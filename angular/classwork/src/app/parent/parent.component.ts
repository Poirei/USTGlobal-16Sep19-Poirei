import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCar;
  Cars = [
    {
      name : 'Mercedes Benz',
      imgUrl : 'https://images.pexels.com/photos/1236792/pexels-photo-1236792.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500'
    },
    {
      name : 'Lamborghini',
      imgUrl : 'https://images.pexels.com/photos/18296/pexels-photo.jpg?auto=compress&cs=tinysrgb&dpr=1&w=500'
    },
    {
      name : 'Ford Mustang',
      imgUrl : 'https://images.pexels.com/photos/544542/pexels-photo-544542.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500'
    },
    {
      name : 'Dodge Demon',
      imgUrl : 'https://images.pexels.com/photos/209792/pexels-photo-209792.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500'
    },
    {
      name : 'Auto',
      imgUrl : 'https://images.pexels.com/photos/67183/pexels-photo-67183.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500'
    }
  ]
  constructor() { }

  ngOnInit() {
  }
  sendCar(car) {
    console.log(car);
    this.selectedCar = car;
  }
}
