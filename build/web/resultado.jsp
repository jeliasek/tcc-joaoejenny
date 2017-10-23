<%-- 
    Document   : resultado
    Created on : 14/08/2017, 14:25:47
    Author     : João Elias
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<?xml version='1.0' encoding='UTF-8' ?>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>TCC</title>
        <link rel="stylesheet" type="text/css" href="_css/estilo.css"/>
        <script language="javascript" src="_javascript/funcoes.js"></script>
        
    </head>
    <body>
        <div id ="interface">
            <img src="_imagens/logo_ifc.png"/>
            <header id = "cabecalho">
                <img id="icone" src="_imagens/orienta25C325A725C325A3o1.png" width="125"/>
                <hgroup>
                    <h1> Teste Vocacional </h1>
                    <h2> Quer ingressar no IFC? Saiba qual o curso que você se encaixa! </h2>
                </hgroup>
                <nav id="menu">
                    <h1>Menu Principal </h1>
                    <ul> 
                        <li onmouseover="mudaFoto('_imagens/icon-casa.png')" onmouseout="mudaFoto('_imagens/orienta25C325A725C325A3o1.png')"> <a href="index.html">Home</a></li>
                        <li onmouseover="mudaFoto('_imagens/cursos.png')" onmouseout="mudaFoto('_imagens/orienta25C325A725C325A3o1.png')"> <a href="cursos.html">Cursos</a></li>
                        <li onmouseover="mudaFoto('_imagens/icon-teste.png')" onmouseout="mudaFoto('_imagens/orienta25C325A725C325A3o1.png')"> <a href="teste.jsp">Teste Vocacional</a></li>
                        <li onmouseover="mudaFoto('_imagens/fale-conosco.png')" onmouseout="mudaFoto('_imagens/orienta25C325A725C325A3o1.png')"> <a href="fale-conosco.html">Fale conosco</a></li>
                    </ul>
                </nav>
            </header>

            <hgroup id="oioi">
                <h1 style="text-align: center"> O curso que você mais se identificou foi: </h1>
                <h2 style="font-size: 30pt" ><%ServletPergunta.resultado;%></h2>
                <a href="http://seletivo-2018-1-integrado.ifc.edu.br/inscricao"> <img id="oi" src="_imagens/inscricao.png" target="_blank"> </a>

            </hgroup>


            <footer id="rodape">
                <p>
                    Copyright 2017 - by Jenny Ayra e João Elias <br />
                    Facebook | <a href="https://twitter.com/joaoeliax" target="_blank">Twitter</a>
                </p>
            </footer>
        </div>
    </body>
</html>




