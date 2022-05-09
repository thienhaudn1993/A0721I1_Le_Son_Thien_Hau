"use strict";
/*
Mô tả
Xây dựng lớp Shape với 2 thuộc tính x và y là toạ độ của các đối tượng Shape.

    Xây dựng Interface IArea để thực hiện việc tính diện tích các hình.

    Xây dựng lớp Rectangle kế thừa lớp Shape và implement interface IArea và cài đặt phương thức area.

    Thực hiện việc khai báo đối tượng rectangle và tính diện tích của hình chữ nhật đó*/
Object.defineProperty(exports, "__esModule", { value: true });
const rectangle_1 = require("./rectangle");
const rectange = new rectangle_1.Rectangle(5, 5, 10, 20);
console.log(rectange.toString());
console.log("Diện tích Rentange là: " + rectange.area());