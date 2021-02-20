<%@page import="bean.UserRegistrationBean"%>
<%@page import="model.UserRegistrationDao"%>

<%
    HttpSession sessionObj = request.getSession(false);
    String email = (String) sessionObj.getAttribute("email");
    String pass = (String) sessionObj.getAttribute("pass");
    UserRegistrationBean obj = new UserRegistrationDao().getUserByEmail(email);
%> 
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=yes">
        <title>user profile</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//js/bootstrap.min.js"></script>
        <script src="js/jquery.min.js"></script>
        <link rel="stylesheet" href="css/bootstrapmy.css">
    </head>


    <body style="background-color: #660033;">
        <span style="color:#0000ff;">
            <img src="<%= obj.getPic()%>">
        </span>
        <div class="container register">
            <div class="row">
                <div class="col-md-3 register-left">
                    <img src="css/logo_white.png" alt=""/>
                    <h3>Welcome</h3>
                    <p>You Are Logged In!!</p>
                    <button onclick="location.href = 'login.html';" class="btn btn-primary btn-lg" name="btn_registration">Sign Out</button>

                </div>
                <div class="col-md-9 register-right">
                    <h3 align="center"><span style="color:#1BBD36;"> 
                            <%= obj.getFname() + " " + obj.getLname()%>'s
                        </span> Profile</h3>

                    <div class="col-md-10" >
                        <div class="media " style="margin-left:190px">


                            <table class="table bordered">

                                <tr>
                                    <td><span style="color:#660066;">Full Name:</span></td>
                                    <td>
                                        <span style="color:#0000ff;">
                                            <%= obj.getFname() + " " + obj.getLname()%>
                                        </span>
                                    </td>
                                </tr>
                                <tr>
                                    <td><span style="color:#660066;">Date Of Birth:</span></td>
                                    <td>
                                        <span style="color:#0000ff;">
                                            <%= obj.getDob()%>
                                        </span>
                                    </td>
                                </tr>
                                <tr>
                                    <td><span style="color:#660066;">Gender:</span></td>
                                    <td>
                                        <span style="color:#0000ff;">
                                            <%= obj.getGen()%>
                                        </span>
                                    </td>
                                </tr>
                                <tr>
                                    <td><span style="color:#660066;">College:</span></td>
                                    <td>
                                        <span style="color:#0000ff;">
                                            <%= obj.getCol()%>
                                        </span>
                                    </td>
                                </tr>
                                <tr>
                                    <td><span style="color:#660066;">Email:</span></td>
                                    <td>
                                        <span style="color:#0000ff;">
                                            <%= obj.getEmail()%>
                                        </span>
                                    </td>
                                </tr>
                                <tr>
                                    <td><span style="color:#660066;">Mobile:</span></td>
                                    <td>
                                        <span style="color:#0000ff;">
                                            <%= obj.getMobile()%>
                                        </span>
                                    </td>
                                </tr>
                                <tr>
                                    <td><span style="color:#660066;">Password:</span></td>
                                    <td>
                                        <span style="color:#0000ff;">
                                            <%= obj.getPass()%>
                                        </span>
                                    </td>
                                </tr>
                            </table>

                        </div>
                    </div>

                </div>
            </div>

        </div>
    </body>
</html>