
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test2 {

    static int find(int[] integers) {

        int result = 0;
        for (int element : integers) {

            if(integers.length%2 == 0){
                if (element % 2 == 0) {
                    result = element;
                    break ;
                }
            }else{

            }

            
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = { 2, 4, 0, 100, 4, 11, 2602, 36 };
        int[] b = { 160, 3, 1719, 19, 11, 13, -21 };

        System.out.println(find(a));
        System.out.println(find(b));

    }
}
