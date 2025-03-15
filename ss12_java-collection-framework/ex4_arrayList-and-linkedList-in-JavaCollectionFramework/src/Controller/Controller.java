package Controller;

import java.util.Scanner;

public class Controller {
    private ProductManager productManager = new ProductManager();

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.displayMenu();
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = true;
        while (isExit) {
            System.out.println("Model.Product Management System");
            System.out.println("1. Add product");
            System.out.println("2. Display product list");
            System.out.println("3. Modify product's information");
            System.out.println("4. Exit");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Add product");
                    productManager.addProduct();
                    break;
                case 2:
                    System.out.println("Display product list");
                    productManager.DisplayProductList();
                    break;
                case 3:
                    System.out.println("Modify product's information");
                    productManager.modifyProduct();
                    break;
                default:
                    isExit = false;
                    System.out.println("Exit");
            }
        }
    }
}
