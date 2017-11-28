
<%@ page import="proyecto1.Fraccion" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'fraccion.label', default: 'Fraccion')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-fraccion" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-fraccion" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list fraccion">
			
				<g:if test="${fraccionInstance?.aluminio}">
				<li class="fieldcontain">
					<span id="aluminio-label" class="property-label"><g:message code="fraccion.aluminio.label" default="Aluminio" /></span>
					
						<span class="property-value" aria-labelledby="aluminio-label"><g:fieldValue bean="${fraccionInstance}" field="aluminio"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fraccionInstance?.asfaltenos}">
				<li class="fieldcontain">
					<span id="asfaltenos-label" class="property-label"><g:message code="fraccion.asfaltenos.label" default="Asfaltenos" /></span>
					
						<span class="property-value" aria-labelledby="asfaltenos-label"><g:fieldValue bean="${fraccionInstance}" field="asfaltenos"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fraccionInstance?.azufre}">
				<li class="fieldcontain">
					<span id="azufre-label" class="property-label"><g:message code="fraccion.azufre.label" default="Azufre" /></span>
					
						<span class="property-value" aria-labelledby="azufre-label"><g:fieldValue bean="${fraccionInstance}" field="azufre"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fraccionInstance?.calcio}">
				<li class="fieldcontain">
					<span id="calcio-label" class="property-label"><g:message code="fraccion.calcio.label" default="Calcio" /></span>
					
						<span class="property-value" aria-labelledby="calcio-label"><g:fieldValue bean="${fraccionInstance}" field="calcio"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fraccionInstance?.cenizas}">
				<li class="fieldcontain">
					<span id="cenizas-label" class="property-label"><g:message code="fraccion.cenizas.label" default="Cenizas" /></span>
					
						<span class="property-value" aria-labelledby="cenizas-label"><g:fieldValue bean="${fraccionInstance}" field="cenizas"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fraccionInstance?.cobre}">
				<li class="fieldcontain">
					<span id="cobre-label" class="property-label"><g:message code="fraccion.cobre.label" default="Cobre" /></span>
					
						<span class="property-value" aria-labelledby="cobre-label"><g:fieldValue bean="${fraccionInstance}" field="cobre"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fraccionInstance?.densidadApi15}">
				<li class="fieldcontain">
					<span id="densidadApi15-label" class="property-label"><g:message code="fraccion.densidadApi15.label" default="Densidad Api15" /></span>
					
						<span class="property-value" aria-labelledby="densidadApi15-label"><g:fieldValue bean="${fraccionInstance}" field="densidadApi15"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fraccionInstance?.hierro}">
				<li class="fieldcontain">
					<span id="hierro-label" class="property-label"><g:message code="fraccion.hierro.label" default="Hierro" /></span>
					
						<span class="property-value" aria-labelledby="hierro-label"><g:fieldValue bean="${fraccionInstance}" field="hierro"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fraccionInstance?.magnesio}">
				<li class="fieldcontain">
					<span id="magnesio-label" class="property-label"><g:message code="fraccion.magnesio.label" default="Magnesio" /></span>
					
						<span class="property-value" aria-labelledby="magnesio-label"><g:fieldValue bean="${fraccionInstance}" field="magnesio"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fraccionInstance?.muestra}">
				<li class="fieldcontain">
					<span id="muestra-label" class="property-label"><g:message code="fraccion.muestra.label" default="Muestra" /></span>
					
						<span class="property-value" aria-labelledby="muestra-label"><g:link controller="muestra" action="show" id="${fraccionInstance?.muestra?.id}">${fraccionInstance?.muestra?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${fraccionInstance?.niquel}">
				<li class="fieldcontain">
					<span id="niquel-label" class="property-label"><g:message code="fraccion.niquel.label" default="Niquel" /></span>
					
						<span class="property-value" aria-labelledby="niquel-label"><g:fieldValue bean="${fraccionInstance}" field="niquel"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fraccionInstance?.nitrogenoBasico}">
				<li class="fieldcontain">
					<span id="nitrogenoBasico-label" class="property-label"><g:message code="fraccion.nitrogenoBasico.label" default="Nitrogeno Basico" /></span>
					
						<span class="property-value" aria-labelledby="nitrogenoBasico-label"><g:fieldValue bean="${fraccionInstance}" field="nitrogenoBasico"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fraccionInstance?.nitrogenoTotal}">
				<li class="fieldcontain">
					<span id="nitrogenoTotal-label" class="property-label"><g:message code="fraccion.nitrogenoTotal.label" default="Nitrogeno Total" /></span>
					
						<span class="property-value" aria-labelledby="nitrogenoTotal-label"><g:fieldValue bean="${fraccionInstance}" field="nitrogenoTotal"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fraccionInstance?.rendimiento}">
				<li class="fieldcontain">
					<span id="rendimiento-label" class="property-label"><g:message code="fraccion.rendimiento.label" default="Rendimiento" /></span>
					
						<span class="property-value" aria-labelledby="rendimiento-label"><g:fieldValue bean="${fraccionInstance}" field="rendimiento"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fraccionInstance?.rendimientoAcumulado}">
				<li class="fieldcontain">
					<span id="rendimientoAcumulado-label" class="property-label"><g:message code="fraccion.rendimientoAcumulado.label" default="Rendimiento Acumulado" /></span>
					
						<span class="property-value" aria-labelledby="rendimientoAcumulado-label"><g:fieldValue bean="${fraccionInstance}" field="rendimientoAcumulado"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fraccionInstance?.sodio}">
				<li class="fieldcontain">
					<span id="sodio-label" class="property-label"><g:message code="fraccion.sodio.label" default="Sodio" /></span>
					
						<span class="property-value" aria-labelledby="sodio-label"><g:fieldValue bean="${fraccionInstance}" field="sodio"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fraccionInstance?.vanadio}">
				<li class="fieldcontain">
					<span id="vanadio-label" class="property-label"><g:message code="fraccion.vanadio.label" default="Vanadio" /></span>
					
						<span class="property-value" aria-labelledby="vanadio-label"><g:fieldValue bean="${fraccionInstance}" field="vanadio"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fraccionInstance?.viscosidad100}">
				<li class="fieldcontain">
					<span id="viscosidad100-label" class="property-label"><g:message code="fraccion.viscosidad100.label" default="Viscosidad100" /></span>
					
						<span class="property-value" aria-labelledby="viscosidad100-label"><g:fieldValue bean="${fraccionInstance}" field="viscosidad100"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fraccionInstance?.viscosidad120}">
				<li class="fieldcontain">
					<span id="viscosidad120-label" class="property-label"><g:message code="fraccion.viscosidad120.label" default="Viscosidad120" /></span>
					
						<span class="property-value" aria-labelledby="viscosidad120-label"><g:fieldValue bean="${fraccionInstance}" field="viscosidad120"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fraccionInstance?.viscosidad140}">
				<li class="fieldcontain">
					<span id="viscosidad140-label" class="property-label"><g:message code="fraccion.viscosidad140.label" default="Viscosidad140" /></span>
					
						<span class="property-value" aria-labelledby="viscosidad140-label"><g:fieldValue bean="${fraccionInstance}" field="viscosidad140"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fraccionInstance?.viscosidad40}">
				<li class="fieldcontain">
					<span id="viscosidad40-label" class="property-label"><g:message code="fraccion.viscosidad40.label" default="Viscosidad40" /></span>
					
						<span class="property-value" aria-labelledby="viscosidad40-label"><g:fieldValue bean="${fraccionInstance}" field="viscosidad40"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fraccionInstance?.viscosidad50}">
				<li class="fieldcontain">
					<span id="viscosidad50-label" class="property-label"><g:message code="fraccion.viscosidad50.label" default="Viscosidad50" /></span>
					
						<span class="property-value" aria-labelledby="viscosidad50-label"><g:fieldValue bean="${fraccionInstance}" field="viscosidad50"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fraccionInstance?.viscosidad80}">
				<li class="fieldcontain">
					<span id="viscosidad80-label" class="property-label"><g:message code="fraccion.viscosidad80.label" default="Viscosidad80" /></span>
					
						<span class="property-value" aria-labelledby="viscosidad80-label"><g:fieldValue bean="${fraccionInstance}" field="viscosidad80"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:fraccionInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${fraccionInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
