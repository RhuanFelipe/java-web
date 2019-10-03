<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8" />
    <title>Página de Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
    <link rel="stylesheet" type="text/css" href="../lib/css/login.css" />
</head>
<body>
    <div class="container" >
        <a class="links" id="paracadastro"></a>
        <a class="links" id="paralogin"></a>

        <div class="content">      
            <!--FORMULÁRIO DE LOGIN-->
            <div id="login">
                <p class="mensagem">${mensagem}</p>
                <form method="post" action="autenticacao.jsp" method="POST"> 
                    <h1>Login</h1> 
                    <p> 
                        <label for="cpf">Seu CPF</label>
                        <input id="cpf" name="cpf" required="required" type="text" 
                               placeholder="ex. 000.000.000-00"/>
                    </p>

                    <p> 
                        <label for="senha">Sua Senha</label>
                        <input id="senha" name="senha" required="required" type="password" placeholder="ex. senha" /> 
                    </p>

                    <p> 
                        <input type="checkbox" name="manterlogado" id="manterlogado" value="" /> 
                        <label for="manterlogado">Manter-me logado</label>
                    </p>

                    <p> 
                        <input type="submit" value="Logar" /> 
                    </p>

                    <p class="link">
                        Ainda não tem conta?
                        <a href="#paracadastro">Cadastre-se</a>
                    </p>
                </form>
            </div>

            <!--FORMULÁRIO DE CADASTRO-->
            <div id="cadastro">
                <form method="post" action=""> 
                    <h1>Cadastro</h1> 

                    <p> 
                        <label for="nome_cad">Seu nome</label>
                        <input id="nome_cad" name="nome_cad" required="required" type="text" placeholder="nome" />
                    </p>

                    <p> 
                        <label for="email_cad">Seu e-mail</label>
                        <input id="email_cad" name="email_cad" required="required" type="email" placeholder="contato@htmlecsspro.com"/> 
                    </p>

                    <p> 
                        <label for="senha_cad">Sua senha</label>
                        <input id="senha_cad" name="senha_cad" required="required" type="password" placeholder="ex. 1234"/>
                    </p>

                    <p> 
                        <input type="submit" value="Cadastrar"/> 
                    </p>

                    <p class="link">  
                        Já tem conta?
                        <a href="#paralogin"> Ir para Login </a>
                    </p>
                </form>
            </div>
        </div>
    </div>  
</body>
</html>