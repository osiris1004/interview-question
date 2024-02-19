package abstract_and_interface;

public class Cat extends AnimalAbstract implements AnimalInterface{

    @Override
    public void makeNoise() {
        System.out.println("miow");
    }

    @Override
    public void pop() {
        System.out.println("poop");
    }

}
