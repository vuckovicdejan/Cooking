<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hp
  Date: 6/13/2018
  Time: 3:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="<c:url value="/resources/bootstrap.css" />" rel="stylesheet">
    <style>

        body{
            color: whitesmoke;
            background-image: url("https://wallpaperstudio10.com/static/wpdb/wallpapers/1920x1080/183116.jpg");

        }

        h1{

            color: whitesmoke;

        }

        .jumbotron{

            background: rgba(0, 0, 0, 0.5);

            border: 1px black;
            box-shadow: 1px 2px 5px #000000;

        }

        .vertical-center {
            min-height: 100vh;
            text-align: center;


            align-items: center;
        }


    </style>

</head>
<body>


  <div class="container">
      <div class="jumbotron vertical-center">
          <%--<h1 class="display-4">${opis.opis}</h1>--%>
         <h1>${opis.naziv}<h1>
         <h2> ${opis.opis}<h2>

          <c:forEach var="item" items="${kolicina}">
             <p>Sastojci:</p> ${item.kolicina}
              ${item.sastojci.naziv_sastojka}
          </c:forEach>
      </div>
  </div>



</body>
</html>
