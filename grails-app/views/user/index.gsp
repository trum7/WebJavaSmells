<!DOCTYPE html>
<html lang="en" class="full">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <title>Hydrocarbon</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
  
    <link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.png')}" type="image/x-icon">
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
  <body>
      <div class="container" style="margin: 15px">
          <div class="row">
              <div class="col-md-8 col-md-offset-2" style="padding: 25px">
                  <nav class="navbar navbar-default">
                        <div class="container-fluid">
                            <div class="navbar-header">
                                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                                    <span class="sr-only">Toggle navigation</span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                </button>
                                <a class="navbar-brand" href="#">Hydrocarbon</a>
                            </div>

                            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                                <ul class="nav navbar-nav navbar-right">
                                    <li class="active"><a href="#">Home<span class="sr-only">(current)</span></a></li>
                                    <li><a href="#">About</a></li>
                                    <li><a href="#">Help</a></li>

                                </ul>
                            </div>
                        </div>
                    </nav>
                </div>
            </div>
            <div class="row">
                <div class="col-md-8 col-md-offset-2">
                    <div class="col-md-6 col-md-offset-3" style="text-align : center">
                        <h1>Log in</h1>
                        <div class="message">
   						   ${flash.message}
                        </div>
                         <g:if test="${session.user}">
     					   <br/>
     						Login as : ${session.user} | <g:link action="goTo">Go to index</g:link>
  						</g:if>
  						<g:else>
                        <g:form controller="user" action="login">
                            <div class="form-group">
                                <div class="col-md-12" style="margin-bottom : 5px">
                                    <input class="form-control" id="inputEmail" name="username" placeholder="User" type="text">
                                </div>

                                <div class="col-md-12" style="margin-bottom : 5px">
                                    <input class="form-control" name="password" value="${password}" placeholder="Password" type="password">
                                </div>
                                   <div class="col-md-6" style="margin-bottom : 5px; text-align: left">
                                   

                                </div>
                                <div class="col-md-6" style="margin-bottom : 5px; text-align : right">
                                    <!--  <button class="btn btn-primary" type="submit">Log in</submit> -->
                                    <label>&nbsp;</label><input type="submit" name="Login"/>
                                </div>
                            </div>
                        </g:form>
                        </g:else>
                        
                        
                    </div>
                </div>

            </div>
        </div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${assetPath(src: 'bootstrap.min.js')}"></script>
  </body>
</html>



