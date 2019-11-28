import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent implements OnInit {
  inputData = '';
  constructor() {
  }

  ngOnInit() {
  }
  dataInput(event: any) {
    console.log(event.target.value);
    this.inputData = event.target.value;
  }

  alertMsg = () => {
    alert(`Missile alert !! Save your ass!`);
  }
}
