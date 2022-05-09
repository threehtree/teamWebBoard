<%--
  Created by IntelliJ IDEA.
  User: peter
  Date: 2022-05-09
  Time: 오후 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>adminPage</title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="/resources/assets/favicon.ico" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="/resources/css/styles.css" rel="stylesheet" />
    <link rel="stylesheet" href="/resources/css/customStyle.css">
</head>

<body>
<div class="d-flex" id="wrapper">
    <!-- Sidebar-->
    <div class="border-end bg-white" id="sidebar-wrapper">
        <div class="customListName sidebar-heading border-bottom bg-light">관리목록
        </div>
        <div class="list-group list-group-flush">
            <a class="list-group-item list-group-item-action list-group-item-light p-3" href="#!">계약관리</a>
            <a class="list-group-item list-group-item-action list-group-item-light p-3" href="#!">의뢰자관리</a>
            <a class="list-group-item list-group-item-action list-group-item-light p-3" href="#!">시공사관리</a>
            <a class="list-group-item list-group-item-action list-group-item-light p-3" href="#!">관리설정</a>

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


            <form class="searchBar">

                <select name="" id="">
                    <option value="">계약명</option>
                    <option value="">의뢰자명</option>
                    <option value="">시공사명</option>

                </select>
                <input type="text" placeholder="검색어를 입력 하세요.">
                <button type="submit" class="btn">


                    <i class="fa-solid fa-magnifying-glass"></i></button>

            </form>



            <table class="table table-bordered">
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

                </tr>
                </thead>
                <tbody>
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
                    <td><button class="btn btn-secondary">수정</button><button class="btn btn-danger">삭제</button>
                    </td>
                </tr>
                <tr>
                    <th scope="row">2</th>
                    <td>학원내부 천장공사</td>
                    <td>이상없음</td>
                    <td>2022/5/10 ~ 2022/7/25</td>
                    <td>학원장</td>
                    <td>천공장</td>
                    <td>입금완료</td>
                    <td>불가</td>
                    <td>없음</td>
                    <td><button class="btn btn-secondary">수정</button><button class="btn btn-danger">삭제</button>
                    </td>
                </tr>
                <tr>
                    <th scope="row">3</th>
                    <td>학원내부 천장공사</td>
                    <td>이상없음</td>
                    <td>2022/5/10 ~ 2022/7/25</td>
                    <td>학원장</td>
                    <td>천공장</td>
                    <td>입금완료</td>
                    <td>불가</td>
                    <td>없음</td>
                    <td><button class="btn btn-secondary">수정</button><button class="btn btn-danger">삭제</button>
                    </td>
                </tr>
                <tr>
                    <th scope="row">4</th>
                    <td>학원내부 천장공사</td>
                    <td>이상없음</td>
                    <td>2022/5/10 ~ 2022/7/25</td>
                    <td>학원장</td>
                    <td>천공장</td>
                    <td>입금완료</td>
                    <td>불가</td>
                    <td>없음</td>
                    <td><button class="btn btn-secondary">수정</button><button class="btn btn-danger">삭제</button>
                    </td>
                </tr>
                <tr>
                    <th scope="row">5</th>
                    <td>학원내부 천장공사</td>
                    <td>이상없음</td>
                    <td>2022/5/10 ~ 2022/7/25</td>
                    <td>학원장</td>
                    <td>천공장</td>
                    <td>입금완료</td>
                    <td>불가</td>
                    <td>없음</td>
                    <td><button class="btn btn-secondary">수정</button><button class="btn btn-danger">삭제</button>
                    </td>
                </tr>
                <tr>
                    <th scope="row">6</th>
                    <td>학원내부 천장공사</td>
                    <td>이상없음</td>
                    <td>2022/5/10 ~ 2022/7/25</td>
                    <td>학원장</td>
                    <td>천공장</td>
                    <td>입금완료</td>
                    <td>불가</td>
                    <td>없음</td>
                    <td><button class="btn btn-secondary">수정</button><button class="btn btn-danger">삭제</button>
                    </td>
                </tr>
                <tr>
                    <th scope="row">7</th>
                    <td>학원내부 천장공사</td>
                    <td>이상없음</td>
                    <td>2022/5/10 ~ 2022/7/25</td>
                    <td>학원장</td>
                    <td>천공장</td>
                    <td>입금완료</td>
                    <td>불가</td>
                    <td>없음</td>
                    <td><button class="btn btn-secondary">수정</button><button class="btn btn-danger">삭제</button>
                    </td>
                </tr>
                <tr>
                    <th scope="row">8</th>
                    <td>학원내부 천장공사</td>
                    <td>이상없음</td>
                    <td>2022/5/10 ~ 2022/7/25</td>
                    <td>학원장</td>
                    <td>천공장</td>
                    <td>입금완료</td>
                    <td>불가</td>
                    <td>없음</td>
                    <td><button class="btn btn-secondary">수정</button><button class="btn btn-danger">삭제</button>
                    </td>
                </tr>
                <tr>
                    <th scope="row">9</th>
                    <td>학원내부 천장공사</td>
                    <td>이상없음</td>
                    <td>2022/5/10 ~ 2022/7/25</td>
                    <td>학원장</td>
                    <td>천공장</td>
                    <td>입금완료</td>
                    <td>불가</td>
                    <td>없음</td>
                    <td><button class="btn btn-secondary">수정</button><button class="btn btn-danger">삭제</button>
                    </td>
                </tr>
                <tr>
                    <th scope="row">10</th>
                    <td>학원내부 천장공사</td>
                    <td>이상없음</td>
                    <td>2022/5/10 ~ 2022/7/25</td>
                    <td>학원장</td>
                    <td>천공장</td>
                    <td>입금완료</td>
                    <td>불가</td>
                    <td>없음</td>
                    <td><button class="btn btn-secondary">수정</button><button class="btn btn-danger">삭제</button>
                    </td>
                </tr>
                </tbody>
            </table>




            <nav aria-label="Page navigation customPagination">
                <ul class="pagination">
                    <li class="page-item">
                        <a class="page-link" href="#" tabindex="-1" aria-disabled="true">이전</a>
                    </li>
                    <li class="page-item"><a class="page-link" href="#">1</a></li>


                    <li class="page-item">
                        <a class="page-link" href="#">다음</a>
                    </li>
                </ul>
            </nav>





        </div>
    </div>
</div>
<!-- Bootstrap core JS-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<!-- Core theme JS-->
<script src="/resources/js/scripts.js"></script>

<!-- fontawesome -->
<script src="https://kit.fontawesome.com/67818242f4.js" crossorigin="anonymous"></script>
</body>

</html>
