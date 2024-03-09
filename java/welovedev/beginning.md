## 1:what does this code does
```
class Test {
    String var = "we";
    public static void main(String[] args) {
    String var2 = "lovedev";
    System.out.println(var + var2);
    
    }
}

``` 
it will throw an error

## 2:
## 3:
## 4:
## 5:
## 6:
## 7:
## 8:
In summary, while enum constants are implicitly static and final, you have flexibility in defining private or public fields/methods, using static elements, and controlling instantiation through private constructors. Enum types are a powerful feature in Java for representing a fixed set of values.
## 9:

## 10:
## 12:what is the use of assertEquals
It is use to check whether the actual value matches the expected value. 
```
public class ExampleTest {
    @Test
    public void testAddition() {
        int result = Calculator.add(2, 3);
        int expected = 5;
        assertEquals(expected, result);
    }
}
```
## 13:All test annotation use in test junit
### @Test
Indicates that the annotated method is a test method.
```
@Test
public void myTestMethod() {
    // Test logic here
}
```
### @Before
Executed before each test method. Used for setup activities.
```
@Before
public void setUp() {
    // Setup logic here
}
```
### @After
Executed after each test method. Used for cleanup activities.
```
@After
public void tearDown() {
    // Cleanup logic here
}
```
### @BeforeClass
Executed once before any test methods in the test class. Used for expensive setup activities.
```
@BeforeClass
public static void setUpClass() {
    // One-time setup logic here
}
```
### @AfterClass
Executed once after all test methods in the test class. Used for cleanup activities.
```
@AfterClass
public static void tearDownClass() {
    // One-time cleanup logic here
}
```
### @Ignore
Indicates that the annotated test method should be ignored.
```
@Ignore
@Test
public void ignoredTest() {
    // This test will be ignored
}
```
### @RunWith
Specifies a test runner class. Allows customization of the test class execution.
```
@RunWith(Parameterized.class)
public class MyParameterizedTest {
    // Parameterized test logic here
}
```
### @Parameters
Provides parameters to be used by parameterized tests.
```
@Parameters
public static Collection<Object[]> data() {
    // Parameter values here
}
```
## 14:
```
public static void main(String[] args) {
        Integer[] tab = new Integer[3];
        tab[0] = 2;
        tab[1] = 5;
        tab[2] = 8;
        System.out.println(Arrays.toString(tab));
    }
```
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

## 27:all primitive types do  inherit directly from the Object class.
yes
## 28:
## 29:

## 30: what is the file extention  when a java programe is compile
.class
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