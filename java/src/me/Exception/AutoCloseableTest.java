package me.Exception;

public class AutoCloseableTest {

    public static void main(String[] args){

        AutoCloseableObj obj = new AutoCloseableObj();

        try(obj){
            throw new Exception(); // Exception 강제 생성
        }catch (Exception e){
            System.out.println("exception");
        }
        System.out.println("end");
    }
}
