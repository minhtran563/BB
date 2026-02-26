<%-- 
    Document   : AddProdut
    Created on : Feb 23, 2026, 4:00:56 PM
    Author     : Minh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INSERT PRODUCT</title>
    </head>
    <body>
        <h1>INSERT PRODUCT</h1>
        <form name="f1" id="f1" method="post" action="AddProduct">
            <p> Category:
                <select name="catid">
                    <option value="">select category</option>
                    <c:forEach items="${requestScope.listCategory}" var="item" varStatus="loop">
                        <option value="${item.getCatId()}">
                            ${item.getCatname()}
                        </option>
                    </c:forEach>
                </select>
            </p>
            <p>Name:<input type="text" name="pname"></p>
            <p>Price:<input type="number" name="pprice"></p>
            <p>Images:<input type="text" name="pimage"></p>
            <p>Description:<textarea name="pdescription" rows="5" cols="50"></textarea></p>
            <p>Status:<input type="checkbox" name="pstatus" value="1"></p>
            <p>
                <input type="submit" name="submitButton" value="Add" />
                <input type="reset" name="resetButton" value="Reset" />
            </p>
        </form>
    </body>
</html>
