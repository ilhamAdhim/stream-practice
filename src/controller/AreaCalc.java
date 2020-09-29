
package controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Arga
 */
public class AreaCalc {
    private double length;
    private double width;
    private final views.AreaCalc view;

    public AreaCalc(views.AreaCalc view) {
        this.view = view;
    }
    
    
    public double getArea(){
        String strLength=view.getTxtLength().getText();
        String strWidth=view.getTxtWidth().getText();
        this.length = Double.valueOf(strLength);
        this.width = Double.valueOf(strWidth);
        return length * width;
    }
    public double getPerimeter(){
        String strLength=view.getTxtLength().getText();
        String strWidth=view.getTxtWidth().getText();
        this.length = Double.valueOf(strLength);
        this.width = Double.valueOf(strWidth);
        return (2*length)+(2*width);
    }
    
}
