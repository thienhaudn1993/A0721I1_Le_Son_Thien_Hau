import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-font-size-editor',
  templateUrl: './font-size-editor.component.html',
  styleUrls: ['./font-size-editor.component.css']
})
export class FontSizeEditorComponent implements OnInit {
  fontSizeNew = 14;
  constructor() { }

  ngOnInit(): void {
  }
  // Cách 1: Sử dụng sự kiện change để thay đổi kích thước của chữ

  changeFontSizeValue(fontSize) {
    this.fontSizeNew = fontSize;
  }
}
