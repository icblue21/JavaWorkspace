package me.usefulClass.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

    public static void main(String[] args) throws ClassNotFoundException {

        Class c = Class.forName("java.lang.String"); // String Class 동적 로딩
        // "java.lang.String" 문자열 중 대,소문자가 틀리거나 한 문자라도 틀리면 오류남

        Constructor[] cons = c.getConstructors();
        for( Constructor cs : cons ){
            System.out.println(cs);
        }

        Method[] methods = c.getMethods();
        for( Method m : methods){
            System.out.println(m);
        }

    }
}
