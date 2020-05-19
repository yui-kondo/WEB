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
                <h4>検索用フォーム</h4>
            </div>
            <div id="content">
                <h1>これはMUSIC_DBデータ検索用のフォームです。</h1>
                <br /><br />
                <P>下からフィールド名を選択してください。</P>
                <p>フィールド名を選択したら、【GetList】ボタンをクリックします。</p>
                <br />

                <p><select name="category_name">
                   <option value="selectoin" selected>ここからカテゴリ名を選んでください。</option>
                   <option value="song">曲名</option>
                   <option value="artist">アーティスト名</option>
                   <option value="series">シリーズ名</option>
                   <option value="tune">曲調</option>
                   <option value="createday">制作日</option>

                   </select>
                   &nbsp; &nbsp;<button type="button">GetList</button></p>

            </div>
        </div>
    </body>
</html>