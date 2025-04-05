package Controller;

import java.util.Scanner;
import System.PhoneManagement;
import System.AuthenticPhoneManagement;
import System.HandCarriedPhoneManagement;

public class Controller {
    private Scanner sc = new Scanner(System.in);
    private PhoneManagement phoneManagement = new PhoneManagement();
    private AuthenticPhoneManagement phone1 = new AuthenticPhoneManagement();
    private HandCarriedPhoneManagement phone2 = new HandCarriedPhoneManagement();

    public void displayMenu() {
        boolean isExit = false;
        while (!isExit) {
            System.out.println("=====================================");
            System.out.println("Phone Management System");
            System.out.println("1. Display Phone List");
            System.out.println("2. Add New Phone");
            System.out.println("3. Remove Phone");
            System.out.println("4. Search Phone");
            System.out.println("0. Exit");
            System.out.println("=====================================");
            int choice;
            while (true) {
                System.out.print("Enter your choice: ");
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input!");
                }
            }
            switch (choice) {
                case 1:
                    displayPhone();
                    break;
                case 2:
                    addPhone();
                    break;
                case 3:
                    deletePhone();
                    break;
                case 4:
                    searchPhone();
                    break;
                case 0:
                    isExit = true;
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }

    private void displayPhone() {
        boolean isExit = false;
        while (!isExit) {
            System.out.println("\nDisplay Phone List");
            System.out.println("1. Display Authentic Phone List");
            System.out.println("2. Display Hand Carried Phone List");
            System.out.println("3. Display All Phone Lists");
            System.out.println("0. Exit");
            int choice;
            while (true) {
                System.out.print("Enter your choice: ");
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input!");
                }
            }
            switch (choice) {
                case 1:
                    System.out.println("\nAUTHENTIC PHONE LIST");
                    phone1.displayPhone();
                    break;
                case 2:
                    System.out.println("\nHAND CARRIED PHONE LISTS");
                    phone2.displayPhone();
                    break;
                case 3:
                    System.out.println("\nALL PHONE LISTS");
                    phone1.displayPhone();
                    phone2.displayPhone();
                    break;
                case 0:
                    isExit = true;
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }

    private void addPhone() {
        boolean isExit = false;
        while (!isExit) {
            System.out.println("\nAdd New Phone");
            System.out.println("1. Add authentic phone");
            System.out.println("2. Add hand carried phone");
            System.out.println("0. Exit");
            int choice;
            while (true) {
                System.out.print("Enter your choice: ");
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input!");
                }
            }
            switch (choice) {
                case 1:
                    System.out.println("\nADD AUTHENTIC PHONE");
                    phone1.addNewPhone();
                    break;
                case 2:
                    System.out.println("\nADD HAND CARRIED PHONE");
                    phone2.addNewPhone();
                    break;
                case 0:
                    isExit = true;
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }

    private void deletePhone() {
        boolean isExit = false;
        while (!isExit) {
            System.out.println("\nDelete Phone");
            System.out.println("1. Delete authentic phone");
            System.out.println("2. Delete hand carried phone");
            System.out.println("0. Exit");
            int choice;
            while (true) {
                System.out.print("Enter your choice: ");
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input!");
                }
            }
            switch (choice) {
                case 1:
                    System.out.println("\nDELETE AUTHENTIC PHONE");
                    phone1.deletePhone();
                    break;
                case 2:
                    System.out.println("\nDELETE HAND CARRIED PHONE");
                    phone2.deletePhone();
                    break;
                case 0:
                    isExit = true;
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }

    private void searchPhone() {
        boolean isExit = false;
        while (!isExit) {
            System.out.println("\nSearch Phone");
            System.out.println("1. Search Authentic Phone");
            System.out.println("2. Search Hand Carried Phone");
            System.out.println("0. Exit");
            int choice;
            while (true) {
                System.out.print("Enter your choice: ");
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input!");
                }
            }
            switch (choice) {
                case 1:
                    System.out.println("\nSEARCH AUTHENTIC PHONE");
                    phone1.searchPhone();
                    break;
                case 2:
                    System.out.println("\nSEARCH HAND CARRIED PHONE");
                    phone2.searchPhone();
                    break;
                case 0:
                    isExit = true;
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }
}
