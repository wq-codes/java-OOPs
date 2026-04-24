package Assignment1;

import java.util.ArrayList;

public class Order {
    private final int orderId;
    private static int counter = 1;
    private final String customerName;
    private final ArrayList<MenuItem> items;

    // Items are stored in composition — deep copied to prevent external modification
    Order(String customerName, ArrayList<MenuItem> items) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
        for (MenuItem item : items) {
            this.items.add(new MenuItem(item));
        }
        this.orderId = counter;
        counter++;
    }

    // Copy constructor — assigns a new unique order ID to the copied order
    Order(Order source) {
        this.customerName = source.customerName;
        this.items = new ArrayList<>();
        for (MenuItem item : source.items) {
            this.items.add(new MenuItem(item));
        }
        this.orderId = counter;
        counter++;
    }

    // Returns the sum of prices of all items in the order
    double getTotalPrice() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    int getOrderId() {
        return orderId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("================================\n");
        sb.append("  Order ID: " + orderId + "\n");
        sb.append("  Customer: " + customerName + "\n");
        sb.append("--------------------------------\n");
        sb.append("  ITEMS:\n");
        for (MenuItem item : items) {
            sb.append("  - " + item.getName() + " [" + item.getCategory() + "] ... Rs. " + item.getPrice() + "\n");
        }
        sb.append("--------------------------------\n");
        sb.append("  Total: Rs. " + getTotalPrice() + "\n");
        sb.append("================================");
        return sb.toString();
    }
}
