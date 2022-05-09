import { Injectable } from '@angular/core';
import {Iword} from '../model/iword';

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {
  words: Iword[] = [
    {
      wordEnglish: 'hello',
      mean: 'xin chào'
    },
    {
      wordEnglish: 'class',
      mean: 'lớp học'
    },
    {
      wordEnglish: 'bye',
      mean: 'tạm biệt'
    },
    {
      wordEnglish: 'love',
      mean: 'yêu'
    },
    {
      wordEnglish: 'address',
      mean: 'địa chỉ'
    },
  ];

  constructor() { }
  getAll(){
    return this.words;
  }
  translate(word: string): Iword {
    // tslint:disable-next-line:no-shadowed-variable triple-equals
    return this.words.find((x) => x.wordEnglish == word);
  }
}
