<%-- 
    Document   : index
    Created on : Jun 28, 2021, 12:45:42 PM
    Author     : rahul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NeuBao</title>
        <link href="styles/home.css" rel="stylesheet"/>
    </head>
    <body>
        <div class="bg-img"></div>
        <div class="nav-container">
            <div class="topnav">
                <img class="logo" src="images/logo.png"/>
                <a href="support.jsp">Support</a>
                <a href="seller.jsp">Seller</a>
                <a href="buyer.jsp">Buyer</a>
                <a href="login.jsp">Log In</a>
                <a href="register.jsp" class="sign">Register</a>                
            </div>
        </div>
        <div class="content">
            <a href="add_product.jsp">Sell Product</a>
            <a href="manage_products">Manage Products</a>
        </div>

    </body>
</html>
