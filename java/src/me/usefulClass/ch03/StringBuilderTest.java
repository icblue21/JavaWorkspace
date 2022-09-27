package me.usefulClass.ch03;

public class StringBuilderTest {
    public static void main(String[] args) {

        String java = new String("java");
        String android = new String("android");

        StringBuilder sb = new StringBuilder(java);
        System.out.println(System.identityHashCode(sb)); // 연결전 sb의 주소값
        sb.append(android);
        System.out.println(System.identityHashCode(sb)); // 연결후 sb의 주소값
        // 연결전과 연결후가 같은 것을 볼 수 있다.

        String test = sb.toString();
        System.out.println(test);



    }
}
