<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>つぶやきアプリ</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h1>つぶやきアプリ</h1>
    <form action="tsubuyaki" method="post">
        <input type="text" name="message" placeholder="今何してる？" required>
        <button type="submit">投稿</button>
    </form>
    <hr>
    <h2>みんなのつぶやき</h2>
    <ul>
        <c:forEach var="tsubuyaki" items="${tsubuyakiList}">
            <li>${tsubuyaki.timestamp} - ${tsubuyaki.message}</li>
        </c:forEach>
    </ul>
</body>
</html>
