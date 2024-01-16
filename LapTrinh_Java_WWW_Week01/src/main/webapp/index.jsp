<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <title>Login</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />

  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
          integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
          integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
          crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
          integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
          crossorigin="anonymous"></script>

  <script src="https://code.jquery.com/jquery-3.7.0.js" integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM="
          crossorigin="anonymous"></script>

  <script>
    document.addEventListener("DOMContentLoaded", function () {
      let arrCookie = document.cookie.split(";");
      let alertShown = false;

      function checkCookie() {
        for (let i in arrCookie) {
          let keyAndValue = arrCookie[i].split("=");
          let key = keyAndValue[0];
          let value = keyAndValue[1];
          if (key == "state_login" && value == "user_null") {
            alert("user not found, login again!!");
            alertShown = true;
          }
          if (key == "state_login" && value == "user_pwd_fail") {
            alert("user password fail, login again!!");
            alertShown = true;
          }
        }
      }
      document.getElementById("loginForm").addEventListener("submit", function (event) {
        let accountId = document.getElementById("accountId").value;
        let password = document.getElementById("pwd").value;

        // Example condition to trigger an alert
        if (accountId === "" || password === "") {
          alert("Please enter both Account_id and Password!");
          event.preventDefault();
        } else {
          if (!alertShown) {
            checkCookie();
          }
        }
      });
      checkCookie();
    });
  </script>
</head>

<body>
<div class="container">
  <h2 class="text-center">Login</h2>
  <form class="form-horizontal" action="ControlServlet" id="loginForm">
    <div class="form-group">
      <label class="control-label col-sm-3 offset-sm-3" for="accountId">Account:</label>
      <div class="col-sm-6 offset-sm-3">
        <input class="form-control" id="accountId" placeholder="Enter Account" name="accountId">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-3 offset-sm-3" for="pwd">Password:</label>
      <div class="col-sm-6 offset-sm-3">
        <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
      </div>
    </div>
    <div class="form-group text-center">
      <button type="submit" class="btn btn-success" style="background: darkcyan; color: white; border-color:darkcyan">Login</button>
    </div>
  </form>
</div>
</body>

</html>
