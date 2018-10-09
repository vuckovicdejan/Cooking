<%--
  Created by IntelliJ IDEA.
  User: Hp
  Date: 6/9/2018
  Time: 11:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="<c:url value="/resources/bootstrap.css" />" rel="stylesheet">
    <style type="text/css">

        body{
            background-image: url("https://coolcookstyle.files.wordpress.com/2011/04/p1000825.jpg");
            background-size: 100%;
            background-attachment: fixed;
        }

        .jumbotron{
            background: rgba(0, 0, 0, 0.5);
            position: absolute;
            top: 50%;
            left:50%;
            transform: translate(-50%,-50%);
            border: 1px black;
            box-shadow: 1px 2px 5px #000000;
        }

        .container-fluid {
            position: relative;
            height: 14rem;
            border: 1px solid blue;
        }

        #link{

            font-size: 50px;

        }

    </style>
</head>
<body>
<%--<div class="container-fluid">--%>

<div class="jumbotron" align="center">
    <%--<div id="wrapper" align="center">--%>
<form:form action="processForm" modelAttribute="cooking" method="post"  onsubmit="(!(alert(showLenght()))); ">
    <form:input path="username" id="user" type="text" placeholder="Enter Username" min="5" />
<br>
    <form:input path="password" id="pass" type="password" placeholder="Enter Password" min="3" />
<br>
    <button class="btn-primary" type="submit"  >Unos......</button>
</form:form>
    <%--</div>--%>
</div>
<%--</div>--%>
<a class="nav-link" id="link" href="/cooking/home">Prikaz Recepata</a>



<script>

    function showLenght() {
        var x = document.getElementById('user').value;
        var y = document.getElementById('pass').value;
        var z = x + y;

        return "Duzina karaktera  je: " + z.length;

    }

</script>
</body>
</html>
