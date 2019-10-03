<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<sql:setDataSource var="bd" driver="com.mysql.jdbc.Driver"
                   url="jdbc:mysql://localhost/curso_java8"
                   user="root" password=""/>
<sql:query dataSource="${bd}" var="result">
    SELECT * from Login
</sql:query>
<table border="1" width="100%">
    <tr>
        <th>CPF</th><th>Senha</th>
    </tr>
    <c:forEach var="row" items="${result.rows}">
        <tr>
            <td><c:out value="${row.cpf}"/></td>
            <td><c:out value="${row.senha}"/></td>
        </tr></c:forEach>
</table>