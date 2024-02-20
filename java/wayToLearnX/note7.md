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
- Decorator
- Proxy
- Composite
- Bridge
- Flyweight
- Adapter
- Facade
- Filter

#### Behavioral Patterns:
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

### Creational Patterns:

- Builder
- Prototype
- Singleton
- Factory
- Abstract Factory

## 3: 
## 4: 
## 5: 
## 6: 
## 7: 
## 8: 
## 9: 
## 10: 