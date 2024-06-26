## 1:  why is java independent from the plate forme in simple term
Java is platform-independent because the Code is compiled into this universal format(bytecode), and any device with a Java Virtual Machine (JVM) can run it. The JVM interprets the bytecode, making Java apps work on different platforms without changes.

NB *JRE* is the tool that hole all classes and library use to execute java code <br>
NB *JDK* contain JRE and JVM

## 2:

## 3: what is access modification. 
refers to controlling the visibility or accessibility of classes, methods, and fields in your code. 

- Public:
- Private: 
- Protected: The member is accessible within its own package and by subclasses.
- Default (no modifier):The member is accessible only within its own package.

## 4: Overloading(surcharge) and Overwrting(redefinition)

## 5: Mutable Class and Immutable Class
### Mutable Class:
A mutable class is a class whose internal state (data) can be modified or changed after an object of that class is created.

### Immutable Class:
An immutable class is a class whose internal state cannot be modified once an object is created. It remains constant throughout its lifecycle.

## 6:Mutable Objects and Immutable Objects
### Mutable Objects
Mutable objects are objects whose state (data) can be changed after they are created.
```
class MutablePerson {
    private String name;

    MutablePerson(String name) {
        this.name = name;
    }

    void setName(String newName) {
        this.name = newName;
    }
}
```
### Immutable Objects:
Immutable objects are objects whose state cannot be changed after they are created.
```
class ImmutablePerson {
    private final String name;

    ImmutablePerson(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
```

## 7:The difference between set and list
### List:
- **Ordered Collection:** Lists maintain the order of elements based on their index. The order in which elements are added is preserved.
- **Duplicates:** Lists allow duplicate elements. You can have the same value present multiple times in a list.
- **Implementation Classes:** Examples of list implementations include **ArrayList**, **LinkedList**, and **Vector**.
```
List<String> myList = new ArrayList<>();
myList.add("Apple");
myList.add("Banana");
myList.add("Apple"); // Duplicate allowed
```
### Set:
- **Unordered Collection:** Sets do not maintain any order of elements. There's no guarantee that the elements will be stored in a particular sequence.
- **No Duplicates:** Sets do not allow duplicate elements. If you try to add the same element more than once, it won't be stored.
- **Implementation Classes:** Examples of set implementations include **HashSet** and **TreeSet.**
```
Set<String> mySet = new HashSet<>();
mySet.add("Apple");
mySet.add("Banana");
mySet.add("Apple"); // Duplicate not allowed
```
## 8:Difference between abstract class and interface

## 9:
### Core Spring Framework Annotations
1. @Required<br>
tells a property most not be null. hence most have a value
2. @Autowired :<br> 
inject dependency
@Bean<br>
When you mark a method with **@Bean** in a class annotated with **@Configuration**, Spring understands that calling this method will give it an instance of a specific object. This object, known as a bean, is then managed by the Spring container and can be used in other parts of your application.
3. @Configuration<br>
It helps set up and arrange special objects called beans in our Spring app.
4. @ComponentScans<br>
used to specify or locate the base packages to scan for Spring-managed components.
6. @Qualifier<br>
7. @Lazy<br>
It delays the creation of a bean until it is actually needed.
8. @Value: <br>
Access application.properties variable @Value("${app.name}")

### Spring Framework StereoType Annotations
9. @Component
it tell spring creates instances of these classes denoted with @Component, which can then be injected and used throughout the application
10. @Controller
It is use to define controller classes responsible for handling HTTP requests.
11. @Service
Service classes typically contain business logic and are often used to encapsulate and manage business operations (such as operation on getting and adding user in the system).
12. @Repository
It is used to define classes that interact with a database, 

### Spring Boot Annotations
13. @EnableAutoConfiguration
14. @SpringBootApplication
This annotation mark on the main class as the entry point and encapsulate auto-configuration and component scanning.

### Spring MVC and Rest Annotations
15. @Controller
16. @RequestMapping
17. @GetMapping
18. @PostMapping
19. @PutMapping
20. @DeleteMapping
21. @PatchMapping
22. @RequestBody
23. @ResponseBody
24. @PathVariable
25. @RequestParam
26. @RequestHeader
27. @RestController
28. @RequestAttribute
29. @CookieValue
30. @CrossOrigin
By using this annotation, you explicitly specify which origins are permitted to access your API, thereby allowing cross-origin requests from those specified domains.

## 10: @SpringBootApplication is made up of the following application;
@EnableAutoConfiguration
@ComponentScan. use to scan packages and create bean
@Configuration. use to mark a class as a configuration class

## 11:The difference between stateless and stateful authentication in Spring

### Stateless Authentication:

Idea: In stateless authentication, the server doesn't store any information about the client's authentication state between requests.
How it Works: Each request from the client includes all the necessary information for authentication, often in the form of a token (e.g., JWT).

### Stateful Authentication:

Idea: In stateful authentication, the server keeps track of the client's authentication state between requests.
How it Works: After a successful login, the server creates a session and associates it with the client. Subsequent requests include a session identifier to link them to the authenticated session.

## 12:IoC (Inversion of control)
Ioc mean that instead of the programmer deciding the flow of the application, that is what object and etc etc, this is all handle to the spring framework (spring container)<br>
One of the things that IoC require is dependency injection.<br>
what happen in our code is that instead of instancing some new object, spring is actually doing it for us

## 13:Beans
A Bean is an instance of a class or method that is manage buy the spring container<br>
Spring container is responsible of managing all the beans

## 14: what are the difference scope of bean in spring  
The scope of a bean defines the lifecycle and visibility of that bean. Here are the main bean scopes in simple terms:
- **Singleton:** There is only one instance of the bean in the Spring container. It is shared among all the requests, meaning all requests get the same instance.
- **Prototype:** A new bean instance is created every time it is requested. Each request gets a fresh instance of the bean.
- **Request:** Scoped to a single HTTP request. This means each HTTP request will have its own instance of the bean.
- **Session:** Scoped to an HTTP session. Each user session will have its own instance of the bean.
- **Global Session (clustered environments):** Similar to session scope but designed for clustering environments. It is generally used with portlet-based Spring MVC applications.


## 15: The difference between JDBC and hibernate
### JDBC (Java Database Connectivity):
- **Approach:** JDBC is a low-level API that requires manual handling of database connections, queries, and result sets.
- **Control:** Developers have more control over SQL queries and database interactions.
- **Mapping:** Object-relational mapping (ORM) is not automated; developers need to write SQL queries and map results to Java objects manually.
- **Complexity:** Generally involves more boilerplate code and is considered more complex for certain tasks.

### Hibernate:
- **Approach:** Hibernate is a high-level ORM framework that automates many database operations, making it more developer-friendly.
- **Control:** Offers a higher level of abstraction, reducing the need for manual handling of database connections and SQL queries.
- **Mapping:** Provides automated object-relational mapping, allowing developers to work with Java objects directly without writing SQL queries.
- **Complexity:** Generally simplifies database interactions, reducing boilerplate code and making it easier to work with databases.
## 16:Hibernate language is know as: HQL and the hHibernate specification is know as JPA
it is independent from the data base, it uses cash for performace ans have already predefine method to do perform queries
## 17:If you change the database system the request will remain correct

## 18:Dialect
The dialect specifies the type of database used in hibernate so that hibernate generate appropriate type of SQL statements.

## 19:What is maven
Maven is a tool  to manage the build lifecycle, dependencies, and project structure.

## 20:sql syntax to select the average of the marks

## design pattern
