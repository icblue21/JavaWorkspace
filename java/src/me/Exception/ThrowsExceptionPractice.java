package me.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExceptionPractice {

    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        // throws를 하면 예외가 발생하는 부분을 호출하는 곳에서 예외처리 하도록 미룰 수 있음.
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;

    }
    public static void main(String[] args){

        ThrowsExceptionPractice test = new ThrowsExceptionPractice();

        try {
            test.loadClass("a.txt","java.lang.String");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch ( Exception e ){ // 또 다른 예외를 처리하기 위한 디폴트 exception ( 최상위 익셉션을 써서 업캐스팅 되도록 )
            // 맨 밑에 안쓰면 나머지 익셉션이 다 하위라서 하위쪽으로 안들어감

        }


        /* catch( FileNotFoundException | ClassNotFoundException e){

        }*/ // multi exception

    }
}
