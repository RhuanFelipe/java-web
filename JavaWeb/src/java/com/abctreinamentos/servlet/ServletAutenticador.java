/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abctreinamentos.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author rhuan.silva
 */
@WebServlet(name = "ServletAutenticador", urlPatterns = {"/ServletAutenticador"})
public class ServletAutenticador extends HttpServlet {

    static String url = "jdbc:mysql://localhost/curso_java8";
    static String usuario = "root";
    static String senha = "";
    static Connection conexao;

    @Override
    public void init() throws ServletException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection(url, usuario, senha);
            conexao.setAutoCommit(false);
        } catch (SQLException ex) {
            Logger.getLogger(ServletAutenticador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletAutenticador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletAutenticador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletAutenticador at " + request.getContextPath() + "</h1>");
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
        //PrintWriter out = response.getWriter();

        String cpfMascara = request.getParameter("cpf");
        String cpf = cpfMascara.replaceAll("[.-]", "");
        String senha = request.getParameter("senha");

        String sql = "SELECT * FROM login where cpf = '" + cpf + "' AND senha = '" + senha + "'";

        HttpSession session = request.getSession();

        try {
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()) {
                session.setAttribute("mensagem", "Usuário Autenticado!");
                response.sendRedirect("unidade3/sucesso.jsp");
            } else {
                session.setAttribute("mensagem", "Usuário não Autenticado!");
                response.sendRedirect("unidade3/login.jsp#paralogin");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServletAutenticador.class.getName()).log(Level.SEVERE, null, ex);
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
