var xV = [];
var yV = [];
var zV = [];


function graficar(a,b,c){
	xV =a
	yV = b
	zV = c

	var data = [  	 {"x": 0, "y": 0, "z": 0 }];
	for (var i = 0; i < yV.length; i++) {
			data [i] = {"x": xV[i], "y": yV[i], "z": zV[i] }
		}
	 

	 var width = 800 , height = 400 ;

	 var svg = d3.select("body").append("svg")
	 	.attr( "width", width)
		.attr( "height", height)
		.append("g")
	 	.attr("transform" , "translate(30,30)");
	    
	 
	 
	 
	 
 	xRange = d3.scale.linear()
		.range([ 50, width-150])
		.domain([d3.min(data,function(d){return d.x;}),
		d3.max(data,function(d){return d.x ;})]);
	
 	yRange = d3.scale.linear()
			.range([ height-100, 50])
			.domain([d3.min(data,function(d){return d.y;}),
		d3.max(data,function(d){return d.y ;})]);
 	zRange = d3.scale.linear()
	.range([ height-100, 50])
	.domain([d3.min(data,function(d){return d.z;}),
	         d3.max(data,function(d){return d.z ;})]);
			
		var lineFunc = d3.svg.line()	  					
						.x(function(d){	return xRange(d.x );	})
	  					.y(function(d){return yRange(d.y );})
	  					
		
		var lineFuncz = d3.svg.line()	  					
		.x(function(d){	return xRange(d.x );	})
			.y(function(d){return zRange(d.z );})
			
	  					
	svg.append("svg:path")
		.attr("d", lineFunc(data))
		.attr("class", "line2")
	
		svg.append("svg:path")
		.attr("d", lineFuncz(data))
		.attr("class", "line")

	var xAxis = d3.svg.axis()
				.scale(xRange)
				.orient("bottom")
	var yAxis = d3.svg.axis()
				.scale(yRange)
				.orient("left")
	//sssssssssssss
		svg.append('text')
    		.attr({'id': 'xLabel', 'x': 300, 'y': 10, 'text-anchor': 'middle'})
    		.text('Graph');			
	
		svg.append('text')
    		.attr({'id': 'xLabel', 'x': 320, 'y': 340, 'text-anchor': 'middle'})
    		.text('Basic nitrogen');			
	
		svg.append('text')
	    	.attr('transform', 'translate( 0, 200)rotate(-90)')
	    	.attr({'id': 'yLabel', 'text-anchor': 'middle'})			
	    	.text('Total nitrogen');
	//sssssssss
		
		
	svg.append("g")
		.attr("class", "axis")
		.attr("transform" , "translate(0,300)")
		.call(xAxis)
	svg.append("g")
		.attr("class", "axis")
		.attr("transform" , "translate(50,0)")
		.call(yAxis)
	//sssssssssssssss
	/*for (var i = 0; i < yV.length; i++) {
			svg.append("circle")
				.attr("cx", 500+xV[i])
				.attr("cy", 100+yV[i])
				.attr("r", 2)
				.attr("fill", "blck")			}
		
		
	/*svg.select("g")
      .selectAll('circle')
      .transition()
      .duration(500)
      .ease('quad-out')
      .x(function(d){	return xRange(d.x );	})
	  .y(function(d){return zRange(d.z );})
	
		
		*/
		
		
}	
