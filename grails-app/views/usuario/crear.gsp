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
          <div class="row">
              <div class="col-md-8 col-md-offset-2" style="margin-top: 30px">
                  <div class="panel panel-primary">
                      <div class="panel-heading">
                          <h3 class="panel-title">Agregar Usuario</h3>
                      </div>
                      <div class="panel-body">
                          <g:form class="form-horizontal"  method="POST" controller="usuario" action="crear2" >
                              <fieldset>
                                  <div class="form-group">
                                      <label for="inputName" class="col-lg-2 control-label">Persona</label>
                                      <div  class="col-lg-10">
                                         <g:select id="persona" name="persona" from="${proyecto1.Persona.list()}" optionKey="documento" optionValue="documento" required="" value="${usuarioInstance?.persona?.id}" class="many-to-one"/>
                                         <!-- <g:select id="persona" name="persona" from="${proyecto1.Persona.list()}" optionKey="documento" optionValue="documento" required="" value="${usuarioInstance?.persona?.id}" class="many-to-one"/> -->
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label for="inputAcc" class="col-lg-2 control-label">Nivel de acceso</label>
                                      <div  class="col-lg-10">
                                          <input class="form-control" id="inputAcc" name="acceso" placeholder="Nivel de acceso" type="text">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label for="inputUsuario" class="col-lg-2 control-label">Usuario</label>
                                      <div  class="col-lg-10">
                                          <input class="form-control" id="inputUser" name="usuario" placeholder="Usuario" type="text">
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <label for="inputPass" class="col-lg-2 control-label">Contraseña</label>
                                      <div  class="col-lg-10">
                                          <input class="form-control" id="inputPass" name="password" placeholder="Password" type="password">
                                      </div>
                                  </div>                              
                                  <br>
                                  <br>
                                  <div class="form-group">
                                      <div class="col-lg-10 col-lg-offset-2">
                                          <!-- Cancel button -->
                                          <a type="reset" class="btn btn-default" href="#">Cancel</a>
                                          <a class="btn btn-primary" data-toggle="modal"  data-target="#myModal">Submit</a>
                                      </div>
                                  </div>
                                  <!-- Pop up  -->
                                  <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                                      <div class="modal-dialog modal-sm" role="document">
                                          <div class="modal-content">
                                              <div class="modal-header">
                                                  <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                                  <h4 class="modal-title" id="myModalLabel">Confimartion Message</h4>
                                              </div>
                                              <div class="modal-body" style="text-align : center">
                                                  <div class="row">
                                                      <div class="col-md-12">
                                                          <h4>Do you want to save the changes or modify the user data?</h4>
                                                      </div>
                                                      <div class="col-md-6">
                                                          <button type="submit" class="btn btn-success" style="margin : 10px">
                                                              <span class="glyphicon glyphicon-floppy-disk" style="font-size: 30px"></span>
                                                          </button>
                                                          <h5>Save</h5>
                                                      </div>
                                                      <div class="col-md-6">
                                                          <button class="btn btn-danger" data-dismiss="modal" style="margin : 10px">
                                                              <span class="glyphicon glyphicon-remove" style="font-size: 30px"></span>
                                                          </button>
                                                          <h5>Cancel</h5>
                                                      </div>
                                                  </div>
                                              </div>
                                            </div>
                                        </div>
                                    </div>
                                </fieldset>
                            </g:form>
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
