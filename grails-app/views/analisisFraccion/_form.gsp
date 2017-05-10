<%@ page import="proyecto1.AnalisisFraccion" %>



<div class="fieldcontain ${hasErrors(bean: analisisFraccionInstance, field: 'balanceAluminio', 'error')} required">
	<label for="balanceAluminio">
		<g:message code="analisisFraccion.balanceAluminio.label" default="Balance Aluminio" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="balanceAluminio" value="${fieldValue(bean: analisisFraccionInstance, field: 'balanceAluminio')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: analisisFraccionInstance, field: 'balanceAzufre', 'error')} required">
	<label for="balanceAzufre">
		<g:message code="analisisFraccion.balanceAzufre.label" default="Balance Azufre" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="balanceAzufre" value="${fieldValue(bean: analisisFraccionInstance, field: 'balanceAzufre')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: analisisFraccionInstance, field: 'balanceCalcio', 'error')} required">
	<label for="balanceCalcio">
		<g:message code="analisisFraccion.balanceCalcio.label" default="Balance Calcio" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="balanceCalcio" value="${fieldValue(bean: analisisFraccionInstance, field: 'balanceCalcio')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: analisisFraccionInstance, field: 'balanceCenizas', 'error')} required">
	<label for="balanceCenizas">
		<g:message code="analisisFraccion.balanceCenizas.label" default="Balance Cenizas" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="balanceCenizas" value="${fieldValue(bean: analisisFraccionInstance, field: 'balanceCenizas')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: analisisFraccionInstance, field: 'balanceCobre', 'error')} required">
	<label for="balanceCobre">
		<g:message code="analisisFraccion.balanceCobre.label" default="Balance Cobre" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="balanceCobre" value="${fieldValue(bean: analisisFraccionInstance, field: 'balanceCobre')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: analisisFraccionInstance, field: 'balanceHierro', 'error')} required">
	<label for="balanceHierro">
		<g:message code="analisisFraccion.balanceHierro.label" default="Balance Hierro" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="balanceHierro" value="${fieldValue(bean: analisisFraccionInstance, field: 'balanceHierro')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: analisisFraccionInstance, field: 'balanceMagnesio', 'error')} required">
	<label for="balanceMagnesio">
		<g:message code="analisisFraccion.balanceMagnesio.label" default="Balance Magnesio" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="balanceMagnesio" value="${fieldValue(bean: analisisFraccionInstance, field: 'balanceMagnesio')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: analisisFraccionInstance, field: 'balanceNiquel', 'error')} required">
	<label for="balanceNiquel">
		<g:message code="analisisFraccion.balanceNiquel.label" default="Balance Niquel" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="balanceNiquel" value="${fieldValue(bean: analisisFraccionInstance, field: 'balanceNiquel')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: analisisFraccionInstance, field: 'balanceSodio', 'error')} required">
	<label for="balanceSodio">
		<g:message code="analisisFraccion.balanceSodio.label" default="Balance Sodio" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="balanceSodio" value="${fieldValue(bean: analisisFraccionInstance, field: 'balanceSodio')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: analisisFraccionInstance, field: 'balanceVanadio', 'error')} required">
	<label for="balanceVanadio">
		<g:message code="analisisFraccion.balanceVanadio.label" default="Balance Vanadio" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="balanceVanadio" value="${fieldValue(bean: analisisFraccionInstance, field: 'balanceVanadio')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: analisisFraccionInstance, field: 'densidad', 'error')} ">
	<label for="densidad">
		<g:message code="analisisFraccion.densidad.label" default="Densidad" />
		
	</label>
	<g:checkBox name="densidad" value="${analisisFraccionInstance?.densidad}" />

</div>

<div class="fieldcontain ${hasErrors(bean: analisisFraccionInstance, field: 'intervaloInferior', 'error')} required">
	<label for="intervaloInferior">
		<g:message code="analisisFraccion.intervaloInferior.label" default="Intervalo Inferior" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="intervaloInferior" value="${fieldValue(bean: analisisFraccionInstance, field: 'intervaloInferior')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: analisisFraccionInstance, field: 'intervaloSuperior', 'error')} required">
	<label for="intervaloSuperior">
		<g:message code="analisisFraccion.intervaloSuperior.label" default="Intervalo Superior" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="intervaloSuperior" value="${fieldValue(bean: analisisFraccionInstance, field: 'intervaloSuperior')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: analisisFraccionInstance, field: 'nitrogenoTotal', 'error')} required">
	<label for="nitrogenoTotal">
		<g:message code="analisisFraccion.nitrogenoTotal.label" default="Nitrogeno Total" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="nitrogenoTotal" value="${fieldValue(bean: analisisFraccionInstance, field: 'nitrogenoTotal')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: analisisFraccionInstance, field: 'viscosidad', 'error')} ">
	<label for="viscosidad">
		<g:message code="analisisFraccion.viscosidad.label" default="Viscosidad" />
		
	</label>
	<g:checkBox name="viscosidad" value="${analisisFraccionInstance?.viscosidad}" />

</div>

