package me.java.input;

import java.util.Scanner; // 자바 라이브러리에 저장되어 있는 클래스 ( 클래스 안에 입력 메소드들이 있음 )
public class Main {
    public static void main(String[] args){
        // 입력 메소드
        // 사용자가 콘손을 통해 입력한 데이터를 저장
        Scanner sc = new Scanner(System.in);
        // 객체(object) : 실제 행동하는 단위

        System.out.print("정수를 입력하세요: "); // 입력 유도 메시지
        int num = sc.nextInt(); // 정수를 입력받는 메소드
        System.out.println(num);

        System.out.print("실수를 입력하세요 : ");
        double d = sc.nextDouble();
        System.out.println(d);
    }
}
