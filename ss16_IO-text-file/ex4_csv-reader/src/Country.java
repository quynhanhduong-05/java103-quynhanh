public class Country {
    private String name;
    private int ID;
    private String code;

    public Country() {}

    public Country(String name, int id, String code) {
        this.name = name;
        this.ID = id;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int id) {
        ID = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + ID +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
