<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="/resources/assets/favicon.ico"/>
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="/resources/css/styles.css" rel="stylesheet"/>
    <link rel="stylesheet" href="/resources/css/customStyle.css">
    <title>adminPage</title>
</head>
<body>

<div class="d-flex" id="wrapper">

    <div class="border-end bg-white" id="sidebar-wrapper">
        <div class="customListName sidebar-heading border-bottom bg-light">관리목록
        </div>
        <div class="list-group list-group-flush">
            <a class="contractList list-group-item list-group-item-action list-group-item-light p-3" href="#!">계약관리</a>
            <a class="clientList list-group-item list-group-item-action list-group-item-light p-3" href="#!">의뢰자관리</a>
            <a class="workerList list-group-item list-group-item-action list-group-item-light p-3" href="#!">시공사관리</a>
            <a class="settingForm list-group-item list-group-item-action list-group-item-light p-3" href="#!">관리설정</a>
        </div>
    </div>
    <!-- Page content wrapper-->
    <div id="page-content-wrapper">
        <!-- Top navigation-->
        <nav class=" navbar customNavbar navbar-expand-lg navbar-light bg-light border-bottom">
            <div class="container-fluid">
                <button class="btn fs-2" id="sidebarToggle">OSCA</button>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                        data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                        aria-expanded="false" aria-label="Toggle navigation"><span
                        class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ms-auto mt-2 mt-lg-0">
                        <li class="nav-item active"><a class="nav-link" href="#!">Home</a></li>
                        <li class="nav-item"><a class="nav-link" href="#!">Logout</a></li>
                        <li class="nav-item"><a class="nav-link" href="#!">Setting</a></li>
                    </ul>
                </div>
            </div>
        </nav>

        <!-- Page content-->
        <div class="container-fluid">

            <div class="searchDiv">
                <select class="type">
                    <option value="">---</option>
                    <option value="t" ${listDTO.type =="t"?"selected":""}>제목</option>
                    <option value="tc"  ${listDTO.type =="tc"?"selected":""}>제목내용</option>
                    <option value="tcw"  ${listDTO.type =="tcw"?"selected":""}>제목내용작성자</option>
                </select>
                <input type="text" name="keyword" value="${listDTO.keyword}">
                <button class="searchBtn">Search</button>
            </div>

            <table class="table table-bordered dtoList">
                <thead>
                <tr>
                    <th scope="col">No.</th>
                    <th scope="col">계약명</th>
                    <th scope="col">계약현황</th>
                    <th scope="col">계약기간</th>
                    <th scope="col">의뢰자</th>
                    <th scope="col">시공사</th>
                    <th scope="col">입금여부</th>
                    <th scope="col">대금요청</th>
                    <th scope="col">문제요청</th>
                    <th scope="col">기능여부</th>
                <tr>
                    <th scope="row">1</th>
                    <td>학원내부 천장공사</td>
                    <td>이상없음</td>
                    <td>2022/5/10 ~ 2022/7/25</td>
                    <td>학원장</td>
                    <td>천공장</td>
                    <td>입금완료</td>
                    <td>불가</td>
                    <td>없음</td>
                    <td>
                        <button class="btn btn-secondary">수정</button>
                        <button class="btn btn-danger">삭제</button>
                    </td>
                </tr>
                <c:forEach items="${dtoList}" var="board">
                    <tr>
                        <th>${board.bno}</th>
                        <td>${board.title}</td>
                        <td>${board.content}</td>
                        <td>${board.content}</td>
                        <td>${board.content}</td>
                        <td>${board.content}</td>
                        <td>${board.content}</td>
                        <td>${board.content}</td>
                        <td>${board.content}</td>
                        <td>${board.content}</td>

                    </tr>
                </c:forEach>
                </tr>
                </thead>
                <tbody>

                </tbody>


            </table>


            <%--            <ul class="dtoList">--%>
            <%--                <c:forEach items="${dtoList}" var="board">--%>
            <%--                    <li>--%>
            <%--                        <span> ${board.bno} </span>--%>
            <%--                            &lt;%&ndash;            전 방법&ndash;%&gt;--%>
            <%--                            &lt;%&ndash;            <span><a href='/board/read${listDTO.link}&bno=${board.bno}'> ${board.title}</a></span>&ndash;%&gt;--%>
            <%--                        <span>--%>
            <%--                    <a href='/board/read/${board.bno}' class="dtoLink">--%>
            <%--                    <c:out value="${board.title}"></c:out></a>--%>
            <%--                </span>--%>
            <%--                        <span> ${board.content} </span>--%>
            <%--                        <span> ${board.writer} </span>--%>
            <%--                    </li>--%>
            <%--                </c:forEach>--%>
            <%--            </ul>--%>

            <div class="customFooter">
<%--                ${pageMaker}--%>
                <span>현재 Page: ${pageMaker.page}, 목록 Total: ${pageMaker.total} </span>

                <ul class="pagination">

                    <c:if test="${pageMaker.prev}">
                        <li class="paginate_button page-item" id="dataTable_previous">
                            <a class="page-link" href="${pageMaker.start-1}" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                    </c:if>
                    <c:forEach begin="${pageMaker.start}" end="${pageMaker.end}" var="num">
                        <li class="paginate_button page-item"><a class="page-link"
                                                                 href="${num}">${num}</a></li>
                    </c:forEach>
                    <c:if test="${pageMaker.next}">
                        <li class="paginate_button page-item" id="dataTable_next">
                            <a class="page-link" href="${pageMaker.end+1}" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                    </c:if>
                </ul>
            </div>
            <form class="actionForm" action="/board/list" method="get">
                <input type="hidden" name="page" value="${listDTO.page}">
                <input type="hidden" name="size" value="${listDTO.size}">
                <input type="hidden" name="type" value="${listDTO.type == null?'':listDTO.type}">
                <input type="hidden" name="keyword" value="${listDTO.keyword == null? '':listDTO.keyword}">
            </form>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
<script>

    const linkDiv = document.querySelector(".pagination")
    const actionForm = document.querySelector(".actionForm")

    const contractList = document.querySelector(".contractList")
    const clientList = document.querySelector(".clientList")
    const workerList = document.querySelector(".workerList")

    contractList.addEventListener("click", (e)=>{
        console.log("contract")
    },false)

    clientList.addEventListener("click", (e)=>{
        console.log("client")
    },false)

    workerList.addEventListener("click", (e)=>{
        console.log("worker")
    },false)


    document.querySelector(".dtoList").addEventListener("click", (e) => {

        e.preventDefault()
        e.stopPropagation()

        const target = e.target
        if (target.getAttribute("class").indexOf('dtoLink') < 0) {
            return
        }
        const url = target.getAttribute("href")
        //alert(url)
        actionForm.setAttribute("action", url)
        actionForm.submit()

    }, false)

    linkDiv.addEventListener("click", (e) => {
        e.stopPropagation()
        e.preventDefault()

        const target = e.target

        if (target.getAttribute("class") !== 'page-link') {
            return
        }

        const pageNum = target.getAttribute("href")
        actionForm.querySelector("input[name='page']").value = pageNum
        actionForm.setAttribute("action", "/board/list")
        actionForm.submit()

    }, false)


    document.querySelector(".searchBtn").addEventListener("click", (e) => {
        const type = document.querySelector('.searchDiv .type').value
        const keyword = document.querySelector(".searchDiv input[name='keyword']").value

        console.log(type, keyword)

        actionForm.setAttribute("action", "/board/list")
        actionForm.querySelector("input[name='page']").value = 1
        actionForm.querySelector("input[name='type']").value = type
        actionForm.querySelector("input[name='keyword']").value = keyword
        actionForm.submit()


    }, false)


    const result = '${result}'

    console.log(result)

    if (result !== '') {
        alert("처리되었습니다.")
    }


</script>
<!-- Bootstrap core JS-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<!-- Core theme JS-->
<script src="/resources/js/scripts.js"></script>

<!-- fontawesome -->
<script src="https://kit.fontawesome.com/67818242f4.js" crossorigin="anonymous"></script>
</body>
</html>
