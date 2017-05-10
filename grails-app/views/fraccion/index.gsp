
<%@ page import="proyecto1.Fraccion" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'fraccion.label', default: 'Fraccion')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-fraccion" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-fraccion" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="aluminio" title="${message(code: 'fraccion.aluminio.label', default: 'Aluminio')}" />
					
						<g:sortableColumn property="asfaltenos" title="${message(code: 'fraccion.asfaltenos.label', default: 'Asfaltenos')}" />
					
						<g:sortableColumn property="azufre" title="${message(code: 'fraccion.azufre.label', default: 'Azufre')}" />
					
						<g:sortableColumn property="calcio" title="${message(code: 'fraccion.calcio.label', default: 'Calcio')}" />
					
						<g:sortableColumn property="cenizas" title="${message(code: 'fraccion.cenizas.label', default: 'Cenizas')}" />
					
						<g:sortableColumn property="cobre" title="${message(code: 'fraccion.cobre.label', default: 'Cobre')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${fraccionInstanceList}" status="i" var="fraccionInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${fraccionInstance.id}">${fieldValue(bean: fraccionInstance, field: "aluminio")}</g:link></td>
					
						<td>${fieldValue(bean: fraccionInstance, field: "asfaltenos")}</td>
					
						<td>${fieldValue(bean: fraccionInstance, field: "azufre")}</td>
					
						<td>${fieldValue(bean: fraccionInstance, field: "calcio")}</td>
					
						<td>${fieldValue(bean: fraccionInstance, field: "cenizas")}</td>
					
						<td>${fieldValue(bean: fraccionInstance, field: "cobre")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${fraccionInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
