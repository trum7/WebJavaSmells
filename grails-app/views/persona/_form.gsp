<%@ page import="proyecto1.Persona" %>



<div class="fieldcontain ${hasErrors(bean: personaInstance, field: 'correo', 'error')} required">
	<label for="correo">
		<g:message code="persona.correo.label" default="Correo" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="email" name="correo" required="" value="${personaInstance?.correo}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: personaInstance, field: 'documento', 'error')} required">
	<label for="documento">
		<g:message code="persona.documento.label" default="Documento" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="documento" type="number" value="${personaInstance.documento}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: personaInstance, field: 'nombre', 'error')} required">
	<label for="nombre">
		<g:message code="persona.nombre.label" default="Nombre" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nombre" required="" value="${personaInstance?.nombre}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: personaInstance, field: 'direccion', 'error')} required">
	<label for="direccion">
		<g:message code="persona.direccion.label" default="Direccion" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="direccion" required="" value="${personaInstance?.direccion}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: personaInstance, field: 'telefono', 'error')} required">
	<label for="telefono">
		<g:message code="persona.telefono.label" default="Telefono" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="telefono" type="number" value="${personaInstance.telefono}" required=""/>

</div>

