
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1 align="center">新增健康信息</h1>
<table align="center">
    <form action="add">
        <tr>
            <td align="right">姓名：</td>
            <td>
                <input type="text" name="uname">
            </td>
        </tr>
        <tr>
            <td align="right">身份证：</td>
            <td>
                <input type="text" name="ipcard">
            </td>
        </tr>
        <tr>
            <td align="right">体温：</td>
            <td>
                <input type="text" name="temp">
            </td>
        </tr>
        <tr>
            <td align="right">身体状况：</td>
            <td>
                <input type="text" name="condition">
            </td>
        </tr>
        <tr>
            <td align="right">填报时间：</td>
            <td>
                <input type="text" name="ctime">
            </td>
        </tr>
        <tr>
            <td align="right">填报人：</td>
            <td>
                <input type="text" name="aid">
            </td>
        </tr>
      <tr>
          <td colspan="2">
              <input type="submit" value="添加">
          </td>
      </tr>
    </form>
</table>
</body>
</html>
