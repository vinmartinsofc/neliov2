package Oop.entities;

public class Product {
   private String name;
   private double price;
   private int quantity;


    public Product(String name, double price,int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;

    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Name " + name + "\n" +
                "Price $" + price + "\n" +
                "Quantity: " + quantity + "\n" +
                "Total In Stock: " + totalValueInStock();
    }
}
