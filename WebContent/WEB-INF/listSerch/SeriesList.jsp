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
                <h4>シリーズ名検索用フォーム</h4>
            </div>
            <div id="content">
            <p>シリーズ名&nbsp; &nbsp;
            <form action="<c:url value='/seriesResult' />" method="post">
            <select name="seriesSerch">
                   <option value="ラブソング" selected>ラブソング</option>
                   <option value="アニメソング">アニメソング</option>
                   <option value="ロック">ロック</option>
                   <option value="映画ソング">映画ソング</option>
                   <option value="J-POP">J-POP</option>

                   </select>
                   &nbsp; &nbsp;<input class= "sb" type="submit" name ="button" value=" Search ">

            </form>
            </p>

            <a href = "<c:url value='/LoginSerch/m_serch01.html' />">前のページへ</a>

            </div>
         </div>
     </body>
</html>