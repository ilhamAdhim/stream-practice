

package practicum1_week3;

/**
 *
 * @author Arga
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
                 InputStreamReader reader = new InputStreamReader(inputStream);
                 BufferedReader br= new BufferedReader(reader);
                 StringBuilder sb=new StringBuilder();
                 String str;
                 while ((str = br.readLine())!=null) {
                     sb.append(str);
                 }
                 doc.insertString(0, sb.toString(), null);
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
