
# -- Introduction
## What is Angular? 
  it is javascript framework for building structured and single page web site application
## What are Angular advantages?
 - it is a single page application with the help of component base architecture
 - help us to make flexible ans structured application
 - it is cross platform (acn be use on all os) and is and opensource (free to use)
 - reusable code (that it you can at one place and reuse what you did at many places (helpers, services))
## What is the difference between AngularJS and Angular?
 - AngularJS : it support only js, it has mvc architecture, does not have CLI tool, does not use dependency injection, does not support mobile browser
 - Angular : it support both js and  ts, it has component bas architecture, it  have CLI tool, make use of dependency injection , support mobile browser
## What is NPM?
 it is a tool to manage dependency, build, test, run etc
## What is CLI tool?
 it is a tool to create an angular project, component, service etc
# -- Section 2
## What are Components in Angular?
Components are building block 
 ## What is a Selector and Template?
 - selector : is the html tag to represent a unique component
 - template : is the html view of the component
 ## What is Module in Angular? What is app.module.ts file? 
 module is the file that group the component, directive, pipes ans services that are use in the application
 ## How an Angular App gets Loaded and Started? What are index.html, app-root, selector and main.ts?
 ##  What is a Bootstrapped Module & Bootstrapped Component?
# -- Section 3
## What is Data Binding in Angular?
Data Binding is the communication between typescript and html
## What is String Interpolation in Angular (one way binding and accept only string as variable)?
    {{typescript-variable}}
## What is Property Binding in Angular (accept all type as variable)?
    [html-property]="typescript-variable"
## What is Event Binding in Angular?
    (event)="typescript method"
## What is Two way Binding in Angular?
it is the exchange of data from the view to component and then from component to the view at same time

    [(ngModel)]="typescript-variable"
# -- Section 4 
## What are Directives? What are the type of directives?
they are class that add additional behavior to an element

## Structural directive change the appearance of the dom by adding or removing element
### What is *ngIf Structural directive?
    *ngIf="typescript-condition;
### What is *ngFor Structural directive?
    *ngFor="let item-variable of typescript-Array-variable; index as i"
### What is *ngSwitch Structural directive?
    [ngSwitch]="typescript-variable"
## Attribute directive change the appearance or behavior an element
### What is [ngStyle] Attribute directive?
### What is [ngClass] Attribute directive?
## What is the difference between Component, Attribute and Structural Directives?
# -- Section 5 
## What is Decorator?
it is metadata about a class, method or property
## What are the types of Decorator?

## What are Pipes? What are the types of Pipes & Parameterized Pipes?
 
## What is Chaining Pipes?
# -- Section 6
## Explain Services with Example?
## How to create Servicein Angular?
## How to use Dependency Injector with Services in Angular?
## What is Hierarchical Dependency Injection?
## What is Provider in  Angular?
## What is the role of @Injectable Decorator in a Service?
# -- Section 7 
## What are Parent-Child Components?
## What are Lifecycle Hooks in Angular?
## What is a Constructor in Angular?
## What is ngOnInit life cycle hook in Angular?
## What is the difference between constructor and ngOnInit?
# -- Section 8 
## What are Asynchronous operations?
## What is the difference between Promise and Observable?
## What is RxJS?
## What is Observable? How to implement Observable
## What is the role of HttpClient in Angular?
# -- Section 9 
## What is Typescript? Or What is the difference between Typescript and Javascript?
## What is the difference between let and var keyword?## What is Type annotation?
## What are Built in/ Primitive and User-Defined/ Non-primitive Types in Typescript?
## What is “any” type in Typescript?
## What is Enum type in Typescript?
## What is Type Assertion in Typescript?
## What are Arrow Functions in Typescript?
