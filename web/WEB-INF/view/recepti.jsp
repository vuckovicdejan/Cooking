<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="sr">
<head>
    <title>HTML5 kuhinja</title>
    <meta charset="utf-8"/>
    <style type="text/css">
        header, section, footer, aside, nav, article, figure, figcaption {
            display: block;}
        body {
            color: #666666;
            background-color: #f9f8f6;
            background-position: center;
            font-family: Georgia, Times, serif;
            line-height: 1.4em;
            margin: 0px;}
        .wrapper {
            width: 940px;
            margin: 20px auto 20px auto;
            border: 2px solid #000000;
            background-color: #ffffff;}
        header {
            height: 160px;
            background-image: url("/resources/header-7.png");
            background-size: cover;
            padding-top: 20px;
        }
        h1 {
            text-indent: 20px;
            width: 940px;
            height: 110px;
            margin: 0px;
        }
        nav, footer {
            clear: both;
            color: #ffffff;
            background-color: #aeaca8;
            height: 30px;}
        nav ul {
            margin: 0px;
            padding: 5px 0px 5px 30px;}
        nav li {
            display: inline;
            margin-right: 40px;}
        nav li a {
            color: #ffffff;}
        nav li a:hover, nav li a.current {
            color: #000000;}
        section.courses {
            float: left;
            width: 659px;
            border-right: 1px solid #eeeeee;}
        article {
            clear: both;
            overflow: auto;
            width: 100%;}
        .hgroup {
            margin-top: 40px;}
        figure {
            float: left;
            width: 290px;
            height: 220px;
            padding: 5px;
            margin: 20px;
            border: 1px solid #eeeeee;}
        figcaption {
            font-size: 90%;
            text-align: left;}
        aside {
            width: 230px;
            float: left;
            padding: 0px 0px 0px 20px;}
        aside section a {
            display: block;
            padding: 10px;
            border-bottom: 1px solid #eeeeee;}
        aside section a:hover {
            color: #985d6a;
            background-color: #efefef;}
        a {
            color: #de6581;
            text-decoration: none;}
        h1, h2, h3 {
            font-weight: normal;}
        h2 {
            margin: 10px 0px 5px 0px;
            padding: 0px;}
        h3 {
            margin: 0px 0px 10px 0px;
            color: #de6581;}
        aside h2 {
            padding: 30px 0px 10px 0px;
            color: #de6581;}
        footer {
            font-size: 80%;
            padding: 7px 0px 0px 20px;}
    </style>
    <!--[if lt IE 9]>
    <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>
<body>
<div class="wrapper">
    <header>
        <h1>NiCAT kuhinja</h1>
        <nav>
            <ul>
                <li><a href="/cooking/home" class="current">Prva strana</a></li>
                <li><a href="">Kursevi</a></li>
                <li><a href="">Ketering</a></li>
                <li><a href="">O NiCAt-u</a></li>
                <li><a href="">Kontakt</a></li>
                <li><a href="/forma">Login</a></li>
                <li><a href="/cooking/forma">Sign Out</a></li>
            </ul>
        </nav>
    </header>
    <section class="courses" >
        <%--<a href="uvod.html">--%>
            <div style="height: 530px; overflow:auto">
            <c:forEach var="recipe" items="${recepti}">

            <article>
                <c:url var="link" value="/cooking/opis">
                    <c:param name="id_recepti" value="${recipe.id}" />
                </c:url>
                <figure>
                    <img src=" ${recipe.nazivSlike}">
                    <figcaption> <a href="${link}">${recipe.naziv}</a></figcaption>
                </figure>

                    <div class="hgroup">

                        <tr>
                            <td>${recipe.naziv} </td><br>

                            <td> ${recipe.kratakNaziv} </td>
                        <tr>
                    </div>




            </article>

        <%--</a>--%>
        </c:forEach>
</div>
        <%--<a href="sauces.html">--%>
            <%--<article>--%>
                <%--<figure>--%>
                    <%--<img src="/resources/kin2.jpg" alt="Teriyaki sauce" />--%>
                    <%--<figcaption>Terijaki sos</figcaption>--%>
                <%--</figure>--%>
                <%--<div class="hgroup">--%>

                    <%--<h2>Obuka u kreiranju soseva</h2>--%>
                    <%--<h3>U trajanju od jednog dana</h3>--%>

                <%--</div>--%>
                <%--<p>Intezivan kurs koji NiCAT organizuje a povodom kreiranja soseva koji odgovaraju toplom vremenu.</p>--%>
            <%--</article>--%>
        <%--</a>--%>
    </section>
    <aside>
        <section class="popular-recipes">
            <h2>Popularni recepti</h2>
            <c:forEach var="recipe" items="${recepti}">
                <%--<c:url var="updateLink" value="/cooking/opis">--%>
                    <%--<c:param name="username" value="${recipe.users}" />--%>
                <%--</c:url>--%>
                <c:url var="link" value="/cooking/opis">
                    <c:param name="id_recepti" value="${recipe.id}" />
                </c:url>
                <%--<a href="${updateLink}">${recipe.naziv}</a>--%>
                <a href="${link}">${recipe.naziv}</a>
            </c:forEach>
        </section>
        <section class="contact-details">
            <h2>Dikele kontakti</h2>
            <h3>Svemirska Kafana</h3>
            <h3>Ceres Station, Asteroid Belt</h3>

        </section>
    </aside>
    <footer>
        &copy; 2017 NiCAT
    </footer>
</div><!-- .wrapper -->
</body>
</html>