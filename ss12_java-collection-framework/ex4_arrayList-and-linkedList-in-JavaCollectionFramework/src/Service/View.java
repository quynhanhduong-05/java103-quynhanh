package Service;

import java.util.Scanner;
import Controller.ProductManager;

public class View {
    private Customer customer = new Customer();
    public static void main(String[] args) {
        View view = new View();
        view.displayMenu();
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        boolean isExit = true;
        while (isExit) {
            System.out.println("Please choose an option");
            System.out.println("1. Add product");
            System.out.println("2. Display cart list");
            System.out.println("3. Remove");
            System.out.println("4. Display product list");
            System.out.println("5. Exit");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Add product");
                    customer.addProduct();
                    break;
                case 2:
                    System.out.println("Display cart list");
                    customer.DisplayCart();
                    break;
                case 3:
                    System.out.println("Remove product");
                    customer.removeProduct();
                    break;
                case 4:
                    System.out.println("Display product list");
                    productManager.DisplayProductList();
                    break;
                default:
                    isExit = false;
                    System.out.println("Exit");
            }
        }
    }
}