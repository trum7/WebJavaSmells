
<%@ page import="proyecto1.AnalisisFraccion" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'analisisFraccion.label', default: 'AnalisisFraccion')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-analisisFraccion" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-analisisFraccion" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="balanceAluminio" title="${message(code: 'analisisFraccion.balanceAluminio.label', default: 'Balance Aluminio')}" />
					
						<g:sortableColumn property="balanceAzufre" title="${message(code: 'analisisFraccion.balanceAzufre.label', default: 'Balance Azufre')}" />
					
						<g:sortableColumn property="balanceCalcio" title="${message(code: 'analisisFraccion.balanceCalcio.label', default: 'Balance Calcio')}" />
					
						<g:sortableColumn property="balanceCenizas" title="${message(code: 'analisisFraccion.balanceCenizas.label', default: 'Balance Cenizas')}" />
					
						<g:sortableColumn property="balanceCobre" title="${message(code: 'analisisFraccion.balanceCobre.label', default: 'Balance Cobre')}" />
					
						<g:sortableColumn property="balanceHierro" title="${message(code: 'analisisFraccion.balanceHierro.label', default: 'Balance Hierro')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${analisisFraccionInstanceList}" status="i" var="analisisFraccionInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${analisisFraccionInstance.id}">${fieldValue(bean: analisisFraccionInstance, field: "balanceAluminio")}</g:link></td>
					
						<td>${fieldValue(bean: analisisFraccionInstance, field: "balanceAzufre")}</td>
					
						<td>${fieldValue(bean: analisisFraccionInstance, field: "balanceCalcio")}</td>
					
						<td>${fieldValue(bean: analisisFraccionInstance, field: "balanceCenizas")}</td>
					
						<td>${fieldValue(bean: analisisFraccionInstance, field: "balanceCobre")}</td>
					
						<td>${fieldValue(bean: analisisFraccionInstance, field: "balanceHierro")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${analisisFraccionInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
