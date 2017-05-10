<!DOCTYPE html>
<html lang="en" class="full">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.png')}" type="image/x-icon">
    <title>Hydrocarbon</title>
    <script type = "text/javascript">
      var name = "${session.muestra.nombre}"; // Synchronise with the name of sample
	  var proof1 = "${session.non}";
	  var proof2 = "${session.met}";
	  var proof3 = "${session.visco}";
	  var proof4 = "${session.nitro}";
	  document.writeln( '<h1 style = "margin-top : 100px; color:gray; text-align:center">' +name+ '</h1>' );
	
	</script>
    <script type = "text/javascript">
      var success = 1;
	  function print( success ){
	    if( success == 1 )
          document.write( '<img src ="${assetPath(src: 'verde.png')}" rel="images" class="img-rounder" style="height: 50px; width : 50px; margin : 10px"></img>' );
	    
        else
          document.write( '<img src ="${assetPath(src: 'rojo.png')}" rel="images" class="img-rounder" class="img-rounder" style="height: 50px; width : 50px; margin : 10px"></img>' );
	  }
	</script>
    <!-- Bootstrap -->
    <link href="${assetPath(src: 'bootstrap.css')}" rel="stylesheet">
    <link href="${assetPath(src: 'full.css')}" rel="stylesheet">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body background = "fondo.jpg">
    <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
           <a class="navbar-brand" href="#">Engineer</a>
        </div>
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
          <ul class="nav navbar-nav navbar-right" style="padding-bottom : 0px">
            <li><a href="/Proyecto1/ingeniero/index"><span class=" glyphicon glyphicon-home" style="font-size: 24px;"></span></a></li>
            
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><span class="glyphicon glyphicon-cog" style="font-size: 24px;"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="#"></a></li>
                <li class="divider"></li>
                <li><a href="#">Log out</a></li>
              </ul>
            </li>
            <li><img src="${assetPath(src: 'Engineer.png')}" rel="images" style="height: 50px; width : 50px; margin : 10px"></img></li>
          </ul>
        </div>
      </div>
    </nav>
	<div class = "col-md-1"></div>
	<div class = "col-md-2" size = 7 style = "text-align: center; margin-top : 70px">
	  <ul class = "list-unstyled">
        <li>
		  <script>
		    print( proof1 );
		  </script>
		</li>
		<li>
		  <script>
		    print( proof2 );
		  </script>
		</li>
		<li>
		  <script>
		    print( proof3 );
		  </script>
		</li>
		<li>
		  <script>
		    print( proof4 );
		  </script>
		</li>
	  </ul>
	</div>
	<div class = "col-md-5" size = 7 style = "text-align: center; margin-top : 70px">
	  <ul class = "list-unstyled" style = "margin-top : 10px">
        <h1 face = "arial" size = 6 style = "text-align: left; color:#0C5069">Nonmetallic mass balance</h1>
	  </ul>
	  <ul class = "list-unstyled" style = "margin-top : 30px">
        <h1 face = "arial" size = 6 style = "text-align: left; color:#0C5069">Metal mass balance</h1>
	  </ul>
	  <ul class = "list-unstyled" style = "margin-top : 30px">
        <h1 face = "arial" size = 6 style = "text-align: left; color:#0C5069">Viscosity proof</h1>
	  </ul>
	  <ul class = "list-unstyled" style = "margin-top : 30px">
        <h1 face = "arial" size = 6 style = "text-align: left; color:#0C5069">Nitrogen proof</h1>
	  </ul>
	</div>
	<div class = "col-md-3" size = 7 style = "background-color = white; text-align: center; margin-top : 10px">
	  <ul class = "list-unstyled" size = 7 style = "margin-top : 30%">
        <a class="btn btn-danger btn-lg"data-toggle="modal" data-target="#myModal" style = "margin-top : 15px; border-radius : 5px" >Delete analysis</a>
	  </ul>
	  <ul class = "list-unstyled" size = 7 style = "margin-top : 30px">
	    <a class="btn btn-primary btn-lg" style = "margin-top : 15px; border-radius : 5px" href="../ingeniero/index">Correct results</a>
	  </ul>
	</div>
	<!--Pop up-->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
      <div class="modal-dialog modal-sm" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <h4 class="modal-title" id="myModalLabel">Confirmation Message</h4>
          </div>
          <div class="modal-body" style="text-align : center">
            <div class="row">
              <div class="col-md-12">
                <h4>Do you want delete analyze sample of the Database?</h4>
              </div>
              <g:form controller="test" action="delete">
              <div class="col-md-6">
                <button type="submit" class="btn btn-success" style="margin : 10px">
                  <span class="glyphicon glyphicon-floppy-disk" style="font-size: 30px"></span>
                </button>
                <h5>Yes</h5>
              </div>
              <div class="col-md-6">
                <button class="btn btn-danger" data-dismiss="modal" style="margin : 10px">
                  <span class="glyphicon glyphicon-remove" style="font-size: 30px"></span>
                </button>
                <h5>Cancel</h5>
              </div>
              </g:form>
            </div>
          </div>
        </div>
      </div>
    </div>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="${assetPath(src: 'bootstrap.min.js')}"></script>
  </body>
</html>