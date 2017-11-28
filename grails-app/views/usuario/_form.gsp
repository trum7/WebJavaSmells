<%@ page import="proyecto1.Usuario" %>



<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'password', 'error')} required">
	<label for="password">
		<g:message code="usuario.password.label" default="Password" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="password" maxlength="15" required="" value="${usuarioInstance?.password}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'acceso', 'error')} required">
	<label for="acceso">
		<g:message code="usuario.acceso.label" default="Acceso" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="acceso" type="number" value="${usuarioInstance.acceso}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'persona', 'error')} required">
	<label for="persona">
		<g:message code="usuario.persona.label" default="Persona" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="persona" name="persona.id" from="${proyecto1.Persona.list()}" optionKey="id" required="" value="${usuarioInstance?.persona?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'usuario', 'error')} required">
	<label for="usuario">
		<g:message code="usuario.usuario.label" default="Usuario" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="usuario" required="" value="${usuarioInstance?.usuario}"/>

</div>

