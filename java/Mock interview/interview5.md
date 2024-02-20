## 1:The difference between Class and object
- a **class**  template for creating objects. It defines the properties (attributes or fields) and behaviors (methods) that objects of that class will have.
- An **object** is an instance of a class

## 2:
### Objects:
Objects are instances of classes that encapsulate data (attributes) and the functions (methods) that operate on the data.


### Classes:
Classes are templates for creating objects. They define the properties (attributes) and behaviors (methods) that objects will have.t involves restricting access to the internal state of an object and only allowing interactions through well-defined methods.

### Encapsulation:
Encapsulation is the bundling of data and the methods that operate in to a single unit known as class .
```
public class BankAccount {
    private double balance; // private variable

    // Getter method
    public double getBalance() {
        return balance;
    }

    // Setter method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Setter method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

```


### Inheritance:
Inheritance allows a class (subclass or child class) to inherit properties and behaviors from another class (superclass or parent class).

### Polymorphism
Polymorphism is the ability of a single function, method, or operator to work in different ways based on the context or types of data it is applied to
```
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Output: Dog barks
        myCat.makeSound(); // Output: Cat meows
    }
}
```

### Abstraction
Abstraction is the hiding of complex implementation details and showing only the necessary features of an object. 

```
abstract class Shape {
    abstract void draw(); // Abstract method
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Shape myCircle = new Circle();
        Shape mySquare = new Square();

        myCircle.draw(); // Output: Drawing a circle
        mySquare.draw(); // Output: Drawing a square
    }
}
```
## 3: Constructor
use to initialize class attribute and have the same name as the class name

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