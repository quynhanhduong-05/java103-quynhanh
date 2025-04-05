package System;

import Model.HandCarriedPhone;
import Model.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HandCarriedPhoneManagement extends PhoneManagement {
    List<HandCarriedPhone> handCarriedPhoneList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public HandCarriedPhone getPhoneInfo () {
        Phone phone = super.getPhoneInfo();

        //get phone country
        System.out.print("Enter Phone Country (ex: USA) excepting Vietnam: ");
        String country = sc.nextLine().toUpperCase();
        while (country.equals("VIETNAM")) {
            System.out.print("Enter Phone Country (ex: USA) excepting Vietnam: ");
            country = sc.nextLine().toUpperCase();
        }

        //get phone status
        System.out.print("Enter Phone Status (Fixed/Not fixed): ");
        String status = sc.nextLine().toUpperCase();
        while (!status.equals("FIXED") && !status.equals("NOT FIXED")) {
            System.out.print("Enter Phone Status (Fixed/Not fixed): ");
            status = sc.nextLine().toUpperCase();
        }

        HandCarriedPhone newPhone = new HandCarriedPhone(phone.getName(), phone.getPrice(), phone.getQuantity(), phone.getProducer(), country, status);
        return newPhone;
    }

    public void addNewPhone() {
        HandCarriedPhone newPhone = getPhoneInfo();
        if (findPhone(newPhone)) {
            System.out.println("Phone already exists");
        } else {
            handCarriedPhoneList.add(newPhone);
            System.out.println("Phone added successfully");
            copyPhoneToFile(newPhone);
        }
    }

    public void deletePhone() {
        HandCarriedPhone newPhone = getPhoneInfo();
        for (HandCarriedPhone p : handCarriedPhoneList) {
            if (p.getId() == newPhone.getId() && p.getName().equals(newPhone.getName())) {
                handCarriedPhoneList.remove(p);
                System.out.println("Phone deleted successfully");
                return;
            }
        }
        System.out.println("Phone not found");
    }

    public void displayPhone() {
        System.out.println();
        System.out.printf("%-20s | %-3s | %-10s | %-5s | %-10s | %-10s | %-10s | %-8s%n",
                "Phone", "ID", "Name", "Price", "Quantity", "Producer", "Country", "Status");
        System.out.println("--------------------------------------------------------------------------------------------------");
        for (HandCarriedPhone h : handCarriedPhoneList) {
            System.out.printf("%-20s | %-3s | %-10s | %-5s | %-10s | %-10s | %-10s | %-8s%n",
                    "Hand Carried Phone", h.getId(), h.getName(), h.getPrice(), h.getQuantity(), h.getProducer(), h.getCountry(), h.getStatus());
        }
    }

    public void searchPhone() {
        HandCarriedPhone newPhone = getPhoneInfo();
        for (HandCarriedPhone h : handCarriedPhoneList) {
            if (h.getName().equals(newPhone.getName())) {
                System.out.printf("%-20s | %-3s | %-10s | %-5s | %-10s | %-10s | %-10 | %-8s%n",
                        "Phone", "ID", "Name", "Price", "Quantity", "Producer", "Country", "Status");
                System.out.println("--------------------------------------------------------------------------------------------------");
                System.out.printf("%-20s | %-3s | %-10s | %-5s | %-10s | %-10s | %-10 | %-8s%n",
                        "Hand Carried Phone", h.getId(), h.getName(), h.getPrice(), h.getQuantity(), h.getProducer(), h.getCountry(), h.getStatus());
                System.out.println("Phone found successfully");
                return;
            }
        }
        System.out.println("Phone not found");
    }

    private boolean findPhone(Phone phone) {
        for (HandCarriedPhone p : handCarriedPhoneList) {
            if (p.getName().equals(phone.getName())) {
                return true;
            }
        }
        return false;
    }
}
