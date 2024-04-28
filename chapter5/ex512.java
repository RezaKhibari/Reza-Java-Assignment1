/**
 * ex512
 */
public class ex512 {

    public static void main(String[] args) {
        int product = 1;

        // Iterate through odd integers from 1 to 15
        for (int i = 1; i <= 15; i += 2) {
            product *= i; // Multiply the current integer with the product
        }

        // Display the product
        System.out.println("Product of odd integers from 1 to 15: " + product);
    } 
    }