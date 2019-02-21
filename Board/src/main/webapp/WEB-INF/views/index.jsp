<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>메인 페이지</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" type="text/css" media="screen" href="/resources/css/bootstrap.css">
  <link rel="stylesheet" type="text/css" media="screen" href="/resources/css/index.css">
</head>
<body>
  <c:import url="menu.jsp"></c:import>
  <div id="backImg">
    <p id="center">영화 게시판 사이트 입니다.</p>
  </div>
  <div class="container">
    
  </div>

  <script>
    let backImg     = document.querySelector("#backImg");
    let randomNum   = Math.floor(Math.random() * 3) + 1;
    backImg.style.backgroundImage = "url('/resources/images/mainback" + randomNum + ".jpg')";

    let topMenu = document.querySelector("#topMenu");
    topMenu.classList.remove("navbar-static-top");
    topMenu.classList.add("navbar-fixed-top");
  </script>
</body>
</html>