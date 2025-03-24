package System;

import java.util.Scanner;

public class InputHandling {
    Scanner scanner = new Scanner(System.in);
    public InputHandling() {}

    public String DOBHandler(String DOB) {
        StringBuilder result = new StringBuilder();
        StringBuilder[] dob = {new StringBuilder(), new StringBuilder(), new StringBuilder()};
        int index = 0;
        for (int i = 0; i < DOB.length(); i++) {
            if (Character.isDigit(DOB.charAt(i))) {
                dob[index].append(DOB.charAt(i));
            } else {
                index++;
            }
        }
        for (int i = 0; i < 2; i++) {
            if (dob[i].length() < 2) {
                dob[i].insert(0, '0');
            }
            result.append(dob[i]);
            result.append("/");
        }
        result.append(dob[2]);
        return result.toString();
    }

    public boolean isLeapYear (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkValidDOB (String DOB) {
        if (DOB == null) {
            return false;
        }
        StringBuilder[] dob = {new StringBuilder(), new StringBuilder(), new StringBuilder()};
        int index = 0;
        for (int i = 0; i < DOB.length(); i++) {
            if (Character.isDigit(DOB.charAt(i))) {
                dob[index].append(DOB.charAt(i));
            } else {
                index++;
            }
        }
        Integer[] validDOB = new Integer[3];
        for (int i = 0; i < 3; i++) {
            validDOB[i] = Integer.parseInt(dob[i].toString());
        }
        switch (validDOB[1]) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (validDOB[0] > 31) {
                    return false;
                }
            case 4: case 6: case 9: case 11:
                if (validDOB[0] > 30) {
                    return false;
                }
            case 2:
                if (isLeapYear(validDOB[2])) {
                    if (validDOB[0] > 29) {
                        return false;
                    }
                } else {
                    if (validDOB[0] > 28) {
                        return false;
                    }
                }
        }
        return true;
    }

    public boolean genderHandler(String gender) {
        if (gender.toLowerCase().equals("male") || gender.toLowerCase().equals("female")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean emailHandler(String email) {
        if(!email.contains("@")) {
            return false;
        }
        String[] part = email.split("@");
        if (part.length != 2) {
            return false;
        }
        if (!part[1].equals("gmail.com")) {
            return false;
        }
        return true;
    }

    public boolean phoneHandler(String phone) {
        if (phone.length() != 10) {
            return false;
        }
        if (phone.charAt(0) != '0') {
            return false;
        }
        for (int i = 1; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
