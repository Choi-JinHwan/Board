<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>게시글 작성</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" type="text/css" media="screen" href="/resources/css/bootstrap.css">
  <link rel="stylesheet" type="text/css" media="screen" href="/resources/css/write.css">
  
</head>
<body>
  <c:import url="menu.jsp"></c:import>
  
  
  <div class="container">
    <h1 class="text-center">게시판 글쓰기</h1>
    <form action="/PostWriter" method="POST" id="submitForm" class="form-horizontal">
      <div class="form-group">
        <label for="title" class="col-sm-1 control-label">제목</label>
        <div class="col-sm-11">
          <input type="text" name="title" id="title" class="form-control" placeholder="제목을 작성해주세요.">
        </div>
      </div>
      <div class="form-group">
          <label for="name" class="col-sm-1 control-label">이름</label>
          <div class="col-sm-11">
            <input type="text" name="name" id="name" class="form-control" placeholder="이름을 작성해주세요.">
          </div>
        </div>
      <div>
        <textarea name="contents" id="description" class="form-control" rows="3" placeholder="내용을 작성해주세요."></textarea>
      </div>
      <div class="btn_wrap">
        <input type="submit" class="btn btn-success" value="작성완료" id="submit">
      </div>
    </form>
  </div>
  <script src="/resources/js/write.js"></script>
</body>
</html>