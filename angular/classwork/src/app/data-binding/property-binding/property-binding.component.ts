import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  name = 'RyzenKpns';
  imgUrl = 'https://images.pexels.com/photos/2253821/pexels-photo-2253821.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500';
  address = 'Silchar, Assam, India, Asia, Northern Sub-Continent, Earth';
  color = 'greenyellow';
  isActive = false;
  constructor() { }

  ngOnInit() {
    setInterval(() => {
      this.color = 'red';
      this.isActive = !this.isActive;
    }, 2000);
  }
}
