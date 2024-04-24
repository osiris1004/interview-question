public class CreatePhoneNumber {

    public static String createPhoneNumber(int[] numbers) {
        StringBuilder phoneNumber = new StringBuilder();
        phoneNumber.append("(").append(concatenateArray(numbers, 0, 3)).append(") ")
                    .append(concatenateArray(numbers, 3, 6)).append("-")
                    .append(concatenateArray(numbers, 6, 10));
        return phoneNumber.toString();
    }
    
    private static String concatenateArray(int[] array, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(array[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        System.out.println(createPhoneNumber(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
    
}
