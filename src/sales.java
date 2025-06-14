import com.mysql.cj.xdevapi.Result;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shoan
 */
public class sales extends javax.swing.JPanel {

    public static String barcode_c = "0";
    public static String cus_id = "0";
 
    public sales() {
        initComponents();
        data_load();
        
    }
    
    public void pro_tot_cal(){
        Double qt = Double.valueOf(txt_p_qty.getText());
        Double price = Double.valueOf(lbl_price.getText());
            
        Double tot = qt * price;
            
        lbl_tot_price.setText(String.valueOf(tot));
    }
    public void cart_total(){
        
        int numofrow = tbl_sales.getRowCount();
        double total = 0;
        for (int i= 0;i<numofrow;i++){
            double value = Double.valueOf(tbl_sales.getValueAt(i, 5).toString());
            total+=value;
        }
        bill_total.setText(Double.toString(total));
        
        //Total Quantity
        int numofrows = tbl_sales.getRowCount();
        double totals = 0;
        for (int i= 0;i<numofrows;i++){
            double value = Double.valueOf(tbl_sales.getValueAt(i,3).toString());
            totals+=value;
        }
        lbl_qty.setText(Double.toString(totals));
    }

    public void balance_tot(){
        Double paid = Double.valueOf(txt_paid.getText());
        Double tot = Double.valueOf(bill_total.getText());
        Double due;
        
        due= paid-tot;
        
        balance_amt.setText(String.valueOf(due));
    }
    
public void data_load(){
    try{
      
        Statement s = (Statement) db.mycon().createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM customer");
        
        Vector v = new Vector();
        while (rs.next()){
            v.add(rs.getString("customer_name"));
            
            DefaultComboBoxModel com = new DefaultComboBoxModel(v);
            comb_cus.setModel( com);
        }
        
        
    }catch(Exception e){
        System.out.println(e);
    }
    //Load last invoice data
    try{
         
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM extra WHERE exid = 1 ");
            
            if(rs.next()){
                lbl_inid.setText(rs.getString("val"));
            }
            
         }catch (SQLException e){
             System.out.println(e);
         }
    
//lOAD PRODUCTS  
    try{
      
        Statement s = (Statement) db.mycon().createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM product");
        
        Vector v = new Vector();
        while (rs.next()){
            v.add(rs.getString("Product_Name"));
            
            DefaultComboBoxModel com = new DefaultComboBoxModel(v);
            comb_product.setModel( com);
        }
        
        
    }catch(Exception e){
        System.out.println(e);
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new FancyPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comb_product = new javax.swing.JComboBox<>();
        comb_cus = new javax.swing.JComboBox<>();
        txt_p_qty = new javax.swing.JTextField();
        lbl_price = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_tot_price = new javax.swing.JLabel();
        br_code = new javax.swing.JLabel();
        br_code1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_inid = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sales = new javax.swing.JTable();
        jPanel6 = new   FancyPanel();
        jPanel8 = new FancyPanel();
        jLabel9 = new javax.swing.JLabel();
        bill_total = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        balance_amt = new javax.swing.JLabel();
        btn_pay = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_paid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lbl_qty = new javax.swing.JLabel();
        jPanel7 = new FancyPanel();
        btn_remove = new javax.swing.JButton();
        btn_remove_all = new javax.swing.JButton();
        btn_add_cart = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("CUSTOMER");

        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("PRODUCT");

        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("QTY");

        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("UNIT PRICE :");

        comb_product.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        comb_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_productActionPerformed(evt);
            }
        });

        comb_cus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        comb_cus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_cusActionPerformed(evt);
            }
        });

        txt_p_qty.setText("1");
        txt_p_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_p_qtyActionPerformed(evt);
            }
        });
        txt_p_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_p_qtyKeyReleased(evt);
            }
        });

        lbl_price.setForeground(java.awt.Color.white);
        lbl_price.setText("00");

        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("TOTAL PRICE");

        lbl_tot_price.setForeground(java.awt.Color.white);
        lbl_tot_price.setText("00");

        br_code.setForeground(java.awt.Color.white);
        br_code.setText("TOTAL PRICE");

        br_code1.setForeground(java.awt.Color.white);
        br_code1.setText("BarCode");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INVOICE NO :");

        lbl_inid.setForeground(new java.awt.Color(255, 255, 255));
        lbl_inid.setText("01");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_inid))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comb_cus, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comb_product, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_p_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_price)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_tot_price)
                        .addGap(35, 35, 35)
                        .addComponent(br_code1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(br_code)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbl_inid))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comb_cus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(comb_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_p_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(lbl_price)
                    .addComponent(jLabel6)
                    .addComponent(lbl_tot_price)
                    .addComponent(br_code1)
                    .addComponent(br_code))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbl_sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "INID", "P_name", "Barcode", "Qty", "Unit Price", "Total Price"
            }
        ));
        jScrollPane1.setViewportView(tbl_sales);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("TOTAL AMOUNT");

        bill_total.setBackground(new java.awt.Color(255, 255, 255));
        bill_total.setForeground(java.awt.Color.white);
        bill_total.setText("00");

        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setText("BALANCE AMOUNT");

        balance_amt.setBackground(new java.awt.Color(255, 255, 255));
        balance_amt.setForeground(java.awt.Color.white);
        balance_amt.setText("00");

        btn_pay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-print-14.png"))); // NOI18N
        btn_pay.setText("Pay & Print");
        btn_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(btn_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(balance_amt, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bill_total, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(bill_total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(balance_amt))
                .addGap(18, 18, 18)
                .addComponent(btn_pay)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PAID AMOUNT :");

        txt_paid.setText("0.0");
        txt_paid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_paidActionPerformed(evt);
            }
        });
        txt_paid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_paidKeyReleased(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TOTAL QTY");

        lbl_qty.setForeground(new java.awt.Color(255, 255, 255));
        lbl_qty.setText("00");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(txt_paid, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_qty)
                .addGap(90, 90, 90)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txt_paid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_qty)
                        .addComponent(jLabel8)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-remove-16.png"))); // NOI18N
        btn_remove.setText("Remove");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });

        btn_remove_all.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-delete-all-16.png"))); // NOI18N
        btn_remove_all.setText("Remove All");
        btn_remove_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_remove_allActionPerformed(evt);
            }
        });

        btn_add_cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-add-to-cart-16.png"))); // NOI18N
        btn_add_cart.setText("Add to Cart");
        btn_add_cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_cartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_remove_all)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_add_cart)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btn_add_cart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_remove)
                .addGap(18, 18, 18)
                .addComponent(btn_remove_all)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 198, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comb_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_productActionPerformed
        //load unit price
        
        String name = comb_product.getSelectedItem().toString();
        try {
            
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT Bar_code,Price FROM product WHERE Product_Name = '"+name+"' ");
            if(rs.next()){
                lbl_price.setText(rs.getString("Price"));
                br_code.setText(rs.getString("Bar_code"));
            }
            
            //Product Calculation
               
            
        }catch(Exception e){
            System.err.println(e);
        }
        pro_tot_cal();
    }//GEN-LAST:event_comb_productActionPerformed

    private void txt_p_qtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_p_qtyKeyReleased
       
        
    }//GEN-LAST:event_txt_p_qtyKeyReleased

    private void btn_add_cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_cartActionPerformed
      //add to cart
         String qty = txt_p_qty.getText();
        if (!InputValidator.validateDigitsOnly(qty)) {
        JOptionPane.showMessageDialog(null, "Please add a valid Quantity");
        return;
        }
        pro_tot_cal();
        if (!InputValidator.validateNotNullOrEmpty(qty)) {
        JOptionPane.showMessageDialog(null, "Quantity Can not be null");
        return;
        }
        
        DefaultTableModel dt = (DefaultTableModel) tbl_sales.getModel();
        
        Vector v = new Vector();
        
        v.add(lbl_inid.getText()); 
        v.add(comb_product.getSelectedItem().toString()); 
        v.add(br_code.getText()); 
        v.add(txt_p_qty.getText()); 
        v.add(lbl_price.getText());     
        v.add(lbl_tot_price.getText()); 
        
        dt.addRow(v);
        cart_total();
    }//GEN-LAST:event_btn_add_cartActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        try{
            DefaultTableModel dt = (DefaultTableModel) tbl_sales.getModel();
            int rw = tbl_sales.getSelectedRow();
            
            dt.removeRow(rw);
            
        }catch(Exception e ){
            System.out.println(e);
        }
        cart_total();
        balance_tot();
    }//GEN-LAST:event_btn_removeActionPerformed

    private void btn_remove_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_remove_allActionPerformed
         DefaultTableModel dt = (DefaultTableModel) tbl_sales.getModel();
         dt.setRowCount(0);
         cart_total();
         balance_tot();
    }//GEN-LAST:event_btn_remove_allActionPerformed

    private void txt_p_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_p_qtyActionPerformed
        
        
    }//GEN-LAST:event_txt_p_qtyActionPerformed

    private void txt_paidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_paidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_paidActionPerformed

    private void txt_paidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_paidKeyReleased
       balance_tot();
    }//GEN-LAST:event_txt_paidKeyReleased

    private void btn_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payActionPerformed
        //Sending data to databse
        
      
        try{
         
            DefaultTableModel dt = (DefaultTableModel) tbl_sales.getModel();
            int rc = dt.getRowCount(); 
        
        for (int i=0;i<rc;i++)
           {
            
             String inid = dt.getValueAt(i, 0).toString(); // get inid
             String P_name = dt.getValueAt(i, 1).toString(); // get product name
             String bar_code = dt.getValueAt(i, 2).toString(); // get barcode
             String qty = dt.getValueAt(i, 3).toString(); // get product qty
             String un_price = dt.getValueAt(i, 4).toString(); // get product unit price
             String tot_price = dt.getValueAt(i, 5).toString(); // get product total Price
            
             //Cart Db
             Statement s = db.mycon().createStatement();
             s.executeUpdate("INSERT INTO cart (INID, Product_Name, Bar_code, qty, Unit_Price, Total_Price) VALUES ('"+inid+"','"+P_name+"','"+bar_code+"','"+qty+"','"+un_price+"','"+tot_price+"') ");
            
           }
            }catch(Exception e){
                  System.err.println(e);   
            }
         try{
             String inv_id = lbl_inid.getText();
             String cname = comb_cus.getSelectedItem().toString();
             String totqty = lbl_qty.getText();
             String tot_bil = bill_total.getText();
             String blnc = balance_amt.getText();
                 
             
             //paid check 
             Double tot = Double.valueOf(bill_total.getText());
             Double pid = Double.valueOf(txt_paid.getText());
             String Status = null;
             if (pid.equals(0.0)){
                 Status = "Unpaid";
             }else if (tot>pid){
                 Status = "Partial";
             }else if (tot<pid){
                 Status = "Paid";
             }
             //sales db
             Statement ss = db.mycon().createStatement();
             ss.executeUpdate("INSERT INTO sales (INID, Cid, Customer_Name, Total_Qty, Total_Bill, Status, Balance) VALUES('"+inv_id+"','"+cus_id+"','"+cname+"','"+totqty+"','"+tot_bil+"','"+Status+"','"+blnc+"')"); 
             JOptionPane.showMessageDialog(null,"Saved");
             
             
             
             }catch(NumberFormatException | SQLException e){
                 System.out.print(e);
             }
         
         //Save last invoid id number 
         try{
             String id  = lbl_inid.getText();
             Statement s = db.mycon().createStatement();
             s.executeUpdate("UPDATE extra SET val = '"+id+"' WHERE exid = 1 ");
             
             
         }catch(SQLException e){
             System.out.println(e);
         }
        
         //Print Slip
         try {
            
           
        HashMap para = new HashMap();
        
        para.put("inv_id", lbl_inid.getText());  // inv_id  is ireport parameter name
        
        ReportView r =new ReportView("src\\reports\\print.jasper", para);
        r.setVisible(true);  
            
            
            
        } catch (Exception e) {
        }
         
         //Load last invoice number
         
         
        
         //plus new invoice 
         int i = Integer.valueOf(lbl_inid.getText());
         i++;
         lbl_inid.setText(String.valueOf(i));
         lbl_price.setText("");
             lbl_tot_price.setText("");
             br_code.setText("");
             bill_total.setText("");
             balance_amt.setText("");
             txt_paid.setText("");
             lbl_qty.setText("");
    }
   
                
     /*       
       
    }//GEN-LAST:event_btn_payActionPerformed
*/
    
    private void comb_cusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_cusActionPerformed
         String name = comb_cus.getSelectedItem().toString();
        try {
            
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT cid,customer_name FROM customer WHERE customer_name = '"+name+"' ");
            if(rs.next()){
                cus_id = (rs.getString("cid"));
                
            }
            
            //Product Calculation
              
        }catch(SQLException e){
            System.err.println(e);
        }
        pro_tot_cal();
    }//GEN-LAST:event_comb_cusActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balance_amt;
    private javax.swing.JLabel bill_total;
    private javax.swing.JLabel br_code;
    private javax.swing.JLabel br_code1;
    private javax.swing.JButton btn_add_cart;
    private javax.swing.JButton btn_pay;
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton btn_remove_all;
    private javax.swing.JComboBox<String> comb_cus;
    private javax.swing.JComboBox<String> comb_product;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_inid;
    private javax.swing.JLabel lbl_price;
    private javax.swing.JLabel lbl_qty;
    private javax.swing.JLabel lbl_tot_price;
    private javax.swing.JTable tbl_sales;
    private javax.swing.JTextField txt_p_qty;
    private javax.swing.JTextField txt_paid;
    // End of variables declaration//GEN-END:variables
}
