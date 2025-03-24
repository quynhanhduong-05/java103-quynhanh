package System;

public interface ContactListFunction {
    public void displayContactList();
    public boolean addContact();
    public boolean deleteContact();
    public boolean updateContact();
    public boolean findContact();
    public void saveContactFromFile();
    public void copyContactToFile();
}