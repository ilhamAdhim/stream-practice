package views;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import controller.Assignment1;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ilham A
 */
public class assignment1 extends javax.swing.JFrame {
    private final Assignment1 controller;
    /**
     * Creates new form assignment1
     */
    public assignment1() {
        initComponents();
        controller=new Assignment1(this);
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

        loadFile = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        btnRead = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        menuButton = new javax.swing.JMenu();
        readFile = new javax.swing.JMenuItem();
        saveByte = new javax.swing.JMenuItem();
        saveFile = new javax.swing.JMenuItem();
        rectArea = new javax.swing.JMenuItem();
        mnlineNumber = new javax.swing.JMenuItem();
        rectArea1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setText("Praktikum 1");

        btnRead.setText("Read File");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        menuBar.setBackground(new java.awt.Color(204, 204, 255));
        menuBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menuBar.setToolTipText("");

        menuButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menuButton.setText("Practice");
        menuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        readFile.setText("Read File");
        readFile.setEnabled(false);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(btnRead)))
                        .addGap(0, 151, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRead)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void readFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readFileActionPerformed
        // TODO add your handling code here:
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

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        // TODO add your handling code here:
        controller.read();
    }//GEN-LAST:event_btnReadActionPerformed

    private void rectAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectAreaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AreaCalc rect = new AreaCalc();
        rect.setVisible(true);
    }//GEN-LAST:event_rectAreaActionPerformed

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


    public JButton getBtnRead() {
        return btnRead;
    }

    public JFileChooser getLoadFile() {
        return loadFile;
    }

    public JTextArea getTxtArea() {
        return txtArea;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRead;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFileChooser loadFile;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuButton;
    private javax.swing.JMenuItem mnlineNumber;
    private javax.swing.JMenuItem readFile;
    private javax.swing.JMenuItem rectArea;
    private javax.swing.JMenuItem rectArea1;
    private javax.swing.JMenuItem saveByte;
    private javax.swing.JMenuItem saveFile;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
