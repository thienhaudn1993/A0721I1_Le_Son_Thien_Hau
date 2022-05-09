import { Component, OnInit } from '@angular/core';
import {DictionaryService} from '../service/dictionary.service';
import {ActivatedRoute} from '@angular/router';
import {Iword} from '../model/iword';

@Component({
  selector: 'app-dictionary-detail',
  templateUrl: './dictionary-detail.component.html',
  styleUrls: ['./dictionary-detail.component.css']
})
export class DictionaryDetailComponent implements OnInit {
  dictionary: Iword | undefined;
  constructor(private dictionaryService: DictionaryService, private activatedRouter: ActivatedRoute) { }

  ngOnInit(): void {
    this.activatedRouter.paramMap.subscribe((param) => {
       this.dictionary = this.dictionaryService.translate(param.get('wordEnglish'));
    });
  }

}
