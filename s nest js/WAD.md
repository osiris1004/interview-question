


# --------------------------------------------------------------------------------------------------------
## What is the main responsibility of one ExceptionFilterin Nest.js?
- Filter incoming requests.
- * Catch and handle exceptions thrown while processing a request.
- Execute code after a response has been sent.
- Validate incoming data.


## How do you declare a value type provider in Nest.js?
- Using the decorator *@Provider()*
- By declaring it in the table *providers* of a module with a specific syntax.
- By exporting a constant from a module.
- By defining a route with a particular prefix.


## How to manage resource sharing (CORS) with NestJS?
- app.enableCors();
- app.cors();
- const app = await NestFactory.create(AppModule, { cors: true });
- const app = await NestFactory.create(AppModule, { cors: { origin: 'url_d_origine' } });


## Which of the following is not a predefined interceptor in Nest.js?
- FilesInterceptor
- TransformInterceptor
- ClassSerializerInterceptor
- LoggingInterceptor


## How can you associate one ExceptionFilterwith a specific controller or route?
- By adding it to the *apply()* class method MiddlewareConsumer.
- By declaring it in the *main.ts* .
- Using the decorator *@UseFilters()*.
- Using the decorator *@UseMiddleware()*.


## In the context of the declaration of providers, what is the specific role of useFactory?
- Determine the life cycle of the provider.
- Assign roles or permissions to users.
- Instantiate a provider based on dynamic logic or configurations
- Integrate external dependencies into the module


## Which of these objects is injected into the constructor of a custom Guard to get details about the current request?
- ExecutionContext
- RouterContext
- GuardContext
- NestExecutionContext


## Which method *ConfigModule* would allow you to load an asynchronous configuration?
- asynchrone()
- loadAsync()
- forRootAsync()
- asyncConfig()


## What is the main role of Guards in Nest.js?
- Manage view rendering
- Determine if a request should be handled by a route
- Store session data
- Manage database migrations


## What option can you use to ignore missing file .envwhen initializing ConfigModule?
- ignoreFile: true
- ignoreEnvFile: true
- skipEnv: true
- bypassFile: true


## How could you, with useFactory, initialize a provider that depends on asynchronous data obtained from a remote API?
- By directly returning the result from the API.
- By using a promise or an asynchronous function in the factory.
- Using the decorator @Async()above the factory function.
- By calling a callback function inside useFactory.


## In the context of Nest.js, what does the library enable class-validator?
- Create custom decorators.
- Build microservices.
- Automatically validate objects based on certain defined validation rules.
- Manage data persistence in a database.


## Examine the following code for a Nest.js module:
```
@Module({
  imports: [],
  controllers: [ProductsController],
  providers: [ProductsService],
})
export class ProductsModule {}
```
Which of the following statements is true about this code?

- The module ProductsModuledeclares ProductsControllerto handle queries associated with this module.
- ProductsModuleimports other modules, as indicated by the imports table.
- ProductsServiceis exported and can be used by other modules that would import ProductsModule.
- ProductsControllercan directly use all services from any other module without importing them.


## What interface should a Guard implement in Nest.js to determine whether or not a request should be processed?
- GuardActivate
- GuardProvider
- CanActivate
- ActivateGuard


## What is middleware in Nest.js?
- A function that is executed before the route handler.
- A class that implements the interfaceExceptionFilter
- A function that transforms the server response.
- A method for storing data in a database.


## Examine the following code for a Nest.js service:
```
@Injectable()
export class MyService {
  @Inject('LibraryService')
  private libraryService: LibraryService;
}
```
Which of the following statements is true about this code?

- *LibraryServiceis* a class that must be defined in the same module as *MyService*.
- *libraryService* is a property of *MyService* where *LibraryService* is injected via property-based injection.
- The code will cause an error because *@Inject()* can only be used in constructors.
- *LibraryService* is an alias for another service that will be automatically resolved by Nest.js.


## In Nest.js, what is the main role of controllers?
- Manage configuration and environment variables
- Manipulate database data
- Process incoming requests and return a response to the client
- Ensuring application authentication and security


## When would it make sense to use a custom decorator rather than a built-in Pipe?
- Extract a specific field from the request header.
- Validate the structure of an incoming DTO object.
- Convert simple data types, like strings to numbers.
- Inject authenticated user data directly as method parameter


## Or the following code:
```
@Module({
  providers: [
    {
      provide: 'DATABASE_SERVICE',
      useFactory: (configService: ConfigService) => {
        return new DatabaseService(configService.get('DATABASE_URL'));
      }
    }
  ]
})
export class AppModule {}
```

What is the error in the provider declaration?


- The module does not include the import of *ConfigService*.
- It's missing the property *inject* needed to inject *ConfigService* into the function *useFactory*.
- We cannot use the method *get* directly on *ConfigService*.
- The key *DATABASE_SERVICE* is not formatted correctly.


## What command do I use to initialize a new Nest.js project using the CLI?
- nest create nom-du-projet
- nest init nom-du-projet
- nest start nom-du-projet
- nest new nom-du-projet


## Which command starts the application in development mode with hot-reloading support?
- nest run dev
- nest start --watch
- nest start --hot
- nest serve --reload


## Which decorator is needed to define a module?
- @Controller()
- @Service()
- @Module()
- @Injectable()


## What is the difference between properties *providers* and *exports* in the definition of a Nest.js module?
- *providers* registers services or other classes for dependency injection inside the module, while *exports* determines which services or classes can be used by other modules that import this module.
- *providers* is used to define routes, while *exports* is used to define controllers.
- Both properties serve the same purpose and are therefore interchangeable.
- *providers* is only for services external to the module, while *exports* is for services intended to be shared.


## Which of the following is one of the properties of a module?
- providers
- controllers
- imports
- roads
- exports


## How can you customize the scope of a provider in Nest.js?
- Using the decorator *@Scoped()*
- By defining the property *scope* when creating the provider.
- By exporting it to a different module.
- Using the decorator *@Singleton()*


## How can a specific configuration variable be accessed with the ConfigService?
- configService.retrieve('NOM_VARIABLE')
- configService.variable('NOM_VARIABLE')
- configService.env('NOM_VARIABLE')
- configService.get<string>('NOM_VARIABLE')


## What command is used to create a new module in Nest.js?
- nest g service nom-du-module
- nest generate controller nom-du-module
- nest g module nom-du-module
- nest new module nom-du-module


## Which decorator allows you to retrieve HTTP request context in Nest.js?
- @Query()
- @Request()
- @Param()
- @Response()


## What are the different scopes available for a provider in Nest.js?
- Singleton
- component
- Module
- Request
- Transient
- Service


## Examine the code below:
```
@Controller('cats')
export class CatsController {
  @Get()
  findAll(): string {
    return 'This action returns all cats';
  }
}
```
What URL would be used to access the method findAll()?

- /
- /cats
- /findAll
- /cats/findAll


## What frameworks can Nest.js use for processing HTTP requests?
- Express.js
- Hapi.js
- Koa.js
- Fastify


## How can you define a GraphQL type in Nest.js?
- . Using the decorator *@Type()*
- Using the decorator *@ObjectType()*
- Using the decorator *@GraphQLType()*
- Using the decorator *@GraphEntity()*


## What is the main purpose of asynchronous providers in Nest.js?
- Run code in parallel to improve performance.
- Resolve dependencies asynchronously.
- Provide a way to declare providers that will be instantiated later.
- Manage circular references between providers.


## What is Nest.js?
- A frontend framework based on JavaScript
- A library for mobile application development
- A backend framework for building efficient and scalable Node.js applications
- A database management system


## When you declare a provider in the providers table of a module, but do not add it to the exports table, what happens?
- It is available globally throughout the application.
- It can only be injected inside the module where it is declared.
- It automatically generates an associated route.
- It is automatically transformed into a singleton.


## Consider the following code snippet:
```
@Post()
async create(@Body() createCatDto: CreateCatDto) {
  this.catsService.create(createCatDto);
}
```
What is the role of the decorator @Body()in this extract?


- It returns the response body.
- It extracts the object from the incoming request body.
- It is used to validate the body of the incoming request.
- It transforms the request body into a formatted response.


## Why and when would you use the decorator *@Optional()* when injecting dependencies?
- To make the dependency optional in unit tests only.
- To mark a dependency as of low importance.
- When you want to inject multiple instances of a dependency.
- When the injected dependency can be absent without causing an error.


## Is it recommended to store sensitive information, like passwords, directly in a file .env?
- Yes, because the file *.env* is encrypted.
- No, it is better to use secrets management solutions or other protection mechanisms.
- Yes, as long as the file *.env* is not versioned with Git.
- It depends on the company's security policy.


## Which method should be defined when creating a custom interceptor?
- transform()
- intercept()
- handle()
- process()


## What is an interceptor in Nest.js?
- A decorator for adding metadata to a method.
- A class that implements NestInterceptor.
- A mechanism for adding logic before or after execution of a method.
- A service that is injected directly into controllers.


## Why would you use *forwardRef* in Nest.js?
- To improve performance by loading providers asynchronously.
- To create a reference to a module or provider that is not yet defined because of a circular reference.
- To refer to future versions of a module or provider.
- To enable provider caching.


## What is the main use of the interface *OnModuleInit* in Nest.js?
- It provides a method to execute logic when the module is initialized.
- It is used to initialize the module routes.
- It creates middleware for the module.
- It allows you to inject dependencies into the module.


## In what situations would you use the methods *switchToHttp* or *switchToWs* in a Nest.js guard or interceptor?
- To access the underlying context, such as the HTTP request object or web socket object, from the execution context
- To change the application's communication protocol on the fly.
- To transform the response of an HTTP request into a WebSocket response.
- To enable or disable WebSockets in the application.


## How can you make a module "global" in Nest.js?
- By importing it into the module *AppModule*
- Using the decorator *@Global()*
- By placing it in a specific folder
- By adding it to an array *globals* in the main module


## Why do we use modules in Nest.js?
- To organize code into reusable units
- To facilitate functionality decoupling
- To increase the execution speed of the application
- To create clear boundaries between features


## In what order are methods related to the module lifecycle executed?
- *onModuleInit*, *onApplicationShutdown*,*onModuleDestroy*
- *onApplicationShutdown*, *onModuleDestroy*,*onModuleInit*
- *onModuleInit*, *onModuleDestroy*,*onApplicationShutdown*
- *onModuleDestroy*, *onModuleInit*,*onApplicationShutdown*


## In Nest.js, how would you define a service or component that can be injected?
- Using the decorator *@Service()*
- Using the decorator *@Injectable()*
- Using the decorator *@Provider()*
- Using the decorator *@Component()*


## Which decorator is used to associate a Guard with a route or controller?
@Guard()
@UseGuards()
@ApplyGuard()
@GuardProvider()


## What is the main responsibility of a pipe in Nest.js?
- Catching and handling exceptions.
- Execute code before and after the route handler.
- Transform or validate incoming data.
- Manage outgoing responses.


## How can you make a ExceptionFilterglobal so that it applies to your entire application?
- By adding it to the providers table in the main module.
- Using the method *useGlobalFilters()* of the AppModule class.
- Using the *useGlobalFilters()* class method *NestFactory*.
- By adding it to the imports table in the main module.


## In Nest.js, which decorator do you use to declare a class as a controller?
- @Route
- @Controller
- @Component
- @Module

