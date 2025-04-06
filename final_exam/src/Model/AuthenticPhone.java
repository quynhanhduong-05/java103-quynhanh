package Model;

public class AuthenticPhone extends Phone {
    private double warrantyPeriod;
    private String warrantyScope;

    public AuthenticPhone() {}

    public AuthenticPhone(double warrantyPeriod, String warrantyScope){
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyScope = warrantyScope;
    }

    public AuthenticPhone(String name, double price, int quantity, String producer, double warrantyPeriod, String warrantyScope){
        super(name, price, quantity, producer);
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyScope = warrantyScope;
    }

    public double getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(double warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String isWarrantyScope() {
        return warrantyScope;
    }

    public void setWarrantyScope(String warrantyScope) {
        this.warrantyScope = warrantyScope;
    }

    @Override
    public String toString() {
        return super.toString() + getWarrantyPeriod() + "," + isWarrantyScope();
    }
}
