<%@ page import="quiz.Question" import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="<c:url value="/static/jquery-3.6.0.min.js"/>"></script>
    <title>Quiz</title>
</head>
<body style="text-align: center";>

<div>
    <h1 style="color:#337ab7;">Квест</h1>
</div>

<%
Question question = (Question) session.getAttribute("question");
%>

<div style="color:#337ab7;">
    <h3>
        <%= question.getQuestionText() %>
    </h3>
</div>

<% for(Map.Entry<String,Boolean> pair : question.getAnswers().entrySet()) { %>

<form action="logic" method="post">
    <div class="radio">
        <label style="color:#337ab7;">
            <input type="radio" name="option" id="optionsRadios" value= "<%= pair.getValue() %>" checked>
            <%= pair.getKey() %>
        </label>
    </div>

<% } %>

<button type="submit" class="btn btn-primary">відповісти</button>
</form>
</body>
</html>