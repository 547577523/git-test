<%--
  Created by IntelliJ IDEA.
  User: 86173
  Date: 2021/8/10
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<!--http://localhost:8080/java_web/index.jsp?deptNo=10&deptNo=20&deptNo=30-->
<body>
${paramValues.deptNo[0]}<br/>
${paramValues.deptNo[1]}<br/>
${paramValues.deptNo[2]}
</body>
</html>