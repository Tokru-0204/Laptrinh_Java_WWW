<%@ page import="vn.edu.iuh.fit.backend.services.ProductServices" %>
<%@ page import="vn.edu.iuh.fit.backend.models.Product" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products Listing</title>
    <!-- Add a link to Bootstrap 4 CSS file -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>
<%
    vn.edu.iuh.fit.backend.services.ProductServices productServices = new vn.edu.iuh.fit.backend.services.ProductServices();
    List<vn.edu.iuh.fit.backend.models.Product> lst = productServices.getActiveProducts();
%>
<div class="container mt-5">
    <h2>Products Listing</h2>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Description</th>
            <th>Unit</th>
            <th>Manufacturer</th>
            <th>Status</th>
            <th colspan="2">Actions</th>
        </tr>
        </thead>
        <tbody>
        <% for (vn.edu.iuh.fit.backend.models.Product product : lst) {
            long id = product.getProduct_id();
            String deleteString = "controls?action=delete_product&id=" + id;
            String editString = "controls?action=edit_product&id=" + id;
        %>
        <tr>
            <td><%= id %></td>
            <td><%= product.getName() %></td>
            <td><%= product.getDescription() %></td>
            <td><%= product.getUnit() %></td>
            <td><%= product.getManufacturer() %></td>
            <td><%= product.getStatus() %></td>
            <td><a href="<%= editString %>" class="btn btn-warning btn-sm">Update</a></td>
            <td><a href="<%= deleteString %>" class="btn btn-danger btn-sm">Delete</a></td>
        </tr>
        <% } %>
        </tbody>
    </table>
</div>

<!-- Add links to Bootstrap 4 JS files -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
