package me.Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

    public static void main(String[] args){

        int i;
        try (FileInputStream fis = new FileInputStream("input.txt")){

            while( (i = fis.read()) != -1 ) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
