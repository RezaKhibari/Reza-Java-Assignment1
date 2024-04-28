import java.util.Scanner;

/**
 * ex216
 */
public class ex216 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int num1 = scan.nextInt();

        System.out.println("Enter the scond integer: ");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is larger");
        } else if (num2 > num1) {
            System.out.println(num2 + " is larger");
        } else {
            System.out.println("These are equal");
        }
        scan.close();
    }
}