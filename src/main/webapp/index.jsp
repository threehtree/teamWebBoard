<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1 class="titleWord"><%= "Hello World!" %></h1>
<br/>

<button class="btnOne">One</button>

<button class="btnTwo">Two</button>

<script>
    const one = document.querySelector(".btnOne")
    const two = document.querySelector(".btnTwo")
    let title = document.querySelector(".titleWord")

    one.addEventListener("click", (e)=>{
        title.innerHTML = "hhhhhhh"
    },false)

    two.addEventListener("click", (e)=>{
        title.innerHTML = "HelloWord"
    },false)

</script>

</body>
</html>