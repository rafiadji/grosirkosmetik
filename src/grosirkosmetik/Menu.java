/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grosirkosmetik;

/**
 *
 * @author rafiadji
 */
public class Menu extends javax.swing.JFrame {
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        if(GrosirKosmetik.level == 2){
            BSupplier.setVisible(false);
            BProduk.setVisible(false);
            BKaryawan.setVisible(false);
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

        BLogout = new javax.swing.JButton();
        BSupplier = new javax.swing.JButton();
        BProduk = new javax.swing.JButton();
        BTransaksi = new javax.swing.JButton();
        LMenu = new javax.swing.JLabel();
        BKaryawan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setUndecorated(true);

        BLogout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BLogout.setText("LOGOUT");
        BLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLogoutActionPerformed(evt);
            }
        });

        BSupplier.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BSupplier.setText("SUPPLIER");
        BSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSupplierActionPerformed(evt);
            }
        });

        BProduk.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BProduk.setText("PRODUK");
        BProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BProdukActionPerformed(evt);
            }
        });

        BTransaksi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BTransaksi.setText("TRANSAKSI");
        BTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTransaksiActionPerformed(evt);
            }
        });

        LMenu.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        LMenu.setText("MENU");

        BKaryawan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BKaryawan.setText("KARYAWAN");
        BKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKaryawanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(156, 156, 156)
                            .addComponent(LMenu))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BSupplier)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BProduk)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BKaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LMenu)
                .addGap(18, 18, 18)
                .addComponent(BTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BProduk, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                        .addComponent(BSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                    .addComponent(BKaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BLogout)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLogoutActionPerformed
        Login lg = new Login();
        lg.setVisible(true);
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(Login.DO_NOTHING_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_BLogoutActionPerformed

    private void BSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSupplierActionPerformed
        Supplier sp = new Supplier();
        sp.setVisible(true);
        sp.setLocationRelativeTo(null);
        sp.setDefaultCloseOperation(Login.DO_NOTHING_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_BSupplierActionPerformed

    private void BProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BProdukActionPerformed
        Produk p = new Produk();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        p.setDefaultCloseOperation(Login.DO_NOTHING_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_BProdukActionPerformed

    private void BTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTransaksiActionPerformed
        if(GrosirKosmetik.level == 1){
            LapTransaksi lt = new LapTransaksi();
            lt.setVisible(true);
            lt.setLocationRelativeTo(null);
            lt.setDefaultCloseOperation(Login.DO_NOTHING_ON_CLOSE);
            this.dispose();
        }
        else{
            Transaksi t = new Transaksi();
            t.setVisible(true);
            t.setLocationRelativeTo(null);
            t.setDefaultCloseOperation(Login.DO_NOTHING_ON_CLOSE);
            this.dispose();  
        }
    }//GEN-LAST:event_BTransaksiActionPerformed

    private void BKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKaryawanActionPerformed
        Karyawan kr = new Karyawan();
        kr.setVisible(true);
        kr.setLocationRelativeTo(null);
        kr.setDefaultCloseOperation(Login.DO_NOTHING_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_BKaryawanActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BKaryawan;
    private javax.swing.JButton BLogout;
    private javax.swing.JButton BProduk;
    private javax.swing.JButton BSupplier;
    private javax.swing.JButton BTransaksi;
    private javax.swing.JLabel LMenu;
    // End of variables declaration//GEN-END:variables
}