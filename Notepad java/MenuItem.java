package Assignment1;

public class MenuItem {
    private String name;
    private double price;
    private String category;

    MenuItem(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Copy constructor — creates an independent deep copy of the given MenuItem
    MenuItem(MenuItem source) {
        this.name = source.name;
        this.price = source.price;
        this.category = source.category;
    }


    // Setters
    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    // Getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    // Two MenuItems are equal if they share the same name and price
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        MenuItem other = (MenuItem) obj;

        return this.name.equals(other.name) &&
                this.price == other.price;
    }

    @Override
    public String toString() {
        return "  - " + name + " [" + category + "] ... Rs. " + price;
    }
}
