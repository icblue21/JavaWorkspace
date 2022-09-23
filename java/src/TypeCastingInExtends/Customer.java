package TypeCastingInExtends;

public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;

    double bonusRatio;

    /* public Customer(){

        customerGrade = "SILVER";
        bonusRatio = 0.01;

        System.out.println( "Customer() called");
    } */

    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;

        customerGrade = "SILVER";
        bonusRatio = 0.01;


        System.out.println( "Customer(int, String) called");
    }

    public int calcPrice(int price){
        bonusPoint += price*bonusRatio;
        return price;
    }

    public String showCustomerInfo(){
        return customerName + "님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+ bonusPoint + "입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }
}
