<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 1/26/2022
  Time: 7:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p style="color: red">${msg}</p>
<h2><a href="/complex">Quay lại trang danh sách mặt bằng</a></h2>
<form method="post">
    <p>Mã mặt bằng (*)</p>
    <input type="text" name="maMB">
    <p>Diện tích (*)</p>
    <input type="text" name="dienTich">
    <p>Trạng thái  (*)</p>
    <select name="trangThai">
        <option>Trống</option>
        <option>Hạ tầng</option>
        <option>Đầy đủ</option>
    </select>
    <p>Tầng (*)</p>
    <select name="tang">
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
    <p>Loại Văn Phòng  (*)</p>
    <select name="loaiVanPhong">
        <option>Văn Phòng Chia Sẽ</option>
        <option>Văn Phòng Trọn Gói</option>
    </select>
    <p>Giá cho thuê (*)</p>
    <input type="text" name="gia">
    <p>Ngày bắt đầu (*)</p>
    <input type="date" name="ngayBatDau">
    <p>Ngày kết thúc (*)</p>
    <input type="date" name="ngayKetThuc">
    <br>
    <button type="submit">Lưu</button>
    <button type="reset">Hủy</button>
</form>
</body>
</html>
