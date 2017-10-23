package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Pergunta;

public final class teste_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Teste Vocacional</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"_css/estilo.css\"/>\n");
      out.write("        <script language=\"javascript\" src=\"_javascript/funcoes.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id =\"interface\">\n");
      out.write("            <img src=\"_imagens/logo_ifc.png\"/>\n");
      out.write("\n");
      out.write("            <header id = \"cabecalho\">\n");
      out.write("                <img id=\"icone\" src=\"_imagens/orienta25C325A725C325A3o1.png\" width=\"125\"/>\n");
      out.write("                <hgroup>\n");
      out.write("                    <h1> Teste Vocacional </h1>\n");
      out.write("                    <h2> Quer ingressar no IFC? Saiba qual o curso que você se encaixa! </h2>\n");
      out.write("                </hgroup>\n");
      out.write("                <nav id=\"menu\">\n");
      out.write("                    <h1>Menu Principal </h1>\n");
      out.write("                    <ul> \n");
      out.write("                        <li onmouseover=\"mudaFoto('_imagens/icon-casa.png')\" onmouseout=\"mudaFoto('_imagens/icon-teste.png')\"> <a href=\"index.html\">Home</a></li>\n");
      out.write("                        <li onmouseout=\"mudaFoto('_imagens/icon-teste.png')\"> <a href=\"cursos.html\">Cursos</a></li>\n");
      out.write("                        <li onmouseover=\"mudaFoto('_imagens/icon-teste.png')\" onmouseout=\"mudaFoto('_imagens/icon-teste.png')\"> <a href=\"teste.jsp\">Teste Vocacional</a></li>\n");
      out.write("                        <li onmouseover=\"mudaFoto('_imagens/fale-conosco.png')\" onmouseout=\"mudaFoto('_imagens/icon-teste.png')\"> <a href=\"fale-conosco.html\">Fale conosco</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("            <section>\n");
      out.write("                <article id=\"principal\">\n");
      out.write("                    <header id=\"c-section\">\n");
      out.write("                        <hgroup>\n");
      out.write("                            <h1> Está em dúvida para saber em qual curso se inscrever?</h1>\n");
      out.write("                            <h2> Vamos tirar essa dúvida!!!</h2>\n");
      out.write("                            <form method=\"POST\" action=\"ServletPergunta\">\n");
      out.write("                                ");

                                    ArrayList<Pergunta> perguntas = control.Sistema.listarPerguntas();
                                    for (Pergunta p : perguntas) {
      out.write("\n");
      out.write("                                <label>");
      out.print( p.getPergunta());
      out.write("</label><br />\n");
      out.write("                                <input type=\"radio\" name=\"");
      out.print( p.getPk_pergunta());
      out.write("\" value=\"A\" /> ");
      out.print( p.getRespostaA());
      out.write("<br />\n");
      out.write("                                <input type=\"radio\" name=\"");
      out.print( p.getPk_pergunta());
      out.write("\" value=\"B\" /> ");
      out.print( p.getRespostaB());
      out.write("<br />\n");
      out.write("                                <input type=\"radio\" name=\"");
      out.print( p.getPk_pergunta());
      out.write("\" value=\"C\" /> ");
      out.print( p.getRespostaC());
      out.write("<br />\n");
      out.write("                                <br />\n");
      out.write("                                ");
 }
                                
      out.write("\n");
      out.write("                                <input type=\"submit\" value=\"Enviar\">\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                            \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </hgroup>\n");
      out.write("                    </header>\n");
      out.write("                </article>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <footer id=\"rodape\">\n");
      out.write("                    <p>\n");
      out.write("                        Copyright  2017 - by Jenny Ayra e João Elias <br/>\n");
      out.write("                        Facebook | <a href=\"https://twitter.com/joaoeliax\" target=\"_blank\">Twitter</a>\n");
      out.write("                    </p>\n");
      out.write("                </footer>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
