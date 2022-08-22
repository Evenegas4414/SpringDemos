<%--
  Created by IntelliJ IDEA.
  User: Exequiel
  Date: 21-08-2022
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Order Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>

    <div class="container">
        <form:form action="saveOrder" method="post" modelAttribute="order">

            <div class="mb-3">
                <label for="name" class="form-label">Product name</label>
                <form:input type="text" class="form-control" id="name" path="name"></form:input>
            </div>
            <div class="mb-3">
                <label for="quantity" class="form-label">Quantity</label>
                <form:input type="number" class="form-control" id="quantity" path="quantity"></form:input>
            </div>
            <button type="submit" class="btn btn-primary">Enviar</button>
        </form:form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
            crossorigin="anonymous"></script>
</body>
</html>