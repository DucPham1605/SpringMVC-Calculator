<%--
  Created by IntelliJ IDEA.
  User: ducp1605
  Date: 01/08/2019
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Personal Calculator</title>
</head>
<body>
<h1><strong>Calculator</strong></h1>
<form method="get" action="calculate" id="calculator">
    <input type="text" placeholder="0" name="firstNumber" value="${firstNumber}">
    <input type="text" placeholder="0" name="secondNumber" value="${secondNumber}">
    </br>
    <input type="submit" name="operator" value="Add">
    <input type="submit" name="operator" value="Substract">
    <input type="submit" name="operator" value="Multiply">
    <input type="submit" name="operator" value="Divide"> </br>
    <span>Result: ${result}</span>
</form>
</body>
</html>
