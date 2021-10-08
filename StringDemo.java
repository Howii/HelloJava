public class StringDemo {

  public static void main(String[] args) {
    // create a string
    String greeting = "Hello world!";

    // string from array of characters
    char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
    String helloString = new String(helloArray);
    System.out.println(helloString);

    // string length
    String palindrome = "Dot saw I was Tod";
    int len = palindrome.length();
    System.out.println("String Length is : " + len);

    // string concatenation
    System.out.println("My name is ".concat("Phil"));
    String string1 = " saw I was ";
    System.out.println("Dot" + string1 + "Tod");

    // string formatting
    float floatVar = 2.5f;
    int intVar = 42;
    String stringVar = "Snowboarding";
    System.out.printf("The value of the float variable is " +
                      "%.2f, while the value of the integer " +
                      "variable is %d, and the string " +
                      "is %s", floatVar, intVar, stringVar);

    String fs;
    fs = String.format("The value of the float variable is " +
                       "%.2f, while the value of the integer " +
                       "variable is %d, and the string " +
                       "is %s", floatVar, intVar, stringVar);
    System.out.println(fs);
  }
}
