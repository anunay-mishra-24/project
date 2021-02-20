<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=yes">
        <title>Registration</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//js/bootstrap.min.js"></script>
        <script src="js/jquery.min.js"></script>
        <link rel="stylesheet" href="css/bootstrapmy.css">
        <script>
            var check = function () {
                if (document.getElementById('pass').value ==
                        document.getElementById('cpass').value) {
                    document.getElementById('message').style.color = 'green';
                    document.getElementById('message').innerHTML = 'Password Matched.';
                } else {
                    document.getElementById('message').style.color = 'red';
                    document.getElementById('message').innerHTML = 'Password Not matched!';
                }
            }
        </script>
    </head>


    <body style="background-color: #660033;">
        <div class="container register">
            <div class="row">
                <div class="col-md-3 register-left">
                    <img src="css/logo_white.png" alt=""/>
                    <h3>Welcome</h3>
                    <p>Register Yourself To enjoy free account!</p>
                    <h5 style="color: #ffcc99;">Already Registered?</h5>
                    <button onclick="location.href = 'login.html';" class="btn btn-primary btn-lg" name="btn_registration">Sign In</button>

                </div>
                <div class="col-md-9 register-right">
                    <form action="./register" method="post" role="form">
                        <div class="tab-content" id="myTabContent">
                            <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                                <h3 class="register-heading">Register Here</h3>

                                <div class="row register-form">
                                    <div class="col-md-6">

                                        <div class="form-group">
                                            <input type="text" name="fname" id="fname" class="form-control" placeholder="First Name *" />
                                        </div>
                                        <div class="form-group">
                                            <input type="text" name="lname" id="lname" class="form-control" placeholder="Last Name *" />
                                        </div>
                                        <div class="form-group">
                                            <input type="password" name="pass" id="pass" class="form-control" placeholder="Password *" onkeyup='check();' />
                                        </div>
                                        <div class="form-group">
                                            <input type="password" name="cpass" id="cpass" class="form-control"  placeholder="Confirm Password *" onkeyup='check();'/>
                                            <span id='message'></span>
                                        </div>
                                        <div class="form-group">
                                            <label for="pic">
                                                Select Profile Image:
                                            </label>
                                            <input type="file" name="pic" id="pic" accept="image/*"/>
                                        </div>
                                    </div>
                                    <div class="col-md-6">

                                        <div class="form-group">
                                            <input type="email" name="email" id="email" class="form-control" placeholder="Your Email *"  />
                                        </div>
                                        <div class="form-group">
                                            <input type="text" id="mobile" maxlength="10" name="mobile" class="form-control" placeholder="Your Phone *"  />
                                        </div>
                                        <div class="form-group">
                                            <input type="date" name="dob" id="dob" class="form-control"/>
                                        </div>
                                        <div class="form-group">
                                            <input type="text" name="col" id="col" class="form-control" placeholder="College Name *" />
                                        </div>
                                        <div class="form-group">
                                            <div class="maxl">
                                                <label class="radio inline"> 
                                                    <input type="radio" class="form-control" name="gen" id="gen" value="male" checked>
                                                    <span> Male </span> 
                                                </label>
                                                <label class="radio inline"> 
                                                    <input type="radio" class="form-control" name="gen" id="gen" value="female">
                                                    <span>Female </span> 
                                                </label>
                                            </div>
                                        </div>
                                        <button type="submit" class="btn btn-primary btn-lg" name="btn_registration">Register</button>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>