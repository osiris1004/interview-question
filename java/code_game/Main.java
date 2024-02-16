package code_game;

class Main {
    public static void main(String[] args) {
        String name = "James gosling";
        // ! I want to change the 'g' to a 'G'.
        // ! Will this work at compile time? name.charAt(6) = 'G';
        // * name.charAt(6) = 'G' will throw an error because string is immutable
        name.charAt(6);
        // ! Print with the standard system println to see “James Gosling”
        // System.out.println(name);
        System.out.println(name.charAt(6));
    }
}

class Main2 {
    public static void main(String[] args) {
        // !This program received 2 arguments. We want to
        // ! determine if those two strings are equal.
        // ! Compare the first argument to the second argument boolean compareResult =
        //! (XXX); if (compareResult) { System.out.println("The Strings are the same.");
        //! } else { System.out.println("The Strings are not the same."); }
        if (compareResult) {
            System.out.println("The Strings are the same.");
        } else {
            System.out.println("The Strings are not the same.");
        }
        // ! Print the main string args System.out.println(args[0]);
        // System.out.println(args[1]);
    }
}
