<%@ page import="proyecto1.Cliente" %>



<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'correo', 'error')} required">
	<label for="correo">
		<g:message code="cliente.correo.label" default="Correo" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="correo" required="" value="${clienteInstance?.correo}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'direccion', 'error')} required">
	<label for="direccion">
		<g:message code="cliente.direccion.label" default="Direccion" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="direccion" required="" value="${clienteInstance?.direccion}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'nombre', 'error')} required">
	<label for="nombre">
		<g:message code="cliente.nombre.label" default="Nombre" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nombre" required="" value="${clienteInstance?.nombre}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'rut', 'error')} required">
	<label for="rut">
		<g:message code="cliente.rut.label" default="Rut" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="rut" required="" value="${clienteInstance?.rut}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'telefono', 'error')} required">
	<label for="telefono">
		<g:message code="cliente.telefono.label" default="Telefono" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="telefono" type="number" value="${clienteInstance.telefono}" required=""/>

</div>

