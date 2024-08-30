/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telephone_app.Panels;


import java.awt.event.*;
import java.sql.*;
import kush.models.Mylib;

/**
 *
 * @author acer
 */
public class AdminUpdate extends javax.swing.JPanel {

    /**
     * Creates new form AdminUpdate
     */
    public AdminUpdate() {
        initComponents();
        setSize(1000, 1000);
        setVisible(true);
        jButton5.addActionListener(new E());
        jButton1.addActionListener(new F());
        jButton6.addActionListener(new G());
        jButton7.addActionListener(new H());
    }
    
    class E implements ActionListener
    {
        public void actionPerformed(ActionEvent ae) 
        {
           String t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11;
        t1 = jTextField1.getText();
        t2 = jTextField2.getText();
        t3 = jTextField3.getText();
        t4 = jTextField4.getText();
        t5 = jTextField5.getText();
        t6 = jTextField6.getText();
        t7 = jTextField7.getText();
        t8 = jTextField8.getText();
        t9 = jTextField9.getText();
        t10 = jTextField10.getText();
        t11 = jTextField11.getText();

        try {
            Mylib obj = new Mylib();
            Connection cn = obj.createconnection();
            String sql = "SELECT * FROM admindata WHERE AdminID=?";

            PreparedStatement pst = cn.prepareStatement(sql);

            int n = Integer.parseInt(jTextField11.getText().trim());

            pst.setInt(1, n);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                jTextField11.setEnabled(false);
                jButton1.setEnabled(true);
                jButton7.setEnabled(true);
                jButton6.setEnabled(true);
                jButton5.setEnabled(false);

                jTextField1.setText(rs.getString(2));
                jTextField2.setText(rs.getString(3));
                jTextField3.setText(rs.getString(4));
                jTextField4.setText(rs.getString(5));
                jTextField5.setText(rs.getString(6));
                jTextField6.setText(rs.getString(7));
                jTextField7.setText(rs.getString(8));
                jTextField8.setText(rs.getString(9));
                jTextField9.setText(rs.getString(10));
                jTextField10.setText(rs.getString(10));

            }
            else
            {
                javax.swing.JOptionPane.showMessageDialog(null,"Invalid ID");
            }
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, ""+e);
        }  
        }
    }
    
    class F implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
          String t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11;
        t1 = jTextField1.getText();
        t2 = jTextField2.getText();
        t3 = jTextField3.getText();
        t4 = jTextField4.getText();
        t5 = jTextField5.getText();
        t6 = jTextField6.getText();
        t7 = jTextField7.getText();
        t8 = jTextField8.getText();
        t9 = jTextField9.getText();
        t10 = jTextField10.getText();
        t11 = jTextField11.getText();
        try
        {
            Mylib obj=new Mylib();
            Connection cn=obj.createconnection();
            String s1="update admindata set name=?,fname=?,address=?,city=?,state=?,pincode=?,contact=?,eid=?,password=? where AdminID=?";
            PreparedStatement p1=cn.prepareStatement(s1);
            int n=Integer.parseInt(t11.trim());
            p1.setString(1, t1);
            p1.setString(2, t2);
            p1.setString(3, t3);
            p1.setString(4, t4);
            p1.setString(5, t5);
            p1.setString(6, t6);
            p1.setString(7, t7);
            p1.setString(8, t8);
            p1.setString(9, t9);

            p1.setInt(10, n);

            int a=p1.executeUpdate();
            if(a==1)
            {
                javax.swing.JOptionPane.showMessageDialog(null,"Updated");
                resetform();
            }
            else
            {
                javax.swing.JOptionPane.showMessageDialog(null,"Not Updated");

            }
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, ""+e);
        }  
       }
    }
    
    
     class G implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
           String t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11;
        t1 = jTextField1.getText();
        t2 = jTextField2.getText();
        t3 = jTextField3.getText();
        t4 = jTextField4.getText();
        t5 = jTextField5.getText();
        t6 = jTextField6.getText();
        t7 = jTextField7.getText();
        t8 = jTextField8.getText();
        t9 = jTextField9.getText();
        t10 = jTextField10.getText();
        t11 = jTextField11.getText();
        try
        {
            Mylib obj=new Mylib();
            Connection cn=obj.createconnection();
            String s1="delete from admindata where AdminID=?";
            PreparedStatement p1=cn.prepareStatement(s1);
            int n=Integer.parseInt(t11.trim());
            p1.setInt(1, n);

            int a=p1.executeUpdate();
            if(a==1)
            {
                javax.swing.JOptionPane.showMessageDialog(null,"Data of ID: "+n+"is deleted");
                resetform();
            }
            else
            {
                javax.swing.JOptionPane.showMessageDialog(null,"Already deleted,cannot delete");

            }
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, ""+e);
        } 
        }
    }
      class H implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            resetform();
        }
    }
      public void resetform()
{
    jButton5.setEnabled(true);
    jButton6.setEnabled(false);
    jButton7.setEnabled(false);
    
    jTextField11.setEnabled(true);
    jButton1.setEnabled(false);
    
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
	jTextField11.setText("");
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 3, 48)); // NOI18N
        jLabel1.setText("Admin Update Form");
        add(jLabel1);
        jLabel1.setBounds(270, 40, 540, 64);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setText("Name :");
        add(jLabel2);
        jLabel2.setBounds(50, 220, 136, 53);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setText("Father Name :");
        add(jLabel3);
        jLabel3.setBounds(670, 230, 186, 35);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel4.setText("Address :");
        add(jLabel4);
        jLabel4.setBounds(50, 300, 124, 35);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel5.setText("City : ");
        add(jLabel5);
        jLabel5.setBounds(680, 310, 77, 35);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel6.setText("State");
        add(jLabel6);
        jLabel6.setBounds(50, 380, 71, 35);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        add(jTextField1);
        jTextField1.setBounds(290, 220, 347, 53);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel7.setText("PinCode : ");
        add(jLabel7);
        jLabel7.setBounds(680, 370, 136, 54);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel8.setText("Contact No. : ");
        add(jLabel8);
        jLabel8.setBounds(50, 450, 186, 53);

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel9.setText("Eid : ");
        add(jLabel9);
        jLabel9.setBounds(50, 530, 136, 53);

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel10.setText("Password : ");
        add(jLabel10);
        jLabel10.setBounds(670, 450, 186, 53);

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel11.setText("Confirm Pass : ");
        add(jLabel11);
        jLabel11.setBounds(660, 530, 198, 53);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        add(jTextField2);
        jTextField2.setBounds(920, 220, 347, 53);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        add(jTextField3);
        jTextField3.setBounds(290, 300, 347, 53);

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        add(jTextField4);
        jTextField4.setBounds(920, 300, 347, 53);

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        add(jTextField5);
        jTextField5.setBounds(290, 370, 347, 53);

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        add(jTextField6);
        jTextField6.setBounds(920, 370, 347, 53);

        jTextField7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        add(jTextField7);
        jTextField7.setBounds(290, 450, 347, 53);

        jTextField8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        add(jTextField8);
        jTextField8.setBounds(290, 530, 347, 53);

        jTextField9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        add(jTextField9);
        jTextField9.setBounds(920, 450, 347, 53);

        jTextField10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        add(jTextField10);
        jTextField10.setBounds(920, 530, 347, 53);

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel12.setText("Admin ID : ");
        add(jLabel12);
        jLabel12.setBounds(50, 150, 156, 53);

        jTextField11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        add(jTextField11);
        jTextField11.setBounds(290, 150, 347, 53);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton5.setText("Show");
        add(jButton5);
        jButton5.setBounds(700, 150, 150, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1.setText("Update");
        add(jButton1);
        jButton1.setBounds(230, 625, 170, 50);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton6.setText("Delete");
        add(jButton6);
        jButton6.setBounds(470, 625, 160, 50);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton7.setText("Cancel");
        add(jButton7);
        jButton7.setBounds(720, 625, 160, 50);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton5;
    javax.swing.JButton jButton6;
    javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
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
