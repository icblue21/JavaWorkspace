package me.usefulClass.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class c1 = Class.forName("me.usefulClass.ch04.Person");

        Person person = (Person)c1.newInstance(); // new를 쓰지 않고 인스턴스 생성하는 방법
        person.setName("Kim");
        System.out.println(person);

        Class c2 = person.getClass();
        Person p2 = (Person)c2.newInstance();
        System.out.println(p2);


        // local에 Person이라는 타입이 없고 모를 때, 인스턴스를 생성하는 방법
        Class[] parameterTypes = {String.class};
        Constructor cons = c2.getConstructor(parameterTypes);

        Object[] initArgs = {"Kim"};
        Person kim = (Person)cons.newInstance(initArgs);
        System.out.println(kim);

        // 알면 간단하게 이렇게 쓴다..
        Person kim2 = new Person("Lee");
    }
}
