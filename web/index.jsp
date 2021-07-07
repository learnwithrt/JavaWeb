<%-- 
    Document   : index
    Created on : Jun 28, 2021, 12:45:42 PM
    Author     : rahul
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="org.neubao.dao.ProductDao"%>
<%@page import="org.neubao.model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NeuBao</title>
        <link href="styles/home.css" rel="stylesheet"/>
    </head>
    <body>
        <!--<div class="bg-img"></div>-->
        <div class="nav-container">
            <div class="topnav">
                <img class="logo" src="images/logo.png"/>
                <a href="support.jsp">Support</a>
                <a href="seller.jsp">Seller</a>
                <a href="buyer.jsp">Buyer</a>
                <%
                    //get the session
                    //HttpSession sess=request.getSession(false);
                    //Do not crate a new session if one doesn't exist
                    //check if the attribute in the session is null
                    Object name=session.getAttribute("uname");
                    if(name==null){
                %>
                <a href="login.jsp">Log In</a>
                <a href="register.jsp" class="sign">Register</a>                
                <%
                    }
                    else{
                %>
                <a href="profile.jsp?id=<%=name%>" class="sign"><%=name%></a>          
                <a href="LogoutServlet">Logout</a>                
                <%}
                %>
            </div>
        </div>
        <div class="products">
            <table>
                <thead>
                    <tr>
                        <th>Picture</th>
                        <th>Name</th>
                        <th>Availability</th>
                        <th>Description</th>
                        <th>Price</th>
                        <th>Seller</th>
                    </tr>
                </thead>
                <tbody>
                    <!--
                    You want to write java code inside jsp you use % tags
                    -->
                    <%
                        //I can write java code
                        ArrayList<Product> products = new ProductDao().getAllProducts();
                        for (Product pro : products) {
                    %>
                    <tr>
                        <td><img class="productPic" src="images/<%=pro.getId()%>.jpg"></td>
                        <td><%=pro.getName()%></td>
                        <td><%=pro.getQty()%></td>
                        <td><%=pro.getDescription()%></td>
                        <td><%=pro.getPrice()%></td>
                        <td><%=pro.getSeller_id()%></td>
                        <td><a href="CartServlet?id=<%=pro.getId()%>">Add to cart</a></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>
