package me.Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

    public static void main(String[] args){

        //FileInputStream fis = null;

        try (FileInputStream fis = new FileInputStream("a.txt")) {
            //fis = new FileInputStream("a.txt");
            System.out.println("read");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) { // try에서 fis.close() 되기 때문에 close()에 대한 exception 처리 (Auto Closeable, Java 7 이상)
            e.printStackTrace();
        }
        System.out.println("end");




        /*catch (FileNotFoundException e) {
            System.out.println(e);
            return;
        } finally {
            if( fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("fin"); // finally는 항상 불림
        }
        System.out.println("end"); // return 때문에 안불림
        */
    }
}
