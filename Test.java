
class Base {
    String name = "nelly";
    void update(String name){
        this.name =  name; 
    }

}

class Test {
    static int num = 0 ;
    static  void changePrimitive(int in){
        num = in;
    }
    public static void main(String[] args) {
        // Integer a = 10;
        // Integer b = 10;
        // Integer c = 200;
        // Integer d = 200;

        // System.out.println(a == b);
        // System.out.println(c == d);

        System.out.println(num);
        changePrimitive(10);
        System.out.println(num);

 // ******************* * ** * ***************** //

        Base base = new Base();
        System.out.println(base.name);
        base.update("mm");
        System.out.println(base.name);
    }
}
