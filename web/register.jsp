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
                <span><img class="logo" src="images/logo.png"/></span>
                <a href="support.jsp">Support</a>
                <a href="seller.jsp">Seller</a>
                <a href="buyer.jsp">Buyer</a>
                <a href="login.jsp">Log In</a>
                <a href="register.jsp" class="sign">Register</a>                
            </div>
        </div><br/>
        <div class="container">
            <h5>Already have an account?<a href="login.jsp"> Sign In</a></h5>
            <h4>Sign Up to NeuBao</h4>
            <form action="RegisterServlet" method="post">
                <label for="uname">Pick a Username</label>
                <input type="text" id="uname" name="uname"/>
                <label for="uname">Your email address</label>
                <input type="text" id="email" name="email">
                <label for="uname">Password</label>
                <input type="password" id="pwd" name="pwd">
                <input type="submit" value="Sign Up">
            </form>
            <div class="terms">
                <p>By Clicking sign up you agree to NeuBao's <a href="">terms</a> and conditions and <a href="">privacy</a> statement. We will occasionally send you emails and information.</p>
            </div>
        </div>
        
    </body>
</html>
