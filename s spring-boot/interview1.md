## 1:why will you use spring boot over spring framework
- when creating a spring boot app we just need ...jpa and ...web to lunch a crud app  where as  when we need to create a spring crud application you should manually add the following dependency
    - spring-core, spring-context, spring-tx, spring-orm, spring-web, spring-webmvc, hibernate-core, hibernate-validator, jackson-core, servlet-api,
    - you will have version conflict due to the manual configuration, if there is a downgrade our an upgrade of the dependency version  
- when using spring boot, you avoid any additional configuration when doing a task compare to spring
- spring have an embed tomcat for deploying you jar or war file for testing you app, where in spring je need to build it manually then host it in your tomcat server 
- spring has a separated starter call actuator  which can easily monitor your application ( metrics, health checks)

## 2: Give me some spring boot starter or module
- spring boot starter web 
    - it is use when we want to design some web mvc application
- spring boot starter data JPA
    - use if you want your application to integrate any persistence layout. ( simplifies the interaction between Java objects and relational databases. It provides a way to map Java objects to database tables and vice versa)
- spring boot starter AOP
    - In essence, AOP helps in improving code modularity, reusability, and maintainability by isolating common functionalities that would otherwise be scattered throughout your codebase.
- spring boot starter web services
    - use if you want to expose SOAP base services
- spring boot starter security
    - It provides pre-configured settings and dependencies to help you easily implement authentication, authorization, and other security-related functionalities.
- spring boot starter apache kafka
    - In essence, the Spring Boot Starter for Apache Kafka streamlines the process of incorporating Kafka into your Spring Boot application, enabling efficient communication and data streaming between different parts of your system.
- spring boot starter spring cloud
- spring boot starter thymeleaf

## 3:How do we run spring boot application
mvn spring-boot:run


## 4:what is the use of @SpringBootApplication
this is the combination of 3 annotation which are :
- @EnableAutoConfiguration
    - This annotation tells Spring Boot to automatically configure your application based on the dependencies you've added and the beans you've defined.
- @ComponentScan
    - This annotation instructs Spring to scan and locate components, such as beans and controllers, in specified packages. Spring needs to know where to find your classes annotated with @Component, @Service, @Repository, etc. @ComponentScan helps by telling Spring which packages to scan for these components. It ensures that Spring is aware of all the relevant classes in your 
- @Configuration
    - In a configuration class, you define beans using methods annotated with @Bean. These beans are then managed by the Spring container. @Configuration is used to indicate that the class contains configuration information for the application.


## 5:What is auto configuration:
Auto-configuration is the auto configuring of your application accordingly based on  dependencies. This eliminates the need for extensive configuration code.

## 6:How can you disable a specific auto-configuration class in spring boot
in the @SpringBootApplication you can define those auto configuration you d'ont want to be enable for you.
```
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
```
you can also exclude it in the application.properties

## 7:how can you customize the default configuration in spring boot 
```
server.port=2020
```
## 8:how spring boot run() method works internally
- load configuration file such as application.properties or application.yml
- Component Scanning
- Auto-Configuration
- creates an application context, which is a container for managing your beans and their dependencies.
- If your application is a web application, Spring Boot starts an embedded server (like Tomcat or Jetty) to handle HTTP requests.
- Your main business logic (controllers, services, etc.) is now ready to execute and now available for use.

## 9:what is the command line runner in spring boot
CommandLineRunner is an interface that allow you to run a piece of code when your Spring Boot application starts up

# ---------------------------------------------------------PART-2-----------------------------------------------------------------------------------------
## 10:Can you explain the purpose of stereotype annotations in spring framework ?
stereotype annotations are  labels you put on your classes to tell Spring what role or purpose they play in your application. Here are a few common stereotype annotations in Spring:
- @Component:
    - Used to indicate that a class is a Spring component and should be automatically detected and configured by Spring.
- @Service:
    - Indicates that the class is a service component, typically used for business logic.
- @Repository:
    - Indicates that the class is a repository, handling data access and persistence (where we define all database interaction).
- @Controller:
    - Indicates that the class is a controller component, responsible for  handling HTTP requests response.
- @RestController:
## 12:How can you define bean in spring framework
There are 2 way 
- 1 :
```
@Configuration
public class AppConfig{
    @Bean
    public DemoServices demoService(){
        return new DemoService
    }
}
```
- 2 or by defining java stereotype annotations


## 13:what is decency injection  
decency injection is a design pattern use to apply loose coupling between the classes, buy removing the direct dependency between them
```
@Service
public class orderService{
    @Autowired
    private OrderRepository orderRepository;
}
```

## 14:Hom many ways we can perform dependency injection in spring or spring boot 
- 1 field level dependency injection
```
@Service
public class orderService{
    @Autowired
    private OrderRepository orderRepository;
}
```
- 2 setter dependency injection
```
@Service
public class orderService{
    @Autowired
    public void setOrderRepository (OrderRepository orderRepository){
        this.orderRepository = orderRepository
    }
}
```
- 3  constructor dependency injection
```
@Service
public class orderService{
    @Autowired
    public orderService (OrderRepository orderRepository){
        this.orderRepository = orderRepository
    }
}
```
### NB
A circular dependency occurs when two or more classes depend on each other, either directly or indirectly, creating a loop. In other words, Class A depends on Class B, and Class B depends on Class A, forming a circular reference.
## 15:when should you use setter injection over constructor injection ans vice versa
- Setter injection
    -  Use Setter injection when you have many dependencies. 
    -  Setter injection in optional that is if you don't inject the dependency (bean) there is no problems
    -  can result to circular dependency with the use of **@Lazy**
- Constructor Injection
    -  Use Constructor Injection when an object must be created with all of its dependencies.
    -  Constructor Injection  is mandatory that is, if you don't inject the dependency (bean) the programme will crash because it must be inject at run time
    -  can result to circular dependency


## 16:can you provide an example of real world use case where @PostConstruct is useful
@PostConstruct is use to execute the preprocessing logic (NB using the CommandLineRunner you can perform preprocessing logic)
```
@PostConstruct
public void initLogic(){
    System.out.printLn("xxxx test)
}
```
one use came is  implementing the connection pool logic

## 17:hom can we dynamically load values in spring boot application
- make use of  the @value annotation : 
```
@Value("${discount.offer}")
private String envArgs

```
- make use of Environment from org.springframework.core.env as show below 
```
Autowired
private Environment
```
 
## 18:can you explain the key different between YML and properties files, and in what scenarios you might prefer one format over the other
- Syntax and Structure
    - ```
        discount.offer.price = 25
      ```
      vs  
    - ```
        discount:
                offer:
                    price : 25 
      ```
- Hierarchy
    - ```
         spring.datasource.driver-class = com.mysql.cj.jdbc.Driver
         spring.datasource.driver-class.username : jdbc:mysql://localhost:3306/javatechie
         spring.datasource.driver-class.user: root
         spring.datasource.driver-class.password : password
     ```
    vs
   - ```
        spring:
                datasource:
                        driver-class: com.mysql.cj.jdbc.Driver
                        username : jdbc:mysql://localhost:3306/javatechie
                        user: root
                        password : password
    ```
- Lists and Arrays
   - ```
        mylist=apple,banana,orange
     ```
    vs
   - ```
        mylist :
            - apple
            - banana
            - orange
     ```


- Complex Data types
    - properties files only understand string and integer data type
    - yml fils understand complex data type 

- Readability

## 19:What is the diffrence beyween yml and YAML


## 20:if i configure same values in bothe properties then which value will load in spring boot first between properties and yml file ?

## 21:How to load External properties in spring Boot

- spring.config.import = file/location.properties
    - this tell spring load instead the properties file that is locate at file/location.properties

## 22:How to map or bind config properties to java object
# ---------------------------------------------------------PART-2-----------------------------------------------------------------------------------------
## 23:how will you resolve bean dependency ambiguity
if you have an interface and is  implemented by 2 difference class and you want to inject it the interface in a class, an error will occur by sing a single bean is required but 2 was found. to solve the problem make use of **@Qualifier** annotation
```
@Service
public void TrailerService(){

    Autowired
    @Qualifier("rderRepositoryIml2")
    private OrderRepository orderRepository
}
```
 @Qualifier("orderRepositoryIml2") // i want to inject the the implementation2.Class of this particular interface (private OrderRepository orderRepository)
## 24:can we avoid this dependency ambiguity without using @Qualifier
yes which is:
- @Resource(name= "orderRepositoryIml2")

## 25:what is bean scope and can you explain the difference type of bean
beans scope is the life cycle and visibility of a spring bean
 
 Singleton:
- An object instantiated once, and the same instance is shared across the entire application.
Example: Creating a database connection manager that's reused by all parts of the application.

Prototype:
- A new instance of the object is created every time it is requested.
Example: Creating a new user object for each user logging into a system.

Request:
- A new instance is created for each HTTP request.
Example: Creating a user authentication object for each user request to a web server.

Session:
- A new instance is created for each user session in a web application.
Example: Storing user-specific data in an object that lasts throughout a user's visit to a website.

Application:
- A single instance is created for the entire web application.
Example: Storing global settings or data that should be shared among all users in a web application.

WebSocket:
- Represents a continuous communication channel between the server and a client, allowing bidirectional communication.
Example: Establishing a WebSocket connection to enable real-time, interactive communication between a web server and a web browser.

## 26:how to define custom bean scope ?

## 27:can you provide few real-time use cases for when to choose singleton scope and prototype scope.

- singleton scope
    - data configuration
    - service layout
        - Think of a logging service like a shared diary for your application. Using Singleton ensures that all parts of your program write in the same diary, making it easy to find and understand what's happening across the entire application. 
    - application configuration
- prototype scope
    - user session
    - thread safety
        - thread is a unit of execution
        - thread safety is the execution of multiple thread simultaneously with corruption issues
    - heavy initialization


---------------------------------------------------------PART-4-----------------------------------------------------------------------------------------
## 28:have you worked on restful web services ?  if yes what all http method have you use in your project
- **Post :** create a resource
- **put :** update
- **get :**  fetch 
- **patch :** update partially
- **delete :** remove a resource

## 29:how can you specify the http method type for your Rest endpoint
- **@GetMapping(value ="/message", product = MediaType.Text_Plain_Value)**
- NB you set @Controller make use of @RespondBody
- **@PostMapping()**
- **@PutMapping()**
- **@PatchMapping()**
- **@DeleteMapping()**

## 30:can you design a rest endpoint, assume that you have a product database, and your task is to create an API to filter a list of products by productType
```
@Autowired
private ProductService service

@GetMapping("/search/{productType}")
public ResponseEntity<?> getProducts(@PathVariable String productType){
    List<Product> product = service.getProductByType(productType);
    return ResponseEntity.ok(products)
}
```

## 31:design endpoint in a way that takes "productType" as input. if the user provides this input, the endpoint should filter products based on the specified condition. if "productType" is not provided, endpoint should return all the product
- **required=false** : mean that the RequestParam is optional
```
Example where @RequestParam is used :http://example.com/api/search?productType=play
@GetMapping("/search")
public ResponseEntity<?> getProducts(@RequestParam(value ="productType", required=false) String productType){
    if(productType){
        List<Product> product = service.getProductByType(productType);
        return ResponseEntity.ok(products)
    }else{
        return ResponseEntity.ok(service.get())
    }
   
}
```

## 32:the difference between @RequestParam: and @PathVariable:
- **@RequestParam:** use to in Query parameters which is key-value pairs that come after the ? in the URL ans is optional
    - http://example.com/api/resource?id=123 : exacted path(?id=123)
- **@PathVariable**  use to exact parts of the URL and is mandatory. that is if you d'ont give the path it will create an error
    - http://example.com/api/resource/123 : exacted path(123)

## 33:why did you use @RestController why not @controller?
- **@RestController** :  this return the json or any thing 
- **@controller** : this return   html or view page 

## 34:how can we deserialize a JSON request payload into an object within a Spring MVC controller
- this can be achieved by th DTO concept

```public String processBook(@RequestBody Book book)```
**@RequestBody Book book** this tell spring to map the input payload in to tha book Object


## 35:can we perform updates operation in POST http method if yes then why do we need PutMapping or put http method
Technical you can perform the update operation in the post mapping but soing so we  violate the principle of of Restful design.
In Rest Each specific method has a specific purpose and semantic meaning

## 36:can we pass Request Body in GET HTTP Method
yes

## 37:How can we perform content negotiation (xml/json) in rest endpoint
```@GetMapping(produces = {"application/json", "application/xml"})```
```
# Enable content negotiation
spring.mvc.contentnegotiation.favor-path-extension = true
spring.mvc.contentnegotiation.favor-parameter = true
spring.mvc.contentnegotiation.defaultContentType = application/xml
```
## 38:What all status code you have observed in you application 
 - 400 : bad request:you are trying to access a resource giving wrong input
 - 404 : resource not found : when the url given the resource is not available
 - 401 : authentication fail
 - 403 : authentication successful put your are not allow to access the resource
 - 405 : method not allow. an trying to access a get method with a post
 - 415 : unsupported media type
 - 500 : internal server error : mean the server encounter an unexpected condition from performigf a request
 - 502 : bad getaway
 - 200 : ok :the request was successful
 - 201 : the request has fulfil and the resource was created

## 39:How can you customize the status code for your endpoint?  
```@ResponseStatus(HttpStatus.created)```


## 30:how can you enable cross origin 
this should be define on top of the controller class
```@CrossOrigin(origins = "http://localehost:4000")```
or you can implement the WebMvcConfigure

## 40:how can  you upload a file in spring 
## 41:How do you maintain versioning for your Rest API
- **@PostMapping("/v1/bookNew")**
- **@PostMapping("/v2/bookNew")**
   - this is how we main the version of api. the aim is to avoid touching what is in already production so that if you switch in v2 and there is a crash, you can easily forward back to the version that already works well
there are many way to perform that but this is what i prefer

## 42:How will you document your Rest Api
using swagger 
## 43:How can you hide certain rest endpoints to prevent from being exposed externally
- **@Hidden**
    - make use of this annotation above your restEntity method to hide the root
## 44:how will you consume restful API
## 45:
## 46:
## 47:
## 48:
## 49:
## 40:

## the most important design pattern in java 
