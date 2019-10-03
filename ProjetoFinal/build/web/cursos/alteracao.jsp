<jsp:include page="../util/topo.jsp" />

<html><head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script type="text/javascript" src="../lib/js/jquery.min.js"></script>
        <script type="text/javascript" src="../lib/js/bootstrap.min.js"></script>
        <link href="../lib/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="../lib/css/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="../lib/css/padrao.css" rel="stylesheet" type="text/css">
    </head><body>
        <div class="section section-danger text-justify">
            <div class="container">
                <div class="row text-center">
                    <div class="col-md-12 text-center">
                        <h1 class="text-center">Sistema de Gerenciamento de Cursos</h1>
                    </div>
                </div>
            </div>
        </div>
        <div class="section">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 text-center">
                        <h3 class="tt_menu">&gt;&gt; CURSOS - ALTERAR UM CURSO &lt;&lt;</h3>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <form class="form-horizontal" role="form" action="http://localhost:8084/LojaVirtual/Controlador" method="POST">
                            <div class="form-group">
                                <div class="col-sm-2">
                                    <label for="inputCURSO" class="control-label">Informar o CÓDIGO:</label>
                                </div>
                                <div class="col-sm-10">
                                    <input type="number" name="codCurso" class="form-control" id="inputEmail3" placeholder="Informe o código" 
                                           title="Informe o código" required="">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-2">
                                    <label for="inputNome" class="control-label">Informar o NOME:</label>
                                </div>
                                <div class="col-sm-10">
                                    <input type="text" name="nome" class="form-control" id="inputNome" placeholder="Nome">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-2">
                                    <label for="inputVALOR" class="control-label">Informar o VALOR:</label>
                                </div>
                                <div class="col-sm-10">
                                    <input type="text" name="valor" class="form-control" id="inputVALOR" placeholder="Valor">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-2">
                                    <label for="inputSITE" class="control-label">Informar o SITE:</label>
                                </div>
                                <div class="col-sm-10">
                                    <input type="text" name="url" class="form-control" id="inputSITE" placeholder="Site">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-2 col-sm-10">
                                    <input type="hidden" name="idFormulario" value="2"> 
                                    <input type="hidden" name="tipoFormulario" value="24"> 
                                    <button type="submit" class="btn btn-danger">Alterar</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="section">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 text-center corrigir">
                        <a class="btn btn-default" href="javascript:window.history.go(-1)">Voltar</a>
                    </div>
                </div>
            </div>
        </div>
        <footer>
            <div class="navbar navbar-fixed-bottom bgred">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-12 text-center" style="top:13px;color:#fff;">© ABCTreinamentos - Curso de Java 8 para Web</div>
                    </div>
                </div>
            </div>
        </footer>


    </body></html>