/**
 * ex513
 */
public class ex513 {

    public static void main(String[] args) {
        System.out.println("Factorials from 1 to 20:");

        // Calculate and display factorials from 1 to 20
        for (int i = 1; i <= 20; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
    
            System.out.printf("%d\t%,d%n", i, factorial);
        }
    }

 }