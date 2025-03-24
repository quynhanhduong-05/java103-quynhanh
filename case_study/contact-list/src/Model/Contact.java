package Model;

public class Contact {
    private String phoneNumber;
    private String name;
    private String gender;
    private String address;
    private String email;
    private String DOB;

    public Contact() {}

    public Contact(String phoneNumber, String name, String gender, String address, String email, String DOB) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.DOB = DOB;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "\nName: " + name +
                "\nDOB: " + DOB +
                "\nGender: " + gender +
                "\nEmail: " + email +
                "\nPhone Number: " + phoneNumber +
                "\nAddress: " + address;
    }
}

