/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abctreinamentos.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rhuan.silva
 */
public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int idFormulario; // - - clientes, 2 - cursos, 3 - pagamentos
        int tipoFormulario; //1.1 consulta ...

        idFormulario = Integer.parseInt(request.getParameter("idFormulario"));
        tipoFormulario = Integer.parseInt(request.getParameter("tipoFormulario"));

        if (idFormulario == 1) {// clientes
            int id = Integer.parseInt(request.getParameter("id"));

            switch (tipoFormulario) {
                case 11: {
                    /* System.out.println("[1] Consultar Todos os Clientes");
                    TypedQuery<Cliente> query = em.createQuery("" + "Select c from Cliente", Cliente.class);
                    List<Cliente> clientes = query.getResultList();
                    clientes.forEach(System.out::println);*/
                    break;
                }
                case 12: {
                    out.print("<h3>Cliente => Consulta => " + id + "</h3>");
                    //Cliente cliente = em.find(Cliente.class, id);

                    break;
                }
                case 13: {
                    String cpf = request.getParameter("cpf");
                    String nome = request.getParameter("nome");
                    String email = request.getParameter("email");
                    out.print("<h3>Cliente => Cadastrar => " + id + " - " + cpf + " - " + nome + " - " + email + "</h3>");

                    /*Cliente cliente = new Cliente(cpf, nome, email);
                    tx.begin();
                    em.persist(cliente);
                    tx.commit();
                    em.close();*/
                    break;
                }
                case 14: {
                    String cpf = request.getParameter("cpf");
                    String nome = request.getParameter("nome");
                    String email = request.getParameter("email");
                    out.print("<h3>Cliente => Alterar => " + id + " - " + cpf + " - " + nome + " - " + email + "</h3>");

                    /*Cliente cliente = new Cliente(id, cpf, nome, email);
                    tx.begin();
                    em.merge(cliente);
                    tx.commit();
                    em.close();
                     */
                    break;
                }
                case 15: {
                    out.print("<h3>Cliente => Excluir => " + id + "</h3>");
                    /*Cliente cliente = em.find(Cliente.class, id);
                    tx.begin();
                    em.remove(cliente);
                    tx.commit();
                    em.close();*/
                    break;
                }
            }
        } else if (idFormulario == 2) {// cursos
            int codCurso = Integer.parseInt(request.getParameter("codCurso"));

            switch (tipoFormulario) {
                case 21: //Consultar Todos
                {

                    /*
                    TypedQuery<Curso> query = em.createQuery(""
                            + "Select c from Curso c", Curso.class);
                    List<Curso> cursos = query.getResultList();
                    cursos.forEach(System.out::println);*/
                    break;
                }
                case 22: //Consultar
                {
                    out.print("<h3>Curso => Consulta => " + codCurso + "</h3>");
                    // Curso curso = em.find(Curso.class, cdcurso);
                    break;
                }
                case 23: //Cadastrar 
                {
                    String nome = request.getParameter("nome");
                    String url = request.getParameter("url");
                    int valor = Integer.parseInt(request.getParameter("valor"));
                    out.print("<h3>Curso => Cadastrar => " + codCurso + " - " + nome + " - " + valor + " - " + url + "</h3>");
                    /*
                    Curso curso = new Curso(cdcurso, nome, valor, url);
                    tx.begin();
                    em.persist(curso);
                    tx.commit();*/
                    break;
                }
                case 24: //Alterar
                {
                    String nome = request.getParameter("nome");
                    String url = request.getParameter("url");
                    int valor = Integer.parseInt(request.getParameter("valor"));
                    out.print("<h3>Curso => Alterar => " + codCurso + " - " + nome + " - " + valor + " - " + url + "</h3>");

                    /*
                    Curso curso = new Curso(cdcurso, nome, valor, url);
                    tx.begin();
                    em.merge(curso);
                    tx.commit();
                     */
                    break;
                }
                case 25: //Excluir
                {
                    out.print("<h3>Curso => Excluir => " + codCurso + "</h3>");

                    /*
                    Curso curso = em.find(Curso.class, cdcurso);
                    tx.begin();
                    em.remove(curso);
                    tx.commit();
                     */
                    break;
                }
            }
        } else if (idFormulario == 3) {// pagamentos
            int codCurso = Integer.parseInt(request.getParameter("codCurso"));
            int id = Integer.parseInt(request.getParameter("id"));

            switch (tipoFormulario) {
                case 31: {

                    /*TypedQuery<Pagamento> query = em.createQuery(""
                                + "Select p from Pagamento p", Pagamento.class);
                        List<Pagamento> pagamentos = query.getResultList();
                        pagamentos.forEach(System.out::println);*/
                    break;
                }
                case 32: {
                    out.print("<h3>Pagamento => Consulta => " + codCurso + " - " + id + "</h3>");
                    /*
                    PagamentoID pgtoid = new PagamentoID(id, codCurso);
                    Pagamento pagamento = em.find(Pagamento.class, pgtoid);
                    System.out.println(pagamento);*/
                    break;
                }
                case 33: {
                    String dataInscricao = request.getParameter("dataInscricao");
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate date = LocalDate.parse(dataInscricao, formatter);
                    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                    out.print("<h3>Pagamento => Cadastrar => " + codCurso + " - " + id + " - " + fmt.format(date) + "</h3>");
                    /*
                    PagamentoID pgId = new PagamentoID(id, codCurso);
                    Pagamento pagamento = new Pagamento(pgId, datainscricao);
                    tx.begin();
                    em.persist(pagamento);
                    tx.commit();*/
                    break;
                }
                case 34: {
                   String dataInscricao = request.getParameter("dataInscricao");
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate date = LocalDate.parse(dataInscricao, formatter);
                    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                    out.print("<h3>Pagamento => Alterar => " + codCurso + " - " + id + " - " + fmt.format(date) + "</h3>");
                    /*
                    PagamentoID pgId = new PagamentoID(id, codCurso);
                    Pagamento pagamento = new Pagamento(pgId, datainscricao);
                    tx.begin();
                    em.merge(pagamento);
                    tx.commit();*/
                    break;
                }
                case 35: {
                    out.print("<h3>Pagamento => Excluir => " + codCurso + " - " + id + "</h3>");

                    /*
                    PagamentoID pgId = new PagamentoID(id, codCurso);
                    Pagamento pagamento = em.find(Pagamento.class, pgId);
                    tx.begin();
                    em.remove(pagamento);
                    tx.commit();*/
                    break;
                }

            }
        }
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
