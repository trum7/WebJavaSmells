<!DOCTYPE html>
<html lang="en" class="full">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Web Report</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon1.ico')}" type="image/x-icon">
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
        function main (a,b,c,d,e) {
            // This demo shows how to create an SVG node which is a bit more complex
            // than single image. Do accomplish this we use 'g' element and
            // compose group of elements to represent a node.
            var graph = Viva.Graph.graph();
            var graphics = Viva.Graph.View.svgGraphics(),
                nodeSize = 24;
            //Definicion nodos
            var i = 0;
			//alert(name);
			alert(a);
			alert(b);
			alert(d);
            while(i<b.length){

            	graph.addNode(b[i]);
				i++;
				
            }
			i = 0;
            while(i<d.length){
                
				if( d[i] != null ){
	            	graph.addNode(d[i]);
					i++;
				}else{
					break;
				}
				
            }




			//Aca
			
			            // To render an arrow we have to address two problems:
			            //  1. Links should start/stop at node's bounding box, not at the node center.
			            //  2. Render an arrow shape at the end of the link.
			            // Rendering arrow shape is achieved by using SVG markers, part of the SVG
			            // standard: http://www.w3.org/TR/SVG/painting.html#Markers
			var createMarker = function(id) {
			        return Viva.Graph.svg('marker')
			                .attr('id', id)
			                .attr('viewBox', "0 0 10 10")
			                .attr('refX', "10")
			                .attr('refY', "5")
			                .attr('markerUnits', "strokeWidth")
			                .attr('markerWidth', "10")
			                .attr('markerHeight', "5")
			                .attr('orient', "auto");
			},
			
			marker = createMarker('Triangle');
			marker.append('path').attr('d', 'M 0 0 L 10 5 L 0 10 z');
			
			var defs = graphics.getSvgRoot().append('defs');
			defs.append(marker);
			
			var geom = Viva.Graph.geom();
			
			graphics.link(function(link){
			    var label = Viva.Graph.svg('text').attr('id','label_'+link.data.id).text(link.data.id);
			            	        graphics.getSvgRoot().childNodes[0].append(label);
			    
			    return Viva.Graph.svg('path')
			        .attr('stroke', 'gray')
			        .attr('marker-end', 'url(#Triangle)')
			        .attr('id', link.data.id);
			    }).placeLink(function(linkUI, fromPos, toPos) {
			        var toNodeSize = nodeSize,
			        fromNodeSize = nodeSize;
			
			        var from = geom.intersectRect(
			            fromPos.x - fromNodeSize / 2, // left
			            fromPos.y - fromNodeSize / 2, // top
			            fromPos.x + fromNodeSize / 2, // right
			            fromPos.y + fromNodeSize / 2, // bottom
			            fromPos.x, fromPos.y, toPos.x, toPos.y)
			        || fromPos;
			
			        var to = geom.intersectRect(
			            toPos.x - toNodeSize / 2, // left
			            toPos.y - toNodeSize / 2, // top
			            toPos.x + toNodeSize / 2, // right
			            toPos.y + toNodeSize / 2, // bottom
			            // segment:
			            toPos.x, toPos.y, fromPos.x, fromPos.y)
			            || toPos;
			
			        var data = 'M' + from.x + ',' + from.y +
			            'L' + to.x + ',' + to.y;
			
			        linkUI.attr("d", data);
			    
			        document.getElementById('label_'+linkUI.attr('id'))
			                	.attr("x", (from.x + to.x) / 2)
			                	.attr("y", (from.y + to.y) / 2);
			    });
			//Aca

            
            
            graphics.node(function(node) {
              // This time it's a group of elements: http://www.w3.org/TR/SVG/struct.html#Groups
              var result = d.indexOf(node.id)
              if(result == -1){
                  
              var ui = Viva.Graph.svg('g'),
                  // Create SVG text element with user id as content
                  svgText = Viva.Graph.svg('text').attr('y', '-4px').text(node.id),
                  img = Viva.Graph.svg('image')
                     .attr('width', nodeSize)
                     .attr('height', nodeSize)
                     .link('../assets/javaClass.png');
              ui.append(svgText);
              ui.append(img);

              }else{
                  var ui = Viva.Graph.svg('g'),
                  // Create SVG text element with user id as content
                  svgText = Viva.Graph.svg('text').attr('y', '-4px').text(node.id),
                  img = Viva.Graph.svg('image')
                     .attr('width', nodeSize)
                     .attr('height', nodeSize)
                     .link('../assets/interface.png');
              ui.append(svgText);
              ui.append(img);

              }
              return ui;
            }).placeNode(function(nodeUI, pos) {
                // 'g' element doesn't have convenient (x,y) attributes, instead
                // we have to deal with transforms: http://www.w3.org/TR/SVG/coords.html#SVGGlobalTransformAttribute
                nodeUI.attr('transform',
                            'translate(' +
                                  (pos.x - nodeSize/2) + ',' + (pos.y - nodeSize/2) +
                            ')');
            });

			//links

			i = 0;
            while(i<a.length){

            	graph.addLink(a[i], a[i+1], {id : 'extends'});
				i += 2;
				
            }
			i = 0;
            while(i<c.length){

				if( c[i] != null ){
					for(w = 0; w < c[i+1].length; w++){
            			graph.addLink(c[i], c[i+1][w], {id : 'h_'+i.toString()+w.toString()});
					}
					i += 2;
            	}else{
					break;
                }
				
            }

            i = 0;
            while(i<e.length){

				if( e[i] != null ){
					for(w = 0; w < e[i+1].length; w++){
            			graph.addLink(e[i], e[i+1][w], {id : 'I_'+i.toString()+w.toString()});
					}
					i += 2;
            	}else{
					break;
                }
				
            }


            
            
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
    
    <style>
		table {
		    font-family: arial, sans-serif;
		    border-collapse: collapse;
		    width: 100%;
		    border: 1px solid black;
		}
		
		th{		    
			border: 1px solid black;
			background-color: white;	
		    text-align: center;
		    padding: 8px;
		} 
		td{
		    border: 1px solid black;
		    text-align: center;
		    padding: 8px;
		}
		
		tr:nth-child(even) {
		    background-color: #dddddd;
		}
		</style>
  </head>
  <body style="background-image: url('../assets/result.png');background-repeat: repeat;" onload="main(${a},${b},${c},${d},${e})">
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
          <a class="navbar-brand" href="../">JavaCodeSmells</a>
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
	<div class="col-sm-10">
		<h3>Long Method</h3>
		<div class="col-sm-12" align="center">	
		<table>
		  <tr>
		    <th>Name</th>
		    <th>Belongs</th>
		    <th>Length</th>
		  </tr>
  		  
  		  <g:each in="${methodlength}" var="p">
			<tr>
			<g:if test="${p.length < 40}">
			    <td bgcolor="#00FF00">${p.name}</td>
			    <td bgcolor="#00FF00">${p.belongs}</td>
				<td bgcolor="#00FF00">${p.length}</td>
			</g:if>
			<g:else>
			    <td bgcolor="#FF0000">${p.name}</td>
			    <td bgcolor="#FF0000">${p.belongs}</td>
				<td bgcolor="#FF0000">${p.length}</td>
			</g:else>

			</tr>
		  </g:each>
		
		</table>
		
	  </div>
		  
		
		
		
	</div>
	<div class="col-sm-1"></div>
	</div>
	
	
	<br>
	<div class="col-sm-12">
	<div class="col-sm-1"></div>
	<div class="col-sm-10">
		<h3>Large Class</h3>
		<div class="col-sm-12" align="center">	
		<table>
		  <tr>
		    <th>Name</th>
		    <th>length</th>
		  </tr>
  		  
  		  <g:each in="${largeClass}" var="p">
			<tr>
			<g:if test="${p.length < 100}">
			    <td bgcolor="#00FF00">${p.name}</td>
				<td bgcolor="#00FF00">${p.length}</td>
			</g:if>
			<g:else>
			    <td bgcolor="#FF0000">${p.name}</td>
				<td bgcolor="#FF0000">${p.length}</td>
			</g:else>

			</tr>
		  </g:each>
		
		</table>
		
	  </div>
		  
		
		
		
	</div>
	<div class="col-sm-1"></div>
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
	<div class="col-sm-10">
		<h3>Long Parameter List</h3>
		<div class="col-sm-12" align="center">	
		<table>
		  <tr>
		    <th>Name</th>
		    <th>Belongs</th>
		    <th>Number of parameters</th>
		  </tr>
  		  
  		  <g:each in="${methodlength}" var="p">
			<tr>
			<g:if test="${p.paramNum < 5}">
			    <td bgcolor="#00FF00">${p.name}</td>
			    <td bgcolor="#00FF00">${p.belongs}</td>
				<td bgcolor="#00FF00">${p.paramNum}</td>
			</g:if>
			<g:else>
			    <td bgcolor="#FF0000">${p.name}</td>
			    <td bgcolor="#FF0000">${p.belongs}</td>
				<td bgcolor="#FF0000">${p.paramNum}</td>
			</g:else>

			</tr>
		  </g:each>
		
		</table>
		
	  </div>
		  
		
		
		
	</div>
	<div class="col-sm-1"></div>
	</div>
		
	
	
	</div>
	
	<div class="col-sm-12" align="center">
		<div class="col-sm-1"></div>
		<div class="col-sm-10">
			<h1>Graph</h1>

		<div class="container theme-showcase" role="main">
	    	<g:layoutBody/>
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
