## 1: 

## 2: Briefly explain the concept of constructor overloading?.


Constructor overloading allows a class to have multiple constructors with different argument lists, but the same name (the class name). This means you can create objects of the same class in different ways, providing different information during object creation.
```
class Person {
  String name;
  int age;

  // Constructor with name and age arguments
  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Constructor with just name argument
  Person(String name) {
    this(name, 0); // Calls the first constructor internally
  }
}

// Usage:
Person person1 = new Person("Alice", 30);
Person person2 = new Person("Bob"); // Uses the second constructor



```
## 3:
## 4: How to define the copy constructor in Java? //
Copy constructor in Java is when the constructor of class is passed an object and make copy of the object properties that are assign to another object properties
```
class Point {
  int x, y;

  public Point(Point p) {
    this.x = p.x;
    this.y = p.y;
  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int sum() {
    return x + y;
  }
}

class Main2 {

  public static void main(String[] args) {

    Point point = new Point(1, 1);
    System.out.println(point.sum());

    Point point2 = new Point(point);
    System.out.println(point2.sum());

  }
}
``` 
## 5: What is the difference between method overloading and method overriding?
**Method Overloading:**<br>
It is when Multiple methods within the same class have the same name but different argument lists (number and types of arguments).
``` 
class Calculator {
  int add(int a, int b) { return a + b; }
  double add(double a, double b) { return a + b; }
}
``` 
**Method Overriding(redéfinition des méthodes):**<br>
It is when A method in a subclass has the same name and argument list as a method in its superclass. the purpose of overriding is to allow a subclasse provide its own implementation of the inherited method, customizing its behavior based on the subclass's needs.

``` 
class Animal {
  public void makeSound() { System.out.println("Generic animal sound"); }
}

class Dog extends Animal {
  @Override
  public void makeSound() { System.out.println("Woof!"); }
}
``` 

## 6: What is the purpose of ClassLoader in Java?

The ClassLoader's task is to load the required classes and interfaces into the JVM when needed.
Example: To read keyboard inputs, we need the Scanner class. The Scanner class is loaded by the ClassLoader.
## 7: 

## 8: What do you mean by object cloning, and how is it achieved in Java?
This is the process of creating an exact copy of an object. To achieve this, a Java class must implement the Cloneable interface from the java.lang package and override the clone() method provided by the Object class, whose syntax is as follows:
```
class Clone implements Cloneable {
    private int value;
    public Clone(int value) {
        this.value = value;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Clone clone = (Clone) super.clone();
        // !-------------^ this is called a cast.
        // Deep copy any mutable fields here
        // ...
        return clone;
    }
    public int getValue() {
        return this.value;
    }
}

class Main3 {
    public static void main(String[] args) {
        Clone clone = new Clone(2);
        try {
            Clone clone2 = (Clone) clone.clone();
            // !-------------^ this is called a cast.
            System.out.println(clone2.getValue());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

```
## 9: Do the keywords final, finally, and finalize serve the same purpose?
### finale:
* **Variables**: Prevents reassignment after initial value is set.
* **Methods**: Cannot be overridden by subclasses.
* **Classes**: Cannot be extended to create subclasses.
```
final int age = 30; // age cannot be changed after this line
final String name = "John";

class FinalClass {
  // cannot be extended
}
```
### finally:
It Ensures a block of code always executes, regardless of whether an exception is thrown or not.
```
try {
  // code that might throw an exception
} catch (Exception e) {
  // handle the exception
} finally {
  // always executed, even if exception occurs
  connection.close();
}

```
### finalize:
Deprecated method:  this method was called by the Garbage Collector  before an object is remove from memory.<br>
**NB**We Discouraged the use of finilize because it's unpredictable and not guaranteed to be called before reclamation. Should not be used for critical resource cleanup.

```
public class MyClass {
  @Override
  protected void finalize() throws Throwable {
    // cleanup code here
  }
}
```

## 10: Is it possible for the "finally" block not to be executed? If yes, specify the case.:


Yes, it is possible for the "finally" block not to be executed. Cases include:<br>
Suppose we use System.exit() in the above statement.
If there are fatal errors such as stack overflow, memory access error, etc.