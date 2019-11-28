import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { LoginComponent } from './login/login.component';
import { RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { PropertyBindingType } from '@angular/compiler';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
import { TwoWayDataBindingComponent } from './data-binding/two-way-data-binding/two-way-data-binding.component';
import { DirectivesComponent } from './directives/directives.component';
// import { StructuralDirectiveComponent } from './directives/structural-directive/structural-directive.component';
import { NgIfComponent } from './directives/structural_directive/ng-if/ng-if.component';
// import { NgFforComponent } from './directives/structural_directive/ng-ffor/ng-ffor.component';
import { NgForComponent } from './directives/structural_directive/ng-for/ng-for.component';
import { NgSwitchComponent } from './directives/structural_directive/ng-switch/ng-switch.component';
import { CustomDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { DollarPipe } from './dollar.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    LoginComponent,
    FooterComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwoWayDataBindingComponent,
    DirectivesComponent,
    // StructuralDirectiveComponent,
    NgIfComponent,
    // NgFforComponent,
    NgForComponent,
    NgSwitchComponent,
    CustomDirective,
    RegisterComponent,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentDetailsComponent,
    DollarPipe,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    AppRoutingModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
