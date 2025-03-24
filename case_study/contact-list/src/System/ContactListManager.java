package System;

import Model.Contact;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.io.*;

public class ContactListManager implements ContactListFunction {
    private InputHandling inputHandling = new InputHandling();
    private Scanner sc = new Scanner(System.in);
    public Map<Character, Map<String, LinkedHashSet<Contact>> > contactList = new TreeMap<Character, Map<String, LinkedHashSet<Contact>> >();
    public static LinkedHashSet<String> contactSet = new LinkedHashSet<String>(100);
    public static LinkedHashSet<String> emailSet = new LinkedHashSet<String>(100);

    @Override
    public void displayContactList() {
        System.out.println("========================================");
        for (Map.Entry<Character, Map<String, LinkedHashSet<Contact>>> entry : contactList.entrySet()) {
            Character key = entry.getKey();
            Map<String, LinkedHashSet<Contact>> value = entry.getValue();
            System.out.println();
            System.out.println(key);
            for (Map.Entry<String, LinkedHashSet<Contact>> subEntry : value.entrySet()) {
                LinkedHashSet<Contact> subContact = subEntry.getValue();
                for (Contact contact : subContact) {
                    System.out.println(contact.toString());
                }
            }
        }
        System.out.println("========================================");
    }

    @Override
    public boolean addContact() {
        System.out.println("Please fill in the blank below: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("DOB: ");
        String DOB = sc.nextLine();
        DOB = inputHandling.DOBHandler(DOB);
        while (!inputHandling.checkValidDOB(DOB)) {
            System.out.print("Invalid! DOB: ");
            DOB = sc.nextLine();
            DOB = inputHandling.DOBHandler(DOB);
        }

        System.out.print("Gender: ");
        String gender = sc.nextLine();
        while (!inputHandling.genderHandler(gender)) {
            System.out.print("Invalid! Gender: ");
            gender = sc.nextLine();
        }

        System.out.print("Email: ");
        String email = sc.nextLine();
        while (!inputHandling.emailHandler(email)) {
            System.out.print("Invalid! Email: ");
            email = sc.nextLine();
        }

        System.out.print("Phone Numnber: ");
        String phoneNumber = sc.nextLine();
        while (!inputHandling.phoneHandler(phoneNumber)) {
            System.out.print("Invalid! Phone: ");
            phoneNumber = sc.nextLine();
        }

        System.out.print("Address: ");
        String address = sc.nextLine();

        if (contactSet.contains(phoneNumber)) {
            System.out.println("Phone number already exists");
            return false;
        }

        if (emailSet.contains(email)) {
            System.out.println("Email already exists");
            return false;
        }

        contactSet.add(phoneNumber);
        emailSet.add(email);

        Contact contact = new Contact(phoneNumber, name, gender, address, email, DOB);
        putIntoList(contact, name);
        return true;
    }

    public void putIntoList(Contact contact, String name) {
        Map<String, LinkedHashSet<Contact>> value = contactList.get(name.toUpperCase().charAt(0));
        if (value == null) {
            LinkedHashSet<Contact> newContact =  new LinkedHashSet<>();
            newContact.add(contact);
            Map<String, LinkedHashSet<Contact>> newValue = new LinkedHashMap<>();
            newValue.put(name, newContact);
            contactList.put(name.toUpperCase().charAt(0), newValue);
            System.out.println("Contact added successfully");
            return;
        }
        LinkedHashSet<Contact> subContact = value.get(name);
        if (subContact == null) {
            LinkedHashSet<Contact> newSubContact =  new LinkedHashSet<>();
            newSubContact.add(contact);
            value.put(name, newSubContact);
            contactList.put(name.toUpperCase().charAt(0), value);
            System.out.println("Contact added successfully");
            return;
        }
        subContact.add(contact);
        value.put(name, subContact);
        contactList.put(name.toUpperCase().charAt(0), value);
        System.out.println("Contact added successfully");
    }

    @Override
    public boolean deleteContact() {
        boolean found = false;
        System.out.print("Delete contact: ");
        String name = sc.nextLine();
        Map<String, LinkedHashSet<Contact>> value = contactList.get(name.toUpperCase().charAt(0));
        if (value == null) {
            System.out.println("Contact not found");
            return false;
        }
        for (Map.Entry<String, LinkedHashSet<Contact>> entry : value.entrySet()) {
            String key = entry.getKey();
            if (key.toLowerCase().contains(name.toLowerCase())) {
                LinkedHashSet<Contact> subContact = entry.getValue();
                for (Contact contact : subContact) {
                    found = true;
                    System.out.println(contact.toString());
                }
            }
        }
        if (!found) {
            System.out.println("Contact not found");
            return false;
        }
        System.out.print("Enter the name you want to delete: ");
        String deleteName = sc.nextLine();
        System.out.print("Enter the number you want to delete: ");
        String phoneNumber = sc.nextLine();
        LinkedHashSet<Contact> subContact = value.get(deleteName);
        boolean foundSubContact = false;
        for (Contact contact : subContact) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                subContact.remove(contact);
                foundSubContact = true;
                break;
            }
        }
        if (!foundSubContact) {
            System.out.println("Contact not found");
            return false;
        }
        value.put(deleteName, subContact);
        if (subContact.isEmpty()) {
            value.remove(deleteName);
        }
        contactList.put(deleteName.toUpperCase().charAt(0), value);
        if (value.isEmpty()) {
            contactList.remove(deleteName.toUpperCase().charAt(0));
        }
        System.out.println("Contact deleted successfully");
        return true;
    }

    @Override
    public boolean updateContact() {
        boolean found = false;
        System.out.print("Modify contact: ");
        String name = sc.nextLine();
        Map<String, LinkedHashSet<Contact>> value = contactList.get(name.toUpperCase().charAt(0));
        if (value == null) {
            System.out.println("Contact not found");
            return false;
        }
        for (Map.Entry<String, LinkedHashSet<Contact>> entry : value.entrySet()) {
            String key = entry.getKey();
            if (key.toLowerCase().contains(name.toLowerCase())) {
                LinkedHashSet<Contact> subContact = entry.getValue();
                for (Contact contact : subContact) {
                    found = true;
                    System.out.println(contact.toString());
                }
            }
        }
        if (!found) {
            System.out.println("Contact not found");
            return false;
        }
        System.out.print("Enter the person you want to modify: ");
        String deleteName = sc.nextLine();
        System.out.print("Phone number: ");
        String phoneNumber = sc.nextLine();
        LinkedHashSet<Contact> subContact = value.get(deleteName);
        boolean foundSubContact = false;
        Contact updateContact = null;
        for (Contact contact : subContact) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                updateContact = contact;
                subContact.remove(contact);
                foundSubContact = true;
                break;
            }
        }
        if (!foundSubContact) {
            System.out.println("Contact not found");
            return false;
        }
        System.out.println(updateContact.toString());
        boolean foundModify = false;
        while (!foundModify) {
            System.out.println("What do you want to modify?");
            System.out.println("1. Name");
            System.out.println("2. DOB");
            System.out.println("3. Gender");
            System.out.println("4. Email");
            System.out.println("5. Phone Number");
            System.out.println("6. Address");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int modify = Integer.parseInt(sc.nextLine());
            switch(modify) {
                case 1:
                    System.out.print("New name: ");
                    String newName = sc.nextLine();
                    updateContact.setName(newName);
                    break;
                case 2:
                    System.out.print("New DOB: ");
                    String newDOB = sc.nextLine();
                    newDOB = inputHandling.DOBHandler(newDOB);
                    while (!inputHandling.checkValidDOB(newDOB)) {
                        System.out.print("Invalid! DOB: ");
                        newDOB = sc.nextLine();
                        newDOB = inputHandling.DOBHandler(newDOB);
                    }
                    updateContact.setDOB(newDOB);
                    break;
                case 3:
                    System.out.print("New gender: ");
                    String newGender = sc.nextLine();
                    while (!inputHandling.genderHandler(newGender)) {
                        System.out.print("Invalid! Gender: ");
                        newGender = sc.nextLine();
                    }
                    updateContact.setGender(newGender);
                    break;
                case 4:
                    System.out.print("New email: ");
                    String newEmail = sc.nextLine();
                    while (!inputHandling.emailHandler(newEmail)) {
                        System.out.print("Invalid! Email: ");
                        newEmail = sc.nextLine();
                    }
                    updateContact.setEmail(newEmail);
                    break;
                case 5:
                    System.out.print("New phone number: ");
                    String newPhoneNumber = sc.nextLine();
                    while (!inputHandling.phoneHandler(newPhoneNumber)) {
                        System.out.print("Invalid! Phone number: ");
                        newPhoneNumber = sc.nextLine();
                    }
                    updateContact.setPhoneNumber(newPhoneNumber);
                    break;
                case 6:
                    System.out.print("New address: ");
                    String newAddress = sc.nextLine();
                    updateContact.setAddress(newAddress);
                    break;
                case 0:
                    foundModify = true;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
        subContact.add(updateContact);
        value.put(deleteName, subContact);
        contactList.put(deleteName.toUpperCase().charAt(0), value);
        System.out.println("Contact updated successfully");
        return true;
    }

    @Override
    public boolean findContact() {
        boolean found = false;
        System.out.print("Search: ");
        String name = sc.nextLine();
        Map<String, LinkedHashSet<Contact>> value = contactList.get(name.toUpperCase().charAt(0));
        if (value == null) {
            System.out.println("Contact not found");
            return false;
        }
        for (Map.Entry<String, LinkedHashSet<Contact>> entry : value.entrySet()) {
            String key = entry.getKey();
            if (key.toLowerCase().contains(name.toLowerCase())) {
                LinkedHashSet<Contact> subContact = entry.getValue();
                for (Contact contact : subContact) {
                    found = true;
                    System.out.println(contact.toString());
                }
            }
        }
        if (!found) {
            System.out.println("Contact not found");
            return false;
        }
        return true;
    }

    @Override
    public void saveContactFromFile() {
        String path = "/Users/clouq4d/Workspace/Java/case_study/contact-list/src/Data/contacts.csv";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                List<String> data = parseCsvLine(line);
                Contact contact = new Contact(data.get(0), data.get(1), data.get(2), data.get(3), data.get(5), data.get(4));
                putIntoList(contact, data.get(1));
                System.out.println(contact);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
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

    @Override
    public void copyContactToFile() {
        String path = "/Users/clouq4d/Workspace/Java/case_study/contact-list/src/Data/contacts.csv";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
            for (Map.Entry<Character, Map<String, LinkedHashSet<Contact>>> entry : contactList.entrySet()) {
                Map<String, LinkedHashSet<Contact>> value = entry.getValue();
                for (Map.Entry<String, LinkedHashSet<Contact>> subEntry : value.entrySet()) {
                    LinkedHashSet<Contact> subContact = subEntry.getValue();
                    for (Contact contact : subContact) {
                        bw.write(contact.getPhoneNumber() + ",");
                        bw.write(contact.getName() + ",");
                        bw.write(contact.isGender() + ",");
                        bw.write(contact.getAddress() + ",");
                        bw.write(contact.getDOB() + ",");
                        bw.write(contact.getEmail());
                        bw.newLine();
                    }
                }
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}