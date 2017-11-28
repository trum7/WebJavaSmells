<%@ page import="proyecto1.Ingeniero" %>



<div class="fieldcontain ${hasErrors(bean: ingenieroInstance, field: 'cargo', 'error')} required">
	<label for="cargo">
		<g:message code="ingeniero.cargo.label" default="Cargo" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="cargo" required="" value="${ingenieroInstance?.cargo}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: ingenieroInstance, field: 'carrera', 'error')} required">
	<label for="carrera">
		<g:message code="ingeniero.carrera.label" default="Carrera" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="carrera" required="" value="${ingenieroInstance?.carrera}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: ingenieroInstance, field: 'fechaContratacion', 'error')} required">
	<label for="fechaContratacion">
		<g:message code="ingeniero.fechaContratacion.label" default="Fecha Contratacion" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="fechaContratacion" precision="day"  value="${ingenieroInstance?.fechaContratacion}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: ingenieroInstance, field: 'persona', 'error')} required">
	<label for="persona">
		<g:message code="ingeniero.persona.label" default="Persona" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="persona" name="persona.id" from="${proyecto1.Persona.list()}" optionKey="id" required="" value="${ingenieroInstance?.persona?.id}" class="many-to-one"/>

</div>

