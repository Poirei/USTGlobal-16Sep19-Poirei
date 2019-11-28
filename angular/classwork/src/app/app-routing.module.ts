import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
import { TwoWayDataBindingComponent } from './data-binding/two-way-data-binding/two-way-data-binding.component';
import { NgIfComponent } from './directives/structural_directive/ng-if/ng-if.component';
import { NgForComponent } from './directives/structural_directive/ng-for/ng-for.component';
import { NgSwitchComponent } from './directives/structural_directive/ng-switch/ng-switch.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';


const routes: Routes = [
  {path : `home`, component : HomeComponent},
  {path : `about`, component : AboutComponent},
  {path : `help`, component : HelpComponent},
  {path : `login`, component : LoginComponent},
  {path : `register`, component : RegisterComponent},
  {path : 'property-binding', component : PropertyBindingComponent},
  {path : 'event-binding', component : EventBindingComponent},
  {path : 'two-way-binding', component : TwoWayDataBindingComponent},
  {path : 'ng-if', component : NgIfComponent},
  {path : 'ng-for', component : NgForComponent},
  {path : 'ng-switch', component : NgSwitchComponent},
  {path : 'register', component : RegisterComponent},
  {path : 'reactive-form', component : ReactiveFormComponent},
  {path : 'parent', component : ParentComponent},
  {path : 'child', component : ChildComponent},
  {path : 'comment-details', component : CommentDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
