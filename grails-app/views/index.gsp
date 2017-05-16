<!DOCTYPE html>
<html lang="en" class="full">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <title>Hydrocarbon</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
  
    <link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon1.ico')}" type="image/x-icon">
    <!-- Bootstrap -->
    <link href="${assetPath(src: 'bootstrap.css')}" rel="stylesheet">
    <link href="${assetPath(src: 'full.css')}" rel="stylesheet">
    <link href="${assetPath(src: 'main1.css')}" rel="stylesheet">
    <link href="${assetPath(src: 'vendor.css')}" rel="stylesheet">
    <link href="${assetPath(src: 'base.css')}" rel="stylesheet">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>





	<!-- header
   ================================================== -->
   <header>

   	<div class="row">


	   	<nav id="main-nav-wrap">
				<ul class="main-navigation">
					<li class="current"><a class="smoothscroll"  href="#intro" title="">Home</a></li>
					<li><a class="smoothscroll"  href="#process" title="">Test</a></li>
					<li><a class="smoothscroll"  href="#features" title="">Team</a></li>
				</ul>
			</nav>

			<a class="menu-toggle" href="#"><span>Menu</span></a>

   	</div>

   </header> <!-- /header -->

	<!-- intro section
   ================================================== -->
   <section id="intro">

   	<div class="shadow-overlay"></div>

   	<div class="intro-content">
   		<div class="row">

		<div class="col-twelve" align="center">
          <div class="logo">
            <img src="${resource(dir: 'images', file: 'logo.png')}" style="width: 17em;height: 17em"/>
          </div>
	   			<!--<div class='video-link'>
	   				<a href="#video-popup"><img src="images/play-button.png" alt=""></a>
	   			</div>-->

	   			<h1>Java Code Smell Detection Tool</h1>
                <h5 style="color: white">Are you a good programmer?</h5>



   		</div>
   	</div>

   	<!-- Modal Popup
	   ========================================================= -->

      <!--<div id="video-popup" class="popup-modal mfp-hide">

		   <div class="fluid-video-wrapper">
            <iframe src="http://player.vimeo.com/video/14592941?title=0&amp;byline=0&amp;portrait=0&amp;color=faec09" width="500" height="281" frameborder="0" webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe>
         </div>

         <a class="close-popup">Close</a>

	   </div> <!-- /video-popup -->-->

   </section> <!-- /intro -->


   <!-- Process Section
   ================================================== -->
   <section id="process">

   	<div class="row section-intro">
   		<div class="col-twelve with-bottom-line">

   			<h5>Caracteristicas</h5>
   			<h1>¿Que hace a Ruby ser tan excelente?</h1>

   		</div>
   	</div>

   	<div>
   	
   	
   	                        <g:form controller="antlr" action="index">
                            <div class="form-group">
                                <div class="col-md-12" style="margin-bottom : 5px">
                                    <g:textArea name="code" placeholder= "Codigo"/>
                                </div>

                                <div class="col-md-6" style="margin-bottom : 5px; text-align : right">
                                    <!--  <button class="btn btn-primary" type="submit">Log in</submit> -->
                                    <label>&nbsp;</label><input type="submit" name="Login"/>
                                </div>
                            </div>
                        </g:form>
   	
   	
   	
   	</div>

   </section> <!-- /process-->


   <!-- features Section
   ================================================== -->
	<section id="features">

		<div class="row section-intro">
   		<div class="col-twelve with-bottom-line">

   			<h5>Team</h5>
   			<h3>Programming Languages</h3>
   			<h1>Universidad Nacional de Colombia</h1>

   		</div>
   	</div>

	</section> <!-- /features -->


   <!-- footer
   ================================================== -->
   <footer>


      <div class="footer-bottom">

      	<div class="row">

      		<div class="col-twelve">
	      		<div class="copyright">
		         	<span>© Copyright 2017. | <a href="http://www.Styleshout.com">Design</a></span>
		         </div>

		         <div id="go-top" style="display: block;">
		            <a class="smoothscroll" title="Back to Top" href="#top"><i class="icon ion-android-arrow-up"></i></a>
		         </div>
	      	</div>

      	</div> <!-- /footer-bottom -->

      </div>

   </footer>









    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${assetPath(src: 'bootstrap.min.js')}"></script>
    <script src="${assetPath(src: 'jquery-migrate-1.2.1.min.js')}"></script>
    <script src="${assetPath(src: 'plugins.js')}"></script>
    <script src="${assetPath(src: 'main.js')}"></script>
  </body>
</html>



