/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import views.assignment4;

/**
 *
 * @author ASUS
 */
public class Assignment4 {
    private assignment4 view;

    public Assignment4(assignment4 view){
        this.view=view;
        this.view.getBtnRead().addActionListener((e) -> {
            try {
                read();
            } catch (BadLocationException ex) {
                Logger.getLogger(Assignment4.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        this.view.getBtnSave().addActionListener((e) -> {
            save();
        });
    }
    
     private void save() {
         
         JFileChooser loadFile = view.getLoadFile();
         if (JFileChooser.APPROVE_OPTION == loadFile.showSaveDialog(view)) {
             BufferedOutputStream writer = null;
             try {
                 String contents = view.getTxtArea().getText();
                 if (contents != null && !contents.isEmpty()) {
                     writer = new BufferedOutputStream(new FileOutputStream(loadFile.getSelectedFile()));
                     writer.write(contents.getBytes(), 0, contents.length());
                     JOptionPane.showMessageDialog(view, "File berhasil ditulis.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                 }else{
                     JOptionPane.showMessageDialog(view, "Text Editor is empty. Cannot Save the document.", "Warning", JOptionPane.WARNING_MESSAGE);
                     
                 }

             } catch (FileNotFoundException ex) {
                 Logger.getLogger(Assignment4.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException ex) {
                 Logger.getLogger(Assignment4.class.getName()).log(Level.SEVERE, null, ex);
             } finally {
                 if (writer != null) {
                     try {
                         writer.flush();
                         writer.close();
                         view.getTxtArea().setText("");
                     } catch (IOException ex) {
                         Logger.getLogger(Assignment4.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 }
             }
         }
     }
     
      private void read() throws BadLocationException {
           JFileChooser loadFile = view.getLoadFile();
             Document doc = view.getTxtArea().getDocument();
             if (JFileChooser.APPROVE_OPTION == loadFile.showOpenDialog(view)) {
                 BufferedInputStream reader = null;
                 try {
                     reader = new BufferedInputStream(new FileInputStream(loadFile.getSelectedFile()));
                     doc.insertString(0, "", null);
                     
                     int temp = 0;
//                     List<Integer> list = new ArrayList<>();
                     byte[] dt = new byte[reader.available()];
                     if(!(reader.available() <= 0)){
                        while ((temp=reader.read(dt)) != -1);
                     }
//                     if (!list.isEmpty()) {
//                         byte[] dt = new byte[list.size()];
//                         int i = 0;
//                         for (Integer integer : list) {
//                             dt[i]=integer.byteValue();
//                             i++;
//                         }
                         doc.insertString(doc.getLength(), new String(dt), null);
                         JOptionPane.showMessageDialog(view, "File berhasil dibaca.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
//                     }
                 } catch (FileNotFoundException ex) {
                     Logger.getLogger(Assignment4.class.getName()).log(Level.SEVERE, null, ex);
                 } catch (IOException | BadLocationException ex) {
                     Logger.getLogger(Assignment4.class.getName()).log(Level.SEVERE, null, ex);
                 } finally {
                     if (reader != null) {
                         try {
                             reader.close();
                         } catch (IOException ex) {
                             Logger.getLogger(Assignment4.class.getName()).log(Level.SEVERE, null, ex);
                         }
                     }
                 }
             }
     }
}
