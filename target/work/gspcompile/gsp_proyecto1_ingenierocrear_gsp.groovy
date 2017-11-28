import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_proyecto1_ingenierocrear_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/ingeniero/crear.gsp" }
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
createClosureForHtmlPart(12, 2)
invokeTag('form','g',136,['url':([resource:personaInstance, action:'save']),'class':("form-horizontal")],2)
printHtmlPart(13)
expressionOut.print(assetPath(src: 'bootstrap.min.js'))
printHtmlPart(14)
})
invokeTag('captureBody','sitemesh',146,[:],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1462042587214L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
