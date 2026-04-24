package Assignment1;

import java.util.ArrayList;

public class DeliverySystem {
    // Aggregates restaurants — does not own them (no deep copy)
    private final Restaurant[] restaurants;

    // Array is final because there are no add/remove methods for restaurants
    DeliverySystem(Restaurant[] restaurants) {
        this.restaurants = restaurants;
    }

    // Returns all restaurants located in the given city
    ArrayList<Restaurant> find(String city) {
        ArrayList<Restaurant> matches = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getCity().equals(city)) {
                matches.add(restaurant);
            }
        }
        return matches;
    }

    // Returns a formatted listing of all restaurants and their menus
    String displayMenu() {
        StringBuilder result = new StringBuilder();
        result.append("================================\n");
        result.append("   ALL RESTAURANTS & MENUS\n");
        result.append("================================\n");
        for (Restaurant restaurant : restaurants) {
            result.append(restaurant.toString());
            result.append("\n");
        }
        return result.toString();
    }

    // Returns a formatted listing of all restaurants and their menus in the given city
    String displayByCity(String city) {
        StringBuilder result = new StringBuilder();
        result.append("================================\n");
        result.append("   RESTAURANTS IN " + city.toUpperCase() + "\n");
        result.append("================================\n");
        boolean found = false;
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getCity().equals(city)) {
                result.append(restaurant.toString());
                result.append("\n");
                found = true;
            }
        }
        if (!found) {
            result.append("  No restaurants found in " + city + ".\n");
            result.append("================================");
        }
        return result.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("================================\n");
        sb.append("   FOODPANDA DELIVERY SYSTEM\n");
        sb.append("================================\n");
        for (Restaurant restaurant : restaurants) {
            sb.append(restaurant + "\n");
        }
        sb.append("================================");
        return sb.toString();
    }
}
