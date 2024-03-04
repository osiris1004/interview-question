




## 1:The difference between char[], StringTokenizer, byte[], StringBuilder in simple term
### char[]** is used for storing characters not a string of characters.
```
char[] charArray = {'H', 'e', 'l', 'l', 'o'};
// Convert charArray to String
String helloString = new String(charArray);
System.out.println(helloString);  // Output: Hello
```
### StringTokenizer** is used for breaking a string into tokens based on a delimiter.
```
String inputString = "apple,orange,banana";
StringTokenizer tokenizer = new StringTokenizer(inputString, ",");

while (tokenizer.hasMoreTokens()) {
    String token = tokenizer.nextToken();
    System.out.println(token);
}
// Output:
// apple
// orange
// banana
```
### byte[]** is used for representing binary data.
```
byte[] binaryData = {65, 66, 67};  // ASCII values for 'A', 'B', 'C'
String result = new String(binaryData);
System.out.println(result);  // Output: ABC
```
### StringBuilder** is mutable sequence of characters used for efficient string manipulation.
```
StringBuilder stringBuilder = new StringBuilder("Hello");
stringBuilder.append(" ").append("World");
String resultString = stringBuilder.toString();
System.out.println(resultString);  // Output: Hello World
```
## 2:which design pattern enable to treat tree element without abourdering about the course
The design pattern you are referring to is likely the "Visitor Pattern." The Visitor Pattern is a behavioral design pattern that allows you to define a new operation without changing the classes of the elements on which it operates. 
## 3:
```
 private static Integer[] myCompute(int a){
        int i = 0;
        Integer[] result =  new Integer[2];
        result[i++] = new Integer(a);
        result[i] = new Integer(-a);
        result[1 - i] = result[i];
        return result;

    }

    public static void main(String[] args) {
        Integer[] call = myCompute(3);
        System.out.println(call);
    }
```
## 4:What will be the result 
```
        String s1 = "s1";
        var s2 = "s2";  // var let the compiler to infer  the type
        val s3 = "s3";
        s3 = "s4";
```
## 5:What is a monitor
- a monitor is a synchronization mechanism provided by java to control access to shared resources and ensure thread safety. 
- Java monitors are used to synchronize access to shared data, preventing multiple threads from concurrently modifying the same resource.

## 6: A java class need to be compile before it si executed

## 7:The difference between InputStream and InputStreamReader
### InputStream
- It is used for reading raw binary data (byte), such as images or files.
```
InputStream inputStream = new FileInputStream("example.txt");
int byteData = inputStream.read(); // Reads a byte
```
### InputStreamReader:
- It is use to converts bytes(a text file) from an InputStream into characters.
```
InputStream inputStream = new FileInputStream("example.txt");
InputStreamReader reader = new InputStreamReader(inputStream, "UTF-8");
int charData = reader.read(); // Reads a character
```
## 8: java is a compile, typed and imperative language
imperative programming is a programming paradigm that uses statements that change a program state

## 9: what is the use of thread in java
- It is use to executing concurrent or parallel tasks
```
class DownloadThread extends Thread {
    private String fileName;

    public DownloadThread(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println("Downloading " + fileName + " started by Thread " + Thread.currentThread().getId());
        
        // Simulating file download
        try {
            Thread.sleep(3000); // Simulating download time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Downloading " + fileName + " completed by Thread " + Thread.currentThread().getId());
    }
}

public class DownloadManager {
    public static void main(String[] args) {
        // Create and start multiple threads for downloading files
        Thread thread1 = new DownloadThread("file1.txt");
        Thread thread2 = new DownloadThread("file2.txt");

        thread1.start();
        thread2.start();

        // Wait for both threads to finish before proceeding
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All downloads completed!");
    }
}

```
## 10:
## 12:
## 13:
## 14:
## 15:
## 16:
## 17:
## 18:
## 19:

## 20:
## 21:
## 22:
## 23:
## 24:
## 25:
## 26:
## 27:
## 28:
## 29:

## 30:
## 31:
## 32:
## 33:
## 34:
## 35:
## 36:
## 37:
## 38:
## 39:
## 30:

## 40:
## 41:
## 42:
## 43:
## 44:
## 45:
## 46:
## 47:
## 48:
## 49:
## 40: