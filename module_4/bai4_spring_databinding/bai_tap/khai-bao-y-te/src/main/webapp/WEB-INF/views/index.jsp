<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 2/27/2022
  Time: 8:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Tờ Khai Y Tế</title>
</head>
<body>
<h1 style="text-align: center">TỜ KHAI Y TẾ</h1>
<h1 style="text-align: center">ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN
    THIẾT ĐỂ PHÒNG CHỐNG DỊCH BỆNH TRUYỀN NHIỄM</h1>
<h1 style="text-align: center; color: red">Khuyến cáo khai báo thông tin sai là vi phạm pháp luật Việt Nam</h1>
<form:form method="post" action="home/save" modelAttribute="health">
    <span>Họ tên (ghi chữ IN HOA) <span style="color:red;">(*)</span></span>
    <p><form:input path="fullName" cssStyle="width: 100%;height: 35px"></form:input></p>
    <table width="100%">
        <tr>
            <td><span>Năm sinh <span style="color:red;">(*)</span></span></td>
            <td><span>Giới tính <span style="color:red;">(*)</span></span></td>
            <td><span>Quốc tế <span style="color:red;">(*)</span></span></td>
        </tr>
        <tr>
            <td><form:input path="birthday" type="date" cssStyle="width: 100%;height: 35px"></form:input></td>
            <td>
                <form:select path="gender" cssStyle="width: 100%;height: 30px">
                    <form:option value="/">-Chọn-</form:option>
                    <form:option value="Nam">Nam</form:option>
                    <form:option value="Nữ">Nữ</form:option>
                </form:select>
            </td>
            <td><form:input path="country" cssStyle="width: 100%;height: 35px"></form:input></td>
        </tr>
    </table>
    <p>Số hộ chiếu hoặc CMND hoặc giấy thông hành khác <span style="color:red;">(*)</span></p>
    <p><form:input path="nationalId" cssStyle="width: 100%;height: 35px"></form:input></p>
    <p>Thông tin đi lại <span style="color:red;">(*)</span></p>
    <form:radiobutton path="vehicle" value="Tàu bay"></form:radiobutton>
    <span>Tàu bay</span>
    <form:radiobutton path="vehicle" value="Tàu thuyền"></form:radiobutton>
    <span>Tàu thuyền</span>
    <form:radiobutton path="vehicle" value="Ô tô"></form:radiobutton>
    <span>Ô tô</span>
    <form:radiobutton path="vehicle" value="Khác ( ghi rõ )"></form:radiobutton>
    <span>Khác ( ghi rõ ) <form:input path="vehicle"></form:input></span>
    <br><br>
    <table style="width: 100%">
        <tr>
            <td>Số hiệu phương tiện</td>
            <td>Số ghế</td>
        </tr>
        <tr>
            <td><form:input path="vehicleId" cssStyle="width: 100%;height: 35px"></form:input></td>
            <td><form:input path="numberSeat" cssStyle="width: 100%;height: 35px"></form:input></td>
        </tr>
    </table>
    <br>
    <table style="width: 100%">
        <tr>
            <td><span>Ngày khởi hành <span style="color:red;">(*)</span></span></td>
            <td><span>Ngày kết thúc <span style="color:red;">(*)</span></span></td>
        </tr>
        <tr>
            <td><form:input path="dateStart" type="date" cssStyle="width: 100%;height: 35px"></form:input></td>
            <td><form:input path="dateEnd" type="date" cssStyle="width: 100%;height: 35px"></form:input></td>
        </tr>
    </table>
    <br>
    <span>Trong vòng 14 ngày qua, Anh/Chị có đến tình/thành nào? <span style="color:red;">(*)</span></span>
    <p><form:textarea path="note" cssStyle="width: 100%;height: 35px"></form:textarea></p>
    <h3>Địa chỉ liên lạc</h3>
    <table style="width: 100%">
        <tr>
            <td><span>Tỉnh / thành <span style="color:red;">(*)</span></span></td>
            <td><span>Quận / huyện <span style="color:red;">(*)</span></span></td>
            <td><span>Phường / xã <span style="color:red;">(*)</span></span></td>
        </tr>
        <tr>
            <td><form:input path="city" cssStyle="width: 100%;height: 35px"></form:input></td>
            <td><form:input path="district" cssStyle="width: 100%;height: 35px"></form:input></td>
            <td><form:input path="ward" cssStyle="width: 100%;height: 35px"></form:input></td>
        </tr>
    </table>
    <span>Địa chỉ nơi ở <span style="color:red;">(*)</span></span>
    <p><form:input path="address" cssStyle="width: 100%;height: 35px"></form:input></p>
    <table style="width: 100%">
        <tr>
            <td><span>Điện thoại <span style="color:red;">(*)</span></span></td>
            <td><span>Email <span></td>
        </tr>
        <tr>
            <td><form:input path="phone" cssStyle="width: 100%;height: 35px"></form:input></td>
            <td><form:input path="email" cssStyle="width: 100%;height: 35px"></form:input></td>
        </tr>
    </table>
    <h3>Trong vòng 14 ngày qua, Anh/Chị có xuất hiện triệu chứng nào không? <span style="color:red;">(*)</span></h3>
</form:form>
</body>
</html>
