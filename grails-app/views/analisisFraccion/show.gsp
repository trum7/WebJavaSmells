
<%@ page import="proyecto1.AnalisisFraccion" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'analisisFraccion.label', default: 'AnalisisFraccion')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-analisisFraccion" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-analisisFraccion" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list analisisFraccion">
			
				<g:if test="${analisisFraccionInstance?.balanceAluminio}">
				<li class="fieldcontain">
					<span id="balanceAluminio-label" class="property-label"><g:message code="analisisFraccion.balanceAluminio.label" default="Balance Aluminio" /></span>
					
						<span class="property-value" aria-labelledby="balanceAluminio-label"><g:fieldValue bean="${analisisFraccionInstance}" field="balanceAluminio"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${analisisFraccionInstance?.balanceAzufre}">
				<li class="fieldcontain">
					<span id="balanceAzufre-label" class="property-label"><g:message code="analisisFraccion.balanceAzufre.label" default="Balance Azufre" /></span>
					
						<span class="property-value" aria-labelledby="balanceAzufre-label"><g:fieldValue bean="${analisisFraccionInstance}" field="balanceAzufre"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${analisisFraccionInstance?.balanceCalcio}">
				<li class="fieldcontain">
					<span id="balanceCalcio-label" class="property-label"><g:message code="analisisFraccion.balanceCalcio.label" default="Balance Calcio" /></span>
					
						<span class="property-value" aria-labelledby="balanceCalcio-label"><g:fieldValue bean="${analisisFraccionInstance}" field="balanceCalcio"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${analisisFraccionInstance?.balanceCenizas}">
				<li class="fieldcontain">
					<span id="balanceCenizas-label" class="property-label"><g:message code="analisisFraccion.balanceCenizas.label" default="Balance Cenizas" /></span>
					
						<span class="property-value" aria-labelledby="balanceCenizas-label"><g:fieldValue bean="${analisisFraccionInstance}" field="balanceCenizas"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${analisisFraccionInstance?.balanceCobre}">
				<li class="fieldcontain">
					<span id="balanceCobre-label" class="property-label"><g:message code="analisisFraccion.balanceCobre.label" default="Balance Cobre" /></span>
					
						<span class="property-value" aria-labelledby="balanceCobre-label"><g:fieldValue bean="${analisisFraccionInstance}" field="balanceCobre"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${analisisFraccionInstance?.balanceHierro}">
				<li class="fieldcontain">
					<span id="balanceHierro-label" class="property-label"><g:message code="analisisFraccion.balanceHierro.label" default="Balance Hierro" /></span>
					
						<span class="property-value" aria-labelledby="balanceHierro-label"><g:fieldValue bean="${analisisFraccionInstance}" field="balanceHierro"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${analisisFraccionInstance?.balanceMagnesio}">
				<li class="fieldcontain">
					<span id="balanceMagnesio-label" class="property-label"><g:message code="analisisFraccion.balanceMagnesio.label" default="Balance Magnesio" /></span>
					
						<span class="property-value" aria-labelledby="balanceMagnesio-label"><g:fieldValue bean="${analisisFraccionInstance}" field="balanceMagnesio"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${analisisFraccionInstance?.balanceNiquel}">
				<li class="fieldcontain">
					<span id="balanceNiquel-label" class="property-label"><g:message code="analisisFraccion.balanceNiquel.label" default="Balance Niquel" /></span>
					
						<span class="property-value" aria-labelledby="balanceNiquel-label"><g:fieldValue bean="${analisisFraccionInstance}" field="balanceNiquel"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${analisisFraccionInstance?.balanceSodio}">
				<li class="fieldcontain">
					<span id="balanceSodio-label" class="property-label"><g:message code="analisisFraccion.balanceSodio.label" default="Balance Sodio" /></span>
					
						<span class="property-value" aria-labelledby="balanceSodio-label"><g:fieldValue bean="${analisisFraccionInstance}" field="balanceSodio"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${analisisFraccionInstance?.balanceVanadio}">
				<li class="fieldcontain">
					<span id="balanceVanadio-label" class="property-label"><g:message code="analisisFraccion.balanceVanadio.label" default="Balance Vanadio" /></span>
					
						<span class="property-value" aria-labelledby="balanceVanadio-label"><g:fieldValue bean="${analisisFraccionInstance}" field="balanceVanadio"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${analisisFraccionInstance?.densidad}">
				<li class="fieldcontain">
					<span id="densidad-label" class="property-label"><g:message code="analisisFraccion.densidad.label" default="Densidad" /></span>
					
						<span class="property-value" aria-labelledby="densidad-label"><g:formatBoolean boolean="${analisisFraccionInstance?.densidad}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${analisisFraccionInstance?.intervaloInferior}">
				<li class="fieldcontain">
					<span id="intervaloInferior-label" class="property-label"><g:message code="analisisFraccion.intervaloInferior.label" default="Intervalo Inferior" /></span>
					
						<span class="property-value" aria-labelledby="intervaloInferior-label"><g:fieldValue bean="${analisisFraccionInstance}" field="intervaloInferior"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${analisisFraccionInstance?.intervaloSuperior}">
				<li class="fieldcontain">
					<span id="intervaloSuperior-label" class="property-label"><g:message code="analisisFraccion.intervaloSuperior.label" default="Intervalo Superior" /></span>
					
						<span class="property-value" aria-labelledby="intervaloSuperior-label"><g:fieldValue bean="${analisisFraccionInstance}" field="intervaloSuperior"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${analisisFraccionInstance?.nitrogenoTotal}">
				<li class="fieldcontain">
					<span id="nitrogenoTotal-label" class="property-label"><g:message code="analisisFraccion.nitrogenoTotal.label" default="Nitrogeno Total" /></span>
					
						<span class="property-value" aria-labelledby="nitrogenoTotal-label"><g:fieldValue bean="${analisisFraccionInstance}" field="nitrogenoTotal"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${analisisFraccionInstance?.viscosidad}">
				<li class="fieldcontain">
					<span id="viscosidad-label" class="property-label"><g:message code="analisisFraccion.viscosidad.label" default="Viscosidad" /></span>
					
						<span class="property-value" aria-labelledby="viscosidad-label"><g:formatBoolean boolean="${analisisFraccionInstance?.viscosidad}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:analisisFraccionInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${analisisFraccionInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
