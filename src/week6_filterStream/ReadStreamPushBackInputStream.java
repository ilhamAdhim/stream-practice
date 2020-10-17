/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6_filterStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ilham A
 */
public class ReadStreamPushBackInputStream {
    public static void main(String[] args) {
        try {
            PushbackInputStream stream = new PushbackInputStream(new FileInputStream("coba.txt"),200);
            byte[] bytes = new byte[stream.available()];
            stream.read(bytes);
            System.out.println(new String(bytes));
        } catch (IOException ex) {
            Logger.getLogger(ReadStreamPushBackInputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
