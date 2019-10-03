
<%@page import="java.sql.*"%>
<jsp:declaration>
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
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {

        }
    }
</jsp:declaration>
<jsp:scriptlet>
    String cpfMascara = request.getParameter("cpf");
    String cpf = cpfMascara.replaceAll("[.-]", "");
    String senha = request.getParameter("senha");

    String sql = "SELECT * FROM login where cpf = '" + cpf + "' AND senha = '" + senha + "'";

    try {
        Statement statement = conexao.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        if (rs.next()) {
            session.setAttribute("mensagem", "Usuário Autenticado!");
            response.sendRedirect("sucesso.jsp");
        } else {
            session.setAttribute("mensagem", "Usuário não Autenticado!");
            response.sendRedirect("login.jsp#paralogin");
        }
    } catch (SQLException ex) {
       ex.printStackTrace();
    }

</jsp:scriptlet>

