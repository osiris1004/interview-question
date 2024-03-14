
/*

## 11: What types of memory areas are allocated by the JVM?
1 Heap:<br>
It is the storage memory for object when ever they are created. heaps are managed by by the garbage collector.

2 Method Area:<br>
Stores information about loaded classes, including: 
* **Class metadata**: Field and method definitions, constant pool, etc. 
* **Static variables**: Values associated with the class itself, not individual objects.
 
3 Stack:<br>
storing local variables and method information.

4 Program Counter Register:
Stores the address of the next instruction to be executed in the current thread.

 ### NB: what is garbage collector
 It's an automatic memory management system that frees up memory occupied by objects that are no longer needed by your program.

  ### NB: Compile time 
  it Occurs  when you translate your source code (e.g., Python, Java) into machine code that the computer can directly understand.

  ### NB: Run time 
  Occurs when you actually execute the compiled code or machine code on the computer.
 


 ## 12: Why is multiple inheritance not allowed in Java?
Java avoids multiple inheritance due to:

1 Diamond Problem: <br>
 Ambiguity arises when inheriting from multiple classes with the same method name. Leads to confusion about which method to call.

2 -Complexity: <br>
you should not that unnecessary complexity arises when manage multiple inheritance rules and resolve conflicts..

**Alternatives**:

* **Interfaces**: Implement multiple interfaces for desired functionality, avoiding inheritance conflicts.

* **Composition**: Composition: Instead of inheriting, create objects of other classes within your own class to achieve similar benefits.



## 17 What is the difference between static binding and dynamic binding?
**Static binding** occure at compile time.<br>
**Dynamic binding** occure at runtime.


## 21 What is the difference between the throw and throws keywords?
**throw** <br>
Used within a method or block to explicitly throw an exception, signaling an abnormal condition.
```
public void validateAge(int age) {
  if (age < 0) {
    throw new IllegalArgumentException("Age cannot be negative");
  }
  // ... rest of the method logic
}
```

**throws** <br>
Used in the method signature to declare the exceptions that the method might potentially throw.
```
public String readFile(String filename) throws FileNotFoundException {
  // ... code to read file
}
```