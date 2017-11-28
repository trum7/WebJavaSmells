import proyecto1.Fraccion
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_proyecto1_fraccionshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/fraccion/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'fraccion.label', default: 'Fraccion'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (fraccionInstance?.aluminio)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("fraccion.aluminio.label"),'default':("Aluminio")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(fraccionInstance),'field':("aluminio")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fraccionInstance?.asfaltenos)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("fraccion.asfaltenos.label"),'default':("Asfaltenos")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(fraccionInstance),'field':("asfaltenos")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fraccionInstance?.azufre)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("fraccion.azufre.label"),'default':("Azufre")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(fraccionInstance),'field':("azufre")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fraccionInstance?.calcio)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("fraccion.calcio.label"),'default':("Calcio")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(fraccionInstance),'field':("calcio")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fraccionInstance?.cenizas)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("fraccion.cenizas.label"),'default':("Cenizas")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(fraccionInstance),'field':("cenizas")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fraccionInstance?.cobre)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("fraccion.cobre.label"),'default':("Cobre")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(fraccionInstance),'field':("cobre")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fraccionInstance?.densidadApi15)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("fraccion.densidadApi15.label"),'default':("Densidad Api15")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(fraccionInstance),'field':("densidadApi15")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fraccionInstance?.hierro)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("fraccion.hierro.label"),'default':("Hierro")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(fraccionInstance),'field':("hierro")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fraccionInstance?.magnesio)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("fraccion.magnesio.label"),'default':("Magnesio")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',102,['bean':(fraccionInstance),'field':("magnesio")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fraccionInstance?.muestra)) {
printHtmlPart(34)
invokeTag('message','g',109,['code':("fraccion.muestra.label"),'default':("Muestra")],-1)
printHtmlPart(35)
createTagBody(3, {->
expressionOut.print(fraccionInstance?.muestra?.encodeAsHTML())
})
invokeTag('link','g',111,['controller':("muestra"),'action':("show"),'id':(fraccionInstance?.muestra?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fraccionInstance?.niquel)) {
printHtmlPart(36)
invokeTag('message','g',118,['code':("fraccion.niquel.label"),'default':("Niquel")],-1)
printHtmlPart(37)
invokeTag('fieldValue','g',120,['bean':(fraccionInstance),'field':("niquel")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fraccionInstance?.nitrogenoBasico)) {
printHtmlPart(38)
invokeTag('message','g',127,['code':("fraccion.nitrogenoBasico.label"),'default':("Nitrogeno Basico")],-1)
printHtmlPart(39)
invokeTag('fieldValue','g',129,['bean':(fraccionInstance),'field':("nitrogenoBasico")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fraccionInstance?.nitrogenoTotal)) {
printHtmlPart(40)
invokeTag('message','g',136,['code':("fraccion.nitrogenoTotal.label"),'default':("Nitrogeno Total")],-1)
printHtmlPart(41)
invokeTag('fieldValue','g',138,['bean':(fraccionInstance),'field':("nitrogenoTotal")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fraccionInstance?.rendimiento)) {
printHtmlPart(42)
invokeTag('message','g',145,['code':("fraccion.rendimiento.label"),'default':("Rendimiento")],-1)
printHtmlPart(43)
invokeTag('fieldValue','g',147,['bean':(fraccionInstance),'field':("rendimiento")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fraccionInstance?.rendimientoAcumulado)) {
printHtmlPart(44)
invokeTag('message','g',154,['code':("fraccion.rendimientoAcumulado.label"),'default':("Rendimiento Acumulado")],-1)
printHtmlPart(45)
invokeTag('fieldValue','g',156,['bean':(fraccionInstance),'field':("rendimientoAcumulado")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fraccionInstance?.sodio)) {
printHtmlPart(46)
invokeTag('message','g',163,['code':("fraccion.sodio.label"),'default':("Sodio")],-1)
printHtmlPart(47)
invokeTag('fieldValue','g',165,['bean':(fraccionInstance),'field':("sodio")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fraccionInstance?.vanadio)) {
printHtmlPart(48)
invokeTag('message','g',172,['code':("fraccion.vanadio.label"),'default':("Vanadio")],-1)
printHtmlPart(49)
invokeTag('fieldValue','g',174,['bean':(fraccionInstance),'field':("vanadio")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fraccionInstance?.viscosidad100)) {
printHtmlPart(50)
invokeTag('message','g',181,['code':("fraccion.viscosidad100.label"),'default':("Viscosidad100")],-1)
printHtmlPart(51)
invokeTag('fieldValue','g',183,['bean':(fraccionInstance),'field':("viscosidad100")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fraccionInstance?.viscosidad120)) {
printHtmlPart(52)
invokeTag('message','g',190,['code':("fraccion.viscosidad120.label"),'default':("Viscosidad120")],-1)
printHtmlPart(53)
invokeTag('fieldValue','g',192,['bean':(fraccionInstance),'field':("viscosidad120")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fraccionInstance?.viscosidad140)) {
printHtmlPart(54)
invokeTag('message','g',199,['code':("fraccion.viscosidad140.label"),'default':("Viscosidad140")],-1)
printHtmlPart(55)
invokeTag('fieldValue','g',201,['bean':(fraccionInstance),'field':("viscosidad140")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fraccionInstance?.viscosidad40)) {
printHtmlPart(56)
invokeTag('message','g',208,['code':("fraccion.viscosidad40.label"),'default':("Viscosidad40")],-1)
printHtmlPart(57)
invokeTag('fieldValue','g',210,['bean':(fraccionInstance),'field':("viscosidad40")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fraccionInstance?.viscosidad50)) {
printHtmlPart(58)
invokeTag('message','g',217,['code':("fraccion.viscosidad50.label"),'default':("Viscosidad50")],-1)
printHtmlPart(59)
invokeTag('fieldValue','g',219,['bean':(fraccionInstance),'field':("viscosidad50")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fraccionInstance?.viscosidad80)) {
printHtmlPart(60)
invokeTag('message','g',226,['code':("fraccion.viscosidad80.label"),'default':("Viscosidad80")],-1)
printHtmlPart(61)
invokeTag('fieldValue','g',228,['bean':(fraccionInstance),'field':("viscosidad80")],-1)
printHtmlPart(16)
}
printHtmlPart(62)
createTagBody(2, {->
printHtmlPart(63)
createTagBody(3, {->
invokeTag('message','g',236,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',236,['class':("edit"),'action':("edit"),'resource':(fraccionInstance)],3)
printHtmlPart(64)
invokeTag('actionSubmit','g',237,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(65)
})
invokeTag('form','g',239,['url':([resource:fraccionInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(66)
})
invokeTag('captureBody','sitemesh',241,[:],1)
printHtmlPart(67)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1461452766642L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
