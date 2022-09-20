package me.java.variables;

public class VariablesPractice {
    public static void main(String[] args){
        int i = 10;
        float f = 12.34f;
        double d = 56.78;
        char c = 'a';
        String s = "Hello World";
        boolean b = true;

        //Integer
        System.out.printf("%d\n", i); // 정수
        System.out.printf("%10d\n", i); // 10칸에 대해 오른쪽 정렬
        System.out.printf("%-10d\n", i); // 10칸에 대해 왼쪽 정렬
        System.out.printf("%010d\n", i); // 10칸에 대해 오른쪽 정렬이면서 빈칸 0으로 표시
        System.out.printf("%o\n", i); // 8진수
        System.out.printf("%x\n", i); // 16진수 소문자
        System.out.printf("%X\n", i); // 16진수 대문자
        System.out.printf("%n"); // 줄바꿈 기능
        System.out.println();

        //Float

        System.out.printf("%f\n", f);
        System.out.printf("%.2f\n", f); // 소수점 2번째 자리까지만 출력
        System.out.printf("%.8f\n", f); // 소수점 8번째 자리까지만 출력
        System.out.printf("%5.2f\n", f); // 총 5개 공간에서 소수점 2번째 자리까지만 출력
        System.out.printf("%-5.2f\n", f); // 왼쪽 정렬하면서 //
        System.out.printf("%e\n", f); // 12345.1235 == 1.23451234 * 10^4 =
        System.out.printf("%E\n", f); // 1.2341234E4
        System.out.printf("%30.3e\n", f); // 30칸 중 소수점 3번째자리까지 + 지수 표현
        System.out.printf("%-30.3E\n", f); // 왼쪽정렬 + //
        System.out.println(); // 실수는 정확하게 비교할 수 없기 때문에 두 실수의 차이값을 두고 비교함

        //double

        System.out.printf("%f\n", d);
        System.out.printf("%.2f\n", d);
        System.out.printf("%.8f\n", d);
        System.out.printf("%5.2f\n", d);
        System.out.printf("%e\n", d);
        System.out.printf("%E\n", d);
        System.out.printf("%30.3e\n", d);
        System.out.printf("%-30.3E\n", d);
        System.out.println();

        // char
        System.out.printf("%c\n",c); // 소문자
        System.out.printf("%C\n",c); // 대문자
        System.out.printf("%30c\n",c);
        System.out.printf("%30C\n",c);

        //String
        System.out.printf("%s\n",s); // 소문자
        System.out.printf("%S\n",s); // 대문자
        System.out.printf("%30s\n",s);
        System.out.printf("%30S\n",s);
        System.out.println();

        //boolean
        System.out.printf("%b\n",b); // 소문자
        System.out.printf("%B\n",b); // 대문자
        System.out.printf("%30b\n",b);
        System.out.printf("%30B\n",b);
        System.out.println();

        // 변수에 저장하지 않은 리터럴
        System.out.printf("%d\n",12345);
        System.out.printf("%f\n",12.34);
        System.out.printf("%c\n",'a');
        System.out.printf("%s\n","a");
        System.out.printf("%b\n",true);
        System.out.println();

        // 변수의 자료형과 맞지 않은 지시자 사용 - 런타임 오류 발생
        /* System.out.printf("%c",i);
        System.out.printf("%d",b);

        // 존재하지 않는 지시자 사용 - 런타임 오류 발생
        System.out.printf("%a",i);
        System.out.printf("%k",i);
        System.out.printf("%q",i); */

        /* 보통 코드가 있으면 바이트코드로 컴파일하면서 컴파일러가 오류를 잡는데 처음에 오류를 못잡고
        실행 도중 생기는 오류를 Runtime error라고 한다. */

    }
}

