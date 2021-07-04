<%-- 
    Document   : register
    Created on : Jun 28, 2021, 1:14:41 PM
    Author     : rahul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NeuBao</title>
        <link rel="stylesheet" href="styles/registration.css"/>
        <link rel="stylesheet" href="styles/home.css"/>
    </head>
    <body>
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
        <div class="container">
            <h4>New Product</h4>
            <form action="ProductServlet" method="post">
                <label for="name">Product Name</label>
                <input type="text" id="name" name="name">
                <label for="qty">Quantity</label>
                <input type="text" id="qty" name="qty"/>
                <label for="desc">Description</label>
                <textarea id="desc" name="desc"></textarea>
                <label for="price">Price</label>
                <input type="text" id="price" name="price"/>
                <input type="submit" value="Add">
            </form>
        </div>

    </body>
</html>
