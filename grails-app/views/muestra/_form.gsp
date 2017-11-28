<%@ page import="proyecto1.Muestra" %>



<div class="fieldcontain ${hasErrors(bean: muestraInstance, field: 'api', 'error')} required">
	<label for="api">
		<g:message code="muestra.api.label" default="Api" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="api" value="${fieldValue(bean: muestraInstance, field: 'api')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: muestraInstance, field: 'nombre', 'error')} required">
	<label for="nombre">
		<g:message code="muestra.nombre.label" default="Nombre" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nombre" required="" value="${muestraInstance?.nombre}"/>

</div>

