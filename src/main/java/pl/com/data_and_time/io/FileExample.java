package pl.com.data_and_time.io;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileExample {

    public static void main(String[] args) {
      //  File maybeFile = new File("E:AA SDA");
        File maybeFile = new File("E:AA SDA");
        System.out.println("file exist: " + maybeFile.exists());
        System.out.println("is directory: " + maybeFile.isDirectory());

        File existingOneOrNot = new File("");

//        try {
//            Reader reader = new FileReader("E:AA SDA");
//            int readChar;
//            while ((readChar = reader.read())); != -1{
//                System.out.println("readChar: " +readChar);
//
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

    }



}
