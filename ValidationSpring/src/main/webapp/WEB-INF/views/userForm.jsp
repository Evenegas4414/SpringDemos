<%--
  Created by IntelliJ IDEA.
  User: Exequiel
  Date: 22-08-2022
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>User Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
    <div class="container my-5">

        <form:form class="row g-3" modelAttribute="user" action="">
            <div class="col-12">
                <label for="name" class="form-label">Name</label>
                <form:input type="text" class="form-control" id="name" path="name"></form:input>
                <form:errors class="text-danger" path="name"></form:errors>
            </div>
            <div class="col-12">
                <label for="email" class="form-label">Email</label>
                <form:input type="text" class="form-control" id="email" path="email"></form:input>
                <form:errors class="text-danger" path="email"></form:errors>
            </div>
            <div class="col-md-6">
                <label for="age" class="form-label">Age</label>
                <form:input type="number" class="form-control" id="age" path="age"></form:input>
                <form:errors class="text-danger" path="age"></form:errors>
            </div>
            <div class="col-md-6">
                <label for="birthday" class="form-label">Birthday</label>
                <form:input type="date" class="form-control" id="birthday" path="birthday"></form:input>
                <form:errors class="text-danger" path="birthday"></form:errors>
            </div>
            <div class="col-12">
                <label for="role" class="form-label">Role</label>
                <form:select id="role" class="form-select" path="role">
                    <form:option value="">Select Role</form:option>
                    <form:options items="${roles}"></form:options>
                </form:select>
                <form:errors class="text-danger" path="role"></form:errors>
            </div>
            <div class="col-md-6">
                <label for="street" class="form-label">Street</label>
                <form:input type="text" class="form-control" id="street" path="address.street"></form:input>
                <form:errors class="text-danger" path="address.street"></form:errors>
            </div>
            <div class="col-md-4">
                <label for="state" class="form-label">State</label>
                <form:input type="text" class="form-control" id="state" path="address.state"></form:input>
                <form:errors class="text-danger" path="address.state"></form:errors>
            </div>
            <div class="col-md-2">
                <label for="zipCode" class="form-label">Zip Code</label>
                <form:input type="text" class="form-control" id="zipCode" path="address.zipCode"></form:input>
                <form:errors class="text-danger" path="address.zipCode"></form:errors>
            </div>
            <div class="col-12">
                <button type="submit" class="btn btn-primary">Enviar</button>
            </div>
        </form:form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
            crossorigin="anonymous"></script>
</body>
</html>