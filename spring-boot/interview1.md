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
## 12:How cna you define bean in spring framework
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

## 14:Hom many ways we can perform dependency injection in spring or spring boot 
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