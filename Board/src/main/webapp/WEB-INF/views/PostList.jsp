<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>게시글 목록</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" type="text/css" media="screen" href="/resources/css/bootstrap.css">
  <link rel="stylesheet" type="text/css" media="screen" href="/resources/css/list.css">
</head>
<body>
  <h1 class="text-center">게시판 목록입니다.</h1>
  <div class="container">
    <table class="table table-striped table-bordered">
      <tr>
        <th>#</th>
        <th class="col-sm-10 text-center">제목</th>
        <th class="col-sm-2 text-center">작성일</th>
        <th class="col-sm-2 text-center">작성자</th>
        <th class="col-sm-2 text-center">조회수</th>
        <th class="col-sm-3 text-center">수정</th>
      </tr>
      <c:forEach var="post" items="${postList}">
        <tr id="linkTable" class="tr_hover" style="cursor:pointer;">
          <td class="text-center linkTd"><span>count</span></td>
          <td class="text-center linkTd"><span>${post.title}</span></td>
          <td class="text-center linkTd"><span>${post.writeDate}</span></td>
          <td class="text-center linkTd"><span>${post.name}</span></td>
          <td class="text-center linkTd"><span>${post.viewCount}</span></td>
          <td>
            <button type="button" class="submitBtn" onclick="location.href='/PostUpdate/${post.postId}';">수정</button>
          </td>
        </tr>
      </c:forEach>
    </table>
  </div>
  <script src="/resources/js/list.js"></script>
</body>
</html>