package proyecto1;

import java.util.HashMap;
import java.util.List;

import proyecto1.Java8Parser.*;

public class Visitor<T> extends Java8BaseVisitor<T>{

	public HashMap<String,Integer> lexemes = new HashMap<String,Integer>();
	public HashMap<String,Integer> attributes = new HashMap<String,Integer>();
	public HashMap<String,Integer> classes = new HashMap<String,Integer>();
	public HashMap<String,MethodInfo> methods = new HashMap<String,MethodInfo>();

	@Override
	public T visitCompilationUnit(CompilationUnitContext ctx) {
		List<TypeDeclarationContext> types = ctx.typeDeclaration();

		for(TypeDeclarationContext t: types  ){
			visit(t);
		}
		return null;
	}

	@Override
	public T visitTypeDeclaration(TypeDeclarationContext ctx) {
		visitChildren(ctx);
		return null;
	}

	// --------------------------   CLASSES DECLARATIONS
	@Override
	public T visitClassDeclaration(ClassDeclarationContext ctx) {
		visitNormalClassDeclaration(ctx.normalClassDeclaration());
		return null;
	}

	@Override
	public T visitNormalClassDeclaration(NormalClassDeclarationContext ctx) {
		Integer classlong =  Integer.parseInt(visitClassBody(ctx.classBody()).toString());
		String name = ctx.Identifier().getText();

		if (!classes.containsKey(name)){
			classes.put(name, classlong);
		}
		System.out.println(classes.keySet().toString());
		return null;
	}


	@Override
	public T visitClassBody(ClassBodyContext ctx) {

		List<ClassBodyDeclarationContext> bodyDecl = ctx.classBodyDeclaration();
		int classLong = ctx.getStop().getLine()-ctx.getStart().getLine()-1;
		System.out.printf("Longitud Clase: %d \n",classLong );
		for(ClassBodyDeclarationContext bd: bodyDecl){
			visitClassBodyDeclaration(bd);
		}
		return (T) (Integer) classLong ;
	}

	@Override
	public T visitClassBodyDeclaration(ClassBodyDeclarationContext ctx) {
		visitChildren(ctx);

		return null;
	}

	@Override
	public T visitClassMemberDeclaration(ClassMemberDeclarationContext ctx) {
		visitChildren(ctx);
		return null;
	}
	//-------------------- VARIABLE DECLARATION
	@Override
	public T visitFieldDeclaration(FieldDeclarationContext ctx) {
		visitChildren(ctx);
		return null;
	}

	@Override
	public T visitVariableDeclaratorList(VariableDeclaratorListContext ctx) {

		List<VariableDeclaratorContext> varDecl = ctx.variableDeclarator();
		for(VariableDeclaratorContext var: varDecl){
			this.attributes.put(var.getText(), 0);
		}
		return null;
	}
	//-------------------- METHOD DECLARATION
	@Override
	public T visitMethodDeclaration(MethodDeclarationContext ctx) {

		int totalLines =  Integer.parseInt(visitMethodBody(ctx.methodBody()).toString());
		MethodInfo mi = (MethodInfo) visitMethodHeader(ctx.methodHeader());
		mi.length = totalLines;
		if(!methods.containsKey(mi.name)){
			methods.put(mi.name, mi);
		}

		return null;
	}

	@Override
	public T visitMethodBody(MethodBodyContext ctx) {

		int tmp = ctx.getStop().getLine() - ctx.getStart().getLine();
		int TotalLines =(ctx.block().blockStatements()!= null) ? tmp: 1;
		System.out.printf("Lineas totales en el metodo %d \n",TotalLines-1);
		return (T)(Integer) TotalLines;
	}

	@Override
	public T visitMethodHeader(MethodHeaderContext ctx) {
		MethodInfo mi = (MethodInfo) visitMethodDeclarator(ctx.methodDeclarator());
		return (T) mi;
	}

	@Override
	public T visitMethodDeclarator(MethodDeclaratorContext ctx) {
		MethodInfo mi = new MethodInfo();
		mi.name = ctx.Identifier().getText();
		int numParams = 0;
		if(ctx.formalParameterList()!=null){
			numParams = Integer.parseInt(visitFormalParameterList(ctx.formalParameterList()).toString());
			mi.paramNum = numParams;
			System.out.printf("Cantidad de params %d \n",numParams);
		}else{
			mi.paramNum = numParams;
			System.out.printf("Cantidad de params %d \n",numParams);
		}

		return (T) mi;
	}

	@Override
	public T visitFormalParameterList(FormalParameterListContext ctx) {
		int num = 1 ;

		if (ctx.formalParameters() != null)
			num+= ctx.formalParameters().formalParameter().size();

		T numParams = (T) new Integer(num);
		return numParams;
	}

}
