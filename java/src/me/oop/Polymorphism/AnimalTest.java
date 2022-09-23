package me.oop.Polymorphism;

import java.util.ArrayList;

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다.");
    }

    public void sleep(){ // 공통적으로 사용할 수 있는 메소드는 상위 클래스에서 정의하면 좋다.

    }
}

class Human extends Animal{
    @Override
    public void move(){
        System.out.println("사람이 걷습니다.");
    }

    public void readBook(){
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Dog extends Animal{

    @Override
    public void move() {
        System.out.println("개가 돌아다닙니다.");
    }

    public void eat() {
        System.out.println("개가 사료를 먹습니다.");
    }
}

class Eagle extends Animal{

    @Override
    public void move(){
        System.out.println("독수리가 날아다닙니다.");
    }

    public void built(){
        System.out.println("독수리가 집을 짓습니다.");
    }
}


public class AnimalTest {

    public static void main(String args[]){

        Animal hAniamal = new Human();
        Animal dAniamal = new Dog();
        Animal eAniamal = new Eagle();

        AnimalTest test = new AnimalTest();
        //test.moveAnimal(hAniamal);
        //test.moveAnimal(dAniamal);
        //test.moveAnimal(eAniamal);

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAniamal);
        animalList.add(dAniamal);
        animalList.add(eAniamal);

        for( Animal a : animalList ){
            a.move();
        }

    }

    public void moveAnimal(Animal animal){
        animal.move();
    }
}
