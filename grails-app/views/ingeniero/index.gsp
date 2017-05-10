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
                    <a class="navbar-brand" href="#">Engineer</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right" style="padding-bottom : 0px">
                        <li><a href="/Proyecto1/ingeniero/index"><span class=" glyphicon glyphicon-home" style="font-size: 24px;"></span></a></li>
                        
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><span class="glyphicon glyphicon-cog" style="font-size: 24px;"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li class="divider"></li>
                                <li><g:link controller="user" action="logout">Log out</g:link></li>
                            </ul>
                        </li>
                        <li><img  src="${assetPath(src: 'Engineer.png')}" rel="images" style="height: 50px; width : 50px; margin : 10px"></img></li>
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
                                  ¡Welcome! You are now in the engineer panel, please be extremely careful when inserting new data into the database.
                              </div>
                          </div>
                      </div>
                      <div class="panel panel-danger">
                          <div class="panel-heading" role="tab" id="headingTwo">
                              <h4 class="panel-title">
                                  <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                                      Progress
                                  </a>
                              </h4>
                          </div>
                          <div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
                              <div class="panel-body">
                                  Total of Samples: ${ proyecto1.Muestra.list().size() }
                                  <br>
                                  Total of Analyzed Samples: ${ proyecto1.AnalisisFraccion.list().size() } 
                              </div>
                          </div>
                      </div>
                      <div class="panel panel-danger">
                          <div class="panel-heading" role="tab" id="headingThree">
                              <h4 class="panel-title">
                                  <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                                      Information
                                  </a>
                              </h4>
                          </div>
                          <div id="collapseThree" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree">
                              <div class="panel-body">
                                 Name: ${ proyecto1.Usuario.findByUsuario( session.user ).persona.nombre }
                                 <br> 
                                 ID: ${ proyecto1.Usuario.findByUsuario( session.user ).persona.documento }
                                 <br>
                                 Username: ${ proyecto1.Usuario.findByUsuario( session.user ).usuario }
                              </div>
                          </div>
                      </div>
                  </div>
                </div>
                <div class="col-md-8" style="text-align: center; margin-top : 100px">
                    <div class="col-md-6" style="text-align:center">
                        <div class="btn-group-vertical">
                            <a href="#" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#createsampleform" style="margin : 40px; border-radius : 5px">Create new sample</a>
                            <a href="#" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#modifySample" style="margin : 40px; border-radius : 5px">Modify sample</a>
                            <a href="/Proyecto1/cliente/crear" class="btn btn-primary btn-lg" style="margin : 40px; border-radius : 5px">Register new client</a>
                      </div>
                  </div>
                  <div class="col-md-6" style="text-align:center">
                      <div class="btn-group-vertical">
                          <a href="#" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#clientReport" style="margin : 40px; border-radius : 5px">Generate analysis report for client</a>
                          <a href="#" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#engineerReport" style="margin : 40px; border-radius : 5px">Generate analysis report For engineer</a>
                          <a href="#" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#deleteSample" style="margin : 40px; border-radius : 5px">Request to delete sample</a>
                      </div>
                  </div>
                  <div class="modal fade" id="createsampleform" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" >
                      <div class="modal-dialog" role="document">
                          <div class="modal-content">
                              <div class="modal-header">
                                  <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                                  <h4 class="modal-title" id="myModalLabel">Create sample</h4>
                              </div>
                              <div class="modal-body" style="text-align : center;">
                                  <div class="row">
                                      <div class="col-md-12">
                                      <g:form class="form-horizontal" controller="muestra" action="insert">
                                          <fieldset>
                                              <div class="form-group">
                                                  <label for="inputName" class="col-lg-2 control-label">Name</label>
                                                  <div class="col-lg-10">
                                                      <input class="form-control" id="inputName" name="nombre" placeholder="Name" type="text">
                                                  </div>
                                              </div>
                                              <div class="form-group">
                                                  <label for="inputAPI" class="col-lg-2 control-label">API</label>
                                                  <div class="col-lg-10">
                                                      <input class="form-control" id="inputAPI" name="api" placeholder="API" type="text">
                                                  </div>
                                              </div>
                                              <div class="form-group">
                                                  <label for="inputName" class="col-lg-2 control-label">Name</label>
                                                  <div class="col-lg-10">
                                                      <g:select id="nombre" name="cliente" from="${proyecto1.Cliente.list()}" optionKey="nombre" optionValue="nombre" required="" value="${usuarioInstance?.Cliente?.id}" class="many-to-one"/>
                                                  </div>
                                              </div>
                                              <div class="form-group">
                                                  <div class="col-lg-10 col-lg-offset-2">
                                                      <button type="reset" class="btn btn-default" data-dismiss="modal">Cancel</button>
                                                      <button type="submit" class="btn btn-primary">Submit</button>
                                                  </div>
                                              </div>
                                          </fieldset>
                                      </g:form>
                                  </div>
                              </div>
                          </div>
                      </div>
                  </div>
              </div>
              <div class="modal fade" id="modifySample" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" >
                  <div class="modal-dialog" role="document">
                      <div class="modal-content">
                          <div class="modal-header">
                              <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                              <h4 class="modal-title" id="myModalLabel">Modify Sample</h4>
                          </div>
                          <div class="modal-body" style="text-align : center;">
                              <div class="row">
                                  <div class="col-md-12">
                                  <g:form class="form-horizontal" method="POST" controller="muestra" action="assign">
                                      <fieldset>
                                          <div class="form-group">
                                              <label for="inputEmail" class="col-lg-2 control-label">Name</label>
                                              <div class="col-lg-10">
                                                 <g:select id="nombre" name="nombre" from="${proyecto1.Muestra.list()}" optionKey="nombre" optionValue="nombre" required="" value="${usuarioInstance?.Muestra?.id}" class="many-to-one"/>                                              </div>
                                          </div>
                                          <div class="form-group">
                                              <div class="col-lg-10 col-lg-offset-2">
                                                  <button type="reset" class="btn btn-default" data-dismiss="modal">Cancel</button>
                                                  <button type="submit" class="btn btn-primary">Submit</button>
                                              </div>
                                          </div>
                                      </fieldset>
                                  </g:form>
                              </div>
                          </div>
                      </div>
                  </div>
              </div>
          </div>
          <div class="modal fade" id="engineerReport" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" >
              <div class="modal-dialog" role="document">
                  <div class="modal-content">
                      <div class="modal-header">
                          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                          <h4 class="modal-title" id="myModalLabel">Engineer Report</h4>
                      </div>
                      <div class="modal-body" style="text-align : center;">
                          <div class="row">
                              <div class="col-md-12">
                              <g:form class="form-horizontal" method="POST" controller="test" action="balance">
                                  <fieldset>
                                      <div class="form-group">
                                          <label for="inputEmail" class="col-lg-2 control-label">Name</label>
                                          <div class="col-lg-10">
                                             <g:select id="nombre" name="nombre" from="${proyecto1.Muestra.list()}" optionKey="nombre" optionValue="nombre" required="" value="${usuarioInstance?.Muestra?.id}" class="many-to-one"/>
                                          </div>
                                      </div>
                                      <div class="form-group">
                                          <div class="col-lg-10 col-lg-offset-2">
                                              <button type="reset" class="btn btn-default" data-dismiss="modal">Cancel</button>
                                              <button type="submit" class="btn btn-primary">Submit</button>
                                          </div>
                                      </div>
                                  </fieldset>
                              </g:form>
                          </div>
                      </div>
                  </div>
              </div>
          </div>
        </div>
      <div class="modal fade" id="clientReport" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" >
          <div class="modal-dialog" role="document">
              <div class="modal-content">
                  <div class="modal-header">
                      <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                      <h4 class="modal-title" id="myModalLabel">Client Report</h4>
                  </div>
                  <div class="modal-body" style="text-align : center;">
                      <div class="row">
                          <div class="col-md-12">
                          <g:form class="form-horizontal" method="POST" controller="report" action="index">
                              <fieldset>
                                  <div class="form-group">
                                      <label for="inputEmail" class="col-lg-2 control-label">Name</label>
                                      <div class="col-lg-10">
                                          <g:select id="nombre" name="nombre" from="${proyecto1.Muestra.list()}" optionKey="nombre" optionValue="nombre" required="" value="${usuarioInstance?.Muestra?.id}" class="many-to-one"/>
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <div class="col-lg-10 col-lg-offset-2">
                                          <button type="reset" class="btn btn-default" data-dismiss="modal">Cancel</button>
                                          <button type="submit" class="btn btn-primary">Submit</button>
                                      </div>
                                  </div>
                              </fieldset>
                          </g:form>
                      </div>
                  </div>
              </div>
          </div>
      </div>
        </div>
        <div class="modal fade" id="deleteSample" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" >
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                        <h4 class="modal-title" id="myModalLabel">Request to delete Sample</h4>
                    </div>
                    <div class="modal-body" style="text-align : center;">
                        <div class="row">
                            <div class="col-md-12">
                                <g:form class="form-horizontal" controller="Solicitud" action="insert" class="form-horizontal">
                                    <fieldset>
                                        <div class="form-group">
                                            <label for="inputEmail" class="col-lg-2 control-label">Name</label>
                                            <div class="col-lg-10">
                                               <g:select id="nombre" name="nombre" from="${proyecto1.Muestra.list()}" optionKey="nombre" optionValue="nombre" required="" value="${usuarioInstance?.Muestra?.id}" class="many-to-one"/>
                                            </div>
                                        </div>
                                         <div class="form-group">
                                            <label for="inputDescription" class="col-lg-2 control-label">Description</label>
                                            <div class="col-lg-10">
                                                <input class="form-control" id="inputEmail" name="description" placeholder="Description" type="text">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-lg-10 col-lg-offset-2">
                                                <button type="reset" class="btn btn-default" data-dismiss="modal">Cancel</button>
                                                <button type="submit" class="btn btn-primary">Submit</button>
                                            </div>
                                        </div>
                                    </fieldset>
                                </g:form>
                            </div>
                        </div>
                    </div>
                </div>
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
