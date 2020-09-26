<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/static/js/jquery-1.12.4.js"></script>
</head>
<body>
<center>
    <form action="/add" method="post">
        <h4 style="color: red">学员信息添加</h4>
        <table border="1px" align="center">

            <%--<tr align="center">--%>
                <%--<td colspan="4" style="font-size: 30px;">增加评论</td>--%>
            <%--</tr>--%>
                <tr>
                <td> 姓名：<input type="text" name="name"></td>
            </tr>
            <tr >
                <td> 性别：<input type="text" name="gender"></td>
            </tr>
            <tr >
                <td> 年龄：<input type="text" name="age"></td>
            </tr>
            <tr >
                <td> 电话：<input type="text" name="telephone"></td>
            </tr>
            <tr >
                <td> 邮箱：<input type="text" name="email"></td>
            </tr>
            <tr>
                <td> 班级：<select name="classid">
                    <option value="1">tcas2283</option>
                    <option value="2">Tcmp077</option>
                </select></td>
            </tr>

            <tr><td align="center">
                <input type="submit" value="提交">&nbsp;<input type="button" value="返回">
            </td></tr>

        </table>
    </form>
</center>
<script type="text/javascript">
    $("[type='button']").click(function () {
        location.href="javascript:history.back(0)";
    })
    $("form").submit(function(){
        var name=$("[name='name']").val();
        if(name==""){
            alert("姓名不能为空!");
            return false;
        }
        var telephone=$("[name='telephone']").val();
        if(telephone==""){
            alert("电话不能为空!");
            return false;
        }
        return true;
    })
</script>
</body>
</html>
