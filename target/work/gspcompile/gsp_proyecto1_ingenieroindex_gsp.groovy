import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_proyecto1_ingenieroindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/ingeniero/index.gsp" }
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
invokeTag('captureHead','sitemesh',18,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',40,['controller':("user"),'action':("logout")],2)
printHtmlPart(10)
expressionOut.print(assetPath(src: 'Engineer.png'))
printHtmlPart(11)
expressionOut.print(proyecto1.Muestra.list().size())
printHtmlPart(12)
expressionOut.print(proyecto1.AnalisisFraccion.list().size())
printHtmlPart(13)
expressionOut.print(proyecto1.Usuario.findByUsuario( session.user ).persona.nombre)
printHtmlPart(14)
expressionOut.print(proyecto1.Usuario.findByUsuario( session.user ).persona.documento)
printHtmlPart(15)
expressionOut.print(proyecto1.Usuario.findByUsuario( session.user ).usuario)
printHtmlPart(16)
createTagBody(2, {->
printHtmlPart(17)
invokeTag('select','g',144,['id':("nombre"),'name':("cliente"),'from':(proyecto1.Cliente.list()),'optionKey':("nombre"),'optionValue':("nombre"),'required':(""),'value':(usuarioInstance?.Cliente?.id),'class':("many-to-one")],-1)
printHtmlPart(18)
})
invokeTag('form','g',154,['class':("form-horizontal"),'controller':("muestra"),'action':("insert")],2)
printHtmlPart(19)
createTagBody(2, {->
printHtmlPart(20)
invokeTag('select','g',176,['id':("nombre"),'name':("nombre"),'from':(proyecto1.Muestra.list()),'optionKey':("nombre"),'optionValue':("nombre"),'required':(""),'value':(usuarioInstance?.Muestra?.id),'class':("many-to-one")],-1)
printHtmlPart(21)
})
invokeTag('form','g',185,['class':("form-horizontal"),'method':("POST"),'controller':("muestra"),'action':("assign")],2)
printHtmlPart(22)
createTagBody(2, {->
printHtmlPart(23)
invokeTag('select','g',207,['id':("nombre"),'name':("nombre"),'from':(proyecto1.Muestra.list()),'optionKey':("nombre"),'optionValue':("nombre"),'required':(""),'value':(usuarioInstance?.Muestra?.id),'class':("many-to-one")],-1)
printHtmlPart(24)
})
invokeTag('form','g',217,['class':("form-horizontal"),'method':("POST"),'controller':("test"),'action':("balance")],2)
printHtmlPart(25)
createTagBody(2, {->
printHtmlPart(26)
invokeTag('select','g',239,['id':("nombre"),'name':("nombre"),'from':(proyecto1.Muestra.list()),'optionKey':("nombre"),'optionValue':("nombre"),'required':(""),'value':(usuarioInstance?.Muestra?.id),'class':("many-to-one")],-1)
printHtmlPart(27)
})
invokeTag('form','g',249,['class':("form-horizontal"),'method':("POST"),'controller':("report"),'action':("index")],2)
printHtmlPart(28)
createTagBody(2, {->
printHtmlPart(29)
invokeTag('select','g',271,['id':("nombre"),'name':("nombre"),'from':(proyecto1.Muestra.list()),'optionKey':("nombre"),'optionValue':("nombre"),'required':(""),'value':(usuarioInstance?.Muestra?.id),'class':("many-to-one")],-1)
printHtmlPart(30)
})
invokeTag('form','g',287,['class':("form-horizontal"),'controller':("Solicitud"),'action':("insert")],2)
printHtmlPart(31)
expressionOut.print(assetPath(src: 'bootstrap.min.js'))
printHtmlPart(32)
})
invokeTag('captureBody','sitemesh',301,[:],1)
printHtmlPart(33)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1463758246510L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
