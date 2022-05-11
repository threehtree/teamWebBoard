<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>

<%--<html>--%>
<%--<head>--%>
<%--    <meta charset="utf-8"/>--%>
<%--    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>--%>
<%--    <meta name="description" content=""/>--%>
<%--    <meta name="author" content=""/>--%>
<%--    <!-- Favicon-->--%>
<%--    <link rel="icon" type="image/x-icon" href="/resources/assets/favicon.ico"/>--%>
<%--    <!-- Core theme CSS (includes Bootstrap)-->--%>
<%--    <link href="/resources/css/styles.css" rel="stylesheet"/>--%>
<%--    <link rel="stylesheet" href="/resources/css/customStyle.css">--%>
<%--    <title>adminPage</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--<div class="d-flex" id="wrapper">--%>

<%--    <div class="border-end bg-white" id="sidebar-wrapper">--%>
<%--        <div class="customListName sidebar-heading border-bottom bg-light">관리목록--%>
<%--        </div>--%>
<%--        <div class="list-group list-group-flush">--%>
<%--            <a class="contractList list-group-item list-group-item-action list-group-item-light p-3" href="#!">계약관리</a>--%>
<%--            <a class="clientList list-group-item list-group-item-action list-group-item-light p-3" href="#!">의뢰자관리</a>--%>
<%--            <a class="workerList list-group-item list-group-item-action list-group-item-light p-3" href="http://localhost:8080/admin/contractor/list">시공사관리</a>--%>
<%--            <a class="settingForm list-group-item list-group-item-action list-group-item-light p-3" href="#!">관리설정</a>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--    <!-- Page content wrapper-->--%>
<%--    <div id="page-content-wrapper">--%>
<%--        <!-- Top navigation-->--%>
<%--        <nav class=" navbar customNavbar navbar-expand-lg navbar-light bg-light border-bottom">--%>
<%--            <div class="container-fluid">--%>
<%--                <button class="btn fs-2" id="sidebarToggle">OSCA</button>--%>
<%--                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"--%>
<%--                        data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"--%>
<%--                        aria-expanded="false" aria-label="Toggle navigation"><span--%>
<%--                        class="navbar-toggler-icon"></span></button>--%>
<%--                <div class="collapse navbar-collapse" id="navbarSupportedContent">--%>
<%--                    <ul class="navbar-nav ms-auto mt-2 mt-lg-0">--%>
<%--                        <li class="nav-item active"><a class="nav-link" href="http://localhost:8080/admin/list">Home</a></li>--%>
<%--                        <li class="nav-item"><a class="nav-link" href="#!">Logout</a></li>--%>
<%--                        <li class="nav-item"><a class="nav-link" href="#!">Setting</a></li>--%>
<%--                    </ul>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </nav>--%>

<%--        <!-- Page content-->--%>
<%--        <div class="container-fluid">--%>

<%--            <div class="searchDiv">--%>
<%--                <select class="type">--%>
<%--                    <option value="">---</option>--%>
<%--                    <option value="t" ${listDTO.type =="t"?"selected":""}>제목</option>--%>
<%--                    <option value="tc"  ${listDTO.type =="tc"?"selected":""}>제목내용</option>--%>
<%--                    <option value="tcw"  ${listDTO.type =="tcw"?"selected":""}>제목내용작성자</option>--%>
<%--                </select>--%>
<%--                <input type="text" name="keyword" value="${listDTO.keyword}">--%>
<%--                <button class="searchBtn">Search</button>--%>
<%--            </div>--%>

<%--            <table class="table table-bordered dtoList">--%>
<%--                <thead>--%>
<%--                <tr>--%>
<%--                    <th scope="col">No.</th>--%>
<%--                    <th scope="col">시공사ID</th>--%>
<%--                    <th scope="col">시공사분류</th>--%>
<%--                    <th scope="col">시공사명</th>--%>
<%--                    <th scope="col">사업자번호</th>--%>
<%--                    <th scope="col">시공사번호</th>--%>
<%--                    <th scope="col">시공사E-mail</th>--%>
<%--                    <th scope="col">시공사주소</th>--%>
<%--                    <th scope="col">시공사파일</th>--%>
<%--                </tr>--%>
<%--                </thead>--%>
<%--                &lt;%&ndash;                <tr>&ndash;%&gt;--%>
<%--                &lt;%&ndash;                    <th scope="row">1</th>&ndash;%&gt;--%>
<%--                &lt;%&ndash;                    <td>학원내부 천장공사</td>&ndash;%&gt;--%>
<%--                &lt;%&ndash;                    <td>이상없음</td>&ndash;%&gt;--%>
<%--                &lt;%&ndash;                    <td>2022/5/10 ~ 2022/7/25</td>&ndash;%&gt;--%>
<%--                &lt;%&ndash;                    <td>학원장</td>&ndash;%&gt;--%>
<%--                &lt;%&ndash;                    <td>천공장</td>&ndash;%&gt;--%>
<%--                &lt;%&ndash;                    <td>입금완료</td>&ndash;%&gt;--%>
<%--                &lt;%&ndash;                    <td>불가</td>&ndash;%&gt;--%>
<%--                &lt;%&ndash;                    <td>없음</td>&ndash;%&gt;--%>
<%--                &lt;%&ndash;                    <td>&ndash;%&gt;--%>
<%--                &lt;%&ndash;                        <button class="modBtn btn btn-secondary">수정</button>&ndash;%&gt;--%>
<%--                &lt;%&ndash;                        <button class="delBtn btn btn-danger">삭제</button>&ndash;%&gt;--%>
<%--                &lt;%&ndash;                    </td>&ndash;%&gt;--%>
<%--                &lt;%&ndash;                </tr>&ndash;%&gt;--%>
<%--                <tbody class="tableValue">--%>
<%--                <c:forEach items="${RdtoList}" var="req">--%>
<%--                    <tr>--%>
<%--                        <th>${req.rno}</th>--%>
<%--                        <td>${req.rID}</td>--%>
<%--&lt;%&ndash;                        <td>${ct.categoryNum}</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                        <td>${ct.ctName}</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                        <td>${ct.businessNum}</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                        <td>${ct.ctCall}</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                        <td>${ct.ctEmail}</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                        <td>${ct.ctAddress}</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                        <td>${ct.ctFileNum}</td>&ndash;%&gt;--%>
<%--                            &lt;%&ndash;                        <td>${ct.regdate}</td>&ndash;%&gt;--%>
<%--                            &lt;%&ndash;                        <td>${ct.updatedate}</td>&ndash;%&gt;--%>
<%--                        <td><button class="modBtn btn btn-secondary">수정</button>--%>
<%--                            <button class="delBtn btn btn-danger">삭제</button></td>--%>
<%--                    </tr>--%>
<%--                </c:forEach>--%>
<%--                </tbody>--%>
<%--            </table>--%>


<%--            &lt;%&ndash;            <ul class="dtoList">&ndash;%&gt;--%>
<%--            &lt;%&ndash;                <c:forEach items="${dtoList}" var="board">&ndash;%&gt;--%>
<%--            &lt;%&ndash;                    <li>&ndash;%&gt;--%>
<%--            &lt;%&ndash;                        <span> ${board.bno} </span>&ndash;%&gt;--%>
<%--            &lt;%&ndash;                            &lt;%&ndash;            전 방법&ndash;%&gt;&ndash;%&gt;--%>
<%--            &lt;%&ndash;                            &lt;%&ndash;            <span><a href='/board/read${listDTO.link}&bno=${board.bno}'> ${board.title}</a></span>&ndash;%&gt;&ndash;%&gt;--%>
<%--            &lt;%&ndash;                        <span>&ndash;%&gt;--%>
<%--            &lt;%&ndash;                    <a href='/board/read/${board.bno}' class="dtoLink">&ndash;%&gt;--%>
<%--            &lt;%&ndash;                    <c:out value="${board.title}"></c:out></a>&ndash;%&gt;--%>
<%--            &lt;%&ndash;                </span>&ndash;%&gt;--%>
<%--            &lt;%&ndash;                        <span> ${board.content} </span>&ndash;%&gt;--%>
<%--            &lt;%&ndash;                        <span> ${board.writer} </span>&ndash;%&gt;--%>
<%--            &lt;%&ndash;                    </li>&ndash;%&gt;--%>
<%--            &lt;%&ndash;                </c:forEach>&ndash;%&gt;--%>
<%--            &lt;%&ndash;            </ul>&ndash;%&gt;--%>

<%--            <div class="customFooter">--%>
<%--                &lt;%&ndash;                ${pageMaker}&ndash;%&gt;--%>
<%--                <span>현재 Page: ${pageMaker.page}, 목록 Total: ${pageMaker.total} </span>--%>
<%--                <ul class="pagination">--%>
<%--                    <c:if test="${pageMaker.prev}">--%>
<%--                        <li class="paginate_button page-item" id="dataTable_previous">--%>
<%--                            <a class="page-link" href="${pageMaker.start-1}" aria-label="Previous">--%>
<%--                                <span aria-hidden="true">&laquo;</span>--%>
<%--                            </a>--%>
<%--                        </li>--%>
<%--                    </c:if>--%>
<%--                    <c:forEach begin="${pageMaker.start}" end="${pageMaker.end}" var="num">--%>
<%--                        <li class="paginate_button page-item"><a class="page-link"--%>
<%--                                                                 href="${num}">${num}</a></li>--%>
<%--                    </c:forEach>--%>
<%--                    <c:if test="${pageMaker.next}">--%>
<%--                        <li class="paginate_button page-item" id="dataTable_next">--%>
<%--                            <a class="page-link" href="${pageMaker.end+1}" aria-label="Next">--%>
<%--                                <span aria-hidden="true">&raquo;</span>--%>
<%--                            </a>--%>
<%--                        </li>--%>
<%--                    </c:if>--%>
<%--                </ul>--%>
<%--            </div>--%>
<%--            <form class="actionForm" action="/Requester/list" method="get">--%>
<%--                <input type="hidden" name="page" value="${listDTO.page}">--%>
<%--                <input type="hidden" name="size" value="${listDTO.size}">--%>
<%--                <input type="hidden" name="type" value="${listDTO.type == null?'':listDTO.type}">--%>
<%--                <input type="hidden" name="keyword" value="${listDTO.keyword == null? '':listDTO.keyword}">--%>
<%--            </form>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>


<%--</div>--%>
<%--</body>--%>