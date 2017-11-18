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
    <!-- <link href="${assetPath(src: 'bootstrap-theme.min.css')}" rel="stylesheet"> -->
    <!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous"> -->
    <!-- <link rel="stylesheet" href="https://cdn.datatables.net/1.10.15/css/dataTables.bootstrap4.min.css"> -->

    <link href="${assetPath(src: 'bootstrap.css')}" rel="stylesheet">
    <link href="${assetPath(src: 'full.css')}" rel="stylesheet">
    <link href="${assetPath(src: 'main1.css')}" rel="stylesheet">
    <link href="${assetPath(src: 'vendor.css')}" rel="stylesheet">
    <link href="${assetPath(src: 'base.css')}" rel="stylesheet">
    <link href="${assetPath(src: 'dataTables.bootstrap.min.css')}" rel="stylesheet">

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
                nodeSize = 30;
            //Definicion nodos
            var i = 0;
			//alert(name);
			// alert(a);
			// alert(b);
			// alert(d);
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
			                .attr('viewBox', "0 0 0 0")
			                .attr('refX', "0")
			                .attr('refY', "0")
			                .attr('markerUnits', "strokeWidth")
			                .attr('markerWidth', "10")
			                .attr('markerHeight', "10")
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
			        .attr('stroke', '#05bca9')
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

  </head>
  <body onload="main(${a},${b},${c},${d},${e})">
    <!-- Fixed navbar -->
    <!-- header
     ================================================== -->
     <header>

     	<div class="row">
  	   	<nav id="main-nav-wrap">
  				<ul class="main-navigation">
  					<li class="current"><a href="/Proyecto1" title="">Home</a></li>
  					<li><a class="smoothscroll"  href="#features" title="">Code Smells</a></li>
            <li><a class="smoothscroll"  href="#process" title="">Report</a></li>
  					<li><a class="smoothscroll"  href="#pricing" title="">Graph</a></li>
  				</ul>
  			</nav>

  			<a class="menu-toggle" href="/Proyecto1"><span>Menu</span></a>

     	</div>

     </header> <!-- /header -->
     <!-- Info bad Smells
      ===========================================-->
      <section id="features">

    		<div class="row section-intro">
       		<div class="col-twelve with-bottom-line">


       			<h1>Code Smells </h1>

       			<h5 class="lead"><em>"A code smell is a surface indication that usually corresponds to a deeper problem in the system"</em></h5>
            <h5 class="h06">Martin Fowler</h5>
       		</div>
       	</div>

       	<div class="row features-content">

       		<div class="features-list block-1-3 block-s-1-2 block-tab-full group">
			
			 <div class="bgrid feature">

    			   	<span class="icon"><i class="ion-earth"></i></span>

    	            <div class="service-content">
    	            	 <h3 class="h05">God Class </h3>

    		            <p>Classes that have increased to such huge proportions that they are hard to work with.</p>

    	            </div>

    			   </div> <!-- /bgrid -->
		

    	      	<div class="bgrid feature">

    	      		<span class="icon"><i class="icon-window"></i></span>

    	            <div class="service-content">

    	            	 <h3 class="h05">Long Class</h3>
    		            <p>Usually are classes with more than one hundred (100) lines of code.</p>

    	         	</div>

    				</div> <!-- /bgrid -->

    				<div class="bgrid feature">

    					<span class="icon"><i class="icon-eye"></i></span>

    	            <div class="service-content">
    	            	<h3 class="h05">Data Class</h3>
    		            <p>Class which only contains <i>accessor</i> and <i>mutator</i> methods.
    	         		</p>
    	            </div>

    			   </div> <!-- /bgrid -->

    			   <div class="bgrid feature">

    			   	<span class="icon"><i class="icon-new-file"></i></span>

    	            <div class="service-content">
    	            	<h3 class="h05">Lazy Class</h3>

    		            <p>Class that has not enough functionality, usually is a class that is never instantiated
    	        			</p>
    	            </div>

    			   </div> <!-- /bgrid -->

    				<div class="bgrid feature">

    					<span class="icon"><i class="icon-group"></i></span>

    	            <div class="service-content">
    	            	<h3 class="h05">Message Chains</h3>
    		            <p>Are excessively long methods calls.</p>
    	            </div>

    				</div> <!-- /bgrid -->

    			   <div class="bgrid feature">

    			   	<span class="icon"><i class="icon-layers"></i></span>

    	            <div class="service-content">
    	            	<h3 class="h05">Long Method</h3>

    		            <p>Methods with more than fifteen (15) lines of code.
    	        			</p>


    	            </div>

    			   </div> <!-- /bgrid -->

    			   <div class="bgrid feature">

    			   	<span class="icon"><i class="icon-files"></i></span>

    	            <div class="service-content">
    	            	 <h3 class="h05">Long Parameter list </h3>

    		            <p>Method that requires more than five parameters</p>

    	            </div>

    			   </div> <!-- /bgrid -->
             <div class="bgrid feature">

    			   	<span class="icon"><i class="icon-question"></i></span>

    	            <div class="service-content">
    	            	 <h3 class="h05">Uncommunicative variable names </h3>

    		            <p>Variables with meaningless names. Generally are variables which names are one or two letters long or variable names ending with a number.
    	        			</p>

    	            </div>

    			   </div> <!-- /bgrid -->
             <div class="bgrid feature">

    			   	<span class="icon"><i class="icon-network"></i></span>

    	            <div class="service-content">
    	            	 <h3 class="h05">Shotgun Surgery </h3>

    		            <p>Highly coupled classes.When a change is made it must also be made in other classes.</p>

    	            </div>

    			   </div> <!-- /bgrid -->

    	      </div> <!-- features-list -->

       	</div> <!-- features-content -->

    	</section> <!-- /features -->



     <!--  Tables report
      ===========================================-->
     <section id="process">

     	<div class="row section-intro">
     		<div class="col-twelve with-bottom-line">

     			<h1>Bad smells report</h1>

     			<p class="lead">Find all the details of your code</p>

     		</div>
     	</div>

		<div class="row process-content">
        <div class="col-sm-10">
      		<h3 class="h01">God Class</h3>
          <div class="col-sm-12" align="center">
            <table class="table table-hover table-bordered" id="table8">
              <thead>
                <tr>
                  <th>Name</th>
                  <th>Length</th>
                </tr>
              </thead>
              <tbody>
                  <g:each in="${largeClass}" var="p">
                  <tr>
                    <g:if test="${p.length < 100 }">
                      <td bgcolor="#70F98F">${p.name}</td>
                      <td bgcolor="#70F98F">${p.length}</td>
                    </g:if>
                    <g:else>
                      <td bgcolor="#F47171">${p.name}</td>
                      <td bgcolor="#F47171">${p.length}</td>
                    </g:else>
                  </tr>
                  </g:each>
              </tbody>
            </table>
          </div>
      	</div>
     </div> <!-- /process-content -->
     
     	<div class="row process-content">
        <div class="col-sm-10">
      		<h3 class="h01">Long Class</h3>
          <div class="col-sm-12" align="center">
            <table class="table table-hover table-bordered" id="table1">
              <thead>
                <tr>
                  <th>Name</th>
                  <th>Length</th>
                </tr>
              </thead>
              <tbody>
                  <g:each in="${largeClass}" var="p">
                  <tr>
                    <g:if test="${p.length < 100 }">
                      <td bgcolor="#70F98F">${p.name}</td>
                      <td bgcolor="#70F98F">${p.length}</td>
                    </g:if>
                    <g:else>
                      <td bgcolor="#F47171">${p.name}</td>
                      <td bgcolor="#F47171">${p.length}</td>
                    </g:else>
                  </tr>
                  </g:each>
              </tbody>
            </table>
          </div>
      	</div>
     </div> <!-- /process-content -->
     <br>
     <div class="row process-content">
      <div class="col-sm-10">
        <h3 class="h01">Data Class</h3>
        <div class="col-sm-12" align="center">
          <table class="table table-hover table-bordered" id="table2">
            <thead>
              <tr>
                <th>Class</th>
        		    <th>Number of methods </th>
        		    <th>Number of setters and getters</th>
              </tr>
            </thead>
            <tbody>
                <g:each in="${largeClass}" var="p">
                <tr>
                  <g:if test="${p.isDataClass == false }">
            			    <td bgcolor="#70F98F">${p.name}</td>
            			    <td bgcolor="#70F98F">${p.totalMethods}</td>
            				<td bgcolor="#70F98F">${p.setGetter}</td>
            			</g:if>
            			<g:else>
            			    <td bgcolor="#F47171">${p.name}</td>
            			    <td bgcolor="#F47171">${p.totalMethods}</td>
            				  <td bgcolor="#F47171">${p.setGetter}</td>
            			</g:else>
                </tr>
                </g:each>
            </tbody>
          </table>
        </div>
      </div>
     </div> <!-- /process-content -->
     <br>
     <div class="row process-content">
      <div class="col-sm-10">
        <h3 class="h01">Lazy Class</h3>
        <div class="col-sm-12" align="center">
          <table class="table table-hover table-bordered" id="table3">
            <thead>
              <tr>
                <th>Name</th>
                <th>Number of instances </th>
              </tr>
            </thead>
            <tbody>
                <g:each in="${largeClass}" var="p">
                <tr>
                  <g:if test="${p.countAp > 0}">
                    <td bgcolor="#70F98F">${p.name}</td>
                    <td bgcolor="#70F98F">${p.countAp}</td>
                  </g:if>
                  <g:else>
                    <td bgcolor="#F47171">${p.name}</td>
                    <td bgcolor="#F47171">${p.countAp}</td>
                  </g:else>
                </tr>
                </g:each>
            </tbody>
          </table>
        </div>
      </div>
     </div> <!-- /process-content -->
     <br>
     <div class="row process-content">
      <div class="col-sm-10">
        <h3 class="h01">Message chains</h3>
        <div class="col-sm-12" align="center">
          <table class="table table-hover table-bordered" id="table4">
            <thead>
              <tr>
                <th>Name</th>
                <th>Number of message chains </th>
              </tr>
            </thead>
            <tbody>
                <g:each in="${largeClass}" var="p">
                <tr>
                  <g:if test="${p.messageChains == 0}">
                    <td bgcolor="#70F98F">${p.name}</td>
                    <td bgcolor="#70F98F">${p.messageChains}</td>
                  </g:if>
                  <g:else>
                    <td bgcolor="#F47171">${p.name}</td>
                    <td bgcolor="#F47171">${p.messageChains}</td>
                  </g:else>
                </tr>
                </g:each>
            </tbody>
          </table>
        </div>
      </div>
     </div> <!-- /process-content -->
     <br>
     <div class="row process-content">
      <div class="col-sm-10">
        <h3 class="h01">Long Method</h3>
        <div class="col-sm-12" align="center">
          <table class="table table-hover table-bordered" id="table5">
            <thead>
              <tr>
                <th>Name</th>
        		    <th>Belongs</th>
        		    <th>Length</th>
              </tr>
            </thead>
            <tbody>
                <g:each in="${methodlength}" var="p">
                <tr>
                  	<g:if test="${p.length < 40}">
                    <td bgcolor="#70F98F">${p.name}</td>
                    <td bgcolor="#70F98F">${p.belongs}</td>
                    <td bgcolor="#70F98F">${p.length}</td>
                  </g:if>
                  <g:else>
                    <td bgcolor="#F47171">${p.name}</td>
                    <td bgcolor="#F47171">${p.belongs}</td>
                    <td bgcolor="#F47171">${p.length}</td>
                  </g:else>
                </tr>
                </g:each>
            </tbody>
          </table>
        </div>
      </div>
     </div> <!-- /process-content -->
     <br>
     <div class="row process-content">
      <div class="col-sm-10">
        <h3 class="h01">Long Parameter List</h3>
        <div class="col-sm-12" align="center">
          <table class="table table-hover table-bordered" id="table6">
            <thead>
              <tr>
                <th>Name</th>
        		    <th>Belongs</th>
        		    <th>Number of parameters</th>
              </tr>
            </thead>
            <tbody>
                <g:each in="${methodlength}" var="p">
                <tr>
                  	<g:if test="${p.paramNum < 5}">
                    <td bgcolor="#70F98F">${p.name}</td>
                    <td bgcolor="#70F98F">${p.belongs}</td>
                    <td bgcolor="#70F98F">${p.paramNum}</td>
                  </g:if>
                  <g:else>
                    <td bgcolor="#F47171">${p.name}</td>
                    <td bgcolor="#F47171">${p.belongs}</td>
                    <td bgcolor="#F47171">${p.paramNum}</td>
                  </g:else>
                </tr>
                </g:each>
            </tbody>
          </table>
        </div>
      </div>
     </div> <!-- /process-content -->
     <br>
     <div class="row process-content">
      <div class="col-sm-10">
        <h3 class="h01">Uncommunicative variable names</h3>
        <div class="col-sm-12" align="center">
          <table class="table table-hover table-bordered" id="table7">
            <thead>
              <tr>
                <th>Name</th>
                <th>Number of appearances </th>
              </tr>
            </thead>
            <tbody>
                <g:each in="${varNames}" var="p">
                <tr>
                  <td bgcolor="#70D4F9">${p.name}</td>
                  <td bgcolor="#70D4F9">${p.count}</td>
                </tr>
                </g:each>
            </tbody>
          </table>
        </div>
      </div>
     </div> <!-- /process-content -->
     </section> <!-- /process-->
     <section id="pricing">

     	<div class="row section-intro">
     		<div class="col-twelve with-bottom-line">
     			<h1>Graph</h1>
     			<p class="lead">In this graph is shown all the dependencies, implementations and extensions of a class.</p>
     		</div>
     	</div>
      <div class="row pricing-content">
          <g:layoutBody/>
      </div>







     </section> <!-- /pricing -->

<!--
	<div class="col-sm-12" align="center">
		<div class="col-sm-1"></div>
		<div class="col-sm-10">
			<h1>Graph</h1>


		</div>

	</div> -->
	<script src="${assetPath(src: 'vivagraph.js')}"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="https://cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js"></script>
  <script src="https://cdn.datatables.net/1.10.15/js/dataTables.bootstrap4.min.js"></script>
  <script src="${assetPath(src: 'bootstrap.min.js')}"></script>
  <script src="${assetPath(src: 'plugins.js')}"></script>
  <script src="${assetPath(src: 'main.js')}"></script>
  <script src="${assetPath(src: 'jquery-migrate-1.2.1.min.js')}"></script>
  <script>
      $('#table1').dataTable( );
      $('#table2').dataTable( );
      $('#table3').dataTable( );
      $('#table4').dataTable( );
      $('#table5').dataTable( );
      $('#table6').dataTable( );
      $('#table7').dataTable( );
      $('#table8').dataTable( );


  </script>

  </body>
</html>
