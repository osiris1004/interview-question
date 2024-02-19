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
Copy constructor in Java is when the the constructor has an parameter an object and the use the property of the object in the class
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
```
## 9: 
## 10: 