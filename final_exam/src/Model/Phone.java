package Model;

public class Phone {
    private static int nextId = 1;
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String producer;

    public Phone() {}

    public Phone(String name, double price, int quantity, String producer) {
        this.id = nextId++;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.producer = producer;

        if (id >= nextId) {
            nextId++;
        }
    }

    public int getId() {
        return id;
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

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return getId() + "," +  getName() + "," + getPrice() + "," + getQuantity() + "," + getProducer() + ",";
    }
}
