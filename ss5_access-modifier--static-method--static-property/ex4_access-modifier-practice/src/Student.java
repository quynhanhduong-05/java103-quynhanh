public class Student {
    private String name = "John";
    private String classes = "C02";

    Student() {};

    public void setName (String newName) {
        name = newName;
    }

    public String getName () {
        return name;
    }

    public void setClasses (String newClasses) {
        classes = newClasses;
    }

    public String getClasses () {
        return classes;
    }
}
