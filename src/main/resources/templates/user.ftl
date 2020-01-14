<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>spring boot</title>
</head>
<body>
    <table border="1" align="center">
        <caption>用户表</caption>
        <thead>
        <tr>
            <th>id</th>
            <th>用户名</th>
            <th>密码</th>
            <th>姓名</th>
            <th>图片</th>
        </tr>
        </thead>
       <tbody>
       <#list userList as user>
       <tr>
           <td>${user.id}</td>
           <td>${user.username}</td>
           <td>${user.password}</td>
           <td>${user.name}</td>
           <td><img src="img/1.jpg" style="width: 100px;height: 50px"></td>
       </tr>
       </#list>
       </tbody>

    </table>
</body>
</html>
