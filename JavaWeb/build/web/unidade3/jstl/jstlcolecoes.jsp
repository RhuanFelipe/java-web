<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <body bgcolor="#FFFFFF">
        <jsp:useBean id="colecao"
                     class="unidade3.Clientes"/>
        <c:forEach var="nome" items="${colecao.clientes}">
            <c:out value="${nome}" /> <br />
        </c:forEach>
    </body>
</html>