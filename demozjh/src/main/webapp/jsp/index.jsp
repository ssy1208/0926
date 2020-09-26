<%--
  Created by IntelliJ IDEA.
  User: 张家和
  Date: 2020/9/26
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<CENTER>
    <h3>学员信息列表</h3>
    <a href="/toadd">添加学员</a>
    <table border="1px">
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>年龄</td>
            <td>电话</td>
            <td>email</td>
            <td>班级</td>
        </tr>

        <c:forEach items="${students}" var="list">
        <tr>
            <td>${list.id}</td>
            <td>${list.name}</td>
            <td>${list.gender}</td>
            <td>${list.age}</td>
            <td>${list.telephone}</td>
            <td>${list.email}</td>
            <td>${list.nameclass}</td>
        </tr>
        </c:forEach>

    </table>
</CENTER>
</body>
</html>
