package me.oop.ExtendsPractice;

public class CustomerTest {

    public static void main(String args[]){

        Customer customerLee = new Customer();

        customerLee.setCustomerName("이순신");
        customerLee.setCustomerID(10010);
        customerLee.setBonusPoint(1000);

        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer();

        customerKim.setCustomerName("김유신");
        customerKim.setCustomerID(10000);
        customerKim.setBonusPoint(10000);

        System.out.println(customerKim.showCustomerInfo());
    }
}
