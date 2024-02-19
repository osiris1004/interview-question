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