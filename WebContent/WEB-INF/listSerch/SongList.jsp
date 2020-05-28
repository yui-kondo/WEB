<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>WebDBシステム</title>
        <link rel="stylesheet" href="<c:url value='/css/reset.css' />">
        <link rel="stylesheet" href="<c:url value='/css/style.css' />">

    </head>
    <body>
        <div id="wrapper">
            <div id="header">
                <h4>曲名検索用フォーム</h4>
            </div>
            <div id="content">
            <p>曲名を入力してください。</p>

            <form action="http://localhost:8080/WebDBSystem/Songtitle" method="post">
            <input type="text" name ="song" size ="20">
            <br /><br />

            <input class= "sb" type="submit" value="Search"><br /><br />
            </form>

            <a href = "<c:url value='/LoginSerch/m_serch01.html' />">前のページへ</a>
            </div>
        </div>
    </body>
</html>