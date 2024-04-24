## 1: What is the best way to inject a dependency? in java and give example
There's no single "best" way to inject dependencies in Java, as the optimal approach depends on several factors like your project size, complexity, and preferred development style. However, here are some popular methods and their pros and cons:

1. Constructor Injection:
```
public class MyService {
    private MyDependency dependency;

    public MyService(MyDependency dependency) {
        this.dependency = dependency;
    }

    public void doSomething() {
        dependency.someMethod();
    }
}

```
2. Setter Injection:
```
public class MyService {
    private MyDependency dependency;

    public void setDependency(MyDependency dependency) {
        this.dependency = dependency;
    }

    public void doSomething() {
        dependency.someMethod();
    }
}

```
3. Interface Injection:
```
interface MyDependency {
    void someMethod();
}

class MyRealDependency implements MyDependency {
    @Override
    public void someMethod() {
       System.out.println("ok");
    }
}

 class MyService {
    private MyDependency dependency;

    public void setDependency(MyDependency dependency) {
        this.dependency = dependency;
    }

    public void doSomething() {
        dependency.someMethod();
    }
}

class Main4 {
        public static void main(String[] args)
        {
            MyService myService = new MyService();
            MyDependency dependency = new MyRealDependency(); // Create the concrete dependency
            myService.setDependency(dependency); // Inject the dependency
            myService.doSomething(); // Call the method that uses the dependency
        }
}

```


## 2: What are the different categories of Design Patterns in Java?
Java design patterns are classified into the following types:

#### Structural Patterns:
They focus on how classes and objects can be composed to form larger structures.
- Decorator
- Proxy
- Composite
- Bridge
- Flyweight
- Adapter
- Facade
- Filter

#### Behavioral Patterns:
Behavioral patterns focus on communication between objects
- Visitor
- Strategy
- Iterator
- Template method
- Chain of responsibility
- Command
- Interpreter
- J2EE Patterns:

#### MVC
- Transfer object
- Front controller
- Data Access Object

#### Creational Patterns:
Creation Patterns deals with the manner of creating objects in a suitable to the situation.
- Builder
- Prototype
- Singleton
- Factory
- Abstract Factory

## 3: the most important design pattern
### Singleton Pattern:
Ensures that a class has only one instance and provides a global point of access to it.

### Factory Pattern:
Defines an interface for creating objects but lets subclasses decide which class to instantiate.

### Builder Pattern:
Allows the construction of complex objects step by step, separating the construction process from the representation.

### Observer Pattern:
Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.


### Decorator Pattern:
Adds new functionality to an object dynamically without altering its structure.

### Strategy Pattern:
it allow us to define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.

### Adapter Pattern:
Allows us to work with incompatible interfaces  by providing a bridge between them.

### Facade Pattern:
it enable us to provide a simple interface to control a complex system

### Composite Pattern:
Allows use to compose objects into tree structures and then work with these structures as if they were individual objects.

### Template Method Pattern:
Defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.
## 4: 
## 5: 
## 6: 
## 7: 
## 8: 
## 9: 
## 10: 