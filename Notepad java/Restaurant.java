package Assignment1;

import java.util.ArrayList;

public class Restaurant {
    private ArrayList<MenuItem> menu;  // composed — Restaurant owns its menu
    private String name;
    private String city;
    public double rating;

    Restaurant(String name, String city, double rating) {
        menu = new ArrayList<>();

        // Default menu items added to every restaurant
        menu.add(new MenuItem("Karahi", 1500, "Desi"));
        menu.add(new MenuItem("Biryani", 500, "Desi"));
        menu.add(new MenuItem("Pizza", 1000, "Fast Food"));

        this.name = name;
        this.city = city;
        this.rating = rating;
    }

    // Copy constructor — deep copies the menu so changes to the copy don't affect the original
    Restaurant(Restaurant source) {
        this.name = source.name;
        this.city = source.city;
        this.rating = source.rating;
        menu = new ArrayList<>();
        for (MenuItem item : source.menu) {
            this.menu.add(new MenuItem(item));
        }
    }

    // Setters for name and city (the menu is modified via addMenuItem / removeMenuItem only)
    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    // Returns a deep copy of the menu to protect the internal list from external changes
    public ArrayList<MenuItem> getMenu() {
        ArrayList<MenuItem> menuCopy = new ArrayList<>();
        for (MenuItem item : menu) {
            menuCopy.add(new MenuItem(item));
        }
        return menuCopy;
    }

    void addMenuItem(MenuItem item) {
        menu.add(new MenuItem(item));
    }

    // Uses MenuItem's equals() to locate and remove the matching item
    void removeMenuItem(MenuItem item) {
        menu.remove(item);
    }

    // Returns all menu items belonging to the specified category
    ArrayList<MenuItem> getMenuByCategory(String category) {
        ArrayList<MenuItem> result = new ArrayList<>();
        for (MenuItem item : menu) {
            if (item.getCategory().equals(category)) {
                result.add(new MenuItem(item));
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("================================\n");
        sb.append("  " + name + " (" + city + ")\n");
        sb.append("  Rating: " + rating + "/5\n");
        sb.append("--------------------------------\n");
        sb.append("  MENU:\n");
        for (MenuItem item : menu) {
            sb.append("  - " + item.getName() + " [" + item.getCategory() + "] ... Rs. " + item.getPrice() + "\n");
        }
        sb.append("================================");
        return sb.toString();
    }
}
