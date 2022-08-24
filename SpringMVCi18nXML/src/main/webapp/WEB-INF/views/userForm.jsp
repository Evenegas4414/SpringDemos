<%--
  Created by IntelliJ IDEA.
  User: Exequiel
  Date: 24-08-2022
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!doctype html>
<html lang="es">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title><spring:message code="userForm.title" text="User Form"></spring:message></title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>

    <div class="container my-5">
        <form>
            <div class="mb-3">
                <label for="email" class="form-label">
                    <spring:message code="userForm.email" text="Email address (default)"></spring:message></label>
                <input type="email" class="form-control" id="email" aria-describedby="emailHelp">
                <div id="emailHelp" class="form-text">
                    <spring:message code="userForm.emailHelp"
                                    text="We'll never share your email with anyone else. (default)"></spring:message></div>
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">
                    <spring:message code="userForm.password" text="Password (default)"></spring:message></label>
                <input type="password" class="form-control" id="password">
            </div>
            <button type="submit" class="btn btn-primary">
                <spring:message code="userForm.submit" text="Submit (default)"></spring:message></button>
        </form>

    </div>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
            crossorigin="anonymous"></script>
</body>
</html>