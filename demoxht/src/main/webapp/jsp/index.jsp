<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/static/js/jquery-1.12.4.js"></script>
</head>
<body>
<center>

<h2>学员信息列表</h2>
    <table border="1px" align="center">
        <tr>
            <td colspan="7" align="center"><a href="/jsp/add.jsp">添加学员</a></td>
        </tr>
        <tr align="center">
            <td>编号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>年龄</td>
            <td>电话</td>
            <td>email</td>
            <td>班级</td>
        </tr>
        <c:forEach items="${list}" var="list">
        <tr align="center">
            <td>${ list.id }</td>
                <%-- <td><fmt:formatDate value="${ list.birthday }" pattern="yyyy-MM-dd"></fmt:formatDate></td>--%>
            <td>${ list.name }</td>
            <td>${ list.age }</td>
            <td>${ list.gender }</td>
            <td>${ list.telephone }</td>
            <td>${ list.email }</td>
            <%--<td>${ list.classid }</td>--%>
            <td><c:if test="${list.classid==1}">
                tcas2283
            </c:if>
           <c:if test="${list.classid==2}">
                Tmp077
            </c:if></td>
            <%--<td><fmt:formatDate value="${ list.createdate }" pattern="yyyy-MM-dd"></fmt:formatDate></td>--%>
         <%--   <td><a href="/pl?id=${list.id}">查看评论</a>
                <a href="/add?id=${list.id}">增加评论</a>
                <a href="/dele?id=${ list.id }">删除</a>
                <a href="/upd?id=${list.id}">修改</a>
            </td>--%>
        </tr>
        </c:forEach>

        <script type="text/javascript">
            $("tr:even").css({"background-color":"CCF6CE"})
        </script>

</center>
</table>


<h2 align="center" style="color: red">${dele}</h2>


</body>
</html>
