import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, NgForm, Validators } from '@angular/forms';
import { ApplicationService } from "../../layouts/admin-layout/application.service";

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
 
})
export class FormComponent implements OnInit {

  
  cinFile: any;
  proofFile: any;
  reportFile: any;
   bankIdentifier:string="";
   firstName:string ="";
 lastName :string="";
 address :string="";
   postalCode:number=0;
  constructor(
    
    private applicationService: ApplicationService
  ) { }

  ngOnInit(): void {
    
  }

  onSelectCinFile(event) {
    if (event.target.files && event.target.files.length > 0) {
      this.cinFile = event.target.files[0];
    }
  }

  onSelectProofFile(event) {
    if (event.target.files && event.target.files.length > 0) {
      this.proofFile = event.target.files[0];
    }
  }

  onSelectReportFile(event) {
    if (event.target.files && event.target.files.length > 0) {
      this.reportFile = event.target.files[0];
    }
  }

  onSubmit() {
     
    const formData = new FormData();
    formData.append('id', this.bankIdentifier);
    formData.append('firstName', this.firstName);
    formData.append('lastName', this.lastName);
    formData.append('address', this.address);
    formData.append('postalCode', this.postalCode.toString());
    formData.append('cin', this.cinFile);
    formData.append('proof', this.proofFile);
    formData.append('report', this.reportFile);

    this.applicationService.saveApplication(formData).subscribe(
      (res) => {
        console.log('Application saved successfully!');
      }
    );
  }

}
