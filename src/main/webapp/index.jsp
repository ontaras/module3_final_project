<%@ page import="quiz.Question" import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="<c:url value="/static/jquery-3.6.0.min.js"/>"></script>
    <title>Quiz</title>
    <style>
        ul { margin: 1em; }
        </style>
</head>
<body style="text-align: center">

<div>
    <h1 style="color:#337ab7;">WELCOME-сторінка</h1>
</div>
<article>
<p><h3>Завдання:</p>
<p>написати невеликий текстовий квест.</p>
<p>Питання на наступному кроці залежить від попередньої відповіді.</h3></p>
<p><h4>Вимоги:<?h4></p>

<div>
    <ol>
      <ul>Це має бути Maven проект із використанням таких технологій: сервлети, jsp, jstl.</ul>
      <ul>Для запуску при тестуванні буде використовуватися Tomcat 9, отже при розробці радимо обрати саме його.</ul>
      <ul>Після перемоги чи поразки має бути можливість розпочати гру наново.</ul>
      <ul>Якась інформація має зберігатися у сесії. Це може бути ім'я гравця, кількість зіграних ігор або ще щось на твій розсуд.<ul>
    </ol>
</div>

</article>
<div><button class="btn btn-primary" onclick="restart()">Почати гру</button></div>

<script>
    function restart() {
        $.ajax({
            url: 'restart',
            type: 'POST',
            contentType: 'application/json;charset=UTF-8',
            async: false,
            success: function () {
                location.replace('start');
            }
        });
    }
</script>

</body>
</html>