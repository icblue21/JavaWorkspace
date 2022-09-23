package me.java.Overriding;

public class VIPCustomer extends Customer {
    double saleRatio;
    String agentID;

    public VIPCustomer(){
        // VIPCustomer는 Customer로 부터 명시적으로 상속을 받고 있다.
        // 따라서 VIPCustomer는 상위 클래스의 Constructor(생성자)를 호출해야 한다.
        // 여기서는 상위 클래스(Customer)의 Constructor(생성자)를 호출하는 코드가 없다.
        // 컴파일러가 super(); 를 자동으로 추가해준다. super는 상위 클래스의 주소값을 가리킨다.
        // 만약 상위 클래스에 디폴트생성자가 없으면 내가 상위 클래스의 생성자를 명시적으로 호출해야 한다.

        super(0,"no_name");
        bonusRatio = 0.05;
        saleRatio = 0.1;
        customerGrade = "VIP";
    }

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public double getSaleRatio() {
        return saleRatio;
    }

    public void setSaleRatio(double saleRatio) {
        this.saleRatio = saleRatio;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    @Override
    public int calcPrice(int price) {

        bonusPoint += price*bonusRatio;
        price -= (int)(price*saleRatio);
        return price;
    }
}
