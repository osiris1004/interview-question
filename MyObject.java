
public class MyObject {

    public static void main(String[] args) {
        Bird mm = new Bird();
        mm.displayNbFeet();
    }

}

abstract class Animal {
    protected int nb_foot = 0;

    public Animal(int p_nb_feet) {
        nb_feet = p_nb_feet;
    }

    public void displayNbFeet() {
        System.out.println("%d feet", nb_feet);
    }

}

class Bird {
    public Bird() {
        super(2);
    }

}
