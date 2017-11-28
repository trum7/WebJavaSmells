import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_proyecto1_viewReportgraphics_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/viewReport/graphics.gsp" }
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
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layoutsGraph"),'content':("main")],-1)
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
expressionOut.print(resource(dir: 'css', file: 'style_inicio.css'))
printHtmlPart(7)
expressionOut.print(resource(dir: 'js', file: 'grafica_app.js'))
printHtmlPart(8)
})
invokeTag('captureHead','sitemesh',24,[:],1)
printHtmlPart(9)
createTagBody(1, {->
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',46,['controller':("user"),'action':("logout")],2)
printHtmlPart(12)
expressionOut.print(assetPath(src: 'Customer.png'))
printHtmlPart(13)
expressionOut.print(assetPath(src: 'bootstrap.min.js'))
printHtmlPart(14)
})
invokeTag('captureBody','sitemesh',93,['onload':("graficar(${a},${b},${c})")],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1462144194317L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
