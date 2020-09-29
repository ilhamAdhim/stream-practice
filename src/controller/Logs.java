
package controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import views.AreaCalc;

/**
 *
 * @author Arga
 */
public class Logs {
    views.AreaCalc view;
    Logger logger;  
    public static FileHandler fh;  

    public Logs(AreaCalc view) {
        this.view = view;
        logger = Logger.getLogger("Logger");
    }
    
    public void setLog(Level level, String message){

        try {
            // This block configure the logger with handler and formatter 
            //sesuaikan lokasi logs
            fh = new FileHandler("F:\\Kuliah\\Semester 5\\Network Programming\\stream\\log.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  

            // the following statement is used to log any messages  
            logger.setLevel(level);
            logger.fine(message);
        } catch (SecurityException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }
    }
    public void setLogErr(Level level, String message){
        
        try {  

            // This block configure the logger with handler and formatter  
            //sesuaikan lokasi error logs
            fh = new FileHandler("F:\\Kuliah\\Semester 5\\Network Programming\\stream\\log.err");  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  

            // the following statement is used to log any messages  
            logger.setLevel(level);
            logger.warning(message);
            
            
        } catch (SecurityException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }
    }
}
