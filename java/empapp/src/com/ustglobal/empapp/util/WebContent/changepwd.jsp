<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/css/materialize.min.css">
    <title>Change Password</title>
</head>

<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>

<body>

    <a class="waves-effect waves-light btn" href="./home">Home</a>
    <a class="waves-effect waves-light btn" href="./logout">Logout</a>
    
    <h4><%=msg %></h4>

    <div class="row center">
            <form class="col s12" action="./changepwd" method="POST">
                <div class="row">
                    <div class="input-field col s6">
                        <i class="material-icons prefix">lock</i>
                        <input id="icon_prefix" type="password" class="validate" name="password">
                        <label for="icon_prefix">New Password</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s6">
                        <i class="material-icons prefix">lock</i>
                        <input id="icon_prefix" type="password" class="validate" name="confirmpwd">
                        <label for="icon_prefix">Confirm Password</label>
                    </div>
                </div>
                <button class="btn waves-effect waves-light" type="submit" name="action">Change Password
                    <i class="material-icons right">autorenew</i>
                </button>
            </form>
        </div>

    <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/js/materialize.min.js"></script>
</body>

</html>