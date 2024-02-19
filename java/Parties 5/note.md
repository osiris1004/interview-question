
## 1: 
## 2: How to prevent the serialization of attributes in a class in Java?
To achieve this, the attribute can be declared using the "transient" keyword as shown below:
```
public class Exemple 
{ 
   private transient String name; 
   private String address;
   private int id;
   // ...
}
```
## 3: What happens if the "static" keyword is not included in the signature of the main() method in Java?
There would be no compilation error. However, when the program is executed, since the JVM cannot match the signature of the main method, the code generates a "NoSuchMethodError" at runtime.






## 4:

## 5: 
## 6: 
## 7: 
## 8: 
## 9: 
## 10: 