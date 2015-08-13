<%--
  Created by IntelliJ IDEA.
  User: clementearismendi
  Date: 2015-08-10
  Time: 9:15 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Registration Success</title>
</head>
<body>
<div align="center">
  <table border="0">
    <tr>
      <td colspan="2" align="center"><h2>Registration Succeeded!</h2></td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <h3>Thank you for registering! Here's the review of your details:</h3>
      </td>
    </tr>
    <tr>
      <td>First Name:</td>
      <td>${playerForm.username}</td>
    </tr>
    <tr>
      <td>Last Name:</td>
      <td>${playerForm.lastname}</td>
    </tr>
    <tr>
      <td>Age:</td>
      <td>${playerForm.age}</td>
    </tr>
    <tr>
      <td>Salary:</td>
      <td>${playerForm.salary}</td>
    </tr>
    <tr>
      <td>Position:</td>
      <td>${playerForm.position}</td>
    </tr>

    <tr>
      <td>Country:</td>
      <td>${playerForm.country}</td>
    </tr>

  </table>
</div>
</body>
</html>