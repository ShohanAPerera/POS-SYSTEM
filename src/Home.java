
import com.sun.jdi.connect.spi.Connection;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.sql.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class Home extends javax.swing.JFrame {
    
    
    JPanelLoader jpload  = new JPanelLoader();
    
    
    
    
    public Home() {
        
        
        initComponents();
        this.setExtendedState(Home.MAXIMIZED_BOTH);
        
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home_btn_grp = new javax.swing.ButtonGroup();
        jPanel1 = new FancyPanel();
        btn_Employee = new javax.swing.JToggleButton();
        btn_customer = new javax.swing.JToggleButton();
        btn_Product = new javax.swing.JToggleButton();
        btn_Sales = new javax.swing.JToggleButton();
        btn_Supplier = new javax.swing.JToggleButton();
        btn_Invoices = new javax.swing.JToggleButton();
        btn_reports = new javax.swing.JToggleButton();
        jPanel2 = new FancyPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panel_loader = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(36, 25, 25));

        home_btn_grp.add(btn_Employee);
        btn_Employee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-employee-16.png"))); // NOI18N
        btn_Employee.setText("Employee");
        btn_Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EmployeeActionPerformed(evt);
            }
        });

        home_btn_grp.add(btn_customer);
        btn_customer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-customer-16.png"))); // NOI18N
        btn_customer.setText("Customer");
        btn_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_customerActionPerformed(evt);
            }
        });

        home_btn_grp.add(btn_Product);
        btn_Product.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Product.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-product-16.png"))); // NOI18N
        btn_Product.setText("Product");
        btn_Product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProductActionPerformed(evt);
            }
        });

        home_btn_grp.add(btn_Sales);
        btn_Sales.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Sales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-sales-16.png"))); // NOI18N
        btn_Sales.setText("Sales");
        btn_Sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalesActionPerformed(evt);
            }
        });

        home_btn_grp.add(btn_Supplier);
        btn_Supplier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-supplier-16.png"))); // NOI18N
        btn_Supplier.setText("Suppliers");
        btn_Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SupplierActionPerformed(evt);
            }
        });

        home_btn_grp.add(btn_Invoices);
        btn_Invoices.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Invoices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-invoices-16.png"))); // NOI18N
        btn_Invoices.setText("Invoice");
        btn_Invoices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InvoicesActionPerformed(evt);
            }
        });

        home_btn_grp.add(btn_reports);
        btn_reports.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_reports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-reports-16.png"))); // NOI18N
        btn_reports.setText("Reports");
        btn_reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_Invoices, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Sales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Product, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Employee, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(btn_Supplier, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_customer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_reports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btn_customer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Supplier)
                .addGap(12, 12, 12)
                .addComponent(btn_Employee)
                .addGap(19, 19, 19)
                .addComponent(btn_Product)
                .addGap(18, 18, 18)
                .addComponent(btn_Sales)
                .addGap(18, 18, 18)
                .addComponent(btn_Invoices)
                .addGap(18, 18, 18)
                .addComponent(btn_reports)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fast Checkout. Smart Business. One POS Solution.");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CODE X (1).jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CODE X (1).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(170, 170, 170)
                .addComponent(jLabel3)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        panel_loader.setBackground(new java.awt.Color(255, 255, 255));
        panel_loader.setForeground(new java.awt.Color(255, 255, 255));
        panel_loader.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout panel_loaderLayout = new javax.swing.GroupLayout(panel_loader);
        panel_loader.setLayout(panel_loaderLayout);
        panel_loaderLayout.setHorizontalGroup(
            panel_loaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 851, Short.MAX_VALUE)
        );
        panel_loaderLayout.setVerticalGroup(
            panel_loaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_loader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(panel_loader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_customerActionPerformed
        //Customer Load 
        
        customer cus = new customer ();
        jpload.jPanelLoader(panel_loader, cus);
        
        
          
    }//GEN-LAST:event_btn_customerActionPerformed

    private void btn_SupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SupplierActionPerformed
       supplier sp = new supplier();
       jpload.jPanelLoader(panel_loader, sp);
    }//GEN-LAST:event_btn_SupplierActionPerformed

    private void btn_EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EmployeeActionPerformed
        employee emp  = new employee();
        jpload.jPanelLoader(panel_loader, emp);
    }//GEN-LAST:event_btn_EmployeeActionPerformed

    private void btn_ProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProductActionPerformed
       product pro = new product();
       jpload.jPanelLoader(panel_loader, pro);
    }//GEN-LAST:event_btn_ProductActionPerformed

    private void btn_SalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalesActionPerformed
        sales sl = new sales ();
        jpload.jPanelLoader(panel_loader, sl);
    }//GEN-LAST:event_btn_SalesActionPerformed

    private void btn_InvoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InvoicesActionPerformed
        Invoice inv = new Invoice();
        jpload.jPanelLoader(panel_loader,inv);
    }//GEN-LAST:event_btn_InvoicesActionPerformed

    private void btn_reportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportsActionPerformed
        reports rpts = new reports();
        jpload.jPanelLoader(panel_loader, rpts);
    }//GEN-LAST:event_btn_reportsActionPerformed

    
    int x=210;    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_Employee;
    private javax.swing.JToggleButton btn_Invoices;
    private javax.swing.JToggleButton btn_Product;
    private javax.swing.JToggleButton btn_Sales;
    private javax.swing.JToggleButton btn_Supplier;
    private javax.swing.JToggleButton btn_customer;
    private javax.swing.JToggleButton btn_reports;
    private javax.swing.ButtonGroup home_btn_grp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panel_loader;
    // End of variables declaration//GEN-END:variables
}
