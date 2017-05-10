import proyecto1.AnalisisFraccion
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_proyecto1_analisisFraccion_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/analisisFraccion/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: analisisFraccionInstance, field: 'balanceAluminio', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("analisisFraccion.balanceAluminio.label"),'default':("Balance Aluminio")],-1)
printHtmlPart(2)
invokeTag('field','g',10,['name':("balanceAluminio"),'value':(fieldValue(bean: analisisFraccionInstance, field: 'balanceAluminio')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: analisisFraccionInstance, field: 'balanceAzufre', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("analisisFraccion.balanceAzufre.label"),'default':("Balance Azufre")],-1)
printHtmlPart(2)
invokeTag('field','g',19,['name':("balanceAzufre"),'value':(fieldValue(bean: analisisFraccionInstance, field: 'balanceAzufre')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: analisisFraccionInstance, field: 'balanceCalcio', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("analisisFraccion.balanceCalcio.label"),'default':("Balance Calcio")],-1)
printHtmlPart(2)
invokeTag('field','g',28,['name':("balanceCalcio"),'value':(fieldValue(bean: analisisFraccionInstance, field: 'balanceCalcio')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: analisisFraccionInstance, field: 'balanceCenizas', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("analisisFraccion.balanceCenizas.label"),'default':("Balance Cenizas")],-1)
printHtmlPart(2)
invokeTag('field','g',37,['name':("balanceCenizas"),'value':(fieldValue(bean: analisisFraccionInstance, field: 'balanceCenizas')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: analisisFraccionInstance, field: 'balanceCobre', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("analisisFraccion.balanceCobre.label"),'default':("Balance Cobre")],-1)
printHtmlPart(2)
invokeTag('field','g',46,['name':("balanceCobre"),'value':(fieldValue(bean: analisisFraccionInstance, field: 'balanceCobre')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: analisisFraccionInstance, field: 'balanceHierro', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("analisisFraccion.balanceHierro.label"),'default':("Balance Hierro")],-1)
printHtmlPart(2)
invokeTag('field','g',55,['name':("balanceHierro"),'value':(fieldValue(bean: analisisFraccionInstance, field: 'balanceHierro')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: analisisFraccionInstance, field: 'balanceMagnesio', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("analisisFraccion.balanceMagnesio.label"),'default':("Balance Magnesio")],-1)
printHtmlPart(2)
invokeTag('field','g',64,['name':("balanceMagnesio"),'value':(fieldValue(bean: analisisFraccionInstance, field: 'balanceMagnesio')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: analisisFraccionInstance, field: 'balanceNiquel', 'error'))
printHtmlPart(10)
invokeTag('message','g',70,['code':("analisisFraccion.balanceNiquel.label"),'default':("Balance Niquel")],-1)
printHtmlPart(2)
invokeTag('field','g',73,['name':("balanceNiquel"),'value':(fieldValue(bean: analisisFraccionInstance, field: 'balanceNiquel')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: analisisFraccionInstance, field: 'balanceSodio', 'error'))
printHtmlPart(11)
invokeTag('message','g',79,['code':("analisisFraccion.balanceSodio.label"),'default':("Balance Sodio")],-1)
printHtmlPart(2)
invokeTag('field','g',82,['name':("balanceSodio"),'value':(fieldValue(bean: analisisFraccionInstance, field: 'balanceSodio')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: analisisFraccionInstance, field: 'balanceVanadio', 'error'))
printHtmlPart(12)
invokeTag('message','g',88,['code':("analisisFraccion.balanceVanadio.label"),'default':("Balance Vanadio")],-1)
printHtmlPart(2)
invokeTag('field','g',91,['name':("balanceVanadio"),'value':(fieldValue(bean: analisisFraccionInstance, field: 'balanceVanadio')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: analisisFraccionInstance, field: 'densidad', 'error'))
printHtmlPart(13)
invokeTag('message','g',97,['code':("analisisFraccion.densidad.label"),'default':("Densidad")],-1)
printHtmlPart(14)
invokeTag('checkBox','g',100,['name':("densidad"),'value':(analisisFraccionInstance?.densidad)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: analisisFraccionInstance, field: 'intervaloInferior', 'error'))
printHtmlPart(15)
invokeTag('message','g',106,['code':("analisisFraccion.intervaloInferior.label"),'default':("Intervalo Inferior")],-1)
printHtmlPart(2)
invokeTag('field','g',109,['name':("intervaloInferior"),'value':(fieldValue(bean: analisisFraccionInstance, field: 'intervaloInferior')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: analisisFraccionInstance, field: 'intervaloSuperior', 'error'))
printHtmlPart(16)
invokeTag('message','g',115,['code':("analisisFraccion.intervaloSuperior.label"),'default':("Intervalo Superior")],-1)
printHtmlPart(2)
invokeTag('field','g',118,['name':("intervaloSuperior"),'value':(fieldValue(bean: analisisFraccionInstance, field: 'intervaloSuperior')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: analisisFraccionInstance, field: 'nitrogenoTotal', 'error'))
printHtmlPart(17)
invokeTag('message','g',124,['code':("analisisFraccion.nitrogenoTotal.label"),'default':("Nitrogeno Total")],-1)
printHtmlPart(2)
invokeTag('field','g',127,['name':("nitrogenoTotal"),'value':(fieldValue(bean: analisisFraccionInstance, field: 'nitrogenoTotal')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: analisisFraccionInstance, field: 'viscosidad', 'error'))
printHtmlPart(18)
invokeTag('message','g',133,['code':("analisisFraccion.viscosidad.label"),'default':("Viscosidad")],-1)
printHtmlPart(14)
invokeTag('checkBox','g',136,['name':("viscosidad"),'value':(analisisFraccionInstance?.viscosidad)],-1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1461361381133L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}