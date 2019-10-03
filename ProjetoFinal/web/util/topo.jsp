<%
    if (session.getAttribute("login") != "true") {
        session.setAttribute("mensagem", "Acesso Proibido, por favor realizar login no sistema!");
%>
    <jsp:forward page="../login.jsp"></jsp:forward>
<%
    }
%>