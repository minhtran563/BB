<%-- 
    Document   : ListProduct
    Created on : 23 Feb 2026, 14:42:10
    Author     : Admin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Danh sách sẩn phẩm</title>
    </head>
    <body>
        <h1 align="center">Danh sách sản phẩm</h1>
        <table border="1" width="800" cellpadding="5" align="center">
            <thead>
                <tr>
                    <th>PID</th>
                    <th>Product Name</th>
                    <th>Images</th>
                    <th>Price</th>
                    <th>Status</th>
                    <th>Category</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${requestScope.list}">
                    <tr>
                        <td>${item.getPid()}</td>
                        <td>${item.getPname()}</td>
                        <td><img src="pictures/Sanpham/${item.getPimage()}" width="80"></td>
                        <td><fmt:formatNumber type="number" value="${item.getPprice()}" /></td>
                        <td>${item.isPstatus()?"Có":"Không"}</td>
                        <td>${item.getCatname()}</td>
                        <td>Upadate - Delete</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

    </body>
</html>
