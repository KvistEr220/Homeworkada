package week03.invoice;

public class InvoiceTest {
    public static void main(String[] args) {
      
        Invoice invoice = new Invoice("001", "Hammer", 3, 12.99);

        // Display initial details
        System.out.println("Initial Invoice Details:");
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());

 
        invoice.setQuantity(5);
        invoice.setPricePerItem(14.99);

      
        System.out.println("\nUpdated Invoice Details:");
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
    }
}
