import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule, NgForm } from '@angular/forms';

import { AdminLayoutRoutes } from './admin-layout.routing';



import { FormComponent }            from '../../pages/user/form.component';


import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AdminLayoutComponent } from './admin-layout.component';
import { ApplicationService } from './application.service';


@NgModule({
  imports: [
    CommonModule,
    RouterModule.forChild(AdminLayoutRoutes),
    FormsModule,
    
    
  
  ],
  declarations: [
  
    FormComponent,
  

 
  ],providers: [
    ApplicationService,
  ]
})

export class AdminLayoutModule {}
