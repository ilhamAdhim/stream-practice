/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controller.Logs;
import java.awt.HeadlessException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Ilham A
 */
public class AreaCalc extends javax.swing.JFrame {
    private final controller.AreaCalc controller;
    private final Logs log;

    /**
     * Creates new form AreaCalc
     */
    public AreaCalc() {
        initComponents();
        controller=new controller.AreaCalc(this);
        log=new Logs(this);
        this.setTitle("Network Programming");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLength = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtWidth = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPerimeter = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnClear = new javax.swing.JButton();
        btnCalculate = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuButton = new javax.swing.JMenu();
        readFile = new javax.swing.JMenuItem();
        saveByte = new javax.swing.JMenuItem();
        saveFile = new javax.swing.JMenuItem();
        rectArea = new javax.swing.JMenuItem();
        mnlineNumber = new javax.swing.JMenuItem();
        rectArea1 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu3.setText("File");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Tugas Praktikum 4");

        jLabel2.setText("Length");

        txtLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLengthActionPerformed(evt);
            }
        });

        jLabel3.setText("Width");

        txtWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWidthActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Result");
        jLabel4.setToolTipText("");

        jLabel5.setText("Area");

        txtArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtArea.setEnabled(false);
        txtArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaActionPerformed(evt);
            }
        });

        jLabel6.setText("Perimeter");

        txtPerimeter.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPerimeter.setEnabled(false);
        txtPerimeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerimeterActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        menuBar.setBackground(new java.awt.Color(204, 204, 255));
        menuBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuBar.setToolTipText("");

        menuButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menuButton.setText("Practice");
        menuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        readFile.setText("Read File");
        readFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readFileActionPerformed(evt);
            }
        });
        menuButton.add(readFile);

        saveByte.setText("Save Byte File");
        saveByte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveByteActionPerformed(evt);
            }
        });
        menuButton.add(saveByte);

        saveFile.setText("Filter Stream");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        menuButton.add(saveFile);

        rectArea.setText("AreaCalculator");
        rectArea.setEnabled(false);
        rectArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectAreaActionPerformed(evt);
            }
        });
        menuButton.add(rectArea);

        mnlineNumber.setText("Line Number");
        mnlineNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnlineNumberActionPerformed(evt);
            }
        });
        menuButton.add(mnlineNumber);

        rectArea1.setText("Pushback Assignment");
        rectArea1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectArea1ActionPerformed(evt);
            }
        });
        menuButton.add(rectArea1);

        menuBar.add(menuButton);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPerimeter, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(33, 33, 33)))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnCalculate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnCalculate))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(txtPerimeter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void readFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readFileActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        assignment1 assignmen1=new assignment1();
        assignmen1.setVisible(true);
    }//GEN-LAST:event_readFileActionPerformed

    private void saveByteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveByteActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        assignment2 menu;
        menu = new assignment2();
        menu.setVisible(true);
    }//GEN-LAST:event_saveByteActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        assignment4 menu = new assignment4();
        menu.setVisible(true);
    }//GEN-LAST:event_saveFileActionPerformed

    private void rectAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rectAreaActionPerformed

    private void txtLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLengthActionPerformed

    private void txtWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWidthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWidthActionPerformed

    private void txtAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaActionPerformed

    private void txtPerimeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerimeterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerimeterActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
        
        String logMessage="";
        Calendar cal = Calendar.getInstance();
        try{
            if(!txtLength.getText().isEmpty() && !txtWidth.getText().isEmpty()){
                String length=txtLength.getText();
                String width = txtWidth.getText();
                String check= length+width;
                boolean isNumber=true;
                for(char c:check.toCharArray()){
                    if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                        isNumber=false;
                        logMessage = cal.getTime()+" | Operation Error\nOperation with non numeric value";
                        log.setLogErr(logMessage);
                        JOptionPane.showMessageDialog(rootPane, "Length and Width field should be a number", "Error", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                }
                if(isNumber){
                    if(Integer.valueOf(length)<=0 || Integer.valueOf(width)<=0){
                        logMessage = cal.getTime()+" | Operation Error\nInvalid input number. Zero operation Error";
                        log.setLogErr(logMessage);
                        JOptionPane.showMessageDialog(rootPane, "Invalid input number of zero operation.","Error",JOptionPane.ERROR_MESSAGE);
                    }else{
                        this.txtArea.setText(String.valueOf(controller.getArea()));
                        this.txtPerimeter.setText(String.valueOf(controller.getPerimeter()));

                        logMessage = cal.getTime()+" | Operation Fine\nRectangle "+txtLength.getText()+" x "+txtWidth.getText()+" | Area = "+controller.getArea()+" - Perimeter = "+controller.getPerimeter();
                        log.setLog(logMessage);
                    }
                }
            }else{
                
                logMessage = cal.getTime()+" | Operation Warning\nOperation with empty Length or Width field";
                log.setLogErr(logMessage);
                JOptionPane.showMessageDialog(rootPane, "Length and Width field should not be empty", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
        }catch(HeadlessException ex){
            
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        this.txtLength.setText("");
        this.txtWidth.setText("");
        this.txtArea.setText("");
        this.txtPerimeter.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Logs.output.close();
        Logs.outputErr.close();
    }//GEN-LAST:event_formWindowClosing

    private void mnlineNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnlineNumberActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        assignment5 view = new assignment5();
        view.setVisible(true);
    }//GEN-LAST:event_mnlineNumberActionPerformed

    private void rectArea1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectArea1ActionPerformed
        // TODO add your handling code here:
        assignment6 view = new assignment6();
        this.setVisible(false);
        view.setVisible(true);
    }//GEN-LAST:event_rectArea1ActionPerformed


    public JTextField getTxtLength() {
        return txtLength;
    }

    public JTextField getTxtWidth() {
        return txtWidth;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuButton;
    private javax.swing.JMenuItem mnlineNumber;
    private javax.swing.JMenuItem readFile;
    private javax.swing.JMenuItem rectArea;
    private javax.swing.JMenuItem rectArea1;
    private javax.swing.JMenuItem saveByte;
    private javax.swing.JMenuItem saveFile;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtLength;
    private javax.swing.JTextField txtPerimeter;
    private javax.swing.JTextField txtWidth;
    // End of variables declaration//GEN-END:variables
}
