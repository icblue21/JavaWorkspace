package me.oop.Interface;

public class CalcTest {
    public static void main(String[] args){

        Calc cal = new CompleteCalc();
        // CompleteCalc는 Calc를 상속받은건 아니지만 Calc타입이 구현되어있음
        // 이것을 Type 상속을 했다고 한다. 구현 상속과는 다르다 구현 상속은 구현 코드를 받아야 한다.
        // 즉, CompleteCalc 클래스는 Calc인터페이스를 구현한 클래스이고, Calc타입을 갖고 있다.

        int num1 = 10;
        int num2 = 2;

        System.out.println(cal.add(num1,num2));
        System.out.println(cal.substract(num1,num2));
        System.out.println(cal.times(num1,num2));
        System.out.println(cal.divide(num1,num2));

        // cal은 Calc 인터페이스 타입으로 선언되었기 때문에 Calc 인터페이스 안에 있는 메서드들만 사용할 수 있다.

        CompleteCalc comCal = new CompleteCalc();

        comCal.showInfo();

    }
}
