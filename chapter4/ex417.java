import java.util.Scanner;

/**
 * ex417
 */
public class ex417 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;
        int tripCount = 0;

        while (true) {
            
            //prompt user for input miles
            System.out.println("Enter miles driven or 0 to exit: ");

            // get miles from user
            int miles = scan.nextInt();
            if (miles == 0) {
                break;
            }

            //prompt user for input gallon
            System.out.println("Enter gallons used: ");

            // get gallons from user
            int gallons = scan.nextInt();
            double mpg = miles/gallons;
            System.out.printf("Miles per gallon for trip %d: %.2f%n", ++tripCount, mpg);

            //update  total miles and gallons
            totalMiles += miles;
            totalGallons += gallons;
            mpg = totalMiles/totalGallons;
            System.out.printf("Total Miles per gallon up to trip %d: %.2f%n", tripCount, mpg); 
     }
     // close the scanner
     scan.close();
    } 
}       
