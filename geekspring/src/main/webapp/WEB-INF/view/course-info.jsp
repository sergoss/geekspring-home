<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Courses info</title>
</head>
<body>
<div align="center">
    <h1>Courses Info</h1>
    <table border="1">
        <th>Id</th>
        <th>Title</th>
        <th>Students count</th>
        <tr>
            <td>${course.id}</td>
            <td>${course.title}</td>
            <td>${course.students.size()}</td>
        </tr>

    </table>
    <br>
    <a href="/">Back To Main Page</a>
</div>
</body>
</html>