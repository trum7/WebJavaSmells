
<%@ page import="proyecto1.Ingeniero" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'ingeniero.label', default: 'Ingeniero')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-ingeniero" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-ingeniero" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list ingeniero">
			
				<g:if test="${ingenieroInstance?.cargo}">
				<li class="fieldcontain">
					<span id="cargo-label" class="property-label"><g:message code="ingeniero.cargo.label" default="Cargo" /></span>
					
						<span class="property-value" aria-labelledby="cargo-label"><g:fieldValue bean="${ingenieroInstance}" field="cargo"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${ingenieroInstance?.carrera}">
				<li class="fieldcontain">
					<span id="carrera-label" class="property-label"><g:message code="ingeniero.carrera.label" default="Carrera" /></span>
					
						<span class="property-value" aria-labelledby="carrera-label"><g:fieldValue bean="${ingenieroInstance}" field="carrera"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${ingenieroInstance?.fechaContratacion}">
				<li class="fieldcontain">
					<span id="fechaContratacion-label" class="property-label"><g:message code="ingeniero.fechaContratacion.label" default="Fecha Contratacion" /></span>
					
						<span class="property-value" aria-labelledby="fechaContratacion-label"><g:formatDate date="${ingenieroInstance?.fechaContratacion}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${ingenieroInstance?.persona}">
				<li class="fieldcontain">
					<span id="persona-label" class="property-label"><g:message code="ingeniero.persona.label" default="Persona" /></span>
					
						<span class="property-value" aria-labelledby="persona-label"><g:link controller="persona" action="show" id="${ingenieroInstance?.persona?.id}">${ingenieroInstance?.persona?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:ingenieroInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${ingenieroInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
