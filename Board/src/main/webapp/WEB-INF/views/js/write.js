let title         = document.querySelector("#title");
let description   = document.querySelector("#description");
let name          = document.querySelector("#name");
let submit        = document.querySelector("#submit");
let submitForm    = document.querySelector("#submitForm");


let checkForm = function(){
  submitForm.addEventListener("submit", function (e) {
    if (title.value === "") {
      alert("제목을 작성해주세요.");
      title.focus();
      e.preventDefault();
      return false;
    }
    if (name.value == "") {
      alert("이름을 작성해주세요.");
      name.focus();
      e.preventDefault();
      return false;
    } 
    if (description.value == "") {
      alert("내용을 작성해주세요.");
      description.focus();
      e.preventDefault();
      return false;
    } 
  });
}

checkForm();