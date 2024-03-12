## 1:
## 2:The difference between locale variable and instance variable     
### Local Variable:

- **Scope**: Limited to the block or method where it is declared.
- **Declaration**: Inside a method, constructor, or any block of code.
- **Initialization**: Must be explicitly initialized before use.
- **Lifetime**: Exists only as long as the block or method is executing.
- **Usage**: Not accessible outside the block or method in which it is declared.   
```
public void exampleMethod() {
    int localVar = 10; // Local variable
    System.out.println(localVar);
}

```
### Instance Variable (or Member Variable):
- **Scope**: Belongs to an instance of a class, so it is accessible throughout the entire class.
- **Declaration**: Outside methods, usually at the class level.
- **Initialization**: Automatically initialized with default values if not explicitly set.
- **Lifetime**: Exists as long as the object (instance of the class) exists.
- **Usage**: Accessible throughout the class, and each instance of the class has its own copy.
```
public class MyClass {
    int instanceVar; // Instance variable

    public void setInstanceVar(int value) {
        this.instanceVar = value;
    }
}

```
## 3:the order for the execution in java is
1- Static block.
2- Initialization block. 
3- Constructor block.

## 4:Difference between a List and a Map
### List:
- Structure: Ordered collection of elements (objects or values).
- Accessing Elements: Accessed by index (position).
- Duplicates: Allows duplicate elements.
- Key Concept: No key-value pairs; each element has an index.
- Implementation: Examples include ArrayList and LinkedList.
```
List<String> myList = new ArrayList<>();
myList.add("Apple");
myList.add("Banana");
myList.add("Orange");
System.out.println(myList.get(1)); // Output: Banana
```

### Map:
- Structure: Collection of key-value pairs.
- Accessing Elements: Accessed by key.
- Duplicates: Does not allow duplicate keys; values can be duplicates.
- Key Concept: Each element is identified by a unique key.
- Implementation: Examples include HashMap and TreeMap.
```
Map<String, Integer> myMap = new HashMap<>();
myMap.put("One", 1);
myMap.put("Two", 2);
myMap.put("Three", 3);
System.out.println(myMap.get("Two")); // Output: 2
```

## 5:give me a lib to perform maping from object to object
**ModelMapper**. ModelMapper simplifies the process of mapping one object to another by automatically determining how properties in one object correspond to properties in another.


## 6:How to create an API in spring boot
### Set Up a Spring Boot Project:
Use Spring Initializer (https://start.spring.io/) to generate a new project.
Select the necessary dependencies like "Spring Web."

### Create a Controller:
Write a simple controller class to handle HTTP requests. Annotate it with @RestController.
Define methods to handle different endpoints using @GetMapping, @PostMapping, etc.
```
@RestController
public class MyController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
```
### Run Your Application:
Run the Spring Boot application. Your API will be accessible at http://localhost:8080/hello.

### Test Your API:
Use tools like cURL, Postman, or a web browser to test your API.
Example cURL command:
```
curl http://localhost:8080/hello
```


## 7:What is content negotiation
Content negotiation is  where the server and client communicate to determine the most suitable content type (representation) for a given request. 
```
@RestController
@RequestMapping("/api/data")
public class DataController {

    @GetMapping(produces = {"application/json", "application/xml"})
    public DataObject getData() {
        // Assume DataObject is a class representing your data
        return new DataObject("Sample Data");
    }

    // Other controller methods...

}
```
The **@GetMapping(produces = {"application/json", "application/xml"}) annotation** defines a method that responds to GET requests at the specified path ("/api/data") and produces either JSON or XML based on the "Accept" header in the request.

## 8:the deference between @RestController and @Controller
## 9:the deference between response entity and entity object
### Entity Object:

- An entity object is the actual data or object that you want to send as part of an HTTP response.
- It represents the payload or content of the response, such as a domain object, a collection, or any other serializable data.
- It is the main data you want to transmit to the client.
```
public class Book {
    private String title;
    private String author;

    // Constructors, getters, setters...
}
```
### ResponseEntity:

- ResponseEntity is a class that represents the entire HTTP response, including status code, headers, and the response body (entity).
- It allows you to customize various aspects of the response, such as setting specific HTTP status codes, headers, and, importantly, the response body.
- It wraps the entity object and provides additional control over the response characteristics.
```
ResponseEntity<Book> responseEntity = new ResponseEntity<>(new Book("Title", "Author"), HttpStatus.OK);

```

## 10:
hibernate is the implementation of jpa
jpa is a specification
jdbc is an api

## 12:connection pull


## 13:What is session factory and entity management factory

## 14:What are the annotation that are said to be oblige on entity jpa

## 15:
Use PUT when you want to replace the entire resource with a new representation.
```
PUT /users/123
Content-Type: application/json

{
    "name": "John Doe",
    "age": 30
}
```
Use PATCH when you want to apply partial modifications to the existing resource.
```
PATCH /users/123
Content-Type: application/json

{
    "age": 31
}
```
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