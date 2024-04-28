import java.util.Scanner;

/**
 * ex418
 */
public class ex418 {
// Define customer properties
    static int accNo;
    static int balanceAtBegin;
    static int creditUsed;
    static int credits;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        do {
            // Input customer details
            System.out.println("Enter account number or enter 0 to exit: ");
            accNo = scan.nextInt();
            if (accNo == 0) {
                break;
            }

            System.out.println("Enter balance at the beginning of the month: ");
            balanceAtBegin = scan.nextInt();

            System.out.println("Enter total of all credits applied this month: ");
            creditUsed = scan.nextInt();

            System.out.println("Enter allowed credit limit: ");
            credits = scan.nextInt();

            // Calculate new balance
            int newBalance = credits + balanceAtBegin - creditUsed;

            // Display new balance
            System.out.println("New balance : " + newBalance);

            if (newBalance < credits) {
                System.out.println("Credit limit excded"); 
            }

        } while (true);
        scan.close();
    }
}