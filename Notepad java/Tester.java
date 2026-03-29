package Assignment1;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {

        // Create three restaurants
        Restaurant r1 = new Restaurant("Butt Karahi", "Lahore", 4.0);
        Restaurant r2 = new Restaurant("Kolachi", "Karachi", 4.5);
        Restaurant r3 = new Restaurant("Monal", "Islamabad", 4.9);

        r1.addMenuItem(new MenuItem("Nihari", 800, "Desi"));
        r1.addMenuItem(new MenuItem("Lassi", 200, "Drinks"));

        r2.addMenuItem(new MenuItem("Grilled Fish", 1800, "Seafood"));
        r2.addMenuItem(new MenuItem("Prawn Karahi", 2500, "Seafood"));

        r3.addMenuItem(new MenuItem("BBQ Platter", 3000, "BBQ"));
        r3.addMenuItem(new MenuItem("Green Tea", 300, "Drinks"));

        Restaurant[] restaurantList = {r1, r2, r3};

        // Create the delivery system and display all restaurants
        DeliverySystem foodPanda = new DeliverySystem(restaurantList);
        System.out.println(foodPanda);

        // Place two orders
        ArrayList<MenuItem> aliItems = new ArrayList<>();
        aliItems.add(new MenuItem("Karahi", 1500, "Desi"));
        aliItems.add(new MenuItem("Lassi", 200, "Drinks"));
        Order order1 = new Order("Ali", aliItems);

        ArrayList<MenuItem> aftabItems = new ArrayList<>();
        aftabItems.add(new MenuItem("Grilled Fish", 1800, "Seafood"));
        aftabItems.add(new MenuItem("Prawn Karahi", 2500, "Seafood"));
        Order order2 = new Order("Aftab", aftabItems);

        System.out.println("\n" + order1);
        System.out.println(order2);

        // Deep copy an order — the copy gets a new unique order ID
        Order orderCopy = new Order(order1);
        System.out.println("Original order ID: " + order1.getOrderId());
        System.out.println("Copied order ID:   " + orderCopy.getOrderId());
        System.out.println(orderCopy);

        // Demonstrate MenuItem equals()
        MenuItem m1 = new MenuItem("Karahi", 1500, "Desi");
        MenuItem m2 = new MenuItem("Karahi", 1500, "Desi");
        MenuItem m3 = new MenuItem("Biryani", 500, "Desi");
        System.out.println("\nm1 equals m2: " + m1.equals(m2)); // true — same name and price
        System.out.println("m1 equals m3: " + m1.equals(m3));  // false — different item

        // Demonstrate Restaurant deep copy — adding to the copy should not affect the original
        Restaurant r3Copy = new Restaurant(r3);
        r3Copy.addMenuItem(new MenuItem("Coffee", 400, "Drinks"));
        System.out.println("\nOriginal Monal (no Coffee):");
        System.out.println(r3);
        System.out.println("Copied Monal (has Coffee):");
        System.out.println(r3Copy);

        // Find all restaurants in Lahore
        ArrayList<Restaurant> lahoreRestaurants = foodPanda.find("Lahore");
        System.out.println("Restaurants in Lahore:");
        for (Restaurant r : lahoreRestaurants) {
            System.out.println(r);
        }

        // Get seafood items from Kolachi
        ArrayList<MenuItem> seafoodItems = r2.getMenuByCategory("Seafood");
        System.out.println("\nSeafood at Kolachi:");
        for (MenuItem item : seafoodItems) {
            System.out.println(item);
        }

        // Remove Pizza from Butt Karahi and verify
        r1.removeMenuItem(new MenuItem("Pizza", 1000, "Fast Food"));
        System.out.println("\nButt Karahi after removing Pizza:");
        System.out.println(r1);

        // Display all menus, then filter by city
        System.out.println(foodPanda.displayMenu());
        System.out.println(foodPanda.displayByCity("Karachi"));
        System.out.println(foodPanda.displayByCity("Peshawar"));
    }
}
