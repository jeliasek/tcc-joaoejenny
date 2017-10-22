/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author eduardo-stahnke
 */
@WebServlet(urlPatterns = {"/ServletPergunta"})
public class ServletPergunta extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public static String resultado = "";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            int info = 0;
            int adm = 0;
            int vest = 0;
            for (int i = 1; i <= 10; i++) {
                String resposta = request.getParameter("" + i);
                if (resposta.equalsIgnoreCase("a")) {
                    info++;
                } else if (resposta.equalsIgnoreCase("b")) {
                    adm++;
                } else {
                    vest++;
                }
            }
            if (adm == info && vest < adm || vest == info && adm < info || vest == adm && info < adm) {
                if (adm == info) {
                    Random gerador = new Random();
                    if (gerador.nextInt(2) == 1) {
                        resultado = "Administração";
                    } else {
                        resultado = "Informática";
                    }
                }
                if (vest == info) {
                    Random gerador = new Random();
                    if (gerador.nextInt(2) == 1) {
                        resultado = "Vestuário";
                    } else {
                        resultado = "Informática";
                    }
                }
                if (vest == adm) {
                    Random gerador = new Random();
                    if (gerador.nextInt(2) == 1) {
                        resultado = "Administração";
                    } else {
                        resultado = "Vestuário";
                    }
                }
            } else {
                if (info > adm && info > vest) {
                    resultado = "Informática";
                } else if (adm > info && adm > vest) {
                    resultado = "Administração";
                } else {
                    resultado = "Vestuário";
                }
            }

            //botar html
            out.println("<htlm>");
            out.println("<head>");
            out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
            out.println("<title>Teste Vocacional</title>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"_css/estilo.css\"/>");
            out.println("<script language=\"javascript\" src=\"_javascript/funcoes.js\"></script>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div id =\"interface\">");
            out.println("<img src=\"_imagens/logo_ifc.png\"/>");
            out.println(" <header id = \"cabecalho\">");
            out.println("<img id=\"icone\" src=\"_imagens/orienta25C325A725C325A3o1.png\" width=\"125\"/>");
            out.println("<hgroup>");
            out.println("<h1> Teste Vocacional </h1>");
            out.println(" <h2> Quer ingressar no IFC? Saiba qual o curso que você se encaixa! </h2>");
            out.println(" </hgroup>");
            out.println("<nav id=\"menu\">");
            out.println("<h1>Menu Principal </h1>");
            out.println("<ul>");
            out.println("<li onmouseover=\"mudaFoto('_imagens/icon-casa.png')\" onmouseout=\"mudaFoto('_imagens/icon-teste.png')\"> <a href=\"index.html\">Home</a></li>\n");
            out.println("<li onmouseout=\"mudaFoto('_imagens/icon-teste.png')\"> <a href=\"cursos.html\">Cursos</a></li>\n");
            out.println("<li onmouseover=\"mudaFoto('_imagens/icon-teste.png')\" onmouseout=\"mudaFoto('_imagens/icon-teste.png')\"> <a href=\"teste.jsp\">Teste Vocacional</a></li>\n");
            out.println("<li onmouseover=\"mudaFoto('_imagens/fale-conosco.png')\" onmouseout=\"mudaFoto('_imagens/icon-teste.png')\"> <a href=\"fale-conosco.html\">Fale conosco</a></li>\n");
            out.println("</ul>");
            out.println("</nav>");
            out.println("</header>");
            out.println("<section>");
            out.println("<article id=\"principal\">");
            out.println("<header id=\"c-section\">");
            out.println("<hgroup id=\"oioi\">");
            out.println("<h1> Seu teste foi concluido!</h1>");
            out.println("<h2> O curso que você mais se identificou foi: </h2>");
            out.println("<h4>" + resultado + "</h4>");
            out.println("<br>");
            out.println(" <form method=\"POST\" action=\"ServletPergunta\">");

            out.println("</hgroup>");
            out.println("<a href=\"http://seletivo-2018-1-integrado.ifc.edu.br/inscricao\"> <img id=\"oi\" src=\"_imagens/inscricao.png\" target=\"_blank\"> </a>\n" +
"");
            out.println("</header>");

            out.println("</article>");
            out.println("</section>");
            out.println("<div>");
            out.println("<footer id=\"rodape\">");
            out.println("<p>");
            out.println("Copyright  2017 - by Jenny Ayra e João Elias <br/>");
            out.println("Facebook | <a href=\"https://twitter.com/joaoeliax\" target=\"_blank\">Twitter</a>");
            out.println("</p>");
            out.println("</footer>");
            out.println("</div>");
            out.println("</div>");

            out.println("</body>");

        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
