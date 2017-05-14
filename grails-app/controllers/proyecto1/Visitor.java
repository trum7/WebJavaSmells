package proyecto1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import proyecto1.Java8Parser.*;

public class Visitor<T> extends Java8BaseVisitor<T>{
	int pot = 0;
	public HashMap<String,Integer> lexemes = new HashMap<String,Integer>();
	public HashMap<String,Integer> attributes = new HashMap<String,Integer>();
	public HashMap<String,Integer> primitiveAttributes = new HashMap<String,Integer>();
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
		int classlong = Integer.parseInt(visitClassBody(ctx.classBody()).toString());
		String name = ctx.Identifier().getText();
		
		if (!classes.containsKey(name)){
			classes.put(name, classlong);
		}
//		System.out.println(classes.keySet().toString());
		System.out.println("Holaaaaa");
		return null;
	}

	
	@Override
	public T visitClassBody(ClassBodyContext ctx) {
		
		List<ClassBodyDeclarationContext> bodyDecl = ctx.classBodyDeclaration();
		int classLong = ctx.getStop().getLine()-ctx.getStart().getLine()-1;
//		System.out.printf("Longitud Clase: %d \n",classLong );
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
	//-------------------- ATTRIBUTES DECLARATION 
	@Override
	public T visitFieldDeclaration(FieldDeclarationContext ctx) {
		boolean noPrimitive = Boolean.parseBoolean( visitUnannType(ctx.unannType()).toString());
		ArrayList ids = (ArrayList) visitVariableDeclaratorList(ctx.variableDeclaratorList());
		
		for(int var= 0; var< ids.size(); var++){
			Tuple tuple = (Tuple) ids.get(var);
			if (noPrimitive){
				this.attributes.put((String)tuple.t, (Integer)tuple.v);
			}else{
				this.primitiveAttributes.put((String)tuple.t, (Integer)tuple.v);
			}
//			System.out.println("ATTRIBUTES");
//			System.out.println((String) tuple.t);
		}		
				
		return null;
	}
	@Override
	public T visitUnannType(UnannTypeContext ctx) {
		Boolean isNotPrimitive =false;
		if (ctx.unannPrimitiveType() != null){
			isNotPrimitive = false;
		}else{
			isNotPrimitive = Boolean.parseBoolean(visitUnannReferenceType(ctx.unannReferenceType()).toString());
		}

		return (T) isNotPrimitive.toString();
	}
	@Override
	public T visitUnannReferenceType(UnannReferenceTypeContext ctx) {
		Boolean isNotPrimitive =false;
		if(ctx.unannClassOrInterfaceType() != null || ctx.unannTypeVariable() != null){
			isNotPrimitive = true;
		}else{
			isNotPrimitive = Boolean.parseBoolean(visitUnannArrayType(ctx.unannArrayType()).toString());
		}
		return (T) isNotPrimitive.toString();
	}
	@Override
	public T visitUnannArrayType(UnannArrayTypeContext ctx) {
		Boolean isNotPrimitive = (ctx.unannPrimitiveType() != null) ? false : true;	
		return (T) isNotPrimitive.toString();
	}
	
	
	@Override
	public T visitVariableDeclaratorList(VariableDeclaratorListContext ctx) {
		List<VariableDeclaratorContext> varDecl = ctx.variableDeclarator();
		ArrayList<Tuple> id = new ArrayList<Tuple>();
		VariableDeclaratorContext var = varDecl.get(varDecl.size()-1);
		Tuple numberInstances = (Tuple) visitVariableDeclarator(var);
		id.add(numberInstances);
		for(int vd = 0; vd< varDecl.size()-1; vd++){
			int number = ((Integer)numberInstances.v != 0)? 1: 0;
			VariableDeclaratorContext v = varDecl.get(vd);
			Tuple tuple = new Tuple(v.variableDeclaratorId().Identifier().getText(),number);
			id.add(tuple);
		}
		return (T) id;
	}
	@Override
	public T visitVariableDeclarator(VariableDeclaratorContext ctx) {
		int count = (ctx.variableInitializer()!=null)? 1 : 0;
		String name = ctx.variableDeclaratorId().Identifier().getText();
		Tuple id = new Tuple(name,count);
		return (T) id;
	}
	
	//-------------------- METHOD DECLARATION 
	@Override
	public T visitMethodDeclaration(MethodDeclarationContext ctx) {
//		System.out.println("---------------------------------------------------");
//		System.out.println("Entre a declaracion metodos");
		int totalLines = Integer.parseInt(visitMethodBody(ctx.methodBody()).toString());
		MethodInfo mi = (MethodInfo) visitMethodHeader(ctx.methodHeader());
//		System.out.println("Nombre metodo "+mi.name);
		mi.length = totalLines;
		if(!methods.containsKey(mi.name)){
			this.methods.put(mi.name, mi);
		}
//		System.out.println("---------------------------------------------------");

		return null;
	}
	
	@Override
	public T visitMethodBody(MethodBodyContext ctx) {
		
		int tmp = ctx.getStop().getLine() - ctx.getStart().getLine();
		int TotalLines =(ctx.block().blockStatements()!= null) ? tmp: 1;
//		System.out.printf("Lineas totales en el metodo %d \n",TotalLines-1);
		visitBlock(ctx.block());
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
//			System.out.printf("Cantidad de params %d \n",numParams);
		}else{
			mi.paramNum = numParams;
//			System.out.printf("Cantidad de params %d \n",numParams);	
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
	
	
	@Override
	public T visitBlock(BlockContext ctx) {
		visitChildren(ctx);
		return null;
	}
	@Override
	public T visitBlockStatements(BlockStatementsContext ctx) {
		List<BlockStatementContext> blockStatements = ctx.blockStatement();
		for(BlockStatementContext bl : blockStatements){
			visit(bl);
		}
		return null;
	}
	@Override
	public T visitBlockStatement(BlockStatementContext ctx) {
		visitChildren(ctx);
		return null;
	}
	
	@Override
	public T visitStatement(StatementContext ctx) {
		// System.out.println("ENTREEEEEE 1");
		visitChildren(ctx);
		return null;
	}
	@Override
	public T visitStatementWithoutTrailingSubstatement(StatementWithoutTrailingSubstatementContext ctx) {
		// System.out.println("ENTREEEEEE 2");
		visitChildren(ctx);
		return null;
	}
	
	@Override
	public T visitExpressionStatement(ExpressionStatementContext ctx) {
		// System.out.println("ENTREEEEEE 3 ");
		visitChildren(ctx);
		return null;
	}
	@Override
	public T visitAssignment(AssignmentContext ctx) {
		// System.out.println("ENTREEEEEE 4 ");
		visitLeftHandSide(ctx.leftHandSide());
		return null;
	}
	
	@Override
	public T visitLeftHandSide(LeftHandSideContext ctx) {
		// System.out.println("ENTREEEEEE 5 ");
		visitChildren(ctx);
		return null;
	}
	@Override
	public T visitExpressionName(ExpressionNameContext ctx) {
		String name = ctx.Identifier().getText();
		if(attributes.containsKey(name)){
			int count = this.attributes.get(name);
			this.attributes.put(name, count+1);
			System.out.println("NAME 1 " + name);
			System.out.println(this.attributes.get(name));
		}else if(primitiveAttributes.containsKey(name)){
			int count = primitiveAttributes.get(name);
			this.primitiveAttributes.put(name, count+1);
			System.out.println("NAME 2 " + name);
			System.out.println(this.attributes.get(name));
		}
		return null;
	}
	@Override
	public T visitFieldAccess(FieldAccessContext ctx) {
		String name = ctx.Identifier().getText();
		
		if(attributes.containsKey(name)){
			int count = attributes.get(name);
			attributes.put(name, count+1);
		}else if(primitiveAttributes.containsKey(name)){
			int count = primitiveAttributes.get(name);
			primitiveAttributes.put(name, count+1);
		}
		return null;
	}
	
	@Override
	public T visitMethodInvocation(MethodInvocationContext ctx) {
		visitChildren(ctx);
		return null ;
	}
	
	@Override
	public T visitMethodName(MethodNameContext ctx) {
		String name = ctx.Identifier().getText();
		if(methods.containsKey(name)){
			MethodInfo mi = methods.get(name);
			mi.count+=1;
			this.methods.put(name, mi);	
		}
//		System.out.println(methods.toString());
		return null;
	}
	
	@Override
	public T visitTypeName(TypeNameContext ctx) {
		String name ="";
		if(ctx.packageOrTypeName()!=null){
			pot+=1;
			System.out.printf("Numero de packages %d \n",pot);
			name = (String) visitPackageOrTypeName(ctx.packageOrTypeName()); 
		}else if(ctx.Identifier()!= null){
			name = ctx.Identifier().getText();
			checkExistence(name);
		}
		return (T) name;
	}
	
	@Override
	public T visitPackageOrTypeName(PackageOrTypeNameContext ctx) {
		String name = "";
		if(ctx.packageOrTypeName()!=null){
			pot+=1;
			System.out.printf("Numero de packages %d \n",pot);
			name = (String) visitPackageOrTypeName(ctx.packageOrTypeName()); 
		}else if(ctx.Identifier()!= null){
			System.out.printf("Encontre id en el package %d \n", pot);
			name = ctx.Identifier().getText();
			checkExistence(name);
		}
		return (T) name;
	}
//--------------- Helper Methods 
	
private void checkExistence(String name){
	 if(attributes.containsKey(name)){
		int count = attributes.get(name);
		this.attributes.put(name, count+1);
	}
	System.out.println("Method invocation:" +name);
}
	

}
