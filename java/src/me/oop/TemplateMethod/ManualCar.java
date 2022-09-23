package me.oop.TemplateMethod;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("사람이 운전합니다.");
        System.out.println("사람이 핸들을 조작합니다.");
    }

    @Override
    public void stop() {
        System.out.println("브레이크를 밟아서 정지합니다.");
    }

    @Override
    public void wiper() {
        System.out.println("와이퍼 작동 합니다.");
    }

    @Override
    public void washCar(){
        System.out.println("직접 세차 합니다.");
    }
}
