<%--
  Created by IntelliJ IDEA.
  User: 张家和
  Date: 2020/9/26
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h2 style="color: red">学员信息添加</h2>
    <form action="/add" method="post">
        <p>姓名:<input name="name"></p>
        <p>性别:<input name="gender"></p>
        <p>年龄:<input name="age"></p>
        <p>电话:<input name="telephone"></p>
        <p>email:<input name="email"></p>
        <p>班级:<select name="classid">
            <c:forEach items="${classes}" var="list">
            <option value="${list.id}">${list.name}</option></c:forEach>
        </select></p>
        <input type="submit" value="提交">
    </form>
</center>
</body>
</html>
