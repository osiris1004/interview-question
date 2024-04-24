import java.util.Arrays;

public class WholikesIt {
        public static String likes(String[] a) {
        if (a.length == 0) {
            return "no one likes this";
        }

        if (a.length == 1) {
            return a[0] + " likes this";
        }

        if (a.length == 2) {
            return a[0] + " and " + a[1] + " like this";
        }

        String[] firstTwo = Arrays.copyOfRange(a, 0, 2);
        StringBuilder result = new StringBuilder(String.join(", ", firstTwo));
        result.append(" and ");
        
        if (a.length - 2 == 1) {
            result.append(a[a.length - 1]).append(" like this");
        } else {
            result.append(a.length - 2).append(" others like this");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(likes(new String[]{}));
        System.out.println(likes(new String[]{"Peter"}));
        System.out.println(likes(new String[]{"Jacob", "Alex"}));
        System.out.println(likes(new String[]{"Max", "John", "Mark"}));
        System.out.println(likes(new String[]{"Alex", "Jacob", "Mark", "Max"}));
    }
}
