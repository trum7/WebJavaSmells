<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<meta name="layoutsGraph" content="main"/>
<title>Insert title here</title>
<script src = "https://code.jquery.com/jquery-2.2.3.min.js"></script>
<script src="https://d3js.org/d3.v3.min.js" charset="utf-8"></script>

<link rel="stylesheet" href="${resource(dir: 'css', file: 'style_inicioPrint.css')}" type="text/css">

<script src = "${resource(dir: 'js', file: 'grafica_appPrint.js')}"></script>

</head>
<body onload ="graficar(${a},${b},${c})" >


<input type="button" value="Imprimir"style="Position:Absolute; left:50%; top:95%" onclick="javascript:window.print() " />
 
</body>
</html>