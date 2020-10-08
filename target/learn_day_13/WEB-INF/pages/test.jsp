<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020-10-07
  Time: 22:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<br>
<h3>恭喜你成功了！</h3>
</br>
<c:forEach items="${userList}" var="User">
    ${User.name}
</c:forEach>
</body>
</html>
