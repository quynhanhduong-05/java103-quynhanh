package Controller;

import Model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    private Scanner scanner = new Scanner(System.in);
    public static ArrayList<Product> productList = new ArrayList<Product>(100);
    static {
        productList.add(new Product("A", 1, 100));
        productList.add(new Product("B", 2, 200));
        productList.add(new Product("C", 3, 50));
        productList.add(new Product("D", 4, 1000));
        productList.add(new Product("E", 5, 300));
        productList.add(new Product("F", 6, 150));
        productList.add(new Product("G", 7, 175));
        productList.add(new Product("H", 8, 315));
        productList.add(new Product("I", 9, 895));
    }

    public void DisplayProductList() {
        System.out.println("========================================");
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            System.out.println(product.toString());
        }
        System.out.println("========================================");
    }

    public void addProduct() {
        System.out.print("Please enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter product ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Please enter product price: ");
        double price = Double.parseDouble(scanner.nextLine());

        Product product = new Product(name, id, price);
        productList.add(product);
    }

    public void modifyProduct() {
        System.out.print("Please enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter product ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean found = false;

        for (Product product : productList) {
            if (product.getName().equals(name) && product.getID() == id) {
                System.out.print("Please enter new product name: ");
                String newName = scanner.nextLine();
                System.out.print("Please enter new product ID: ");
                int newID = Integer.parseInt(scanner.nextLine());
                System.out.print("Please enter new product price: ");
                double newPrice = Double.parseDouble(scanner.nextLine());

                product.setName(newName);
                product.setID(newID);
                product.setPrice(newPrice);
                System.out.println("Model.Product updated successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Model.Product not found!");
        }

    }

    public void removeProduct() {
        System.out.print("Please enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter product ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        productList.remove(id-1);
        System.out.println("Model.Product removed successfully!");
    }
}
