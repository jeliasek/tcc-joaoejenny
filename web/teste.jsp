<%-- 
    Document   : teste
    Created on : 07/08/2017, 13:50:26
    Author     : João Elias
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Pergunta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Teste Vocacional</title>
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
                        <li onmouseover="mudaFoto('_imagens/icon-casa.png')" onmouseout="mudaFoto('_imagens/icon-teste.png')"> <a href="index.html">Home</a></li>
                        <li onmouseout="mudaFoto('_imagens/icon-teste.png')"> <a href="cursos.html">Cursos</a></li>
                        <li onmouseover="mudaFoto('_imagens/icon-teste.png')" onmouseout="mudaFoto('_imagens/icon-teste.png')"> <a href="teste.jsp">Teste Vocacional</a></li>
                        <li onmouseover="mudaFoto('_imagens/fale-conosco.png')" onmouseout="mudaFoto('_imagens/icon-teste.png')"> <a href="fale-conosco.html">Fale conosco</a></li>
                    </ul>
                </nav>
            </header>
            <section>
                <article id="principal">
                    <header id="c-section">
                        <hgroup>
                            <h1> Está em dúvida para saber em qual curso se inscrever?</h1>
                            <h2> Vamos tirar essa dúvida!!!</h2>
                            <div id="divCenter">
                                <form id="teste" method="POST" action="ServletPergunta">
                                    <%
                                        ArrayList<Pergunta> perguntas = control.Sistema.listarPerguntas();
                                        for (Pergunta p : perguntas) {%>

                                    <label><%= p.getPergunta()%></label><br />

                                    <input type="radio" name="<%= p.getPk_pergunta()%>" value="A" /> <%= p.getRespostaA()%><br />
                                    <input type="radio" name="<%= p.getPk_pergunta()%>" value="B" /> <%= p.getRespostaB()%><br />
                                    <input type="radio" name="<%= p.getPk_pergunta()%>" value="C" /> <%= p.getRespostaC()%><br />
                                    <br />
                                    <% }
                                    %>
                                    <input type="submit" value="Enviar">
                                </form>
                            </div>






                        </hgroup>
                    </header>
                </article>
            </section>


            <div>
                <footer id="rodape">
                    <p>
                        Copyright  2017 - by Jenny Ayra e João Elias <br/>
                        Facebook | <a href="https://twitter.com/joaoeliax" target="_blank">Twitter</a>
                    </p>
                </footer>
            </div>
        </div>

    </body>
</html>
