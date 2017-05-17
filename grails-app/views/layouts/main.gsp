<!DOCTYPE html>
<html lang="en" class="full">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title><g:layoutTitle default="Grails"/></title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.png')}" type="image/x-icon">
	<link rel="apple-touch-icon" href="${assetPath(src: 'apple-touch-icon.png')}">
	<link rel="apple-touch-icon" sizes="114x114" href="${assetPath(src: 'apple-touch-icon-retina.png')}">

	<!-- Bootstrap theme -->
    <link href="${assetPath(src: 'bootstrap-theme.min.css')}" rel="stylesheet">
	<!-- Custom theme styles -->
    <link href="${assetPath(src: 'theme.css')}" rel="stylesheet">
    <link href="${assetPath(src: 'bootstrap.css')}" rel="stylesheet">
    <link href="${assetPath(src: 'full.css')}" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script type="text/javascript">
        function main (a) {
            // This demo shows how to create an SVG node which is a bit more complex
            // than single image. Do accomplish this we use 'g' element and
            // compose group of elements to represent a node.
            var graph = Viva.Graph.graph();
            var graphics = Viva.Graph.View.svgGraphics(),
                nodeSize = 24;
            //Definicion nodos
            var i = 0;

            while(i<a.length){

            	graph.addNode(a[i]);
				i++;
				
            }
			i = 0;
            while(i<a.length){

            	graph.addLink(a[i], a[i+1]);
				i += 2;
				
            }


            
            graphics.node(function(node) {
              // This time it's a group of elements: http://www.w3.org/TR/SVG/struct.html#Groups
              var ui = Viva.Graph.svg('g'),
                  // Create SVG text element with user id as content
                  svgText = Viva.Graph.svg('text').attr('y', '-4px').text(node.id),
                  img = Viva.Graph.svg('image')
                     .attr('width', nodeSize)
                     .attr('height', nodeSize)
                     .link('../assets/javaClass.png');
              ui.append(svgText);
              ui.append(img);
              return ui;
            }).placeNode(function(nodeUI, pos) {
                // 'g' element doesn't have convenient (x,y) attributes, instead
                // we have to deal with transforms: http://www.w3.org/TR/SVG/coords.html#SVGGlobalTransformAttribute
                nodeUI.attr('transform',
                            'translate(' +
                                  (pos.x - nodeSize/2) + ',' + (pos.y - nodeSize/2) +
                            ')');
            });
            // Render the graph
            var renderer = Viva.Graph.View.renderer(graph, {
                    graphics : graphics
                });
            renderer.run();
        }
    </script>

    <style type="text/css" media="screen">
        html, body, svg { width: 100%; height: 100%;}
    </style>
  </head>
  <body onload="main(${a})">
    <!-- Fixed navbar -->
    <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">JavaCodeSmells</a>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="../">Home</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>

	<div class="row">

	<div class="col-sm-12" align="center"><h1>Final Report</h1></div>
	<br>
	<div class="col-sm-12">
	<div class="col-sm-1"></div>
	<div class="col-sm-8">
		<h3>Incorrect name variables</h3>
	</div>
	</div>
	
	
	<br>
	<div class="col-sm-12">
	<div class="col-sm-1"></div>
	<div class="col-sm-8">
		<h3>Long Method</h3>
	</div>
	</div>
	
	
	<br>
	<div class="col-sm-12">
	<div class="col-sm-1"></div>
	<div class="col-sm-8">
		<h3>Large Class</h3>
	</div>
	</div>
	
	<br>
	<div class="col-sm-12">
	<div class="col-sm-1"></div>
	<div class="col-sm-8">
		<h3>Lazy class</h3>
	</div>
	</div>
	
		<br>
	<div class="col-sm-12">
	<div class="col-sm-1"></div>
	<div class="col-sm-8">
		<h3>Data class</h3>
	</div>
	</div>
	
	

	<br>
	<div class="col-sm-12">
	<div class="col-sm-1"></div>
	<div class="col-sm-8">
		<h3>Long Parameter List</h3>
	</div>

	</div>
	
	<div class="col-sm-12">
		<div class="col-sm-1"></div>
		<div class="col-sm-8">
			<h3>Graph</h3>

		<div class="container theme-showcase" role="main">
	    	<g:layoutBody/>
		</div>
		</div>
	
	</div>
	

	
	
	
	
	
	
	</div>
	<script src="${assetPath(src: 'vivagraph.js')}"></script>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
