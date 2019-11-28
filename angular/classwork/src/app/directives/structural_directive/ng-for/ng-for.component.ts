import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {
  Products = [
    {
      img : 'https://images.pexels.com/photos/2033994/pexels-photo-2033994.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500',
      name : 'Water'
    },
    {
      img : 'https://images.pexels.com/photos/2990770/pexels-photo-2990770.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500',
      name : 'street'
    }
  ]
  constructor() { }
  
  ngOnInit() {
  }

}
