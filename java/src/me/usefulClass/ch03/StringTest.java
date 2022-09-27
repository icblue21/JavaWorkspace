package me.usefulClass.ch03;

public class StringTest {

    public static void main(String[] args){

        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java));
        java = java.concat(android);
        System.out.println(System.identityHashCode(java));
        // java와 concat으로 붙인 javaandroid 는 다르다. 새로운 인스턴스가 생성되고 그 주소를 java가 가키리는 것
        // java에 원래 저장되어 있던 "java"값은 메모리에 남음.. ( 메모리 낭비 )

    }
}
