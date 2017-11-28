import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_proyecto1_userindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/index.gsp" }
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
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1")],-1)
printHtmlPart(4)
expressionOut.print(resource(dir: 'images', file: 'favicon.png'))
printHtmlPart(5)
expressionOut.print(assetPath(src: 'bootstrap.css'))
printHtmlPart(6)
expressionOut.print(assetPath(src: 'full.css'))
printHtmlPart(7)
})
invokeTag('captureHead','sitemesh',20,[:],1)
printHtmlPart(8)
createTagBody(1, {->
printHtmlPart(9)
expressionOut.print(flash.message)
printHtmlPart(10)
if(true && (session.user)) {
printHtmlPart(11)
expressionOut.print(session.user)
printHtmlPart(12)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',58,['action':("goTo")],3)
printHtmlPart(14)
}
else {
printHtmlPart(15)
createTagBody(3, {->
printHtmlPart(16)
expressionOut.print(password)
printHtmlPart(17)
})
invokeTag('form','g',79,['controller':("user"),'action':("login")],3)
printHtmlPart(15)
}
printHtmlPart(18)
expressionOut.print(assetPath(src: 'bootstrap.min.js'))
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',92,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1462150488280L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
