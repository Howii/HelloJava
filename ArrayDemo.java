public class ArrayDemo {

  static void printArray(double[] array) {
    if (array.length == 0) return;

    System.out.print(array[0]);
    for (int i = 1; i < array.length; i++) {
      System.out.print(", " + array[i]);
    }
    System.out.print("\n");
  }

  static double sumArray(double[] array) {
    double total = 0;
    for (int i = 0; i < array.length; i++) {
      total += array[i];
    }
    return total;
  }

  static double maxArray(double[] array) {
    double max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) max = array[i];
    }
    return max;
  }

  static double[] reverseArray(double[] array) {
    double[] result = new double[array.length];
    for (int i = 0, j = result.length - 1; i < array.length; i++, j--) {
      result[j] = array[i];
    }
    return result;
  }

  public static void main(String[] args) {
    double[] myList = {1.9, 2.9, 3.4, 3.5, 6.9};

    // Print all the array elements
    printArray(myList);

    // Summing all elements
    double total = sumArray(myList);
    System.out.println("Total is " + total);

    // Finding the largest element
    double max = maxArray(myList);
    System.out.println("Max is " + max);

    // reverse an array
    double[] rev = reverseArray(myList);
    printArray(rev);

    // foreach loop
    System.out.println("print with foreach");
    for (double element : myList) {
      System.out.print(element + ", ");
    }
    System.out.print("\n");
  }
}
