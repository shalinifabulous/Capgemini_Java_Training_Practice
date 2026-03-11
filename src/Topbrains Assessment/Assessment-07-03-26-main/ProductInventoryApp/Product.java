package ProductInventoryApp;

public class Product {

    private int id;
    private String name;
    private String category;
    private double price;
    private int quantity;
    private double rating;

    public Product(int id, String name, String category, double price, int quantity, double rating) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.rating = rating;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public double getRating() { return rating; }
}