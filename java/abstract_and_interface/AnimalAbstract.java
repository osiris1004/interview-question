package abstract_and_interface;

public abstract class AnimalAbstract {
    int age;
    String name;
    public abstract void makeNoise();
}

/* !!
!! an abstract class enforce and organize exactly every subclass has to have


!!  Can have constructors hence can not be initialize.

!! Can have instance variables, constants, and static variables.

!! Can have abstract methods (methods without a body) and concrete methods (with a body).

!! Abstract methods must be implemented by concrete subclasses.

!! Can have access modifiers for methods and fields (public, private, protected, default).

!! Supports single inheritance; a class can extend only one abstract class.




*/