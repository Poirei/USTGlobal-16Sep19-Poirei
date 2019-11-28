import { ElementRef, Directive, HostBinding, HostListener } from "@angular/core";

@Directive ({
    selector : '[custDir]'
})

export class CustomDirective {
    constructor(private el : ElementRef) {
        this.el.nativeElement.style.backgroundColor = 'greenyellow';
    }
    @HostBinding('style.color') color = 'blue';
    @HostListener('mousenter') menter() {
        this.el.nativeElement.style.backgroundColor = 'yellow';
    }
    @HostListener('mousexit') mexit() {
        this.el.nativeElement.style.backgroundColor = 'violet';
    }
}