package me.oop.Abstract;

public abstract class Computer { // 상속을 위한 클래스

    public abstract void display(); // 하위 클래스에게 추상 메서드를 작성할 책임을 위임
    public abstract void typing();
    public void turnOn(){
        System.out.println("전원이 켜졌습니다.");
    }
    public void turnOff(){
        System.out.println("전원이 꺼졌습니다.");
    }
}
