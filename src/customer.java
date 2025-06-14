/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shoan
 */
public class customer extends javax.swing.JPanel {
    
    String name;
    String cus_tp; 
    String search;

    /**
     * Creates new form customer
     */
    public customer() {
        initComponents();
        tb_load();
        
    }
public void tb_load(){
    try{
        
        DefaultTableModel dt = (DefaultTableModel) tbl_Customer.getModel();
        dt.setRowCount(0);
        
        Statement s = db.mycon().createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM customer");
        

        while (rs.next()){
            Vector v =  new Vector ();
            v.add(rs.getString(1));
            v.add(rs.getString(2));
            v.add(rs.getString(3));
           
            dt.addRow(v);
            
        }
        
    }catch (Exception e){
        System.out.println(e);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new FancyPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Cus_Name = new javax.swing.JTextField();
        txt_Cus_TP = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        btn_Save = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Customer = new javax.swing.JTable();
        jPanel3 = new FancyPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_SearchID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_SearchID_tbl = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name ;");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("T.P Number ;");

        txt_Cus_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Cus_NameActionPerformed(evt);
            }
        });

        txt_Cus_TP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Cus_TPActionPerformed(evt);
            }
        });

        btn_search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-search-16.png"))); // NOI18N
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btn_Update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-update-16.png"))); // NOI18N
        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        btn_Save.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-save-16.png"))); // NOI18N
        btn_Save.setText("Save");
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });

        btn_Delete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-delete-16.png"))); // NOI18N
        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Cus_TP, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(txt_Cus_Name)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btn_Save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Update)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Delete)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Cus_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Cus_TP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_search)
                    .addComponent(btn_Update)
                    .addComponent(btn_Save)
                    .addComponent(btn_Delete))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        tbl_Customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Customer Name", "T.P Number"
            }
        ));
        tbl_Customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_CustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Customer);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search ID ;");

        txt_SearchID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_SearchIDKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Customer Info");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_SearchID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_SearchID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Search Name;");

        txt_SearchID_tbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SearchID_tblActionPerformed(evt);
            }
        });
        txt_SearchID_tbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_SearchID_tblKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_SearchID_tblKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29)
                        .addComponent(txt_SearchID_tbl, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_SearchID_tbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed

        name = txt_Cus_Name.getText();
        cus_tp = txt_Cus_TP.getText();
        
        if (!InputValidator.validateNotNullOrEmpty(name)) {
        JOptionPane.showMessageDialog(null, "Field not be null.");
        return;
        }
        if (!InputValidator.validateNotNullOrEmpty(cus_tp)) {
        JOptionPane.showMessageDialog(null, "Field not be null.");
        return;
        }
        
        if (!InputValidator.validateLettersOnly(name)) {
        JOptionPane.showMessageDialog(null, "Name should contain letters only.");
        return;
        }
        
        // Validate phone number - 10 digits only
        if (!InputValidator.validatePhoneNumber(cus_tp)) {
        JOptionPane.showMessageDialog(null, "Please enter a valid phone number.");
        return;
        } 
         
            
        try {
            
            Statement s = db.mycon().createStatement();
            s.executeUpdate("INSERT INTO customer (customer_name,TP_Number) VALUES('"+name+"','"+cus_tp+"') ");
            
            JOptionPane.showMessageDialog(null,"Details Saved Succesfully");
            tb_load();
            txt_Cus_Name.setText("");
            txt_Cus_TP.setText("");
            txt_SearchID.setText("");
            
            
        }
        catch (SQLException e){   
            System.out.println(e);     
        }     
        
        
        
    }//GEN-LAST:event_btn_SaveActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // search
        
        search = txt_SearchID.getText();
        if (!InputValidator.validateNotNullOrEmpty(search)) {
        JOptionPane.showMessageDialog(null, "Search Field not be null.");
        return;
        }
         
        tb_load();
        
        
        try{
            Statement s = db.mycon ().createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM customer WHERE cid = '"+search+"' ");
            //TP_Number
            //customer_name
            if (rs.next()){
                txt_Cus_Name.setText(rs.getString("customer_name"));
                txt_Cus_TP.setText(rs.getString("TP_Number"));
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Customer ID");
            }
            
        }catch (SQLException e){
            System.out.println(e);      
    }
        tb_load();
    }//GEN-LAST:event_btn_searchActionPerformed

 
    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        // update button
        
        name = txt_Cus_Name.getText();
        cus_tp = txt_Cus_TP.getText();
        
        if (!InputValidator.validateNotNullOrEmpty(name)) {
        JOptionPane.showMessageDialog(null, "Fields not be null.");
        return;
        }
        if (!InputValidator.validateNotNullOrEmpty(cus_tp)) {
        JOptionPane.showMessageDialog(null, "Fields not be null.");
        return;
        }
       
        if (!InputValidator.validateLettersOnly(name)) {
        JOptionPane.showMessageDialog(null, "Name should contain letters only.");
        return;
        }
        
        // Validate phone number - 10 digits only
        if (!InputValidator.validatePhoneNumber(cus_tp)) {
        JOptionPane.showMessageDialog(null, "Please enter a valid phone number.");
        return;
        } 
        
        String id = txt_SearchID.getText();
        String name = txt_Cus_Name.getText();
        String tp = txt_Cus_TP.getText();
        
      
        
        try {
            
            Statement s = db.mycon().createStatement();
            s.executeUpdate("UPDATE customer SET customer_name = '"+name+"', TP_Number = '"+tp+"' WHERE cid = '"+id+"'");
            
            JOptionPane.showMessageDialog(null,"Data Updated Succesfullly");
            txt_Cus_Name.setText("");
            txt_Cus_TP.setText("");
            txt_SearchID.setText("");
            tb_load();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
      

        String id = txt_SearchID.getText();
         
        try{
            Statement s = db.mycon().createStatement();
            s.executeUpdate ("DELETE FROM customer WHERE cid = '"+id+"'");
            JOptionPane.showMessageDialog(null,"Date Deleted Succesfully");
           
            txt_Cus_Name.setText("");
            txt_Cus_TP.setText("");
            txt_SearchID.setText("");
            tb_load();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void tbl_CustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_CustomerMouseClicked
        // Mouse Click & get data to text field:
        
        int r = tbl_Customer.getSelectedRow();
        
        String id = tbl_Customer.getValueAt(r,0).toString();
        String name = tbl_Customer.getValueAt(r, 1).toString();
        String tp = tbl_Customer.getValueAt(r, 2).toString();
        
        txt_SearchID.setText(id);
        txt_Cus_Name.setText(name);
        txt_Cus_TP.setText(tp);
    }//GEN-LAST:event_tbl_CustomerMouseClicked

    private void txt_SearchID_tblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SearchID_tblActionPerformed
        
       
    }//GEN-LAST:event_txt_SearchID_tblActionPerformed

    private void txt_SearchID_tblKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SearchID_tblKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SearchID_tblKeyPressed

    private void txt_SearchID_tblKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SearchID_tblKeyReleased
        // TODO add your handling code here:
        String name = txt_SearchID_tbl.getText();
         
        try{
            DefaultTableModel dt = (DefaultTableModel) tbl_Customer.getModel();
            dt.setRowCount(0);
            Statement s = db.mycon().createStatement();
            
            ResultSet rs = s.executeQuery("SELECT * FROM customer WHERE customer_name LIKE'%"+name+"%'");
            
            while (rs.next()){
                Vector v = new Vector ();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                
                dt.addRow(v);
            }
        }catch (Exception e){
            tb_load();
        }
        
       
    }//GEN-LAST:event_txt_SearchID_tblKeyReleased

    private void txt_Cus_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Cus_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Cus_NameActionPerformed

    private void txt_SearchIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SearchIDKeyReleased
        if (txt_SearchID.getText().trim().isEmpty()) {
        txt_Cus_Name.setText("");
        txt_Cus_TP.setText("");
        txt_SearchID.setText("");
        }
    }//GEN-LAST:event_txt_SearchIDKeyReleased

    private void txt_Cus_TPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Cus_TPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Cus_TPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Save;
    private javax.swing.JButton btn_Update;
    private javax.swing.JButton btn_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Customer;
    private javax.swing.JTextField txt_Cus_Name;
    private javax.swing.JTextField txt_Cus_TP;
    private javax.swing.JTextField txt_SearchID;
    private javax.swing.JTextField txt_SearchID_tbl;
    // End of variables declaration//GEN-END:variables
}
