/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telephone_directory;

import kush.models.Mylib;
import java.sql.*;

/**
 *
 * @author acer
 */
public class RegForm1 extends javax.swing.JFrame {

    /**
     * Creates new form RegForm1
     */
    public RegForm1() {
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
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 3, 48)); // NOI18N
        jLabel1.setText("Registration Form");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(259, 47, 550, 60);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setText("First Name : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(154, 145, 190, 53);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(432, 147, 350, 53);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setText("Last Name :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(820, 150, 190, 53);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel4.setText("Father Name :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 239, 190, 53);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel5.setText("Address :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(820, 239, 190, 53);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel6.setText("City : ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(820, 327, 190, 53);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel7.setText("State :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 517, 190, 53);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel8.setText(" PinCode : ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(820, 517, 190, 53);

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel9.setText("Contact No. : ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(150, 600, 190, 53);

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel10.setText("Email ID :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(820, 600, 190, 53);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(1036, 152, 350, 53);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(430, 239, 350, 53);

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(1036, 241, 350, 53);

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(1036, 329, 350, 53);

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(jTextField6);
        jTextField6.setBounds(430, 517, 350, 53);

        jTextField7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(jTextField7);
        jTextField7.setBounds(1036, 519, 350, 53);

        jTextField8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(jTextField8);
        jTextField8.setBounds(430, 602, 350, 53);

        jTextField9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(jTextField9);
        jTextField9.setBounds(1036, 602, 350, 53);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(699, 696, 185, 52);

        jRadioButton2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jRadioButton2.setText("Female");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(600, 337, 190, 43);

        jRadioButton1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jRadioButton1.setText("Male");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(430, 340, 120, 43);

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel11.setText("Gender :");
        jLabel11.setToolTipText("");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(150, 337, 190, 53);

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel12.setText("Marital Status");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(150, 419, 190, 53);

        jRadioButton3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jRadioButton3.setText("Married");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(430, 419, 129, 43);

        jRadioButton4.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jRadioButton4.setText("UnMarried");
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(600, 424, 187, 43);

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel13.setText("Colony");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(820, 419, 190, 53);

        jTextField10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(jTextField10);
        jTextField10.setBounds(1036, 421, 350, 53);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String t1,t2,t3,t4,t5,t6,t8,t9,t10,t11,t12,t13;
        int t7;
        String gender="";
        String marital="";
        t1=jTextField1.getText();
        t2=jTextField2.getText();
        t3=jTextField3.getText();
        t4=jTextField4.getText();
        t5=jTextField5.getText();
        t6=jTextField6.getText();
        t7=Integer.parseInt(jTextField7.getText());
        t8=jTextField8.getText();
        t9=jTextField9.getText();
        t13=jTextField10.getText();
        if(jRadioButton1.isSelected()) gender="male";
        else gender="female";

        if(jRadioButton3.isSelected()) marital="married";
        else marital="unmarried";

        try
        {
            Mylib obj=new Mylib();
            Connection cn=obj.createconnection();

            String sql="INSERT INTO regdata VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement pst=cn.prepareStatement(sql);

            int id=obj.generateId("regdata",1);

            pst.setInt(1,id);
            pst.setString(2,t1);
            pst.setString(3,t2);
            pst.setString(4,t3);
            pst.setString(5,t4);
            pst.setString(6,t5);
            pst.setString(7,t6);
            pst.setInt(8,t7);
            pst.setString(9,t8);
            pst.setString(10,t9);
            pst.setString(11,t13);
            pst.setString(12,gender);
            pst.setString(13,marital);

            pst.executeUpdate();

            javax.swing.JOptionPane.showMessageDialog(null,"Equipment ID is : "+id);

            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            jTextField9.setText("");
            jTextField10.setText("");
            jRadioButton1.setText("");
            jRadioButton2.setText("");
            jRadioButton3.setText("");
            jRadioButton4.setText("");

        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, ""+e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegForm1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
