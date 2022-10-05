package me.Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

    public static void main(String[] args) throws FileNotFoundException {
        //FileOutputStream fos = new FileOutputStream("output.txt");
        FileOutputStream fos = new FileOutputStream("output.txt", true); // override하지 않고 붙여서 씀
        try(fos){

            byte[] bs = new byte[26];

            byte data = 65;
            for(int i=0; i< bs.length; i++){
                bs[i] = data++;
            }
            fos.write(bs,2,10); // bs[2]부터 10개
            /* fos.write(65);
            fos.write(66);
            fos.write(67); // char가 생성 ABC */

        }catch(IOException e){ // IOException이 FildNotFoundException 포함
            System.out.println(e);
        }
        System.out.println("end");
    }
}
