public class InvoiceItem {
    private String id;
    private String description;
    private int quantity;
    private double unitPrice;

    // Constructors
    public InvoiceItem(String id, String description, int quantity, double unitPrice) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    // Setter methods
    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Method to calculate the total price of the invoice item
    public double getTotal() {
        return quantity * unitPrice;
    }

    public static void main(String[] args) {
        // Test the InvoiceItem class
        InvoiceItem item = new InvoiceItem("001", "Keyboard", 2, 25.0);
        System.out.println("Item ID: " + item.getId());
        System.out.println("Description: " + item.getDescription());
        System.out.println("Quantity: " + item.getQuantity());
        System.out.println("Unit Price: $" + item.getUnitPrice());
        System.out.println("Total: $" + item.getTotal());
    }
}
