//! Static Binding
class Cat {
    private void talk() {
        System.out.println("cat is mewing...");
    }

    public static void main(String args[]) {
        Cat cat = new Cat();
        cat.talk();
    }
}

// ! Dynamic Binding
class Animal {
    void talk() {
        System.out.println("animal is talking...");
    }
}

class Cat2 extends Animal {
    void talk() {
        System.out.println("cat is talking...");
    }

    public static void main(String args[]) {
        Animal animal = new Cat2();
        animal.talk();
    }
}