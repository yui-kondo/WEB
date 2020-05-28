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
                <h4>曲調検索用フォーム</h4>
            </div>
            <div id="content">
            <p>曲調&nbsp; &nbsp;
            <form action="<c:url value='/tuneResult' />" method="post">
            <select name="tuneSerch">
                   <option value="ロマンティック" selected>ロマンティック</option>
                   <option value="リラックス">リラックス</option>
                   <option value="元気ソング">元気ソング</option>
                   <option value="楽しい">楽しい</option>
                   <option value="悲しい">悲しい</option>

                   </select>
                   &nbsp; &nbsp;<input class= "sb" type="submit" name ="button" value=" Search ">


            </p>
            </form>

            <a href = "<c:url value='/LoginSerch/m_serch01.html' />">前のページへ</a>
            </div>
         </div>
     </body>
</html>