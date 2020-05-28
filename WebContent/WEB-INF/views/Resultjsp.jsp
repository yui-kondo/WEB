<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
                <h4>検索結果</h4>
            </div>
            <div id="content">

                <p>1件目：</p>
                <table>
                <tbody>
                    <tr>
                        <th>曲ID</th>
                        <td><c:out value="${songId}" /></td>
                    </tr>
                    <tr>
                        <th>曲名</th>
                        <td><c:out value="${songTitle}" /></td>
                    </tr>
                    <tr>
                        <th>コメント</th>
                        <td><c:out value="${songComment}" /></td>
                    </tr>
                    <tr>
                        <th>作曲年月日</th>
                        <td><fmt:formatDate value="${songCreate}"
                                pattern="yyyy-MM-dd" /></td>
                    </tr>
                    <tr>
                        <th>アーティスト番号</th>
                        <td><c:out value="${songArtist}" /></td>
                    </tr>
                    <tr>
                        <th>曲調</th>
                        <td><c:out value="${songTune}" /></td>
                    </tr>
                    <tr>
                        <th>シリーズ</th>
                        <td><c:out value="${songSeries}" /></td>
                    </tr>
                </tbody>
            </table>
            <br /><br />

            <c:if test = "${songId1 != null}" >
            <p>2件目：</p>
            <table>
                <tbody>
                    <tr>
                        <th>曲ID</th>
                        <td><c:out value="${songId1}" /></td>
                    </tr>
                    <tr>
                        <th>曲名</th>
                        <td><c:out value="${songTitle1}" /></td>
                    </tr>
                    <tr>
                        <th>コメント</th>
                        <td><c:out value="${songComment1}" /></td>
                    </tr>
                    <tr>
                        <th>作曲年月日</th>
                        <td><fmt:formatDate value="${songCreate1}"
                                pattern="yyyy-MM-dd" /></td>
                    </tr>
                    <tr>
                        <th>アーティスト番号</th>
                        <td><c:out value="${songArtist1}" /></td>
                    </tr>
                    <tr>
                        <th>曲調</th>
                        <td><c:out value="${songTune1}" /></td>
                    </tr>
                    <tr>
                        <th>シリーズ</th>
                        <td><c:out value="${songSeries1}" /></td>
                    </tr>
                </tbody>
            </table>
            <br /><br />


            </c:if>

            <a href = "<c:url value='/LoginSerch/m_serch01.html' />">検索ページへ</a>

            </div>
        </div>
    </body>
</html>