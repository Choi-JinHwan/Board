<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>게시글 조회</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" type="text/css" media="screen" href="/resources/css/bootstrap.css">
  <link rel="stylesheet" type="text/css" media="screen" href="/resources/css/view.css">
</head>
<body>
  <h1 class="text-center">${post.title}</h1>
  <div class="container">
    <table class="table-striped table-striped table">
      <tr>
        <td>글 번호</td>
        <td>count</td>
      </tr>
      <tr>
        <td>제목</td>
        <td>${post.title}</td>
      </tr>
      <tr>
        <td>작성자</td>
        <td>${post.name}</td>
      </tr>
      <tr>
        <td>작성일</td>
        <td>${post.writeDate}</td>
      </tr>
      <tr>
        <td>작성자</td>
        <td>${post.viewCount}</td>
      </tr>
    </table>
    <p class="pContents">
      ${post.contents}
    </p>
  </div>
</body>
</html>