package me.oop.TemplateMethod;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void startCar(){
        System.out.println("차 시동을 켭니다.");
    }

    public void endCar(){
        System.out.println("차 시동을 끕니다.");
    }

    public void washCar(){}; // 추상메서드가 아닌 아무것도 없는 구현된 메서드
    // 이런 메서드는 어디에 쓰는가? -> 필요한 경우 재정의해서 사용
    final public void run(){ // template method
        startCar();
        drive();
        wiper();
        washCar();
        stop();
        endCar();
    }
}
