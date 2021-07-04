/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * To check if the user is a valid user and if the user is not valid then display the error div
 * 1. Go to the server and check if the user is valid
 * 2. if the user is valid then go to index.jsp
 * 3. if the user is invalid show the error div
 */
$(document).ready(function () {
    $("#submit").click(function () {
        console.log("Clicked");
        $.ajax({
            /*ajax request should be sent to the server and check the server's reply*/
            type: 'POST',
            url: 'LoginServlet?uname='+$('#uname').val()+'&pwd='+$('#pwd').val(),
            success: function (result) {
                console.log(result);
                if (result === "not")
                    $(".error").show(500);//this will show the error div
                else{
                    $(".success").show(500);
                    window.location.href="index.jsp";
                }
            }
        });
    });
});


