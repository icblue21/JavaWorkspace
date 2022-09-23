package me.java.Polymorphism;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String args[]){

        ArrayList<Customer> customList = new ArrayList<>();

        Customer customT = new Customer(10010, "Tom");
        Customer customH = new Customer(10010, "Harry");
        Customer customJ = new GoldCustomer(10010, "John");
        Customer customK = new GoldCustomer(10010, "Kalu");
        Customer customD = new VIPCustomer(10010, "David");


        customList.add(customD);
        customList.add(customK);
        customList.add(customT);
        customList.add(customH);
        customList.add(customJ);

        int price = 10000;

        for( Customer cst : customList){
            int cost = cst.calcPrice(price);
            System.out.println(cst.showCustomerInfo()+cost);
        }

    }
}
