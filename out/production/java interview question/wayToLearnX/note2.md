## 1: What are the default values assigned to variables and instances in Java?
* Numbers (int, float, etc.): 0
* Boolean: false
* Text (char): Blank character
* Object references: null (not pointing to anything)


## 2: What types of memory areas are allocated by the JVM?


## 3: Encapsulation:
Data encapsulation means bundling data (group) and the methods that operate on that data into a single unit (class). It involves hiding the internal details of an object, controlling access to data through methods, and promoting a modular and maintainable code structure.


## 4: 


## 5: Explain the use of the "final" keyword in a variable, a method, and a class.

**Final Variable:**<br>
Finale variable cannot be changed once it has been assigned.

**Final Method:**<br>
Finale method cannot be overridden by subclasses.

**Final Class:**<br>
 this final class can extend other classes for its use.



## 6: Can static methods be overloaded?
Yes! There can be two or more static methods in a class with the same name but different input parameters.
```
public class MyClass {

  public static void printMessage(String message) {
    System.out.println(message);
  }

  public static void printMessage(int value) {
    System.out.println("The value is: " + value);
  }

  public static void main(String[] args) {
    printMessage("Hello!"); // Calls the first method
    printMessage(42); // Calls the second method
  }
}
```


## 7: Why is the main method static in Java?
The main() method is always static because static methods belong to the class, not a specific object. If the main() method were not static, it would be available for each object, which is not acceptable for the JVM. The JVM calls the main() method based on the class name itself, not by creating an object.


## 8: 




## 9: Difference between static methods, static variables, and static classes in Java?


Static Methods:

* A static method belongs to the class rather than an instance of the class.
* It can be called using the class name, and it does not require an instance of the class to be created.
* Static methods are often used for utility functions that do not depend on the state of an object.

Static Variables:
* A static variable is a class-level variable shared among all instances of the class.
* It is declared with the static keyword and exists independently of any particular instance.
* Changes to a static variable are reflected across all instances of the class.

Static Classes:
* In Java, classes themselves cannot be declared as static. All classes are loaded dynamically by the Java Virtual Machine (JVM) when needed.
* However, inner classes can be declared as static. A static inner class is associated with its outer class but does not have an implicit reference to an instance of the outer class.
* Static inner classes are often used for grouping related functionality within a class without an instance-level connection.

## 10: 


