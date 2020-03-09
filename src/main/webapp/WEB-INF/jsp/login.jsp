<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/9
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/business/js/jquery-1.8.2.min.js"></script>
</head>
<body>
<form action="/goIn/getPage" method="post" onsubmit="return login()">
    用户名：<input name="username" id="username" />
    密码：<input type="password" id="password" name="password"/>
    <button type="submit">登陆</button>
</form>
<input hidden id="contextPath" value="${pageContext.request.contextPath}">
</body>
</html>
<script>
    function login(){

        return true;
    }
</script>