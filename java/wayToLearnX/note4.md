## 1: 
## 2: 
## 3: 
```
class Vehicle {
    protected String color;
    protected String brand;
    protected String model;

    public Vehicle(String color, String brand, String model) {
        this.color = color;
        this.brand = brand;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Vehicle engine started.");
    }

    public void stopEngine() {
        System.out.println("Vehicle engine stopped.");
    }
}

class Car extends Vehicle {
    private int doors;
    private int seats;

    public Car(String color, String brand, String model, int doors, int seats) {
        // Call the constructor of the superclass (`Vehicle`) to initialize its
        //! attributes
        super(color, brand, model); //! Use `super` here

        this.doors = doors;
        this.seats = seats;
    }

    public void openDoors() {
        System.out.println("Car doors opened.");
    }

    public void lockDoors() {
        System.out.println("Car doors locked.");
    }

    @Override // Optional to indicate overriding
    public void startEngine() {
        super.startEngine(); // Call the parent class's `startEngine` for common behavior
        System.out.println("Car engine started with increased sound."); // Add car-specific startup sound
    }
}

class Main4 {
    public static void main(String[] args) {
        Car car = new Car("red", "toyota", "yaris", 2, 4);
        car.startEngine();
    }
}
```

## 4: What is a Singleton class in Java? And how to implement a Singleton class?

A singleton is a special type of class that ensures only one instance of itself can exist throughout the program execution. It provides a global access point to this single instance, often through a static method.
```
class SingleTon {

    private static SingleTon instance;

    private SingleTon() {
        // Private constructor to prevent direct instantiation
    }

    public static SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }

    // Other methods and data members specific to SingleTon
}


class Main4 {
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        SingleTon singleTon2 = SingleTon.getInstance();
        System.out.println(singleTon);
        System.out.println(singleTon2);
    }
}
```

## 5: How to differentiate between a String, a StringBuffer, and a StringBuilder?
* **String:** Immutable. Once created, the content cannot be changed. Useful for constant data or situations where data integrity is crucial.
* **StringBuffer:** Mutable. You can modify its content after creation using methods like append or insert. Thread-safe due to synchronized methods.
* **StringBuilder:** Mutable. Similar to StringBuffer but not thread-safe, making it faster for single-threaded environments.

## 4: What is a Singleton class in Java? And how to implement a Singleton class?

A singleton is a special type of class that ensures only one instance of itself can exist throughout the program execution. It provides a global access point to this single instance, often through a static method.

## 5: 
## 6: 
## 7: 
## 8: 
## 9: 
* **NB:** super(); and this(); can not  be found in the same constructor it will trown an error 
* **NB:** If the apparent class has has a constructor with no argument and it is inherited, the construct will be auto loaded. where as if it has an argument you most implement it with super()
```
class Main4 {
    public static void main(String args[]) {
        B b = new B(10);
    }
}

class A{
    A(){
        System.out.println(" Constructeur 1 de A ");
    }
}

class B extends A{
    B(){
        System.out.println(" Constructeur 1 de B ");
    }
    B(int x){
        super();
        //this(); //if you un comment this which refers to the current object will lead to a recursive call to the same constructor B(int x).
        
        System.out.println(" Constructeur 2 de B ");
    }
}
```
## 10: Does Java use "pass-by-value" or "pass-by-reference"?


Here's a summary of the key points regarding pass-by-value and pass-by-reference in Java:

1. Java primarily uses pass-by-value:
- When passing primitives, a copy of the actual value is passed.
- Changes within methods don't affect the original values.

2. Objects are passed by reference:
- A copy of the object reference is passed.
- Both caller and method access the same object.
- Changes made through the reference in the method affect the original object.

3. Key takeaway:
- Understand this behavior to avoid unexpected side effects when working with objects in Java methods.