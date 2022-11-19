package p20221031_inheritance;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusRatio;

    public Customer(String customerName){
        this.customerName = customerName;
        this.customerGrade = "SILVER";
        this.bonusRatio = 0.01;
    }

    public Customer() {
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo(){
        String info = "\n🌼고객정보🌼" + "\n고객 이름 : " + customerName + "\n고객등급 : " + customerGrade + "\n현재 적립 포인트 : " + bonusPoint;
        return info;
    }
}