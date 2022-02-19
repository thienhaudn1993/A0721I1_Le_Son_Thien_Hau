<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 1/26/2022
  Time: 7:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2><a href="/complex?action=create">Thêm mới 1 mặt bằng</a></h2>
<p style="color: blue">${msg}</p>
<form method="get" action="/complex">
    <input type="hidden" name="action" value="search">
    <p>Loại Mặt Bằng: </p>
    <select name="loaiVanPhong">
        <option value="">Chưa Chọn</option>
        <option>Cho Thuê</option>
        <option>Trọn Gói</option>
    </select>
    <p>Tầng: </p>
    <select name="tang">
        <option value="">Chưa chọn</option>
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
        <option value="6">6</option>
        <option value="7">7</option>
        <option value="8">8</option>
        <option value="9">9</option>
        <option value="10">10</option>
        <option value="11">11</option>
        <option value="12>12</option>
        <option value="13">13</option>
        <option value="14">14</option>
        <option value="15">15</option>
    </select>
    <button type="submit">Tìm kiếm</button>
</form>
<h2>Danh sách mặt bằng cho thuê</h2>
<table  style="width: 750px;" border="1">
    <tr>
        <th>Mã MB</th>
        <th>Diện tích</th>
        <th>Trạng thái</th>
        <th>Tầng</th>
        <th>Loại văn phòng</th>
        <th>Giá cho thuê</th>
        <th>Ngày bắt đầu</th>
        <th>Ngày kết thúc</th>
        <th>Xóa</th>
    </tr>
    <c:forEach var="tcomplex" items="${tComplexList}">
        <tr>
            <td><c:out value="${tcomplex.ma_mb}"></c:out></td>
            <td><c:out value="${tcomplex.dien_tich}"></c:out></td>
            <td><c:out value="${tcomplex.trang_thai}"></c:out></td>
            <td><c:out value="${tcomplex.tang}"></c:out></td>
            <td><c:out value="${tcomplex.loai_van_phong}"></c:out></td>
            <td><c:out value="${tcomplex.gia_cho_thue}"></c:out></td>
            <td><c:out value="${tcomplex.ngay_bat_dau}"></c:out></td>
            <td><c:out value="${tcomplex.ngay_ket_thuc}"></c:out></td>
            <td>
                <a href="/complex?action=delete&id=${tcomplex.ma_mb}">xóa</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
