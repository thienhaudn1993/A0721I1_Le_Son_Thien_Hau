"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Rectangle = void 0;
const sharp_1 = require("./sharp");
class Rectangle extends sharp_1.Sharp {
    constructor(x, y, width, height) {
        super(x, y);
        this._width = width;
        this._height = height;
    }
    get width() {
        return this._width;
    }
    set width(value) {
        this._width = value;
    }
    get height() {
        return this._height;
    }
    set height(value) {
        this._height = value;
    }
    area() {
        return this._width * this._height;
    }
}
exports.Rectangle = Rectangle;
