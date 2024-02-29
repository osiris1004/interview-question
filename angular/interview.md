
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
it is metadata about a class, method or property. or it is a  design pattern or functions that define how Angular features work.
## What are the types of Decorator?

## What are Pipes? What are the types of Pipes & Parameterized Pipes?
 
## What is Chaining Pipes?
pipe are function that accept an input and return a transformed value
### parameterize pipe
    {{123.56 | currency }} 
    {{123.56 | currency : 'INR' }}  where 'INR' is a parameterize constructor
### Chain pipe
    {{"07/23/1984" | date | uppercase }} 
# -- Section 6
## Explain Services with Example?
a service is a a typescript class and a resuable code which acn be used in multiple component. and services con be implement with the help of **dependency injection**
## How to create Servicein Angular?
## How to use Dependency Injector with Services in Angular?
## What is Hierarchical Dependency Injection?

## What is Provider in  Angular?
It make a service available for injecting inside a component
## What is the role of @Injectable Decorator in a Service?
With @Injectable Decorator one service can be used by another service. hence mean if i am in **service A** and i what to inject **service B**  which is done via the constructor, this @Injectable Decorator all the injection
# -- Section 7 
## What are Parent-Child Components?
## What are Lifecycle Hooks in Angular?
this are stages through which a component goes from creation to destruction
- **Constructor** is the default method of a class that is executed when a class is instantiated and it always run before any other hook and is not part of the life cycle hook.<br>
constructor is use to inject dependency, initialize module
- **ngOnChanges** it is call when input properties changes and can be call many time
```
    export class ExampleComponent implements OnChanges {
  @Input() inputData: string;

  ngOnChanges(changes: SimpleChanges): void {
    // This method will be called when the value of @Input() properties changes.
    // You can perform actions based on the changes here.
    if (changes.inputData) {
      console.log('Input Data changed:', changes.inputData.currentValue);
    }
  }
}
```
- **ngInInit** is is called when the component is created or it signal the creation of the component and it is call once
- **ngDoCheck** :is a method in Angular that gets executed during every change detection cycle. It enables the implementation of custom change detection logic. For example, you can use it to perform specific actions when changes occur in the component.

- **ngAfterContentInit, ngAfterContentChecked,  ngAfterViewInit, ngAfterViewChecked** <br>
This hook that are called in child component
    - **ngAfterViewInit**: This hook is called after the component's view has been fully initialized.
- **ngOnDestroy** : it is a hook call when the component is destroyed.
It's a good place to clean up resources, unsubscribe from observables, etc. 
## What is a Constructor in Angular?

## What is ngOnInit life cycle hook in Angular?
is is called when the component is created or it signal the creation of the component and it is call once
## What is the difference between constructor and ngOnInit?
constructor                 | ngOnInit
-------------               | -------------
call before any life-cycle  | called after the ngOnChange
hooks                       | life-cycle hook
it is a type script method  | it is a an angular method
use for dependency injection| use to perform component business logic

# -- Section 8 
## What are Asynchronous operations?
Asynchronous is the parallel execution of task while synchronies is one after the other or sequence execution 
## What is the difference between Promise and Observable?
Promise                         | Observable
-------------                   | -------------
promise wait that all the data  | observable does not wait. as soon
-------------                   | -------------
is fetch before display         | there is data it show immediately  (streaming data)   |
-------------                   | -------------
they are not lazy, that is  execute immediately when all data is fetch     | they are lazy, that is they are not executed 
until they a subscribe
-------------                   | -------------
they ar not cancelable          | They have subscription that are cancelable

## What is RxJS?
It is library for asynchronous and event base programming by using observable
## What is Observable? How to implement Observable
### create an Observable
```
myObservable = new Observable (observer=>{
    observer.next("a") // .next is use to emit data or relies the data
    observer.next("a")
    observer.next("a")
})
```
### consume the Observable
```
ngOnInt();void{
    this.myObservable.subscribe((val=>{
        console.log(val)
    }))
}
```
### promise d'ont need to be consume
```
const isPromise = new Promise <string> ((resolve, reject)=>{
    const x = 0;
    if(x === 0){
        setTimeout(() => resolve("200"), 300);
    }else{
        setTimeout(() => resolve("Error"), 300);
    }
}).then(data=>console.log(data))
```
## What is the role of HttpClient in Angular?
it is a build in service class available in angular which perform http request
# -- Section 9 
## What is Typescript? Or What is the difference between Typescript and Javascript?
## What is the difference between let and var keyword?## What is Type annotation?
## What are Built in/ Primitive and User-Defined/ Non-primitive Types in Typescript?
## What is “any” type in Typescript?
## What is Enum type in Typescript?
## What is Type Assertion in Typescript?
## What are Arrow Functions in Typescript?
