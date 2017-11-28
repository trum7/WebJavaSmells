import proyecto1.Ingeniero
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_proyecto1_ingeniero_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/ingeniero/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: ingenieroInstance, field: 'cargo', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("ingeniero.cargo.label"),'default':("Cargo")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("cargo"),'required':(""),'value':(ingenieroInstance?.cargo)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: ingenieroInstance, field: 'carrera', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("ingeniero.carrera.label"),'default':("Carrera")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("carrera"),'required':(""),'value':(ingenieroInstance?.carrera)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: ingenieroInstance, field: 'fechaContratacion', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("ingeniero.fechaContratacion.label"),'default':("Fecha Contratacion")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',28,['name':("fechaContratacion"),'precision':("day"),'value':(ingenieroInstance?.fechaContratacion)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: ingenieroInstance, field: 'persona', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("ingeniero.persona.label"),'default':("Persona")],-1)
printHtmlPart(2)
invokeTag('select','g',37,['id':("persona"),'name':("persona.id"),'from':(proyecto1.Persona.list()),'optionKey':("id"),'required':(""),'value':(ingenieroInstance?.persona?.id),'class':("many-to-one")],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1461452900017L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
