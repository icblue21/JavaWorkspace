package me.oop.Abstract;

public class Desktop extends Computer{
    @Override
    public void display() {
        System.out.println("데스크탑 화면 출력");

    }
    @Override
    public void typing() {
        System.out.println("데스크탑에서 타이핑");
    }

    @Override
    public void turnOn() {
        System.out.println("데스크탑 전원이 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("데스크탑 전원이 꺼졌습니다.");
    }
}
