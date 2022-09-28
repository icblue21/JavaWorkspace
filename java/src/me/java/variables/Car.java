package me.java.variables;

public class Car {
    int speed;

    void run() { System.out.println(speed+"속도로 달립니다."); }

    public static void main(String[] args) {
        Car car = new Car();
        car.speed = 60;
        car.run(); // static이 아니라 객체없이 사용 불가능
    }
}
