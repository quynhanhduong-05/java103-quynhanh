package Service;

import java.util.ArrayList;
import java.util.Scanner;
import Controller.ProductManager;
import Model.Product;

public class Customer {
    private Scanner scanner = new Scanner(System.in);
    private int totalCost = 0;
    private ArrayList<Product> productsInCart = new ArrayList<Product>();

    public void DisplayCart() {
        System.out.println("========================================");
        for (int i = 0; i < productsInCart.size(); i++) {
            if (productsInCart.get(i) == null) {
                break;
            }
            System.out.println(productsInCart.get(i).toString());
        }
        System.out.println("Total Payment: " + totalCost);
    }

    public void addProduct() {
        System.out.print("Please enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter product ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean found = false;

        for (Product product : ProductManager.productList) {
            if (product.getName().equals(name) && product.getID() == id) {
                productsInCart.add(product);
                totalCost += product.getPrice();
                System.out.println("Model.Product added successfully");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Model.Product not found");
        }
    }

    public void removeProduct() {
        System.out.print("Please enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter product ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean found = false;

        for (Product product : productsInCart) {
            if (product.getName().equals(name) && product.getID() == id) {
                productsInCart.remove(product);
                totalCost -= product.getPrice();
                System.out.println("Model.Product removed successfully");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Model.Product not found");
        }
    }
}
