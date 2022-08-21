<%--
  Created by IntelliJ IDEA.
  User: Exequiel
  Date: 20-08-2022
  Time: 22:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Customer Editor</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>

  <div class="container">
    <form class="row g-3" action="saveCustomer" method="post">
      <div class="col-md-6">
        <label for="firstName" class="form-label">First name</label>
        <input type="text" class="form-control" id="firstName" name="firstName" value="${customer.firstName}">
      </div>
      <div class="col-md-6">
        <label for="lastName" class="form-label">Last name</label>
        <input type="text" class="form-control" id="lastName" name="lastName" value="${customer.lastName}">
      </div>
      <div class="col-12">
        <label for="phone" class="form-label">Phone</label>
        <input type="text" class="form-control" id="phone" name="phone"
               value="${customer.phone.areaCode}-${customer.phone.prefix}-${customer.phone.number}">
      </div>
      <div class="col-12">
        <label for="country" class="form-label">Country</label>
        <form:select class="form-select" aria-label="Default select example" id="country"
                     path="country.name" items="${countries}" >
        </form:select>
      </div>
      <div class="col-12">
        <button type="submit" class="btn btn-primary">Enviar</button>
      </div>
    </form>
  </div>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
          crossorigin="anonymous"></script>
</body>
</html>