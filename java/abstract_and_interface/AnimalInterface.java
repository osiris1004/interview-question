package abstract_and_interface;

public interface AnimalInterface {
    public void pop();
}

/*
 !! every method  are abstract, you dont need to add the hey word abstract

 !! Cannot have constructors. Interfaces cannot be instantiated.

!! Can only have constants (public static final variables).

!! Can only have abstract methods and default/static methods.

!! All methods in an interface are implicitly public and abstract (except static and default methods).

!! All methods are implicitly public.

!! Supports multiple inheritance; a class can implement multiple interfaces.
 */