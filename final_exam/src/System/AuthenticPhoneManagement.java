package System;

import Model.AuthenticPhone;
import Model.Phone;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthenticPhoneManagement extends PhoneManagement {
    List<AuthenticPhone> authenticPhoneList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public AuthenticPhone getPhoneInfo () {
        Phone phone = super.getPhoneInfo();

        //get phone warranty period
        int period;
        while (true) {
            try {
                System.out.print("Enter Phone Warranty Period (ex: 10): ");
                period = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid!");
            }
        }

        //get phone warranty scope
        System.out.print("Enter Phone Warranty Scope (National/International): ");
        String scope = sc.nextLine().toUpperCase();
        while (!scope.equals("NATIONAL") && !scope.equals("INTERNATIONAL")) {
            System.out.print("Enter Phone Warranty Scope (National/International): ");
            scope = sc.nextLine().toUpperCase();
        }

        AuthenticPhone newPhone = new AuthenticPhone(phone.getName(), phone.getPrice(), phone.getQuantity(), phone.getProducer(), period, scope);
        return newPhone;
    }

    public void addNewPhone() {
        AuthenticPhone newPhone = getPhoneInfo();
        if (findPhone(newPhone)) {
            System.out.println("Phone already exists");
        } else {
            authenticPhoneList.add(newPhone);
            System.out.println("Phone added successfully");
            copyPhoneToFile(newPhone);
        }
    }

    public void deletePhone() {
        AuthenticPhone newPhone = getPhoneInfo();
        for (AuthenticPhone p : authenticPhoneList) {
            if (p.getName().equals(newPhone.getName())) {
                authenticPhoneList.remove(p);
                System.out.println("Phone deleted successfully");
                super.deletePhoneFromFile(newPhone);
                return;
            }
        }
        System.out.println("Phone not found");
    }

    public void displayPhone() {
        System.out.println();
        System.out.printf("%-20s | %-3s | %-10s | %-5s | %-10s | %-10s | %-20s | %-17s%n",
                "Phone", "ID", "Name", "Price", "Quantity", "Producer", "Warranty Period", "Warranty Scope");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        for (AuthenticPhone h : authenticPhoneList) {
            System.out.printf("%-20s | %-3s | %-10s | %-5s | %-10s | %-10s | %-20s | %-17s%n",
                    "Authentic Phone", h.getId(), h.getName(), h.getPrice(), h.getQuantity(), h.getProducer(), h.getWarrantyPeriod(), h.isWarrantyScope());
        }
    }

    public void searchPhone() {
        AuthenticPhone newPhone = getPhoneInfo();
        for (AuthenticPhone h : authenticPhoneList) {
            if (h.getName().equals(newPhone.getName())) {
                System.out.println();
                System.out.printf("%-20s | %-3s | %-10s | %-5s | %-10s | %-10s | %-20s | %-17s%n",
                        "Phone", "ID", "Name", "Price", "Quantity", "Producer", "Warranty Period", "Warranty Scope");
                System.out.println("------------------------------------------------------------------------------------------------------------------");
                System.out.printf("%-20s | %-3s | %-10s | %-5s | %-10s | %-10s | %-20s | %-17s%n",
                        "Authentic Phone", h.getId(), h.getName(), h.getPrice(), h.getQuantity(), h.getProducer(), h.getWarrantyPeriod(), h.isWarrantyScope());
                System.out.println("Phone found successfully");
                return;
            }
        }
        System.out.println("Phone not found");
    }

    private boolean findPhone(Phone phone) {
        for (AuthenticPhone p : authenticPhoneList) {
            if (p.getName().equals(phone.getName())) {
                return true;
            }
        }
        return false;
    }
}
