<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录界面</title>
  </head>
  <body>

    <table style="border: 1px solid black" width="30%" align="center">
      <tr>
        <td colspan="2" align="center"><h1>用户登录</h1></td>
      </tr>
      <form action="login">
      <tr>
        <td align="right">用户名:</td>
        <td><input type="text" name="aname"></td>
      </tr>
      <tr>
        <td align="right">密码:</td>
        <td> <input type="password" name="apwd"></td>
      </tr>
      <tr align="center">
        <td colspan="2" align="center"> <input type="submit" value="登录" style="width:100px "></td>
      </tr>
      </form>
    </table>



  </body>
</html>
