<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>Add new Employee</title>
</head>
<body>
<h1 style="color: blue" >Add new Employee</h1>
<p>
    <c:if test="${requestScope[message] != null}">
        <span style="color: red">${requestScope[message]}</span>
    </c:if>
</p>
<p>
    <a href="/employee">Back to Employee list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Emlpoyee information</legend>
        <table>
            <tr>
                <td>
                    Name:
                </td>
                <td>
                    <input type="text" name="name" value="name" id="name">
                </td>
            </tr>
            <tr>
                <td>
                    Age:
                </td>
                <td>
                    <input type="text" name="age" value="age" id="age">
                </td>
            </tr>
            <tr>
                <td>
                    Job Position:
                </td>
                <td>
                    <input type="text" name="jobPosition" value="jobPosition" id="jobPosition">
                </td>
            </tr>
            <tr>
                <td>
                    Department:
                </td>
                <td>
                    <input type="text" name="department" value="department" id="department">
                </td>
            </tr>
            <tr>
                <td>
                    Salary:
                </td>
                <td>
                    <input type="text" name="salary" value="salary" id="salary">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Add Employee" placeholder="Add Employee">
                </td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>

