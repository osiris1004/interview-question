## 1:The difference between Class and object
- a **class**  template for creating objects. It defines the properties (attributes or fields) and behaviors (methods) that objects of that class will have.
- An **object** is an instance of a class

## 2:
### Objects:
Objects are instances of classes that encapsulate data (attributes) and the functions (methods) that operate on the data.


### Classes:
Classes are templates for creating objects. They define the properties (attributes) and behaviors (methods) that objects will have.t involves restricting access to the internal state of an object and only allowing interactions through well-defined methods.

### Encapsulation:
Encapsulation is the bundling of data and the methods that operate in to a single unit known as class .By encapsulating a class's variables, other classes cannot access them, and only the methods of the class can access them.
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
Abstraction is the hiding of complex implementation details and showing only method signature. 

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

## 4:Differences between length and size;
**Length** applies to a Java array, and **size** applies to a Java ArrayList collection object<br>
both are use to are use to determine the number of elements in the array

## 5:The deference way to loop a list in java
### For-each Loop
```
List<String> myList = Arrays.asList("Apple", "Banana", "Orange");
for (String fruit : myList) {
    System.out.println(fruit);
}
```
### Iterator:
```
List<String> myList = Arrays.asList("Apple", "Banana", "Orange");
Iterator<String> iterator = myList.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

### For Loop with Index:
```
List<String> myList = Arrays.asList("Apple", "Banana", "Orange");
for (int i = 0; i < myList.size(); i++) {
    System.out.println(myList.get(i));
}
```

### Java 8 Streams API:
```
List<String> myList = Arrays.asList("Apple", "Banana", "Orange");
myList.stream().forEach(System.out::println);
```

## 6:What id DOM
DOM, or Document Object Model,  refers to the hierarchical representation of an HTML or XML document in a tree-like structure. It allows JavaScript to interact with and manipulate the content, structure, and style of a web page.

## 7: Difference between == and === in javascript
- **==** checks if values are equal, performing type conversion if needed. 
- **===** checks values are equal, considering both value and type, without type conversion. 


## 8:The difference between spring and spring boot
- **Spring:** Requires manual configuration, writing XML files, and setting up various components.
- **Spring Boot:** Offers auto-configuration, eliminating most manual setup and boilerplate code.
- **Spring:** Has a steeper learning curve due to manual configuration.
- **Spring Boot:** Easier to learn, especially for beginners, with its opinionated approach and auto-configuration.

## 9: Some  springframework.data interfaces
- **Repository Interface:** The central interface in Spring Data, providing CRUD (Create, Read, Update, Delete) functionality.

- **CrudRepository Interface:** Extends the Repository interface and provides generic CRUD operations.

- **PagingAndSortingRepository** Interface: Extends CrudRepository and provides additional methods to paginate and sort data.

- **JpaRepository Interface:** Extends PagingAndSortingRepository and provides JPA-specific methods.

- **MongoRepository Interface:** Specialized interface for MongoDB, providing MongoDB-specific methods.

- **QuerydslPredicateExecutor Interface:** Enables the execution of Querydsl queries for entities.

- **RedisRepository Interface:** Provides Redis-specific methods for data access.


## 10:What is the implementation of JPA
it is Hibernate

## 12:What are some JPA annotation 
- **@Entity:** Marks a Java class as a JPA entity, which corresponds to a database table.

- **@Table:** Specifies the details of the database table to which the entity is mapped.

- **@Id:** Declares the primary key field of an entity.

- **@GeneratedValue:** Configures the way primary keys are generated for an entity. Often used in conjunction with @Id.

- **@Column:** Specifies the details of a column in the database table. Used to customize column names, types, etc.

- **@OneToMany and @ManyToOne:** Define a one-to-many or many-to-one relationship between two entities.

- **@ManyToMany:** Defines a many-to-many relationship between two entities.

- **@JoinColumn:** Specifies the column used for joining an entity association or element collection.

- **@Transient:** Marks a field as not persistable, indicating that it should be ignored by the JPA provider.

- **@NamedQuery and @NamedQueries:** Allows you to define named queries directly on an entity for reuse.

- **@Version:** Specifies a version property for optimistic locking.

## 13:Give me some  Maven commands:
mvn clean: Cleans the project by deleting the target directory.

mvn compile: Compiles the source code of the project.

mvn test: Runs the unit tests of the project.

mvn package: Packages the compiled code and resources into a distributable archive, such as a JAR or WAR file.

mvn install: Installs the project into the local repository for use as a dependency in other projects.

mvn deploy: Copies the final package to the remote repository for sharing with other developers and projects.

mvn site: Generates a site documentation for the project.

mvn clean install: Cleans, compiles, and installs the project.

mvn clean test: Cleans and runs the tests.

mvn clean package: Cleans and packages the project.

mvn clean deploy: Cleans, packages, and deploys the project.

## 14:The difference between json and xml
- JSON: Uses a lightweight, human-readable format using key-value pairs. It is often used for configuration files and data exchange between a server and a web application.
- XML: Uses a tag-based markup language where data is enclosed in tags. It is more verbose compared to JSON and is commonly used for document storage and exchange.
- JSON: Generally more readable and compact, making it easier for humans to parse and generate.
- XML: Can be more verbose and complex due to its tag-based structure.
- JSON: Supports basic data types like strings, numbers, arrays, objects, booleans, and null.
- XML: Represents data as plain text and relies on attributes and elements.


## 15:Lombok
Lombok simplifies the development process by reducing boilerplate code, especially for tasks like writing getters, setters, constructors, and other common methods.

## 16: sql to select all city that start with the letter R
## 17: what is sql join principle 
an SQL join is a mechanism to combine rows from two or more tables based on a related column between them. <br>
The principle is to match records in one table with records in another table using a common column, creating a new result set with combined information.

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