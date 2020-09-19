

package practicum1_week3;

/**
 *
 * @author Arga
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import views.assignment1;
public class Assignment1 {
    private final assignment1 view;

    public Assignment1(assignment1 view) {
        this.view = view;
    }
    
    public void read(){
        JFileChooser loadFile = view.getLoadFile();
         Document doc = view.getTxtArea().getDocument();
         if (JFileChooser.APPROVE_OPTION == loadFile.showOpenDialog(view)) {
             InputStream inputStream = null;
             try {
                 inputStream = new FileInputStream(loadFile.getSelectedFile());
                 int read = inputStream.read();
                 doc.insertString(0, "", null);
                 while (read != -1) {
                     doc.insertString(doc.getLength(), "" + read, null);
                     System.out.println("" + read);
                     read = inputStream.read();
                 }
             } catch (FileNotFoundException ex) {
                 Logger.getLogger(Assignment1.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException | BadLocationException ex) {
                 Logger.getLogger(Assignment1.class.getName()).log(Level.SEVERE, null, ex);
             } finally {
                 if (inputStream != null) {
                     try {
                         inputStream.close();
                     } catch (IOException ex) {
                         Logger.getLogger(Assignment1.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 }
             }
         }
    }
    
}
