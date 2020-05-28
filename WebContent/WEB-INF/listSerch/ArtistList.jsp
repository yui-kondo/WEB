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
                <h4>アーティスト名検索用フォーム</h4>
            </div>
            <div id="content">
            <p>アーティスト名&nbsp; &nbsp;
            <form action="<c:url value='/artistResult' />" method="post">
            <select name="artistSerch">
                   <option value="BUMP" selected>BUMP OF CHIKIN</option>
                   <option value="Lisa">Lisa</option>
                   <option value="EXILE">EXILE</option>
                   <option value="米津玄師">米津玄師</option>
                   <option value="B'z">B'z</option>

                   </select>
                   &nbsp; &nbsp;<input class= "sb" type="submit" name ="button" value=" Search ">

            </p>

             </form>

             <a href = "<c:url value='/LoginSerch/m_serch01.html' />">前のページへ</a>

            </div>
         </div>
     </body>
</html>