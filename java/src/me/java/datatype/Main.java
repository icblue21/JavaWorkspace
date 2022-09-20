package me.java.datatype;

public class Main {
    public static void main(String[] args){
        // 리터럴(literal) : 데이터 수
        // 자료형(data type)
        // 원시 자료형 (primitive type) // 처음 만들어졌을 때 부터 있던 자료형 , Stack 공간 사용
        // int      (4byte = 32bit) : 표현 범위 = -2^31 ~ 2^31-1
        // float    (4byte = 32bit) : 표현 범위 = (+/-)1.4E-45 ~ (+/-)3.4028235E38
        // double   (8byte = 64bit) : 표현 범위 = -2^63 ~ 2^63-1
        // char     (2byte = 16bit) : 표현 범위 = (+/-)4.9E-324 ~ (+/-)1.7976931348623157E08
        // 자료형을 쓰는 이유? => 효율적으로 메모리를 관리하기 위해서
        // -----------------------------------------------------------
        // 참조형 (reference type) // Heap 공간 사용
        // String (클래스)
        // Stack과 Heap은 물리적으론 같은 공간을 사용하지만 개념적으로는 다르다.
        // Stack은 원시 자료형을 저장하며 공간이 작아서 빡빡하게 운영되고 Heap은 참조 자료형을 저장하며 값이 어떻게 변할 지 모르기 때문에
        // 널널한 공간에서 운영된다. 하지만 필요 시에는 힙공간이 스택공간을 쓰기도 하며 이를 Heap overflow라고 하며 스택이 힙 공간을
        // 쓰는 것을 stack overflow라고 한다.

        int i = 10; // 정수의 기본 단위
        long l = 10; // 리터럴 값보다 변수 공간이 큰 경우는 가능 ( 자동 형 변환 promotion = 묵시적 형 변환 )
        byte b = 10; // 10이라는 값이 1byte에 들어갈 수 있기 때문에 컴파일러가 자동으로 캐스팅 해줘서 가능, 리터럴 값이 커지면 오류남
        float f = 3.14f; // 리터럴의 기본 단위가 double형이기 때문에 식별자 f를 붙이지 않으면 double로 취급해서 error
        double d = 3.14; // 실수의 기본 단위

        //강제 형 변환 (type casting) = 명시적 형 변환
        b = (byte)10000; // 강제 형 변환을 통해 큰 값을 억지로 줄이는 것이기 때문에 정보의 유실이 발생할 수 있음.

        byte byteValue = 10;
        int intValue = byteValue; // 자동 타입 변환
        // 00001010 (1byte) -> 00000000 00000000 00000000 00001010 (4byte)


        //쓰레기 값 : 저장할 수 있는 범위를 초과해서 값을 저장할 경우 표현 범위 내에서 저장을 위해 엉터리 값 저장
        //쓰레기 값 예제
        byte var1 = 125; // 표현 범위 : -128 ~ 127
        int var2 = 125;

        for (int j = 0; j < 5; j ++) {
            var1++; // var1 = var1 + 1
            var2++; // var2 = var2 + 1
            System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
        }
        // var1이 128을 넘어가는 순간 -128로 넘어가버림
        // 이런 경우 변수가 사용할 수 있는 데이터 범위보다 더 큰 수를 사용했다고 하여 "오버플로우"라고 한다.
        // 반대로 변수가 사용할 수 있는 데이터 범위보다 더 작은 수를 사용하면 "언더플로우"가 발생한다.



        // 타입 캐스팅을 통한 데이터 손실 방지 예제

        int k = 128;

        // i에 저장된 값이 byte 범위니 (-128 ~ 127 사이에 있니)
        if ((k < Byte.MIN_VALUE) || (k > Byte.MAX_VALUE)) {
            System.out.println("byte 타입으로 변환할 수 없음");
            System.out.println("값 다시 확인 바람");
        } else {
            byte by = (byte) i;
            System.out.println(by);
        }


        //정밀도 손실 방지 코드
        int num1 = 123456780;
        int num2 = 123456780;

        float num3 = num2;
        num2 = (int) num3;
        System.out.println(num3); // 1.23456784E8
        System.out.println(num2); // 123456784

        int result = num1 - num2;
        System.out.println(result); // -4

        // 서로 다른 타입의 피연산자가 있을 경우 두 피연산자 중 크기가 큰 타입으로 자동 변환된 후 연산 수행

        String s = "a" + 1;
        System.out.println(s);  // 결과 = "a1" 여기서 리터럴 1은 integer, "a" = String 이므로 더 크기가 작은 1이 문자열로
        // promotion 되어 "a" + "1" 의 연산이 일어나고 "a1"이 결과값으로 나오게 되는 것

    }
}