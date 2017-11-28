<!DOCTYPE html>
<html lang="en" class="full">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Hydrocarbon</title>

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
      <nav class="navbar navbar-default navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <!--<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button> -->
                    <a class="navbar-brand" href="#">Administrator</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right" style="padding-bottom : 0px">
                        <li><a href="/Proyecto1/administrador/index"><span class=" glyphicon glyphicon-home" style="font-size: 24px;"></span></a></li>
                       
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><span class="glyphicon glyphicon-cog" style="font-size: 24px;"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="#"></a></li>
                                <li class="divider"></li>
                                
                                <li><g:link controller="user" action="logout">Log out</g:link></li>
                            </ul>
                        </li>
                        <li><img src="${assetPath(src: 'Administrator.png')}" rel="images" style="height: 50px; width : 50px; margin : 10px"></img></li>
                    </ul>
                </div>
            </div>
        </nav>
      <div class="container">
          <div class"row">
              <div class="col-md-4" style="margin-top : 80px; text-align:center">
                  <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                      <div class="panel panel-danger">
                          <div class="panel-heading" role="tab" id="headingOne">
                              <h4 class="panel-title">
                                  <a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                                      Welcome
                                  </a>
                              </h4>
                          </div>
                          <div id="collapseOne" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
                              <div class="panel-body">
                                 ¡Welcome! You are now in the administration panel, please be extremely careful before performing any action.
                              </div>
                          </div>
                      </div>
                      <div class="panel panel-danger">
                          <div class="panel-heading" role="tab" id="headingTwo">
                              <h4 class="panel-title">
                                  <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                                      Requests
                                  </a>
                              </h4>
                          </div>
                          <div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
                              <div class="panel-body">
							     You have ${proyecto1.Solicitud.list().size()} request for sample deletion.
                              </div>
                          </div>
                      </div>
                      <div class="panel panel-danger">
                          <div class="panel-heading" role="tab" id="headingThree">
                              <h4 class="panel-title">
                                  <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                                      Total of users
                                  </a>
                              </h4>
                          </div>
                          <div id="collapseThree" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree">
                              <div class="panel-body">
							     Administrators: ${proyecto1.Usuario.findAllByAcceso(3).size()}
							     Engineer: ${proyecto1.Usuario.findAllByAcceso(2).size()}
							     Customer: ${proyecto1.Usuario.findAllByAcceso(1).size()}
                              </div>
                          </div>
                      </div>
                  </div>
                </div>
                <div class="col-md-8" style="text-align: center; margin-top : 100px">
                    <div class="col-md-6" style="text-align:center">
                        <div class="btn-group-vertical">
                            <a href="/Proyecto1/Usuario/crear" class="btn btn-primary btn-lg" controller="Usuario" action="crear" style="margin : 40px; border-radius : 5px">Introduce new user</a>
                            <!-- <li><g:link controller="Usuario" action="crear" style="margin : 40px; border-radius : 5px">Introduce New User</g:link></li> -->
                            <a href="/Proyecto1/usuario/del" class="btn btn-primary btn-lg" style="margin : 40px; border-radius : 5px">Delete user</a>
                      </div>
                  </div>
                  <div class="col-md-6" style="text-align:center">
                      <div class="btn-group-vertical">
                          <a href="/Proyecto1/Muestra/requestDelete" class="btn btn-primary btn-lg" controller="muestra" action="requestDelete" style="margin : 40px; border-radius : 5px">Requests</a>
                          <a href="/Proyecto1/persona/crear" class="btn btn-primary btn-lg" style="margin : 40px; border-radius : 5px">Create new person</a>
                      </div>
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
