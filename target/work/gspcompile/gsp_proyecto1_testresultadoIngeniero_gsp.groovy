import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_proyecto1_testresultadoIngeniero_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/test/resultadoIngeniero.gsp" }
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
printHtmlPart(2)
expressionOut.print(resource(dir: 'images', file: 'favicon.png'))
printHtmlPart(3)
createTagBody(2, {->
createClosureForHtmlPart(4, 3)
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(5)
expressionOut.print(session.muestra.nombre)
printHtmlPart(6)
expressionOut.print(session.non)
printHtmlPart(7)
expressionOut.print(session.met)
printHtmlPart(8)
expressionOut.print(session.visco)
printHtmlPart(9)
expressionOut.print(session.nitro)
printHtmlPart(10)
expressionOut.print(assetPath(src: 'verde.png'))
printHtmlPart(11)
expressionOut.print(assetPath(src: 'rojo.png'))
printHtmlPart(12)
expressionOut.print(assetPath(src: 'bootstrap.css'))
printHtmlPart(13)
expressionOut.print(assetPath(src: 'full.css'))
printHtmlPart(14)
})
invokeTag('captureHead','sitemesh',37,[:],1)
printHtmlPart(15)
createTagBody(1, {->
printHtmlPart(16)
expressionOut.print(assetPath(src: 'Engineer.png'))
printHtmlPart(17)
createClosureForHtmlPart(18, 2)
invokeTag('form','g',134,['controller':("test"),'action':("delete")],2)
printHtmlPart(19)
expressionOut.print(assetPath(src: 'bootstrap.min.js'))
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',142,['background':("fondo.jpg")],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1462052122759L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
