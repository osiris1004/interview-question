package welovedev;

public class Dev {

    private static Integer[] myCompute(int a){
        int i = 0;
        Integer[] result =  new Integer[2];
        result[i++] = new Integer(a);
        result[i] = new Integer(-a);
        result[1 - i] = result[i];
        return result;

    }

    public static void main(String[] args) {
        System.out.println(myCompute(3));
    }
    
}
