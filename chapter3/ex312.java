/**
 * ex312
 */
public class ex312 {
    public static void main(String[] args) {
        Invoice samplInvoice1 = new Invoice("1001", "knife", 15, 7.99);
        Invoice samplInvoice2 = new Invoice("1002", "tape", 75, 4.98);

        // Display invoice details 
        System.out.println("Part Number: " + samplInvoice1.getPartNumber());
        System.out.println("Part Description: " + samplInvoice1.getPartDescription());
        System.out.println("Quantity: " + samplInvoice1.getQuantity());
        System.out.println("Price Per Item: " + samplInvoice1.getPricePerItem());
        System.out.println("Invoice Amount: " + samplInvoice1.getInvoiceAmount());
        System.out.println();

        System.out.println("Part Number: " + samplInvoice2.getPartNumber());
        System.out.println("Part Description: " + samplInvoice2.getPartDescription());
        System.out.println("Quantity: " + samplInvoice2.getQuantity());
        System.out.println("Price Per Item: " + samplInvoice2.getPricePerItem());
        System.out.println("Invoice Amount: " + samplInvoice2.getInvoiceAmount());
        System.out.println();


    }

}