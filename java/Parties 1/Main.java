class Main {

  public static void printMessage(String message) {
    System.out.println(message);
  }

  public static void printMessage(int value) {
    System.out.println("The value is: " + value);
  }

  public static void main(String[] args) {
    printMessage("Hello!"); // Calls the first method
    printMessage(42); // Calls the second method
  }
}