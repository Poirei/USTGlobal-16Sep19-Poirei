import { AbstractControl, ValidationErrors } from '@angular/forms';



export class CustomValidation {
    constructor() {}
    static unique(control: AbstractControl): null | ValidationErrors {
        if (control.value === 'poirei4@gmail.com') {
            return {unique : true};
        } else {
            return null;
        }
    }
}