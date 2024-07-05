<%@ page import="quiz.Question" import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
    <script src="<c:url value="/static/jquery-3.6.0.min.js"/>"></script>
    <title>Quiz</title>
</head>
<body style="text-align: center";>
<div>
    <h1 style="color:#337ab7;">Квест</h1>
</div>

<c:if test="${restart}">
<h3 style="color:#337ab7;">
<c:out value="${message}" >
</c:out>
</h3>
    <button class="btn btn-primary" onclick="restart()">Почати знову</button>
</c:if>

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

