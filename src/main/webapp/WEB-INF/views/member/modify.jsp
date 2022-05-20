<%--
  Created by IntelliJ IDEA.
  User: LDJ
  Date: 2022-05-17
  Time: 오후 4:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <br/>
    ${memDtoOne}
    <br/>
    ${memNo}
    ${listDTO}
    ${memNo}
    <br/>

    <form action="/member/modify/${memNo}" method="post">
        <div>
            <div>
                <span>No</span>
                <input type="text" name="bno" value="<c:out value="${memDtoOne.memNo}"/>" readonly>
            </div>
            <div>
                <span>ID</span>
                <input type="text" name="memID" value="<c:out value="${memDtoOne.memID}"/>">
            </div>
            <div>
                <span>이름</span>
                <input type="text" name="memName" value="<c:out value="${memDtoOne.memName}"/>" >
            </div>
            <div>
                <span>전화번호</span>
                <input type="text" name="memPhone" value="<c:out value="${memDtoOne.memPhone}"/>" >
            </div>
            <div>
                <span>이메일</span>
                <input type="text" name="memEmail" value="<c:out value="${memDtoOne.memEmail}"/>" >
            </div>
            <div>
                <span>프로필</span>
                <input type="text" name="memProfile" value="<c:out value="${memDtoOne.memProfile}"/>" >
            </div>
            <div>
                <span>생년월일</span>
                <input type="text" name="memBirth" value="<c:out value="${memDtoOne.memBirth}"/>" >
            </div>
            <div>
                <span>주소</span>
                <input type="text" name="memAddress" value="<c:out value="${memDtoOne.memAddress}"/>" >
            </div>
            <button>버튼</button>

        </div>
    </form>

</body>
</html>
