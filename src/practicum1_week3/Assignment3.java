/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicum1_week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import views.assignment3;

/**
 *
 * @author ASUS
 */
public class Assignment3 {
    private assignment3 view;

    public Assignment3(assignment3 view){
        this.view=view;
        this.view.getBtnRead().addActionListener((e) -> {
            try {
                read();
            } catch (BadLocationException ex) {
                Logger.getLogger(Assignment3.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        this.view.getBtnSave().addActionListener((e) -> {
            save();
        });
    }
    
     private void save() {
         JFileChooser loadFile = view.getLoadFile();
         if (JFileChooser.APPROVE_OPTION == loadFile.showSaveDialog(view)) {
             BufferedWriter writer = null;
             try {
                 String contents = view.getTxtArea().getText();
                 if (contents != null && !contents.isEmpty()) {
                     writer = new BufferedWriter(new FileWriter(loadFile.getSelectedFile()));
                     writer.write(contents);
                 }

             } catch (FileNotFoundException ex) {
                 Logger.getLogger(Assignment3.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException ex) {
                 Logger.getLogger(Assignment3.class.getName()).log(Level.SEVERE, null, ex);
             } finally {
                 if (writer != null) {
                     try {
                         writer.flush();
                         writer.close();
                         view.getTxtArea().setText("");
                     } catch (IOException ex) {
                         Logger.getLogger(Assignment3.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 }
             }
         }
     }
      private void read() throws BadLocationException {
         JFileChooser loadFile = view.getLoadFile();
         Document doc = view.getTxtArea().getDocument();
         if (JFileChooser.APPROVE_OPTION == loadFile.showOpenDialog(view)) {
             BufferedReader reader = null;
             try {
                 reader = new BufferedReader(new FileReader(loadFile.getSelectedFile()));
                 String data = null;
                 doc.insertString(0, "", null);
                 while ((data = reader.readLine()) != null) {
                     doc.insertString(doc.getLength(), data, null);
                 }
             } catch (FileNotFoundException ex) {
                 Logger.getLogger(Assignment3.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException | BadLocationException ex) {
                 Logger.getLogger(Assignment3.class.getName()).log(Level.SEVERE, null, ex);
             } finally {
                 if (reader != null) {
                     try {
                         reader.close();
                     } catch (IOException ex) {
                         Logger.getLogger(Assignment3.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 }
             }
         }
     }
}
