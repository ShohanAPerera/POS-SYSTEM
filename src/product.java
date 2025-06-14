

import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class product extends javax.swing.JPanel {
    
    public product(){  
        initComponents();
        tb_load();
    }

    public void tb_load(){
    try{
        
        DefaultTableModel dt = (DefaultTableModel) tbl_product.getModel();
        dt.setRowCount(0);
        
        Statement s = db.mycon().createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM product");
        

        while (rs.next()){
            Vector v =  new Vector ();
            
            v.add(rs.getString(1));
            v.add(rs.getString(2));
            v.add(rs.getString(3));
            v.add(rs.getString(4));
            v.add(rs.getString(5));
            v.add(rs.getString(6));
           
           
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
        p_name = new javax.swing.JTextField();
        p_bar_code = new javax.swing.JTextField();
        p_search = new javax.swing.JButton();
        p_save = new javax.swing.JButton();
        p_delete = new javax.swing.JButton();
        p_update = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        p_s_id = new javax.swing.JTextField();
        p_price = new javax.swing.JTextField();
        p_qty = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_product = new javax.swing.JTable();
        jPanel3 = new FancyPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_srch_id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_srch_pid = new javax.swing.JTextField();

        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name ;");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Supplier ID");

        p_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-search-16.png"))); // NOI18N
        p_search.setText("Search");
        p_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_searchActionPerformed(evt);
            }
        });

        p_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-save-16.png"))); // NOI18N
        p_save.setText("Save");
        p_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_saveActionPerformed(evt);
            }
        });

        p_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-delete-16.png"))); // NOI18N
        p_delete.setText("Delete");
        p_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_deleteActionPerformed(evt);
            }
        });

        p_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-update-16.png"))); // NOI18N
        p_update.setText("Update");
        p_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_updateActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Qty");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bar Code");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(p_bar_code, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                    .addComponent(p_name, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p_price)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel6)
                                .addGap(59, 59, 59)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(p_s_id, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                    .addComponent(p_qty)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(p_save)
                                .addGap(18, 18, 18)
                                .addComponent(p_search)
                                .addGap(18, 18, 18)
                                .addComponent(p_update)
                                .addGap(18, 18, 18)
                                .addComponent(p_delete))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(p_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(p_bar_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(p_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(p_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(p_s_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p_save)
                    .addComponent(p_search)
                    .addComponent(p_update)
                    .addComponent(p_delete))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        tbl_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Product Name", "Bar Code", "Price", "Qty", "SID"
            }
        ));
        tbl_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_productMouseClicked(evt);
            }
        });
        tbl_product.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_productKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_productKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_product);

        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("P  ID ;");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Product Info");

        txt_srch_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_srch_idActionPerformed(evt);
            }
        });
        txt_srch_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_srch_idKeyReleased(evt);
            }
        });

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
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(txt_srch_id, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_srch_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Search;");

        txt_srch_pid.setText("0");
        txt_srch_pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_srch_pidActionPerformed(evt);
            }
        });
        txt_srch_pid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_srch_pidKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(29, 29, 29)
                        .addComponent(txt_srch_pid, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(txt_srch_pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_srch_pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_srch_pidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_srch_pidActionPerformed

    private void txt_srch_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_srch_idActionPerformed

    }//GEN-LAST:event_txt_srch_idActionPerformed

    private void tbl_productKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_productKeyPressed
        int r = tbl_product.getSelectedRow();

        String id = tbl_product.getValueAt(r, 0).toString();
        String name = tbl_product.getValueAt(r, 1).toString();
        String barcode = tbl_product.getValueAt(r, 2).toString();
        String price = tbl_product.getValueAt(r, 3).toString();
        String Qty = tbl_product.getValueAt(r, 4).toString();
        String sid = tbl_product.getValueAt(r, 5).toString();

        txt_srch_id.setText(id);
        p_name.setText(name);
        p_bar_code.setText(barcode);
        p_price.setText(price);
        p_qty.setText(Qty);
        p_s_id.setText(sid);

    }//GEN-LAST:event_tbl_productKeyPressed

    private void tbl_productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_productMouseClicked
        int r = tbl_product.getSelectedRow();

        String id = tbl_product.getValueAt(r, 0).toString();
        String name = tbl_product.getValueAt(r, 1).toString();
        String barcode = tbl_product.getValueAt(r, 2).toString();
        String price = tbl_product.getValueAt(r, 3).toString();
        String Qty = tbl_product.getValueAt(r, 4).toString();
        String sid = tbl_product.getValueAt(r, 5).toString();

        txt_srch_id.setText(id);
        p_name.setText(name);
        p_bar_code.setText(barcode);
        p_price.setText(price);
        p_qty.setText(Qty);
        p_s_id.setText(sid);

    }//GEN-LAST:event_tbl_productMouseClicked

    private void p_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_updateActionPerformed
        // update btn
        String search_id = txt_srch_id.getText();
        String name = p_name.getText();
        String barcode= p_bar_code.getText();
        String price = p_price.getText();
        String qty = p_qty.getText();
        String sid = p_s_id.getText();

        try {
            Statement s = db.mycon().createStatement();
            s.executeUpdate("UPDATE product SET Product_Name='" + name + "', Bar_code='" + barcode + "', Price='" + price + "', Qty='" + qty + "', sid='" + sid + "' WHERE pid='" + search_id + "'");
            JOptionPane.showMessageDialog(null,"Updated Succesfully");
            p_name.setText("");
            p_bar_code.setText("");
            p_price.setText("");
            p_qty.setText("");
            p_s_id.setText("");
            txt_srch_id.setText("");
        }catch (Exception e){
            System.out.print(e);
        }
        tb_load();
    }//GEN-LAST:event_p_updateActionPerformed

    private void p_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_deleteActionPerformed
        //Delete Btn
       String search_id = txt_srch_id.getText();
       if (!InputValidator.validateNotNullOrEmpty(search_id)) {
       JOptionPane.showMessageDialog(null, "Fields can not be empty");
       return;
       }
        
        try {
            Statement s = db.mycon().createStatement();
            s.executeUpdate("DELETE FROM product WHERE pid = '"+search_id+"' ");
            JOptionPane.showMessageDialog(null,"Data Deleted Succesfull");
            p_name.setText("");
            p_bar_code.setText("");
            p_price.setText("");
            p_qty.setText("");
            p_s_id.setText("");
            txt_srch_id.setText("");
            tb_load(); // Refresh the table
        }
        catch(Exception e){
            System.out.println(e);
        }
        tb_load();
    }//GEN-LAST:event_p_deleteActionPerformed

    private void p_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_saveActionPerformed
        //Save Button
        String name = p_name.getText().trim();
        String barcode = p_bar_code.getText().trim();
        String price = p_price.getText().trim();
        String qty = p_qty.getText().trim();
        String sid = p_s_id.getText().trim();

       // Validate all fields before inserting
       if (!InputValidator.validateNotNullOrEmpty(name)) {
       JOptionPane.showMessageDialog(null, "Product name cannot be empty.");
       return;
       }
       if (!InputValidator.validateLettersOnly(name)) {
       JOptionPane.showMessageDialog(null, "Product name should contain letters only.");
       return;
       }
       if (!InputValidator.validateNotNullOrEmpty(barcode)) {
       JOptionPane.showMessageDialog(null, "Barcode cannot be empty.");
       return;
       } 
       if (!InputValidator.validateDigitsOnly(price)) {
       JOptionPane.showMessageDialog(null, "Price must contain digits only.");
       return;
       }
       if (!InputValidator.validateDigitsOnly(qty)) {
      JOptionPane.showMessageDialog(null, "Quantity must contain digits only.");
      return;
       }
       if (!InputValidator.validateDigitsOnly(sid)) {
       JOptionPane.showMessageDialog(null, "Supplier ID must contain digits only.");
       return;
}

      // All validations passed — insert data
     try {
     Statement s = db.mycon().createStatement();
     s.executeUpdate("INSERT INTO product (Product_Name, Bar_code, Price, Qty, sid) " +
                    "VALUES ('" + name + "', '" + barcode + "', '" + price + "', '" + qty + "', '" + sid + "')");
     

     JOptionPane.showMessageDialog(null, "Data Saved Successfully");
     txt_srch_id.setText("");
     p_name.setText("");
     p_bar_code.setText("");
     p_price.setText("");
     p_qty.setText("");
     p_s_id.setText("");
     
     tb_load(); // Refresh the table

    } catch (Exception e) {
     System.out.println(e);
     JOptionPane.showMessageDialog(null, "Failed to save data: " + e.getMessage());
  }


    }//GEN-LAST:event_p_saveActionPerformed

    private void p_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_searchActionPerformed
        //btn Search
       String search = txt_srch_id.getText();
       if (!InputValidator.validateNotNullOrEmpty(search)) {
       JOptionPane.showMessageDialog(null, "Product name cannot be empty.");
       return;
       }
        

        try {

            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM product WHERE pid = '"+search+"'");

            if (rs.next()){
                p_name.setText(rs.getString("Product_Name"));
                p_bar_code.setText(rs.getString("Bar_code"));
                p_price.setText(rs.getString("Price"));
                p_qty.setText(rs.getString("Qty"));
                p_s_id.setText(rs.getString("sid"));

            }

        }catch (Exception e){
            System.out.println(e);
        }

        tb_load();
    }//GEN-LAST:event_p_searchActionPerformed

    private void txt_srch_pidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_srch_pidKeyReleased
       
        String name = txt_srch_pid.getText();
        try{
            DefaultTableModel dt = (DefaultTableModel) tbl_product.getModel();
            dt.setRowCount(0);
            Statement s = db.mycon().createStatement();
            
            ResultSet rs = s.executeQuery("SELECT * FROM product WHERE Product_Name LIKE'%"+name+"%'");
            
            while (rs.next()){
                Vector v = new Vector ();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                
                
                dt.addRow(v);
            }
        }catch (Exception e){
            tb_load();
        }
    }//GEN-LAST:event_txt_srch_pidKeyReleased

    private void tbl_productKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_productKeyReleased
        
    }//GEN-LAST:event_tbl_productKeyReleased

    private void txt_srch_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_srch_idKeyReleased
        if(txt_srch_id.getText().trim().isEmpty()) {
         p_name.setText("");
         p_bar_code.setText("");
         p_price.setText("");
         p_qty.setText("");
         p_s_id.setText("");         
        }
    }//GEN-LAST:event_txt_srch_idKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField p_bar_code;
    private javax.swing.JButton p_delete;
    private javax.swing.JTextField p_name;
    private javax.swing.JTextField p_price;
    private javax.swing.JTextField p_qty;
    private javax.swing.JTextField p_s_id;
    private javax.swing.JButton p_save;
    private javax.swing.JButton p_search;
    private javax.swing.JButton p_update;
    private javax.swing.JTable tbl_product;
    private javax.swing.JTextField txt_srch_id;
    private javax.swing.JTextField txt_srch_pid;
    // End of variables declaration//GEN-END:variables
}
