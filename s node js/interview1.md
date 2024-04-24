## runtime environment
it is platform that provide the necessary tools for the execution of code and include services like memory management and I/O operation

## 1:what is node js ?
node js is not a language nor framework. it a server side runtime environment to execute javascript library <br>
library and framework <br>
- A library is like a collection of pre-written code that you can use in your program.
- A framework is like a structure that dictates how your program should be designed and is follow the RAd by offering tools, library.

## ECMAScript (ES) 
it is js stander specification that govern how js most behave. It defines the syntax, semantics, and rules that JavaScript engines must follow to interpret and execute code

## 2:how node is a server side runtime environment 
browser execute javascript on the client side and similar to node js execute javascript on the server side
## 3:what is v8
V8 is a JavaScript engine that interprets and executes JavaScript code. 
- client side : 
    ```
        browser 
            v8 
            machine code
    ```
- server side : 
    ```
        node js 
            v8 
            machine code
    ```

## 4:express and nest js
help to ease the building of web app and api by providing tools like routing middleware etc

## modules
it is an encapsulated and reusable code that has it own context. 3 type of module are identify
- locale module
    - modules that we create in our application
- built in module
    - modules that nodejs ships with out of the book
- third party modules
    - modules written by other developers that can use it in their app

## 5:client side and server-side
- client side : 
    - UI, 
    - run  on browser 
    - html, css, js

- server-side : 
    - api (authentication, data storage, )
    - javascript
    - handle database object

## 6: 7 main node js feature
it is :
- single threaded
- Asynchronous
- Event driven
- run on V8 engine
- cross platform
- NPM
- great for real time capabilities

## 7: single threaded programming (synchronous  programming)
single-threaded programming means that a program or process executes one task at a time, one after the other, in a sequential manner.
- the disadvantages is that this programming design is a blocking a process leading to performance issues (last long)


## 9: multi threaded programming (Asynchronous  programming)
multi-threaded programming involves running multiple task concurrently (At the same time or simultaneously)
- the advantages is that this programming design is not a blocking process a project leading to good performance 
- in api design multiple thread can be a problem because it can create deadlock problems if not properly handle that why we prefer single threaded for js application
    - deadlock occurs when 2 or more task are unable to proceed because each is waiting for the other to release a resource.



## 8:Events, Event Emitter, Event Queue, Event loop 1 Event Driven
-  **Event:** is a signal telling that something has happen (click is the event)
-  **Event** Emitter: is an object  that trigger an event (button that trigger or emit and event).
- **Event Queue:** This is like a to-do list. When you click the button, the click event goes into a queue, waiting for its turn to be handled.
- **Event Loop:** The event loop is like a manager constantly checking the event queue.  It constantly looks at the queue and decides which event to handle next. It keeps the program running smoothly.
- Event Driven architecture: is when a system is organize in response to event
## 9:advantages of node 
- can handle perform multi thread process
- has a v8 english enable fast code execution 
- efficient for asynchronism operation such as bidirectional communication 
- run on windows, linux etc
- code on js
- code in scalable application 

## 14:disadvantages of node  
- don't use node in task that need cpu intensive task such as image/video processing, data encrypting and heavy computation multi-threaded

## 15:node_module folder
it contains all the dependency of the node project

## 16:NPM
it is use to mange the dependency


## 17:package.json file
it container project metadata that is information about the project

## 18:function vs module
- function : is a n instruction which a module
- module : is a functionality that can be easily reused in the node application
## 19:

## 20:building module in node js // locale modules // third party module (decency or lib)//
  

## 21:the top 5 built in module
fs
path
os
events
http

## 22:function  and event ?
- function is a reusable piece of code to perform a task
- event is an action that can be observe and responded to

## 23:http module
it create an http server that listen to a port to perform http request and response  

## 24: Use of createServer()
it is use to create an http server 
```
const http = request("http")
const server = http.createServer((req,res)=>{
    res.end("hello")
})
const port = 3000;
server.listen(port,()=> console.log(`server is listening on port ${port}`))
```
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