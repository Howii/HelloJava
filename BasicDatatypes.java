public class BasicDatatypes {

  public static void main(String[] args) {
    byte a = 68;
    char b = 'A';

    int decimal = 100;
    int octal = 0144;
    int hexa =  0x64;

    char c = '\u0FD5';
    String d = "\u0FD6";

    float e = 2.5f;
    double f = 3.1415926;

    System.out.println("byte: a = " + a);
    System.out.println("char: b = " + b);
    System.out.println("int: decimal = " + decimal);
    System.out.println("int: octal = " + octal);
    System.out.println("int: hexa = " + hexa);
    System.out.println("char: c = " + c);
    System.out.println("String: d = " + d);
    System.out.println("float: e = " + e);
    System.out.println("double: f = " + f);
  }
}
