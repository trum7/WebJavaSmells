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
                        <li><a href="/Proyecto1/ingeniero/index"><span class=" glyphicon glyphicon-home" style="font-size: 24px;"></span></a></li>
                        
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><span class="glyphicon glyphicon-cog" style="font-size: 24px;"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="#"></a></li>
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
          <div class="row">
              <div class="col-md-8 col-md-offset-2" style="margin-top: 30px">
                  <div class="panel panel-primary">
                      <div class="panel-heading">
                          <h3 class="panel-title">Fractions</h3>
                      </div>
                      <div class="panel-body">
                          <div class="col-md-6" >
                              <!-- Text -->
                              <ul class="nav nav-tabs">
                                  <li class=""><a aria-expanded="false" href="#home" data-toggle="tab">Home</a></li>

                              </ul>
                              <div id="myTabContent" class="tab-content">
                                  <div class="tab-pane fade active in" id="home">
                                      <p>¡Welcome! Please be carefull with the data that you insert in this area.</p>
                                  </div>
                                  <div class="tab-pane fade" id="profile">
                                      <p>Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid. Exercitation +1 labore velit, blog sartorial PBR leggings next level wes anderson artisan four loko farm-to-table craft beer twee. Qui photo booth letterpress, commodo enim craft beer mlkshk aliquip jean shorts ullamco ad vinyl cillum PBR. Homo nostrud organic, assumenda labore aesthetic magna delectus mollit.</p>
                                  </div>
                                  <div class="tab-pane fade" id="dropdown1">
                                      <p>Etsy mixtape wayfarers, ethical wes anderson tofu before they sold out mcsweeney's organic lomo retro fanny pack lo-fi farm-to-table readymade. Messenger bag gentrify pitchfork tattooed craft beer, iphone skateboard locavore carles etsy salvia banksy hoodie helvetica. DIY synth PBR banksy irony. Leggings gentrify squid 8-bit cred pitchfork.</p>
                                  </div>
                                  <div class="tab-pane fade" id="dropdown2">
                                      <p>Trust fund seitan letterpress, keytar raw denim keffiyeh etsy art party before they sold out master cleanse gluten-free squid scenester freegan cosby sweater. Fanny pack portland seitan DIY, art party locavore wolf cliche high life echo park Austin. Cred vinyl keffiyeh DIY salvia PBR, banh mi before they sold out farm-to-table VHS viral locavore cosby sweater.</p>
                                  </div>
                              </div>
                          </div>
                          <div class="col-md-6" style="text-align: center">
                              <!-- Buttons -->
                              <div class="btn-group-vertical" style="width : 200px">
                                  <a href="#" class="btn btn-default" data-toggle="modal" data-target="#1"><span class="badge">1</span> &nbsp &nbsp NAFTA 1</a>
                                  <a href="#" class="btn btn-primary" data-toggle="modal" data-target="#2"><span class="badge">2</span> &nbsp &nbsp NAFTA 2</a>
                                  <a href="#" class="btn btn-default" data-toggle="modal" data-target="#3"><span class="badge">3</span> &nbsp &nbsp NAFTA 3</a>
                                  <a href="#" class="btn btn-primary" data-toggle="modal" data-target="#4"><span class="badge">4</span> &nbsp &nbsp NAFTA 4</a>
                                  <a href="#" class="btn btn-default" data-toggle="modal" data-target="#5"><span class="badge">5</span> &nbsp &nbsp MEDIO 1</a>
                                  <a href="#" class="btn btn-primary" data-toggle="modal" data-target="#6"><span class="badge">6</span> &nbsp &nbsp MEDIO 2</a>
                                  <a href="#" class="btn btn-default" data-toggle="modal" data-target="#7"><span class="badge">7</span> &nbsp &nbsp MEDIO 3</a>
                                  <a href="#" class="btn btn-primary" data-toggle="modal" data-target="#8"><span class="badge">8</span> &nbsp &nbsp GASOLEO 1</a>
                                  <a href="#" class="btn btn-default" data-toggle="modal" data-target="#9"><span class="badge">9</span> &nbsp &nbsp GASOLEO 2</a>
                                  <a href="#" class="btn btn-primary" data-toggle="modal" data-target="#10"><span class="badge">10</span> &nbsp &nbsp GASOLEO 3</a>
                                  <a href="#" class="btn btn-default" data-toggle="modal" data-target="#11"><span class="badge">11</span> &nbsp &nbsp FONDO DE VACIO</a>
                              </div>
                          </div>
                          <div class="col-md-8 col-md-offset-2" style="text-align : center">
                          <g:form class="form-horizontal" method="POST" controller="fraccion" action="insert">
                              <fieldset>
                                  <div class="modal" id="1" >
                                      <div class="modal-dialog">
                                          <div class="modal-content">
                                              <div class="modal-header">
                                                  <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                                  <h4 class="modal-title">NAFTA 1</h4>
                                              </div>
                                              <div class="modal-body">
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Rendimiento</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="rendimiento1" name="rendimiento1" placeholder="Rendimiento"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 0 ).rendimiento }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Azufre</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="azufre1" name="azufre1" placeholder="Azufre" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 0 ).azufre }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Cenizas</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="cenizas1" name="cenizas1" placeholder="Cenizas" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 0 ).cenizas }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Asfaltenos</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="asfaltenos1" name="asfaltenos1" placeholder="Asfaltenos" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 0 ).asfaltenos }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 40</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad401" name="viscosidad401" placeholder="Viscosidad 40" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 0 ).viscosidad40 }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 50</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad501" name="viscosidad501" placeholder="Viscosidad 50" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 0 ).viscosidad50 }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 80</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad801" name="viscosidad801" placeholder="Viscosidad 80" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 0 ).viscosidad80 }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 100</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1001" name="viscosidad1001" placeholder="Viscosidad 100" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 0 ).viscosidad100 }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 120</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1201" name="viscosidad1201" placeholder="Viscosidad 120" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 0 ).viscosidad120 }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 140</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1401" name="viscosidad1401" placeholder="Viscosidad 140" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 0 ).viscosidad140 }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Nitrogeno Basico</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="nitrogeno1" name="nitrogeno1" placeholder="Nitrogeno Basico" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 0 ).nitrogenoBasico }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Aluminio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="aluminio1" name="aluminio1" placeholder="Aluminio" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 0 ).aluminio }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Niquel</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="niquel1" name="niquel1" placeholder="Niquel" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 0 ).niquel }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Vanadio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="vanadio1" name="vanadio1" placeholder="Vanadio" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 0 ).vanadio }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Hierro</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="hierro1" name="hierro1" placeholder="Hierro" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 0 ).hierro }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Cobre</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="cobre1" name="cobre1" placeholder="Cobre" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 0 ).cobre }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Magnesio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="magnesio1" name="magnesio1" placeholder="Magnesio" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 0 ).magnesio }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Calcio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="calcio1" name="calcio1" placeholder="Calcio" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 0 ).calcio }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Sodio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="sodio1" name="sodio1" placeholder="Sodio" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 0 ).sodio }" type="text">
                                                      </div>
                                                  </div>
                                              </div>
                                              <div class="modal-footer">
                                                  <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                                  <div class="modal" id="2" >
                                      <div class="modal-dialog">
                                          <div class="modal-content">
                                              <div class="modal-header">
                                                  <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                                  <h4 class="modal-title">NAFTA 2</h4>
                                              </div>
                                              <div class="modal-body">
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Rendimiento</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="rendimiento1" name="rendimiento2" placeholder="Rendimiento" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 1 ).rendimiento }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Azufre</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="azufre1" name="azufre2" placeholder="Azufre" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 1 ).azufre }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Cenizas</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="cenizas1" name="cenizas2" placeholder="Cenizas" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 1 ).cenizas }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Asfaltenos</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="asfaltenos1" name="asfaltenos2" placeholder="Asfaltenos" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 1 ).asfaltenos }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 40</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad401" name="viscosidad402" placeholder="Viscosidad 40" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 1 ).viscosidad40 }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 50</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad501" name="viscosidad502" placeholder="Viscosidad 50" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 1 ).viscosidad50 }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 80</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad801" name="viscosidad802" placeholder="Viscosidad 80" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 1 ).viscosidad80 }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 100</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1001" name="viscosidad1002" placeholder="Viscosidad 100" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 1 ).viscosidad100 }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 120</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1201" name="viscosidad1202" placeholder="Viscosidad 120" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 1 ).viscosidad120 }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 140</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1401" name="viscosidad1402" placeholder="Viscosidad 140" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 1 ).viscosidad140 }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Nitrogeno Basico</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="nitrogeno1" name="nitrogeno2" placeholder="Nitrogeno Basico" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 1 ).nitrogenoBasico }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Aluminio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="aluminio1" name="aluminio2" placeholder="Aluminio" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 1 ).aluminio }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Niquel</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="niquel1" name="niquel2" placeholder="Niquel" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 1 ).niquel }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Vanadio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="vanadio1" name="vanadio2" placeholder="Vanadio" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 1 ).vanadio }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Hierro</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="hierro1" name="hierro2" placeholder="Hierro" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 1 ).hierro }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Cobre</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="cobre1" name="cobre2" placeholder="Cobre" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 1 ).cobre }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Magnesio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="magnesio1" name="magnesio2" placeholder="Magnesio" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 1 ).magnesio }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Calcio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="calcio1" name="calcio2" placeholder="Calcio" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 1 ).calcio }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Sodio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="sodio1" name="sodio2" placeholder="Sodio" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 1 ).sodio }" type="text">
                                                      </div>
                                                  </div>
                                              </div>
                                              <div class="modal-footer">
                                                  <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                                  <div class="modal" id="3" >
                                      <div class="modal-dialog">
                                          <div class="modal-content">
                                              <div class="modal-header">
                                                  <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                                  <h4 class="modal-title">NAFTA 3</h4>
                                              </div>
                                              <div class="modal-body">
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Rendimiento</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="rendimiento1" name="rendimiento3" placeholder="Rendimiento" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 2 ).rendimiento }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Azufre</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="azufre1" name="azufre3" placeholder="Azufre" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 2 ).azufre }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Cenizas</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="cenizas1" name="cenizas3" placeholder="Cenizas" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 2 ).cenizas }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Asfaltenos</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="asfaltenos1" name="asfaltenos3" placeholder="Asfaltenos"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 2 ).asfaltenos }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 40</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad401" name="viscosidad403" placeholder="Viscosidad 40"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 2 ).viscosidad40 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 50</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad501" name="viscosidad503" placeholder="Viscosidad 50"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 2 ).viscosidad50 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 80</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad801" name="viscosidad803" placeholder="Viscosidad 80"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 2 ).viscosidad80 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 100</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1001" name="viscosidad1003" placeholder="Viscosidad 100"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 2 ).viscosidad100 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 120</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1201" name="viscosidad1203" placeholder="Viscosidad 120"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 2 ).viscosidad120 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 140</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1401" name="viscosidad1403" placeholder="Viscosidad 140"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 2 ).viscosidad140 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Nitrogeno Basico</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="nitrogeno1" name="nitrogeno3" placeholder="Nitrogeno Basico"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 2 ).nitrogenoBasico }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Aluminio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="aluminio1" name="aluminio3" placeholder="Aluminio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 2 ).aluminio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Niquel</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="niquel1" name="niquel3" placeholder="Niquel"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 2 ).niquel }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Vanadio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="vanadio1" name="vanadio3" placeholder="Vanadio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 2 ).vanadio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Hierro</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="hierro1" name="hierro3" placeholder="Hierro"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 2 ).hierro }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Cobre</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="cobre1" name="cobre3" placeholder="Cobre"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 2 ).cobre }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Magnesio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="magnesio1" name="magnesio3" placeholder="Magnesio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 2 ).magnesio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Calcio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="calcio1" name="calcio3" placeholder="Calcio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 2 ).calcio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Sodio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="sodio1" name="sodio3" placeholder="Sodio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 2 ).sodio }"  type="text">
                                                      </div>
                                                  </div>
                                              </div>
                                              <div class="modal-footer">
                                                  <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                                  <div class="modal" id="4" >
                                      <div class="modal-dialog">
                                          <div class="modal-content">
                                              <div class="modal-header">
                                                  <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                                  <h4 class="modal-title">NAFTA 4</h4>
                                              </div>
                                              <div class="modal-body">
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Rendimiento</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="rendimiento1" name="rendimiento4" placeholder="Rendimiento" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 3 ).rendimiento }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Azufre</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="azufre1" name="azufre4" placeholder="Azufre"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 3 ).azufre }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Cenizas</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="cenizas1" name="cenizas4" placeholder="Cenizas"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 3 ).cenizas }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Asfaltenos</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="asfaltenos1" name="asfaltenos4" placeholder="Asfaltenos"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 3 ).asfaltenos }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 40</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad401" name="viscosidad404" placeholder="Viscosidad 40"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 3 ).viscosidad40 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 50</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad501" name="viscosidad504" placeholder="Viscosidad 50"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 3 ).viscosidad50 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 80</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad801" name="viscosidad804" placeholder="Viscosidad 80"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 3 ).viscosidad80 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 100</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1001" name="viscosidad1004" placeholder="Viscosidad 100"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 3 ).viscosidad100 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 120</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1201" name="viscosidad1204" placeholder="Viscosidad 120"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 3 ).viscosidad120 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 140</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1401" name="viscosidad1404" placeholder="Viscosidad 140"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 3 ).viscosidad140 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Nitrogeno Basico</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="nitrogeno1" name="nitrogeno4" placeholder="Nitrogeno Basico"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 3 ).nitrogenoBasico }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Aluminio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="aluminio1" name="aluminio4" placeholder="Aluminio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 3 ).aluminio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Niquel</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="niquel1" name="niquel4" placeholder="Niquel"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 3 ).niquel }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Vanadio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="vanadio1" name="vanadio4" placeholder="Vanadio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 3 ).vanadio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Hierro</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="hierro1" name="hierro4" placeholder="Hierro"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 3 ).hierro }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Cobre</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="cobre1" name="cobre4" placeholder="Cobre"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 3 ).cobre }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Magnesio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="magnesio1" name="magnesio4" placeholder="Magnesio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 3 ).magnesio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Calcio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="calcio1" name="calcio4" placeholder="Calcio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 3 ).calcio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Sodio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="sodio1" name="sodio4" placeholder="Sodio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 3 ).sodio }"  type="text">
                                                      </div>
                                                  </div>
                                              </div>
                                              <div class="modal-footer">
                                                  <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                                  <div class="modal" id="5" >
                                      <div class="modal-dialog">
                                          <div class="modal-content">
                                              <div class="modal-header">
                                                  <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                                  <h4 class="modal-title">MEDIO 1</h4>
                                              </div>
                                              <div class="modal-body">
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Rendimiento</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="rendimiento1" name="rendimiento5" placeholder="Rendimiento" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 4 ).rendimiento }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Azufre</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="azufre1" name="azufre5" placeholder="Azufre"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 4 ).azufre }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Cenizas</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="cenizas1" name="cenizas5" placeholder="Cenizas"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 4 ).cenizas }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Asfaltenos</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="asfaltenos1" name="asfaltenos5" placeholder="Asfaltenos"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 4 ).asfaltenos }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 40</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad401" name="viscosidad405" placeholder="Viscosidad 40"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 4 ).viscosidad40 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 50</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad501" name="viscosidad505" placeholder="Viscosidad 50"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 4 ).viscosidad50 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 80</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad801" name="viscosidad805" placeholder="Viscosidad 80"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 4 ).viscosidad80 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 100</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1001" name="viscosidad1005" placeholder="Viscosidad 100"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 4 ).viscosidad100 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 120</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1201" name="viscosidad1205" placeholder="Viscosidad 120"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 4 ).viscosidad120 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 140</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1401" name="viscosidad1405" placeholder="Viscosidad 140"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 4 ).viscosidad140 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Nitrogeno Basico</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="nitrogeno1" name="nitrogeno5" placeholder="Nitrogeno Basico"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 4 ).nitrogenoBasico }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Aluminio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="aluminio1" name="aluminio5" placeholder="Aluminio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 4 ).aluminio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Niquel</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="niquel1" name="niquel5" placeholder="Niquel"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 4 ).niquel }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Vanadio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="vanadio1" name="vanadio5" placeholder="Vanadio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 4 ).vanadio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Hierro</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="hierro1" name="hierro5" placeholder="Hierro"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 4 ).hierro }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Cobre</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="cobre1" name="cobre5" placeholder="Cobre"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 4 ).cobre }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Magnesio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="magnesio1" name="magnesio5" placeholder="Magnesio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 4 ).magnesio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Calcio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="calcio1" name="calcio5" placeholder="Calcio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 4 ).calcio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Sodio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="sodio1" name="sodio5" placeholder="Sodio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 4 ).sodio }"  type="text">
                                                      </div>
                                                  </div>
                                              </div>
                                              <div class="modal-footer">
                                                  <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                                  <div class="modal" id="6" >
                                      <div class="modal-dialog">
                                          <div class="modal-content">
                                              <div class="modal-header">
                                                  <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                                  <h4 class="modal-title">MEDIO 2</h4>
                                              </div>
                                              <div class="modal-body">
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Rendimiento</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="rendimiento1" name="rendimiento6" placeholder="Rendimiento" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 5 ).rendimiento }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Azufre</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="azufre1" name="azufre6" placeholder="Azufre"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 5 ).azufre }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Cenizas</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="cenizas1" name="cenizas6" placeholder="Cenizas"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 5 ).cenizas }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Asfaltenos</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="asfaltenos1" name="asfaltenos6" placeholder="Asfaltenos"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 5 ).asfaltenos }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 40</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad401" name="viscosidad406" placeholder="Viscosidad 40"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 5 ).viscosidad40 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 50</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad501" name="viscosidad506" placeholder="Viscosidad 50"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 5 ).viscosidad50 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 80</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad801" name="viscosidad806" placeholder="Viscosidad 80"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 5 ).viscosidad80 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 100</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1001" name="viscosidad1006" placeholder="Viscosidad 100"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 5 ).viscosidad100 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 120</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1201" name="viscosidad1206" placeholder="Viscosidad 120"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 5 ).viscosidad120 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 140</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1401" name="viscosidad1406" placeholder="Viscosidad 140"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 5 ).viscosidad140 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Nitrogeno Basico</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="nitrogeno1" name="nitrogeno6" placeholder="Nitrogeno Basico"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 5 ).nitrogenoBasico }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Aluminio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="aluminio1" name="aluminio6" placeholder="Aluminio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 5 ).aluminio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Niquel</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="niquel1" name="niquel6" placeholder="Niquel"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 5 ).niquel }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Vanadio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="vanadio1" name="vanadio6" placeholder="Vanadio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 5 ).vanadio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Hierro</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="hierro1" name="hierro6" placeholder="Hierro"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 5 ).hierro }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Cobre</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="cobre1" name="cobre6" placeholder="Cobre"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 5 ).cobre }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Magnesio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="magnesio1" name="magnesio6" placeholder="Magnesio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 5 ).magnesio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Calcio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="calcio1" name="calcio6" placeholder="Calcio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 5 ).calcio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Sodio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="sodio1" name="sodio6" placeholder="Sodio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 5 ).sodio }"  type="text">
                                                      </div>
                                                  </div>
                                              </div>
                                              <div class="modal-footer">
                                                  <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                                  <div class="modal" id="7" >
                                      <div class="modal-dialog">
                                          <div class="modal-content">
                                              <div class="modal-header">
                                                  <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                                  <h4 class="modal-title">MEDIO 3</h4>
                                              </div>
                                              <div class="modal-body">
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Rendimiento</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="rendimiento1" name="rendimiento7" placeholder="Rendimiento" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 6 ).rendimiento }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Azufre</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="azufre1" name="azufre7" placeholder="Azufre"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 6 ).azufre }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Cenizas</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="cenizas1" name="cenizas7" placeholder="Cenizas"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 6 ).cenizas }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Asfaltenos</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="asfaltenos1" name="asfaltenos7" placeholder="Asfaltenos"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 6 ).asfaltenos }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 40</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad401" name="viscosidad407" placeholder="Viscosidad 40"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 6 ).viscosidad40 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 50</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad501" name="viscosidad507" placeholder="Viscosidad 50"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 6 ).viscosidad50 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 80</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad801" name="viscosidad807" placeholder="Viscosidad 80"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 6 ).viscosidad80 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 100</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1001" name="viscosidad1007" placeholder="Viscosidad 100"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 6 ).viscosidad100 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 120</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1201" name="viscosidad1207" placeholder="Viscosidad 120"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 6 ).viscosidad120 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 140</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1401" name="viscosidad1407" placeholder="Viscosidad 140"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 6 ).viscosidad140 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Nitrogeno Basico</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="nitrogeno1" name="nitrogeno7" placeholder="Nitrogeno Basico"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 6 ).nitrogenoBasico }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Aluminio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="aluminio1" name="aluminio7" placeholder="Aluminio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 6 ).aluminio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Niquel</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="niquel1" name="niquel7" placeholder="Niquel"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 6 ).niquel }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Vanadio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="vanadio1" name="vanadio7" placeholder="Vanadio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 6 ).vanadio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Hierro</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="hierro1" name="hierro7" placeholder="Hierro"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 6 ).hierro }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Cobre</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="cobre1" name="cobre7" placeholder="Cobre"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 6 ).cobre }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Magnesio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="magnesio1" name="magnesio7" placeholder="Magnesio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 6 ).magnesio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Calcio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="calcio1" name="calcio7" placeholder="Calcio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 6 ).calcio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Sodio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="sodio1" name="sodio7" placeholder="Sodio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 6 ).sodio }"  type="text">
                                                      </div>
                                                  </div>
                                              </div>
                                              <div class="modal-footer">
                                                  <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                                  <div class="modal" id="8" >
                                      <div class="modal-dialog">
                                          <div class="modal-content">
                                              <div class="modal-header">
                                                  <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                                  <h4 class="modal-title">GASOLEO 1</h4>
                                              </div>
                                              <div class="modal-body">
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Rendimiento</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="rendimiento1" name="rendimiento8" placeholder="Rendimiento" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 7 ).rendimiento }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Azufre</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="azufre1" name="azufre8" placeholder="Azufre"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 7 ).azufre }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Cenizas</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="cenizas1" name="cenizas8" placeholder="Cenizas"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 7 ).cenizas }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Asfaltenos</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="asfaltenos1" name="asfaltenos8" placeholder="Asfaltenos"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 7 ).asfaltenos }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 40</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad401" name="viscosidad408" placeholder="Viscosidad 40"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 7 ).viscosidad40 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 50</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad501" name="viscosidad508" placeholder="Viscosidad 50"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 7 ).viscosidad50 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 80</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad801" name="viscosidad808" placeholder="Viscosidad 80"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 7 ).viscosidad80 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 100</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1001" name="viscosidad1008" placeholder="Viscosidad 100"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 7 ).viscosidad100 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 120</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1201" name="viscosidad1208" placeholder="Viscosidad 120"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 7 ).viscosidad120 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 140</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1401" name="viscosidad1408" placeholder="Viscosidad 140"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 7 ).viscosidad140 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Nitrogeno Basico</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="nitrogeno1" name="nitrogeno8" placeholder="Nitrogeno Basico"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 7 ).nitrogenoBasico }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Aluminio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="aluminio1" name="aluminio8" placeholder="Aluminio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 7 ).aluminio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Niquel</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="niquel1" name="niquel8" placeholder="Niquel"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 7 ).niquel }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Vanadio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="vanadio1" name="vanadio8" placeholder="Vanadio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 7 ).vanadio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Hierro</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="hierro1" name="hierro8" placeholder="Hierro"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 7 ).hierro }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Cobre</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="cobre1" name="cobre8" placeholder="Cobre"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 7 ).cobre }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Magnesio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="magnesio1" name="magnesio8" placeholder="Magnesio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 7 ).magnesio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Calcio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="calcio1" name="calcio8" placeholder="Calcio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 7 ).calcio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Sodio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="sodio1" name="sodio8" placeholder="Sodio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 7 ).sodio }"  type="text">
                                                      </div>
                                                  </div>
                                              </div>
                                              <div class="modal-footer">
                                                  <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                                  <div class="modal" id="9" >
                                      <div class="modal-dialog">
                                          <div class="modal-content">
                                              <div class="modal-header">
                                                  <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                                  <h4 class="modal-title">GASOLEO 2</h4>
                                              </div>
                                              <div class="modal-body">
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Rendimiento</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="rendimiento1" name="rendimiento9" placeholder="Rendimiento" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 8 ).rendimiento }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Azufre</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="azufre1" name="azufre9" placeholder="Azufre"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 8 ).azufre }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Cenizas</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="cenizas1" name="cenizas9" placeholder="Cenizas"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 8 ).cenizas }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Asfaltenos</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="asfaltenos1" name="asfaltenos9" placeholder="Asfaltenos"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 8 ).asfaltenos }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 40</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad401" name="viscosidad409" placeholder="Viscosidad 40"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 8 ).viscosidad40 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 50</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad501" name="viscosidad509" placeholder="Viscosidad 50"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 8 ).viscosidad50 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 80</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad801" name="viscosidad809" placeholder="Viscosidad 80"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 8 ).viscosidad80 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 100</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1001" name="viscosidad1009" placeholder="Viscosidad 100"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 8 ).viscosidad100 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 120</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1201" name="viscosidad1209" placeholder="Viscosidad 120"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 8 ).viscosidad120 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 140</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1401" name="viscosidad1409" placeholder="Viscosidad 140"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 8 ).viscosidad140 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Nitrogeno Basico</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="nitrogeno1" name="nitrogeno9" placeholder="Nitrogeno Basico"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 8 ).nitrogenoBasico }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Aluminio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="aluminio1" name="aluminio9" placeholder="Aluminio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 8 ).aluminio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Niquel</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="niquel1" name="niquel9" placeholder="Niquel"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 8 ).niquel }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Vanadio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="vanadio1" name="vanadio9" placeholder="Vanadio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 8 ).vanadio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Hierro</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="hierro1" name="hierro9" placeholder="Hierro"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 8 ).hierro }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Cobre</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="cobre1" name="cobre9" placeholder="Cobre"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 8 ).cobre }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Magnesio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="magnesio1" name="magnesio9" placeholder="Magnesio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 8 ).magnesio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Calcio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="calcio1" name="calcio9" placeholder="Calcio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 8 ).calcio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Sodio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="sodio1" name="sodio9" placeholder="Sodio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 8 ).sodio }"  type="text">
                                                      </div>
                                                  </div>
                                              </div>
                                              <div class="modal-footer">
                                                  <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                                  <div class="modal" id="10" >
                                      <div class="modal-dialog">
                                          <div class="modal-content">
                                              <div class="modal-header">
                                                  <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                                  <h4 class="modal-title">GASOLEO 3</h4>
                                              </div>
                                              <div class="modal-body">
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Rendimiento</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="rendimiento1" name="rendimiento10" placeholder="Rendimiento" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 9 ).rendimiento }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Azufre</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="azufre1" name="azufre10" placeholder="Azufre"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 9 ).azufre }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Cenizas</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="cenizas1" name="cenizas10" placeholder="Cenizas"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 9 ).cenizas }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Asfaltenos</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="asfaltenos1" name="asfaltenos10" placeholder="Asfaltenos"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 9 ).asfaltenos }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 40</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad401" name="viscosidad4010" placeholder="Viscosidad 40"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 9 ).viscosidad40 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 50</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad501" name="viscosidad5010" placeholder="Viscosidad 50"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 9 ).viscosidad50 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 80</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad801" name="viscosidad8010" placeholder="Viscosidad 80"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 9 ).viscosidad80 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 100</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1001" name="viscosidad10010" placeholder="Viscosidad 100"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 9 ).viscosidad100 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 120</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1201" name="viscosidad12010" placeholder="Viscosidad 120"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 9 ).viscosidad120 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 140</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1401" name="viscosidad14010" placeholder="Viscosidad 140"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 9 ).viscosidad140 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Nitrogeno Basico</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="nitrogeno1" name="nitrogeno10" placeholder="Nitrogeno Basico"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 9 ).nitrogenoBasico }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Aluminio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="aluminio1" name="aluminio10" placeholder="Aluminio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 9 ).aluminio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Niquel</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="niquel1" name="niquel10" placeholder="Niquel"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 9 ).niquel }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Vanadio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="vanadio1" name="vanadio10" placeholder="Vanadio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 9 ).vanadio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Hierro</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="hierro1" name="hierro10" placeholder="Hierro"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 9 ).hierro }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Cobre</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="cobre1" name="cobre10" placeholder="Cobre"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 9 ).cobre }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Magnesio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="magnesio1" name="magnesio10" placeholder="Magnesio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 9 ).magnesio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Calcio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="calcio1" name="calcio10" placeholder="Calcio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 9 ).calcio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Sodio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="sodio1" name="sodio10" placeholder="Sodio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 9 ).sodio }"  type="text">
                                                      </div>
                                                  </div>
                                              </div>
                                              <div class="modal-footer">
                                                  <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                                  <div class="modal" id="11" >
                                      <div class="modal-dialog">
                                          <div class="modal-content">
                                              <div class="modal-header">
                                                  <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                                  <h4 class="modal-title">FONDO DE VACIO</h4>
                                              </div>
                                              <div class="modal-body">
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Rendimiento</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="rendimiento1" name="rendimiento11" placeholder="Rendimiento" value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 10 ).rendimiento }" type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Azufre</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="azufre1" name="azufre11" placeholder="Azufre"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 10 ).azufre }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Cenizas</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="cenizas1" name="cenizas11" placeholder="Cenizas"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 10 ).cenizas }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Asfaltenos</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="asfaltenos1" name="asfaltenos11" placeholder="Asfaltenos"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 10 ).asfaltenos }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 40</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad401" name="viscosidad4011" placeholder="Viscosidad 40"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 10 ).viscosidad40 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 50</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad501" name="viscosidad5011" placeholder="Viscosidad 50"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 10 ).viscosidad50 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 80</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad801" name="viscosidad8011" placeholder="Viscosidad 80"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 10 ).viscosidad80 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 100</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1001" name="viscosidad10011" placeholder="Viscosidad 100"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 10 ).viscosidad100 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 120</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1201" name="viscosidad12011" placeholder="Viscosidad 120"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 10 ).viscosidad120 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Viscosidad 140</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="viscosidad1401" name="viscosidad14011" placeholder="Viscosidad 140"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 10 ).viscosidad140 }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Nitrogeno Basico</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="nitrogeno1" name="nitrogeno11" placeholder="Nitrogeno Basico"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 10 ).nitrogenoBasico }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Aluminio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="aluminio1" name="aluminio11" placeholder="Aluminio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 10 ).aluminio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Niquel</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="niquel1" name="niquel11" placeholder="Niquel"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 10 ).niquel }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Vanadio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="vanadio1" name="vanadio11" placeholder="Vanadio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 10 ).vanadio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Hierro</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="hierro1" name="hierro11" placeholder="Hierro"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 10 ).hierro }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Cobre</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="cobre1" name="cobre11" placeholder="Cobre"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 10 ).cobre }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Magnesio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="magnesio1" name="magnesio11" placeholder="Magnesio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 10 ).magnesio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Calcio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="calcio1" name="calcio11" placeholder="Calcio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 10 ).calcio }"  type="text">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label for="inputEmail" class="col-lg-2 control-label">Sodio</label>
                                                      <div class="col-lg-10">
                                                          <input class="form-control" id="sodio1" name="sodio11" placeholder="Sodio"  value="${ proyecto1.Fraccion.findAllByMuestra(  session.muestra, [sort:'id', order:'asc'] ).get( 10 ).sodio }"  type="text">
                                                      </div>
                                                  </div>
                                              </div>
                                              <div class="modal-footer">
                                                  <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                                  
                                  <div style="margin : 50px">
                                      <button type="reset" class="btn btn-default" >Cancel</button>
                                      <button type="submit" class="btn btn-success" >Submit</button>
                                  </div>
                              </fieldset>
                          </g:form>
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
