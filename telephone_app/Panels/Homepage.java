/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telephone_app.Panels;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author acer
 */
public class Homepage extends javax.swing.JPanel {

    /**
     * Creates new form Homepage
     */
    public Homepage() {
        initComponents();
        setSize(1000,1000);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Algerian", 3, 48)); // NOI18N
        jLabel1.setText("WELCOME");
        add(jLabel1);
        jLabel1.setBounds(310, 110, 260, 76);

        jLabel2.setBackground(new java.awt.Color(255, 255, 153));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel2.setText("TO");
        add(jLabel2);
        jLabel2.setBounds(400, 200, 90, 62);

        jLabel3.setBackground(new java.awt.Color(170, 0, 204));
        jLabel3.setFont(new java.awt.Font("Dialog", 3, 40)); // NOI18N
        jLabel3.setText("TELEPHONE DIRECTORY");
        add(jLabel3);
        jLabel3.setBounds(307, 290, 500, 68);

        jButton2.setBackground(new java.awt.Color(255, 255, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton2.setText("Enter");
        add(jButton2);
        jButton2.setBounds(260, 470, 160, 60);

        jButton3.setBackground(new java.awt.Color(255, 255, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton3.setText("Exit");
        add(jButton3);
        jButton3.setBounds(570, 470, 160, 60);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton jButton2;
    javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
