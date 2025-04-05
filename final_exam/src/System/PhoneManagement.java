package System;

import Model.Phone;

import java.io.*;
import java.util.*;

public class PhoneManagement {
    private Scanner sc = new Scanner(System.in);

    public void displayPhone() {
        (new AuthenticPhoneManagement()).displayPhone();
        (new HandCarriedPhoneManagement()).displayPhone();
    }

    public Phone getPhoneInfo() {
        //get name
        System.out.print("Enter Phone Name (ex: iPhone): ");
        String name = sc.nextLine().toUpperCase();

        //get price
        double price;
        while (true) {
            try {
                System.out.print("Enter Phone Price (ex: 30): ");
                price = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid!");
            }
        }

        //get quantity
        int quantity;
        while (true) {
            try {
                System.out.print("Enter Phone Quantity (ex: 20): ");
                quantity = Integer.parseInt(sc.nextLine());
                break;
            }  catch (NumberFormatException e) {
                System.out.println("Invalid!");
            }
        }

        //get producer
        System.out.print("Enter Phone Producer (ex: Apple): ");
        String producer = sc.nextLine().toUpperCase();

        Phone newPhone = new Phone(name, price, quantity, producer);
        return newPhone;
    }

    public void copyPhoneToFile(Phone phone) {
        String path = "/Users/clouq4d/Workspace/Java/final_exam/src/Data/phone.csv";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
            bw.write(phone.toString());
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<String>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }
}