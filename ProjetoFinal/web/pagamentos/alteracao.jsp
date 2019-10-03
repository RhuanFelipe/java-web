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
                        <h3 class="tt_menu">&gt;&gt; PAGAMENTOS - ALTERAR UM PAGAMENTO &lt;&lt;</h3>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <form class="form-horizontal" role="form" action="http://localhost:8084/LojaVirtual/Controlador" method="POST">
                            <div class="form-group">
                                <div class="col-sm-3">
                                    <label for="inputEmail3" class="control-label">Informar o [ID]:</label>
                                </div>
                                <div class="col-sm-9">
                                    <input type="number" name="id" class="form-control" id="inputEmail3" placeholder="Informe o [ID]" 
                                           title="Informe o [ID]" required="">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-3">
                                    <label for="inputEmail3" class="control-label">Informar o código:</label>
                                </div>
                                <div class="col-sm-9">
                                    <input type="number" name="codCurso" class="form-control" id="inputEmail3" placeholder="Informe o código" 
                                           title="Informe o código" required="">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-3">
                                    <label for="inputDATA" class="control-label">Informar a DATA DE INSCRIÇÃO:</label>
                                </div>
                                <div class="col-sm-9">
                                    <input name="dataInscricao" type="date" class="form-control" id="inputDATA" title="Preencha o campo Nome" 
                                           required="">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-3 col-sm-10">
                                    <input type="hidden" name="idFormulario" value="3"> 
                                    <input type="hidden" name="tipoFormulario" value="34"> 
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