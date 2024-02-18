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

## 3: How to define the copy constructor in Java? //
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
## 4: 
## 5: 
## 6: 
## 7: 
## 8: 
## 9: 
## 10: 