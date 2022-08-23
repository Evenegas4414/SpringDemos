<%--
  Created by IntelliJ IDEA.
  User: Exequiel
  Date: 22-08-2022
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>User Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
    <div class="container my-5">

        <div class="card">
            <h5 class="card-header">User saved!</h5>
            <div class="card-body">
                <h5 class="card-title">Name:</h5>
                <p class="card-text">${user.name}</p>
                <h5 class="card-title">Email:</h5>
                <p class="card-text">${user.email}</p>
                <h5 class="card-title">Age:</h5>
                <p class="card-text">${user.age}</p>
                <h5 class="card-title">Birthday:</h5>
                <p class="card-text">${user.birthday}</p>
                <h5 class="card-title">Role:</h5>
                <p class="card-text">${user.role}</p>
                <h5 class="card-title">Address:</h5>
                <p class="card-text">${user.address.street} ${user.address.state} ${user.address.zipCode}</p>
            </div>
        </div>

    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
            crossorigin="anonymous"></script>
</body>
</html>