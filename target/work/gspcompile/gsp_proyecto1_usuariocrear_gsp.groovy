import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_proyecto1_usuariocrear_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/usuario/crear.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(3)
expressionOut.print(resource(dir: 'images', file: 'favicon.png'))
printHtmlPart(4)
expressionOut.print(assetPath(src: 'bootstrap.css'))
printHtmlPart(5)
expressionOut.print(assetPath(src: 'full.css'))
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',19,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',42,['controller':("user"),'action':("logout")],2)
printHtmlPart(10)
expressionOut.print(assetPath(src: 'Administrator.png'))
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
invokeTag('select','g',63,['id':("persona"),'name':("persona"),'from':(proyecto1.Persona.list()),'optionKey':("documento"),'optionValue':("documento"),'required':(""),'value':(usuarioInstance?.persona?.id),'class':("many-to-one")],-1)
printHtmlPart(13)
invokeTag('select','g',64,['id':("persona"),'name':("persona"),'from':(proyecto1.Persona.list()),'optionKey':("documento"),'optionValue':("documento"),'required':(""),'value':(usuarioInstance?.persona?.id),'class':("many-to-one")],-1)
printHtmlPart(14)
})
invokeTag('form','g',125,['class':("form-horizontal"),'method':("POST"),'controller':("usuario"),'action':("crear2")],2)
printHtmlPart(15)
expressionOut.print(assetPath(src: 'bootstrap.min.js'))
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',135,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1462123357090L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
