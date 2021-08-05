<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center">健康信息列表</h1>
<table align="center" width="60%" border="1px" cellspacing="0px">
    <tr>
        <td colspan="7">
            <a href="add.jsp">新增</a>
        </td>
    </tr>
    <tr>
        <th>姓名</th>
        <th>身份证</th>
        <th>体温</th>
        <th>身体状况</th>
        <th>填报时间</th>
        <th>填报人</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${healthInfos}" var="healthInfo">
        <tr align="center">
            <td>${healthInfo.uname}</td>
            <td>${healthInfo.ipcard}</td>
            <td>${healthInfo.temp}</td>
            <td>${healthInfo.condition}</td>
            <td>${healthInfo.ctime}</td>
            <td>${healthInfo.admin.realname}</td>
            <td>
                <a href="delete?uname=${healthInfo.uname}">删除</a>
<%--                <a href="showUname?uname=${sessionScope.uname}">修改</a>--%>
                <a href="showUname?uname=${sessionScope.uname}">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
