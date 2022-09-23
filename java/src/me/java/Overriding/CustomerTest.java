package me.java.Overriding;

public class CustomerTest {

    public static void main(String args[]){


        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerID(10010);
        customerLee.setBonusPoint(1000);
        int price = customerLee.calcPrice(1000);// 1000원 계산

        System.out.println(customerLee.showCustomerInfo() + price);


        VIPCustomer customerKim = new VIPCustomer();
        // VIPCustomer 인스턴스를 생성했지만 Customer() 생성자가 먼저 실행 되고 이후 VIPCustomer()가 실행되는 것을 볼 수 있다.
        customerKim.setCustomerName("김유신");
        customerKim.setCustomerID(10000);
        customerKim.setBonusPoint(10000);

        price = customerKim.calcPrice(1000);

        System.out.println(customerKim.showCustomerInfo()+price);


        Customer VIPCtm = new VIPCustomer(123,"Kane");
        // 업캐스팅
        // VIPCustomer로 생성 되었지만 Customer타입으로 형 변환이 되었기 때문에 Customer의 것만 쓸 수 있음.
    }
}
