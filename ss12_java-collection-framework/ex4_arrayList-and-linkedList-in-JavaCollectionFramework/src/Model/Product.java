package Model;

public class Product {
    private String name;
    private int ID;
    private double price;

    public Product(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public Product(String name, int ID, double price) {
        this.name = name;
        this.ID = ID;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Model.Product: " + name + " " + ID + " " + price;
    }
}
