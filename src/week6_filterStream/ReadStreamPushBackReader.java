/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6_filterStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

import java.io.PushbackReader;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Ilham A
 */
public class ReadStreamPushBackReader {
    public static void main(String[] args) {
        try {
            PushbackReader reader = new PushbackReader(new InputStreamReader(new FileInputStream("coba.txt")), 100);
            int read;
            while((read=reader.read())!=-1){
                System.out.print((char)read);
            }
            char[] newWords = "Politeknik Negeri Malang".toCharArray();
            System.out.println("\nAfter unread");
            reader.unread(newWords);
            while((read=reader.read())!=-1){
                System.out.print((char)read);
            }
        } catch (IOException ex) {
            Logger.getLogger(ReadStreamPushBackReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
