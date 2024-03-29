/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grosirkosmetik;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;

/**
 *
 * @author rafiadji
 */
public class Supplier extends javax.swing.JFrame {
    Koneksi conn;
    private DefaultTableModel TableSupp;
    private String id;
    /**
     * Creates new form TambahSupplier
     */
    public Supplier() {
        initComponents();
        conn = new Koneksi();
        BUbahSup.setVisible(false);
        BHapusSup.setVisible(false);
        BBatal.setVisible(false);
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LNSupplier = new javax.swing.JLabel();
        TNSupplier = new javax.swing.JTextField();
        BTambahSup = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableSupplier = new javax.swing.JTable();
        BUbahSup = new javax.swing.JButton();
        BHapusSup = new javax.swing.JButton();
        BBatal = new javax.swing.JButton();
        BKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supplier");

        LNSupplier.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LNSupplier.setText("Nama Supplier");

        BTambahSup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTambahSup.setText("Tambah");
        BTambahSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTambahSupActionPerformed(evt);
            }
        });

        TableSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TableSupplier.setSurrendersFocusOnKeystroke(true);
        TableSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableSupplierMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableSupplier);

        BUbahSup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BUbahSup.setText("Ubah");
        BUbahSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUbahSupActionPerformed(evt);
            }
        });

        BHapusSup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BHapusSup.setText("Hapus");
        BHapusSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHapusSupActionPerformed(evt);
            }
        });

        BBatal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BBatal.setText("Batal");
        BBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBatalActionPerformed(evt);
            }
        });

        BKembali.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BKembali.setText("Kembali");
        BKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LNSupplier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TNSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(BTambahSup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BUbahSup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BHapusSup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BBatal)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BKembali)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LNSupplier)
                    .addComponent(TNSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTambahSup)
                    .addComponent(BUbahSup)
                    .addComponent(BHapusSup)
                    .addComponent(BBatal))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(BKembali)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void loadTable(){
        Object[] field = {"ID Supplier","Nama Supplier"};
        TableSupp = new DefaultTableModel(null, field);
        TableSupplier.setModel(TableSupp);
        
        try{
            ResultSet tsup = conn.select("SELECT * FROM supplier");
            while(tsup.next()){
                String id_supp = tsup.getString("ID_SUPPLIER");
                String nama_supplier = tsup.getString("NAMA_SUPPLIER");
                String[] data = {id_supp, nama_supplier};
                TableSupp.addRow(data);
            }
        }
        catch(Exception e){
            
        }
    }
    
    private void BTambahSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambahSupActionPerformed
        String[][] data = {
            {"NAMA_SUPPLIER", TNSupplier.getText()}
        };
        boolean insert = conn.insert("supplier", data);
        if(insert){
            loadTable();
        }
        else{
            JOptionPane.showMessageDialog(null, "Gagal menambah cek kembali!");
        }
    }//GEN-LAST:event_BTambahSupActionPerformed

    private void TableSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableSupplierMouseClicked
        int row = TableSupplier.getSelectedRow();
        String getData = (TableSupplier.getModel().getValueAt(row, 0).toString());
        try{
            ResultSet tsup = conn.select("SELECT * FROM supplier WHERE ID_SUPPLIER = "+getData);
            while(tsup.next()){
                id = tsup.getString("ID_SUPPLIER");
                TNSupplier.setText(tsup.getString("NAMA_SUPPLIER"));
            }  
        }
        catch(Exception e){
            System.out.println(e);
            System.exit(0);
        }
        BTambahSup.setVisible(false);
        BUbahSup.setVisible(true);
        BHapusSup.setVisible(true);
        BBatal.setVisible(true);
    }//GEN-LAST:event_TableSupplierMouseClicked

    private void BUbahSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUbahSupActionPerformed
        String[][] data = {
            {"NAMA_SUPPLIER", TNSupplier.getText()}
        };
        String[] where ={"ID_SUPPLIER", id};
        int tny = JOptionPane.showConfirmDialog(null, "Yakin mengubah data ini ?");
        if(tny == 0){
            boolean update = conn.update("supplier", data, where);
            if(update){
                loadTable();
                TNSupplier.setText("");
                BTambahSup.setVisible(true);
                BUbahSup.setVisible(false);
                BHapusSup.setVisible(false);
                BBatal.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "Gagal mengubah cek kembali!");
            }   
        }
       
    }//GEN-LAST:event_BUbahSupActionPerformed

    private void BHapusSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHapusSupActionPerformed
        String[] where ={"ID_SUPPLIER", id};
        int tny = JOptionPane.showConfirmDialog(null, "Yakin menghapus data ini ?");
        if(tny == 0){
            boolean delete = conn.delete("supplier", where);
            if(delete){
                loadTable();
                TNSupplier.setText("");
                BTambahSup.setVisible(true);
                BUbahSup.setVisible(false);
                BHapusSup.setVisible(false);
                BBatal.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "Gagal menghapus !");
            }    
        }
    }//GEN-LAST:event_BHapusSupActionPerformed

    private void BBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBatalActionPerformed
        loadTable();
        TNSupplier.setText("");
        BTambahSup.setVisible(true);
        BUbahSup.setVisible(false);
        BHapusSup.setVisible(false);
        BBatal.setVisible(false);
    }//GEN-LAST:event_BBatalActionPerformed

    private void BKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKembaliActionPerformed
        Menu mn = new Menu();
        mn.setVisible(true);
        mn.setLocationRelativeTo(null);
        mn.setDefaultCloseOperation(Login.DO_NOTHING_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_BKembaliActionPerformed

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
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBatal;
    private javax.swing.JButton BHapusSup;
    private javax.swing.JButton BKembali;
    private javax.swing.JButton BTambahSup;
    private javax.swing.JButton BUbahSup;
    private javax.swing.JLabel LNSupplier;
    private javax.swing.JTextField TNSupplier;
    private javax.swing.JTable TableSupplier;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
