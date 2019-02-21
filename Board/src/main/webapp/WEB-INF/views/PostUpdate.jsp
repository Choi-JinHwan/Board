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
  <h1 class="text-center">글 수정</h1>
  <div class="container">
    <form action="" method="POST" id="submitForm" class="form-horizontal">
      <div class="form-group">
        <label for="title" class="col-sm-1 control-label">제목</label>
        <div class="col-sm-11">
          <input type="text" name="title" id="title" class="form-control" placeholder="제목을 작성해주세요." value="${post.title}">
        </div>
      </div>
      <div class="form-group">
          <label for="name" class="col-sm-1 control-label">이름</label>
          <div class="col-sm-11">
            <input type="text" name="name" id="name" class="form-control" placeholder="이름을 작성해주세요." value="${post.name}">
          </div>
        </div>
      <div>
        <textarea name="description" id="description" class="form-control" rows="3" placeholder="내용을 작성해주세요.">${post.contents}</textarea>
      </div>
      <div class="btn_wrap">
        <input type="submit" class="btn btn-success" value="수정완료" id="submit">
      </div>
    </form>
  </div>
  <script src="/resources/js/write.js"></script>
</body>
</html>