
package telephone_app.Panels;

import java.awt.event.*;

import java.sql.*;

import javax.swing.table.DefaultTableModel;
import kush.models.Mylib;
/**
 *
 * @author acer
 */
public class SearchBy extends javax.swing.JPanel {

    /**
     * Creates new form SearcgBy
     */
    DefaultTableModel dtm1;
    public SearchBy() {
        initComponents();
        setSize(1000,1000);
        setVisible(true);
        jButton1.addActionListener(new C());
    }
    class C implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            String t1;
        t1 = jTextField1.getText();
        try {
            Mylib obj=new Mylib();
            Connection cn=obj.createconnection();

             String sql = "Select * from regdata";
            ResultSet rs = obj.fetchData(sql);
            dtm1= new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                    
                    
            },
            new String [] {
                "ID", "Name", "Father Name", "Address", "Colony", "Phone Number"
            }
        );
            dtm1.removeRow(0);
            jTable1.setRowHeight(40);
            while (rs.next()) {
               
                String id, name, father, address, colony, phone;
                phone = rs.getString(9).trim();
                if (phone.equalsIgnoreCase(t1)) {
                    id = rs.getString(1).trim();
                    name = rs.getString(2).trim();
                    address = rs.getString(5).trim();
                    father = rs.getString(4).trim();
                    colony = rs.getString(11).trim();
                    dtm1.addRow(new Object[]{id, name, father, address, colony, phone});
                }
            }
            jTable1.setModel(dtm1);
            
            
        } catch (Exception y) {
           javax.swing.JOptionPane.showMessageDialog(null, "" + y);
        }
        }
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
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Contact : ");
        add(jLabel1);
        jLabel1.setBounds(190, 170, 160, 60);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        add(jTextField1);
        jTextField1.setBounds(340, 180, 350, 50);

        jScrollPane1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Father Name", "Address", "Colony", "Phone Number"
            }
        ));
        jTable1.setIntercellSpacing(new java.awt.Dimension(10, 10));
        jTable1.setMaximumSize(new java.awt.Dimension(2147483647, 15000));
        jTable1.setMinimumSize(new java.awt.Dimension(90, 500));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 400, 1100, 370);

        jLabel2.setFont(new java.awt.Font("Algerian", 3, 48)); // NOI18N
        jLabel2.setText("Search By Contact");
        add(jLabel2);
        jLabel2.setBounds(250, 30, 630, 80);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1.setText("Search");
        add(jButton1);
        jButton1.setBounds(290, 300, 190, 50);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
