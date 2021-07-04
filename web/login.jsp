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
        <script src="script/jquery-3.6.0.min.js"></script>
        <script type="text/javascript" src="script/base.js"></script>
    </head>
    <body>
        <div class="container">
            <h5>Don't have an account?<a href="register.jsp"> Sign Up</a></h5>
            <h4>Sign In to NeuBao</h4>
            <form>
                <label for="uname">Enter Username</label>
                <input type="text" id="uname" name="uname"/>
                <label for="uname">Enter Password</label>
                <input type="password" id="pwd" name="pwd">
                <input type="button" value="Sign In" id="submit">
            </form>
            <div class="terms">
                <p>By Clicking sign in you agree to NeuBao's 
                    <a href="">terms</a> and conditions and 
                    <a href="">privacy</a> statement. 
                    We will occasionally send you emails and information.</p>
            </div>
            <div class="error">
                <p>Sorry! It seems that you are not registered. Please register first</p>
            </div>
            <div class="success">
                <p>Welcome! User</p>
            </div>
        </div>

    </body>
</html>
