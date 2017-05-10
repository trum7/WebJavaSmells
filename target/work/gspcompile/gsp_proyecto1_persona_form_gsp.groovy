import proyecto1.Persona
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_proyecto1_persona_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/persona/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: personaInstance, field: 'correo', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("persona.correo.label"),'default':("Correo")],-1)
printHtmlPart(2)
invokeTag('field','g',10,['type':("email"),'name':("correo"),'required':(""),'value':(personaInstance?.correo)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: personaInstance, field: 'documento', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("persona.documento.label"),'default':("Documento")],-1)
printHtmlPart(2)
invokeTag('field','g',19,['name':("documento"),'type':("number"),'value':(personaInstance.documento),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: personaInstance, field: 'nombre', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("persona.nombre.label"),'default':("Nombre")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("nombre"),'required':(""),'value':(personaInstance?.nombre)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: personaInstance, field: 'direccion', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("persona.direccion.label"),'default':("Direccion")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("direccion"),'required':(""),'value':(personaInstance?.direccion)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: personaInstance, field: 'telefono', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("persona.telefono.label"),'default':("Telefono")],-1)
printHtmlPart(2)
invokeTag('field','g',46,['name':("telefono"),'type':("number"),'value':(personaInstance.telefono),'required':("")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1461457203948L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
