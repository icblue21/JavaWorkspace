package me.oop.TemplateMethod;

public class CarTest {

    public static void main(String[] args){

        Car aiCar = new AICar();
        aiCar.run();

        System.out.println("===========================");

        Car hmCar = new ManualCar();
        hmCar.run();
    }
}
