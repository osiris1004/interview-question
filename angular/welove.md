## 1: ControlValueAccessor
is an interface that acts as a bridge between Angular forms and custom form controls

## 2:what provider is required to manioulate dom in angular
- if you need to manipulate the DOM directly, it's generally recommended to do so through a directive. 
- However, if you find a specific need to manipulate the DOM within a directive, you can use the **Renderer2** service. 
```
import { Directive, ElementRef, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appHighlight]',
})
export class HighlightDirective {
  constructor(private el: ElementRef, private renderer: Renderer2) {}

  ngOnInit() {
    // Use Renderer2 to set styles
    this.renderer.setStyle(this.el.nativeElement, 'background-color', 'yellow');
  }
}
```
## 3:
## 4:
## 5:
## 6:
## 7:
## 8:
## 9:

## 10:
## 12:
## 13:
## 14:
## 15:
## 16:
## 17:
## 18:
## 19:

## 20:
## 21:
## 22:
## 23:
## 24:
## 25:
## 26:
## 27:
## 28:
## 29:

## 30:
## 31:
## 32:
## 33:
## 34:
## 35:
## 36:
## 37:
## 38:
## 39:
## 30:

## 40:
## 41:
## 42:
## 43:
## 44:
## 45:
## 46:
## 47:
## 48:
## 49:
## 40: