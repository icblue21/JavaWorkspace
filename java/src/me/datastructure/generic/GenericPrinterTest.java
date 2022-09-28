package me.datastructure.generic;

public class GenericPrinterTest {

    public static void main(String[] args){

        Powder powder = new Powder();
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        // 뒤에는 알아서 컴파일러가 넣어준다. 명확하게 하고 싶으면 써도 됨
        // GenericPrinter powderPrinter = new GenericPrinter<>(); 로도 쓸 수 있다.
        // 이 때, Type은 Object가 되기 때문에 사용할 때 형 변환을 해줘야 한다.
        // 근데 굳이 제네릭 냅두고 쓸 이유는 없다.

        powderPrinter.setMaterial(powder);


        Powder p = powderPrinter.getMaterial();
        System.out.println(powderPrinter.toString());


    }
}
