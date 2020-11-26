/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tollmanagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author aashita
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    public Admin() {
        initComponents();
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
        txt1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rev1 = new javax.swing.JTextField();
        findrev = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        vno1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        owner1 = new javax.swing.JLabel();
        aadhaar1 = new javax.swing.JLabel();
        vtype1 = new javax.swing.JLabel();
        finddet = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        booth1 = new javax.swing.JComboBox<>();
        showlist = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter date(dd/mm/yyyy) :");

        jLabel2.setText("Total Revenue on this day :");

        findrev.setText("Find revenue");
        findrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findrevActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter Vehicle Number :");

        jLabel4.setText("Owner :");

        jLabel6.setText("Aadhaar Card Number :");

        jLabel7.setText("Vehicle Type :");

        finddet.setText("Find Details");
        finddet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finddetActionPerformed(evt);
            }
        });

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Ubuntu Light", 1, 24)); // NOI18N
        jLabel12.setText("ADMIN ACCESS");

        jLabel8.setText("Select Station :");

        booth1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Jaipur", "Delhi", "Nagpur", "Jodhpur", "Alwar", "Udaipur" }));

        showlist.setText("Show Transactions");
        showlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showlistActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S. No.", "Vehicle Number", "Owner", "Aadhaar", "Vehicle Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(owner1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(aadhaar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(vtype1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(256, 256, 256)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(299, 299, 299)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(46, 46, 46)
                                        .addComponent(vno1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(6, 6, 6)
                                            .addComponent(rev1))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel8))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txt1)
                                                .addComponent(booth1, 0, 268, Short.MAX_VALUE)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(finddet)
                                            .addComponent(findrev)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(showlist)
                                        .addGap(16, 16, 16)))))
                        .addGap(0, 194, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(booth1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(rev1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(findrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showlist)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(vno1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finddet))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(owner1))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(aadhaar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(vtype1))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void findrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findrevActionPerformed
        
        String dateString = txt1.getText();
        java.sql.Date sqlDate = null;
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = formatter.parse(dateString);
        } catch (ParseException ex) {
            Logger.getLogger(Calculate.class.getName()).log(Level.SEVERE, null, ex);
        }
        sqlDate = new java.sql.Date(date.getTime());
        
        String station=(String) booth1.getSelectedItem();
        int boothid = 0;
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/tollmanagement","root","aa872002");
            Statement stmt= (Statement) con.createStatement();
            String query="SELECT boothid FROM booth WHERE location='"+station+"';";
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next())
            {
                boothid = Integer.parseInt(rs.getString("boothid"));
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/tollmanagement","root","aa872002");
            Statement stmt= (Statement) con.createStatement();
            String query="SELECT sum(fare_amt) FROM transactions INNER JOIN fare ON transactions.fareid=fare.fareid WHERE boothid="+boothid+" AND visitdate='"+sqlDate+"';";
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next())
            {
                String sum = rs.getString("sum(fare_amt)");
                rev1.setText(sum);
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        

    }//GEN-LAST:event_findrevActionPerformed

    private void finddetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finddetActionPerformed
        String vno=vno1.getText();
        boolean flag=false;
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/tollmanagement","root","aa872002");
            Statement stmt= (Statement) con.createStatement();
            String query="SELECT owner,aadhaar,vehicletype FROM details WHERE vehicle_no='"+vno+"';";
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next())
            {
                flag=true;
                owner1.setText(rs.getString("owner"));
                aadhaar1.setText(rs.getString("aadhaar"));
                vtype1.setText(rs.getString("vehicletype"));
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Vehicle not found!!!");
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_finddetActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void showlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showlistActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        String dateString = txt1.getText();
        java.sql.Date sqlDate = null;
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = formatter.parse(dateString);
        } catch (ParseException ex) {
            Logger.getLogger(Calculate.class.getName()).log(Level.SEVERE, null, ex);
        }
        sqlDate = new java.sql.Date(date.getTime());
        
        String station=(String) booth1.getSelectedItem();
        int boothid = 0;
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/tollmanagement","root","aa872002");
            Statement stmt= (Statement) con.createStatement();
            String query="SELECT boothid FROM booth WHERE location='"+station+"';";
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next())
            {
                boothid = Integer.parseInt(rs.getString("boothid"));
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/tollmanagement","root","aa872002");
            Statement stmt= (Statement) con.createStatement();
            String query="Select distinct transactions.vehicle_no,owner,aadhaar,vehicletype from transactions inner join details on transactions.vehicle_no=details.vehicle_no where boothid="+boothid+" and visitdate='"+sqlDate+"';";
            ResultSet rs = stmt.executeQuery(query);
            int sno=0;
            while(rs.next())
            {
                sno+=1;
                String vehicle_no = rs.getString("vehicle_no");
                String owner = rs.getString("owner");
                String aadhaar = rs.getString("aadhaar");
                String vehicletype = rs.getString("vehicletype");
                model.addRow(new Object[] {sno,vehicle_no,owner,aadhaar,vehicletype});
                
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_showlistActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aadhaar1;
    private javax.swing.JComboBox<String> booth1;
    private javax.swing.JButton finddet;
    private javax.swing.JButton findrev;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel owner1;
    private javax.swing.JTextField rev1;
    private javax.swing.JButton showlist;
    private javax.swing.JTable table;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField vno1;
    private javax.swing.JLabel vtype1;
    // End of variables declaration//GEN-END:variables
}
