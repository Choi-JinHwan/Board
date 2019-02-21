let span = document.querySelectorAll(".linkTd > span");
let locaFunc = function () {
  location.href = '/PostView/${post.postId}';
}

for (let i = 0; i < span.length; i++) {
  span[i].addEventListener("click", locaFunc);  
}


