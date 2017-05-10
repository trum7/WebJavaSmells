import proyecto1.Usuario
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_proyecto1_usuario_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/usuario/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'password', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("usuario.password.label"),'default':("Password")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("password"),'maxlength':("15"),'required':(""),'value':(usuarioInstance?.password)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'acceso', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("usuario.acceso.label"),'default':("Acceso")],-1)
printHtmlPart(2)
invokeTag('field','g',19,['name':("acceso"),'type':("number"),'value':(usuarioInstance.acceso),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'persona', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("usuario.persona.label"),'default':("Persona")],-1)
printHtmlPart(2)
invokeTag('select','g',28,['id':("persona"),'name':("persona.id"),'from':(proyecto1.Persona.list()),'optionKey':("id"),'required':(""),'value':(usuarioInstance?.persona?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'usuario', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("usuario.usuario.label"),'default':("Usuario")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("usuario"),'required':(""),'value':(usuarioInstance?.usuario)],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1461457251652L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
