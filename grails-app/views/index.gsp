<!DOCTYPE html>
<html lang="en" class="full">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <title>JavaSmells</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">


    <link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon1.ico')}" type="image/x-icon">
    <!-- Bootstrap -->
    <link href="${assetPath(src: 'bootstrap.css')}" rel="stylesheet">
    <link href="${assetPath(src: 'full.css')}" rel="stylesheet">
    <!-- <link href="${assetPath(src: 'fonts.css')}" rel="stylesheet"> -->
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
					<li><a class="smoothscroll"  href="#process" title="">How to</a></li>
					<li><a class="smoothscroll"  href="#features" title="">Test</a></li>
          	<li><a class="smoothscroll"  href="#pricing" title="">Team</a></li>
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
                <h5 style="color:white">Are you a good programmer?</h5>
   		</div>
   	</div>
   </section> <!-- /intro -->

   <section id="process">

     <div class="row section-intro">
    		<div class="col-twelve with-bottom-line">

    			<h5>How to ... </h5>
    			<h1>How does it work?</h1>

    			<p class="lead">In a few simple steps you can find out how great of a programmer you are.</p>

    		</div>
    	</div>

    	<div class="row features-content">

    		<div class="features-list block-1-3 block-s-1-2 block-tab-full group">

 	      	<div class="bgrid feature">

 	      		<span class="icon"><i class="icon-window"></i></span>

 	            <div class="service-content">

 	            	 <h3 class="h05">Choose</h3>

 		            <p>Select the code you want to test and then put all your program classes in a single file.</p>

 	         	</div>

 				</div> <!-- /bgrid -->

 				<div class="bgrid feature">

 					<span class="icon"><i class="icon-file"></i></span>

 	            <div class="service-content">
 	            	<h3 class="h05">Copy</h3>
 		            <p>Copy you entire file in the white square you are going to find below and click the <i>Summit</i> button.</p>
 	            </div>

 			   </div> <!-- /bgrid -->

 			   <div class="bgrid feature">

 			   	<span class="icon"><i class="icon-gift"></i></span>

 	            <div class="service-content">
 	            	<h3 class="h05">Enjoy!</h3>

 		            <p>Wait a few seconds and then find all the details about your code's posible bad smells.
 	        			</p>


 	            </div>

 			   </div> <!-- /bgrid -->
 	      </div> <!-- features-list -->

    	</div> <!-- features-content -->
   </section> <!-- /process-->

   <!-- Process Section
   ================================================== -->
   <section id="features">

   	<div class="row section-intro">
   		<div class="col-twelve with-bottom-line">

   			<h5>Tester</h5>
   			<h1>Are you a good programmer?</h1>
   		</div>
   	</div>

   	<div>

   	<div class="row" align="center">
   	<div class="col-sm-2"></div>

   	<div class="col-sm-8">
                  <g:form controller="antlr" action="index">
                  <div class="form-group">
                      <div class="col-md-12" style="margin-bottom : 5px">
                          <g:textArea name="code" placeholder= "Codigo"/ cols="100"></g:textArea>
                      </div>

                      <div class="col-md-6" style="margin-bottom : 5px; text-align : right">
                          <!--  <button class="btn btn-primary" type="submit">Log in</submit> -->
                          <label>&nbsp;</label><input type="submit" name="Login"/>
                      </div>
                  </div>
              </g:form>
      </div>
     <div class="col-sm-2"></div>
   	</div>


   	</div>

  </section> <!-- /features-->


   <!-- features Section
   ================================================== -->
	<section id="pricing">

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
