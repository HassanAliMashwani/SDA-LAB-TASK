import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private String productName;
    private int quantity;
    private double unitPrice;

    // Constructor is made private to ensure OrderItem creation only happens within Order
    OrderItem(String productName, int quantity, double unitPrice) { 
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    // Getters (no setters provided to make it immutable after creation)
    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    // Method to calculate the total price of the order item
    public double getTotalPrice() {
        return quantity * unitPrice;
    }
}

class Order {
    private int orderId;
    private List<OrderItem> items = new ArrayList<>();

    public Order(int orderId) {
        this.orderId = orderId;
    }

    // Method to add an item to the order, creating the OrderItem instance
    public void addItem(String productName, int quantity, double unitPrice) {
        OrderItem newItem = new OrderItem(productName, quantity, unitPrice);
        items.add(newItem);
    }

    // Other order-related methods (e.g., calculateTotal(), getItems(), etc.)
    public List<OrderItem> getItems() {
        return items;
    }

    public double calculateTotal() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }
}

class Customer {
    private String customerId;
    // Other customer-related attributes

    public Customer(String customerId) {
        this.customerId = customerId;
    }

    // Customer can create an order
    public Order placeOrder(int orderId) {
        return new Order(orderId);
    }

    // Other customer-related methods
}

 class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("C001");

        Order order = customer.placeOrder(12345); 

        order.addItem("Laptop", 1, 1200.00); 
        order.addItem("Mouse", 2, 25.00);

        System.out.println("Order Summary:");
        for (OrderItem item : order.getItems()) {
            System.out.println(" - " + item.getProductName() + " x " + item.getQuantity() + 
                               " - $" + item.getTotalPrice());
        }
        System.out.println("Total Order Amount: $" + order.calculateTotal());
    }
}