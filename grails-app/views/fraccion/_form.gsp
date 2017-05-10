<%@ page import="proyecto1.Fraccion" %>



<div class="fieldcontain ${hasErrors(bean: fraccionInstance, field: 'aluminio', 'error')} required">
	<label for="aluminio">
		<g:message code="fraccion.aluminio.label" default="Aluminio" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="aluminio" value="${fieldValue(bean: fraccionInstance, field: 'aluminio')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: fraccionInstance, field: 'asfaltenos', 'error')} required">
	<label for="asfaltenos">
		<g:message code="fraccion.asfaltenos.label" default="Asfaltenos" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="asfaltenos" value="${fieldValue(bean: fraccionInstance, field: 'asfaltenos')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: fraccionInstance, field: 'azufre', 'error')} required">
	<label for="azufre">
		<g:message code="fraccion.azufre.label" default="Azufre" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="azufre" value="${fieldValue(bean: fraccionInstance, field: 'azufre')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: fraccionInstance, field: 'calcio', 'error')} required">
	<label for="calcio">
		<g:message code="fraccion.calcio.label" default="Calcio" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="calcio" value="${fieldValue(bean: fraccionInstance, field: 'calcio')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: fraccionInstance, field: 'cenizas', 'error')} required">
	<label for="cenizas">
		<g:message code="fraccion.cenizas.label" default="Cenizas" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="cenizas" value="${fieldValue(bean: fraccionInstance, field: 'cenizas')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: fraccionInstance, field: 'cobre', 'error')} required">
	<label for="cobre">
		<g:message code="fraccion.cobre.label" default="Cobre" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="cobre" value="${fieldValue(bean: fraccionInstance, field: 'cobre')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: fraccionInstance, field: 'densidadApi15', 'error')} required">
	<label for="densidadApi15">
		<g:message code="fraccion.densidadApi15.label" default="Densidad Api15" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="densidadApi15" value="${fieldValue(bean: fraccionInstance, field: 'densidadApi15')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: fraccionInstance, field: 'hierro', 'error')} required">
	<label for="hierro">
		<g:message code="fraccion.hierro.label" default="Hierro" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="hierro" value="${fieldValue(bean: fraccionInstance, field: 'hierro')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: fraccionInstance, field: 'magnesio', 'error')} required">
	<label for="magnesio">
		<g:message code="fraccion.magnesio.label" default="Magnesio" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="magnesio" value="${fieldValue(bean: fraccionInstance, field: 'magnesio')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: fraccionInstance, field: 'muestra', 'error')} required">
	<label for="muestra">
		<g:message code="fraccion.muestra.label" default="Muestra" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="muestra" name="muestra.id" from="${proyecto1.Muestra.list()}" optionKey="id" required="" value="${fraccionInstance?.muestra?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: fraccionInstance, field: 'niquel', 'error')} required">
	<label for="niquel">
		<g:message code="fraccion.niquel.label" default="Niquel" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="niquel" value="${fieldValue(bean: fraccionInstance, field: 'niquel')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: fraccionInstance, field: 'nitrogenoBasico', 'error')} required">
	<label for="nitrogenoBasico">
		<g:message code="fraccion.nitrogenoBasico.label" default="Nitrogeno Basico" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="nitrogenoBasico" value="${fieldValue(bean: fraccionInstance, field: 'nitrogenoBasico')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: fraccionInstance, field: 'nitrogenoTotal', 'error')} required">
	<label for="nitrogenoTotal">
		<g:message code="fraccion.nitrogenoTotal.label" default="Nitrogeno Total" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="nitrogenoTotal" value="${fieldValue(bean: fraccionInstance, field: 'nitrogenoTotal')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: fraccionInstance, field: 'rendimiento', 'error')} required">
	<label for="rendimiento">
		<g:message code="fraccion.rendimiento.label" default="Rendimiento" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="rendimiento" value="${fieldValue(bean: fraccionInstance, field: 'rendimiento')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: fraccionInstance, field: 'rendimientoAcumulado', 'error')} required">
	<label for="rendimientoAcumulado">
		<g:message code="fraccion.rendimientoAcumulado.label" default="Rendimiento Acumulado" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="rendimientoAcumulado" value="${fieldValue(bean: fraccionInstance, field: 'rendimientoAcumulado')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: fraccionInstance, field: 'sodio', 'error')} required">
	<label for="sodio">
		<g:message code="fraccion.sodio.label" default="Sodio" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="sodio" value="${fieldValue(bean: fraccionInstance, field: 'sodio')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: fraccionInstance, field: 'vanadio', 'error')} required">
	<label for="vanadio">
		<g:message code="fraccion.vanadio.label" default="Vanadio" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="vanadio" value="${fieldValue(bean: fraccionInstance, field: 'vanadio')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: fraccionInstance, field: 'viscosidad100', 'error')} required">
	<label for="viscosidad100">
		<g:message code="fraccion.viscosidad100.label" default="Viscosidad100" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="viscosidad100" value="${fieldValue(bean: fraccionInstance, field: 'viscosidad100')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: fraccionInstance, field: 'viscosidad120', 'error')} required">
	<label for="viscosidad120">
		<g:message code="fraccion.viscosidad120.label" default="Viscosidad120" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="viscosidad120" value="${fieldValue(bean: fraccionInstance, field: 'viscosidad120')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: fraccionInstance, field: 'viscosidad140', 'error')} required">
	<label for="viscosidad140">
		<g:message code="fraccion.viscosidad140.label" default="Viscosidad140" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="viscosidad140" value="${fieldValue(bean: fraccionInstance, field: 'viscosidad140')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: fraccionInstance, field: 'viscosidad40', 'error')} required">
	<label for="viscosidad40">
		<g:message code="fraccion.viscosidad40.label" default="Viscosidad40" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="viscosidad40" value="${fieldValue(bean: fraccionInstance, field: 'viscosidad40')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: fraccionInstance, field: 'viscosidad50', 'error')} required">
	<label for="viscosidad50">
		<g:message code="fraccion.viscosidad50.label" default="Viscosidad50" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="viscosidad50" value="${fieldValue(bean: fraccionInstance, field: 'viscosidad50')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: fraccionInstance, field: 'viscosidad80', 'error')} required">
	<label for="viscosidad80">
		<g:message code="fraccion.viscosidad80.label" default="Viscosidad80" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="viscosidad80" value="${fieldValue(bean: fraccionInstance, field: 'viscosidad80')}" required=""/>

</div>

