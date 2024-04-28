import java.util.Scanner;

/**
 * ex511
 */
public class ex511 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      // Prompt user for the number of integers
      System.out.print("Enter the number of integers: ");
      int numIntegers = scan.nextInt();

      // Prompt user for the first integer
      System.out.print("Enter the first integer: ");
      int smallest = scan.nextInt();

      // Read and compare remaining integers
      for (int i = 2; i <= numIntegers; i++) {
          System.out.print("Enter integer " + i + ": ");
          int currentInteger = scan.nextInt();
          if (currentInteger < smallest) {
              smallest = currentInteger;
          }
      }

      // Display the smallest integer
      System.out.println("The smallest integer is: " + smallest);

      // Close the scan
      scan.close();   
    }
}