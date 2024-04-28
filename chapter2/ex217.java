import java.util.Scanner;

/**
 * ex217
 */
public class ex217 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // get 3 numbers 
        System.out.print("Enter the first integer: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the scond integer: ");
        int num2 = scan.nextInt();
        System.out.print("Enter the third integer: ");
        int num3 = scan.nextInt();

        // sum of 3 numbers
        int total = num1 + num2 + num3;
        System.out.println("Sum: " + total);

        // Average of 3 numbers
        int Average = (num1 + num2 + num3) / 3;
        System.out.println("Average: " + Average);

        // Product of 3 numbers
        int Product = (num1 * num2 * num3);
        System.out.println("Product: " + Product);

        // Smallest of 3 numbers
        int Smallest = 0;
        if (num1 < num2) {
            Smallest = num1;   
        } else {
            Smallest = num2;
        }
        if (num3 < Smallest) {
            Smallest = num3;
        }
        System.out.println("The smallest number is : " + Smallest);

        // Largest of 3 numbers
        int Largest = 0;
        if (num1 > num2) {
            Largest = num1;   
        } else {
            Largest = num2;
        }
        if (num3 > Largest) {
            Largest = num3;
        }
        System.out.println("The Largest number is : " + Largest);

        scan.close();
    }
}