package proyecto1;

import java.util.HashMap;
import java.util.List;

import proyecto1.Java8Parser.*;


public class ClassAndInterVisitor <T> extends Java8BaseVisitor<T> {
	
	public HashMap<String,ClassInfo> classes = new HashMap<String,ClassInfo>();
	public HashMap<String,InterfaceInfo> interfaces = new HashMap<String,InterfaceInfo>();
	public HashMap<String,MethodInfo> methods; 
	public String className = "";
	
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
	
// ----------------------   CLASS DECLARATION 	---------------------- //
	@Override
	public T visitClassDeclaration(ClassDeclarationContext ctx) {
		visitNormalClassDeclaration(ctx.normalClassDeclaration());
		return null;
	}
	
	@Override
	public T visitNormalClassDeclaration(NormalClassDeclarationContext ctx) {
		String name = ctx.Identifier().getText();
		ClassInfo classInfo = new ClassInfo();
		classInfo.name = name;
		if (!classes.containsKey(name)){
			this.className = name;
			classes.put(name, classInfo);
		}
		classInfo = classes.get(name);
		this.methods = classInfo.methods;
		visitClassBody(ctx.classBody());
		return null;
	}
	@Override
	public T visitClassBody(ClassBodyContext ctx) {
		List<ClassBodyDeclarationContext> bodyDecl = ctx.classBodyDeclaration();
		for(ClassBodyDeclarationContext bd: bodyDecl){
			visitClassBodyDeclaration(bd);
		}
		return null ;
	}
// ----------------------   INTERFACE  DECLARATION 	---------------------- //
	@Override
	public T visitInterfaceDeclaration(InterfaceDeclarationContext ctx) {
		visitNormalInterfaceDeclaration(ctx.normalInterfaceDeclaration());
		return null;
	}
	
	@Override
	public T visitNormalInterfaceDeclaration(NormalInterfaceDeclarationContext ctx) {
		String name = ctx.Identifier().getText();
		InterfaceInfo interfaceInfo = new InterfaceInfo();
		interfaceInfo.name = name;
		if (!interfaces.containsKey(name)){
			interfaces.put(name, interfaceInfo);
		}
		interfaceInfo = interfaces.get(name);
		this.methods = interfaceInfo.methods;
		
		System.out.println(interfaces.keySet().toString());
		
		visitInterfaceBody(ctx.interfaceBody());
		return null;
	}
	@Override
	public T visitInterfaceBody(InterfaceBodyContext ctx) {
		List<InterfaceMemberDeclarationContext> bodyDecl = ctx.interfaceMemberDeclaration();
		for(InterfaceMemberDeclarationContext bd: bodyDecl){
			visitInterfaceMemberDeclaration(bd);
		}
		return null;
	}

	@Override
	public T visitInterfaceMemberDeclaration(InterfaceMemberDeclarationContext ctx) {
		visitChildren(ctx);
		return null;
	}
	
// ----------------------   METHOD  DECLARATION 	---------------------- //	
	@Override
	public T visitInterfaceMethodDeclaration(InterfaceMethodDeclarationContext ctx) {
		visitMethodHeader(ctx.methodHeader());
		return null;
	}
	
	@Override
	public T visitMethodDeclaration(MethodDeclarationContext ctx) {
		visitMethodHeader(ctx.methodHeader());
		return null;
	}
	@Override
	public T visitMethodHeader(MethodHeaderContext ctx) {
		visitMethodDeclarator(ctx.methodDeclarator());
		return null;
	}
	
	@Override
	public T visitMethodDeclarator(MethodDeclaratorContext ctx) {
		
		MethodInfo mi = new MethodInfo();
		mi.name = ctx.Identifier().getText();
		if(!methods.containsKey(mi.name)){
			methods.put(mi.name, mi);
		}
		return null;
	}
}