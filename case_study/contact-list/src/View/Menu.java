package View;

import java.util.Scanner;
import System.ContactListManager;

public class Menu {
    private ContactListManager contactListManager = new ContactListManager();
    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            System.out.println("\nContact Management Program");
            System.out.println("1. Display contacts");
            System.out.println("2. Add contact");
            System.out.println("3. Delete contact");
            System.out.println("4. Update contact");
            System.out.println("5. Search contact");
            System.out.println("6. Save contact from file");
            System.out.println("7. Copy contact to file");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1. Display Contacts");
                    contactListManager.displayContactList();
                    break;
                case 2:
                    System.out.println("2. Add contact");
                    contactListManager.addContact();
                    break;
                case 3:
                    System.out.println("3. Delete contact");
                    contactListManager.deleteContact();
                    break;
                case 4:
                    System.out.println("4. Update contact");
                    contactListManager.updateContact();
                    break;
                case 5:
                    System.out.println("5. Search contact");
                    contactListManager.findContact();
                    break;
                case 6:
                    System.out.println("6. Save contact from file");
                    contactListManager.saveContactFromFile();
                    break;
                case 7:
                    System.out.println("7. Copy contact to file");
                    contactListManager.copyContactToFile();
                    break;
                case 0:
                    isExit = true;
                    System.out.println("Exit Program");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}