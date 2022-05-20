<%--
  Created by IntelliJ IDEA.
  User: LDJ
  Date: 2022-05-18
  Time: 오후 6:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>MyPage</title>
</head>
<body>

<br/>
<br/>
<table
        border="1"
        width="50%"
        height="200"
        cellspacing="5">
    <caption>표 제목</caption>
    <thead>
    <tr align="center" bgcolor="white">
        <td></td>
        <th>사용자 개인정보</th>
    </tr>
    </thead>

    <tbody>
    <tr align="center" bgcolor="white">
        <th>No</th>
        <th>${memDtoOne.memNo}</th>
    </tr>
    <tr align="center" bgcolor="white">
        <td>ID</td>
        <td>${memDtoOne.memID}</td>
    </tr>
    <tr align="center" bgcolor="white">
        <td>이름</td>
        <td>${memDtoOne.memName}</td>
    </tr>
    <tr align="center" bgcolor="white">
        <td>전화번호</td>
        <td>${memDtoOne.memPhone}</td>


    </tr>
    <tr align="center" bgcolor="white">
        <td>이메일</td>
        <td>${memDtoOne.memEmail}</td>


    </tr>

    <tr align="center" bgcolor="white">
        <td>프로필</td>
        <td>${memDtoOne.memProfile}</td>

    </tr>

    <tr align="center" bgcolor="white">
        <td>생년월일</td>
        <td>${memDtoOne.memBirth}</td>


    </tr>

    <tr align="center" bgcolor="white">
        <td>가입일자</td>
        <td>${memDtoOne.regDate}</td>

    </tr>

    </tbody>
</table>


<button data-memMod="${memDtoOne.memNo}" class="modBtn">수정</button>
<button data-memDel='${memDtoOne.memNo}' class="delBtn">탈퇴</button>
<button type="button"  onclick="location.href= '/member/mycontract';" class="contractBtn"> 계약</button>

<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
<script>
    const linkDiv = document.querySelector(".pagination")
    const modBtn = document.querySelector(".modBtn")
    const delBtn = document.querySelector(".delBtn")

    // const changeState = document.querySelector(".changeState")

//======================================================================================

    delBtn.addEventListener("click", (e) => {
        e.preventDefault() //기본기능 방지
        e.stopPropagation() //전파 방지

        if (!e.target.getAttribute("data-memDel")) {

            return;

        }
        const memNo = e.target.getAttribute("data-memDel")
        //data-adNo로 adNo값을 저장해둔것을 가져온다
        removeServer(memNo).then(result => {
            console.log(result)
        })
        //아래에 비동기 코드
        //promise로 반환되기때문에 .then절 사용
        // let targetLi;
        // targetLi = e.target.closest("td")
        // targetLi.innerHTML = " "
        //글목록이 아예 사라지지 않기 때문에 버튼이 남게되어
        //삭제후 버튼에 해당하는 부분을 Delete문자열을 넣음
        alert("No."+memNo+" 회원 탈퇴하셧습니다")
        //나중에 모달로 수정해야한다
        self.location = `/`

    }, false)




    modBtn.addEventListener("click", (e) => {
        e.preventDefault() //기본기능 방지
        e.stopPropagation() //전파 방지

        if (!e.target.getAttribute("data-memMod")) {
            return;
        }
        if(e.target.getAttribute("class").indexOf('.memMod') < 0){
            arridx = parseInt(e.target.getAttribute("data-memMod"))
            // alert(arridx)
            // console.log(arridx)
            alert(arridx)

            self.location = `/member/modify/\${arridx}`
            // $('.form-control').val(arridx)

        }


    },false)

    //----------------------------------------------------------------------------------
    async function removeServer(memNo) {

        const res = await axios.delete(`/member/delete/\${memNo}`)
        //delete형식으로 값을 json형식으로 Controller에 넘겨준다
        const result = res.data
        return result.data
    }

</script>


</body>
</html>
