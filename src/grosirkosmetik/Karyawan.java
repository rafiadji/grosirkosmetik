/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grosirkosmetik;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author rafiadji
 */
public class Karyawan extends javax.swing.JFrame {
    
    Koneksi conn;
    DefaultTableModel TableKar;
    String id;
    /**
     * Creates new form Register
     */
    public Karyawan() {
        initComponents();
        conn = new Koneksi();
        loadTable();
        BUbah.setVisible(false);
        BHapus.setVisible(false);
        BBatal.setVisible(false);
    }
    
    public void loadTable(){
        Object[] field = {"ID Karyawan","Nama Karyawan","No Telp"};
        TableKar = new DefaultTableModel(null, field);
        TabelKaryawan.setModel(TableKar);
        
        try{
            ResultSet tkar = conn.select("SELECT * FROM karyawan");
            while(tkar.next()){
                String id_karyawan = tkar.getString("ID_KARYAWAN");
                String nama_karyawan = tkar.getString("NAMA_KARYAWAN");
                String no_telp = tkar.getString("NO_TELP");
                String[] data = {id_karyawan, nama_karyawan , no_telp};
                TableKar.addRow(data);
            }
        }
        catch(Exception e){
            
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

        LUser = new javax.swing.JLabel();
        LPass = new javax.swing.JLabel();
        LNama = new javax.swing.JLabel();
        LAlamat = new javax.swing.JLabel();
        LNtelp = new javax.swing.JLabel();
        TUser = new javax.swing.JTextField();
        TNama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAAlamat = new javax.swing.JTextArea();
        TTelp = new javax.swing.JTextField();
        TPass = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelKaryawan = new javax.swing.JTable();
        BTambah = new javax.swing.JButton();
        BBatal = new javax.swing.JButton();
        BUbah = new javax.swing.JButton();
        BHapus = new javax.swing.JButton();
        BKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Karyawan");

        LUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LUser.setText("Username");

        LPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LPass.setText("Password");

        LNama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LNama.setText("Nama");

        LAlamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LAlamat.setText("Alamat");

        LNtelp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LNtelp.setText("No Telp");

        TAAlamat.setColumns(20);
        TAAlamat.setRows(5);
        jScrollPane1.setViewportView(TAAlamat);

        TabelKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TabelKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelKaryawanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelKaryawan);

        BTambah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTambah.setText("Tambah");
        BTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTambahActionPerformed(evt);
            }
        });

        BBatal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BBatal.setText("Batal");
        BBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBatalActionPerformed(evt);
            }
        });

        BUbah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BUbah.setText("Ubah");
        BUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUbahActionPerformed(evt);
            }
        });

        BHapus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BHapus.setText("Hapus");
        BHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHapusActionPerformed(evt);
            }
        });

        BKeluar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BKeluar.setText("Kembali");
        BKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BBatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LPass)
                                    .addComponent(LNama)
                                    .addComponent(LAlamat)
                                    .addComponent(LNtelp))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TTelp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LUser)
                                .addGap(18, 18, 18)
                                .addComponent(TUser, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LUser)
                            .addComponent(TUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LPass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LNama)
                            .addComponent(TNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LAlamat)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LNtelp)
                            .addComponent(TTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTambah)
                            .addComponent(BUbah))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BBatal)
                            .addComponent(BHapus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BKeluar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBatalActionPerformed
        Menu mn = new Menu();
        mn.setVisible(true);
        mn.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BBatalActionPerformed

    private void BTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambahActionPerformed
        String[][] data = {
            {"USERNAME", TUser.getText()},
            {"PASSWORD", "MD5('"+TPass.getText()+"')"},
            {"LEVEL", "2"}
        };
        String[][] data1 = {
            {"USERNAME", TUser.getText()},
            {"NAMA_KARYAWAN", TNama.getText()},
            {"ALAMAT", TAAlamat.getText()},
            {"NO_TELP", TTelp.getText()}
        };
        try{
            boolean insert = conn.insert("login", data, true);
            if(insert){
                boolean insert1 = conn.insert("karyawan", data1);
                if(insert1){
                    TNama.setText("");
                    TAAlamat.setText("");
                    TTelp.setText("");
                    TUser.setText("");
                    TPass.setText("");
                    loadTable();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Gagal menambah cek kembali!");
            }  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_BTambahActionPerformed

    private void BUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUbahActionPerformed
        try{
            String[][] data = {
                {"NAMA_KARYAWAN", TNama.getText()},
                {"ALAMAT", TAAlamat.getText()},
                {"NO_TELP", TTelp.getText()}
            };
            String[] where ={"ID_KARYAWAN", id};
            int tny = JOptionPane.showConfirmDialog(null, "Yakin mengubah data ini ?");
            if(tny == 0){
                boolean update = conn.update("karyawan", data, where);
                if(update){
                    loadTable();
                    TNama.setText("");
                    TAAlamat.setText("");
                    TTelp.setText("");
                    LUser.setVisible(true);
                    LPass.setVisible(true);
                    TUser.setVisible(true);
                    TPass.setVisible(true);
                    BTambah.setVisible(true);
                    BUbah.setVisible(false);
                    BHapus.setVisible(false);
                    BBatal.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Gagal mengubah cek kembali!");
                }   
            }    
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_BUbahActionPerformed

    private void BHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHapusActionPerformed
        try{
            ResultSet tkar = conn.select("SELECT USERNAME FROM karyawan WHERE ID_KARYAWAN = '"+id+"'");
            String username = null;
            if(tkar.next()){
                username = tkar.getString("USERNAME");
            }
            String[] where ={"ID_KARYAWAN", id};
            int tny = JOptionPane.showConfirmDialog(null, "Yakin menghapus data ini ?");
            if(tny == 0){
                boolean delete = conn.delete("karyawan", where);
                if(delete){
                    String[] where1 ={"USERNAME", username};
                    boolean delete1 = conn.delete("login", where1);
                    loadTable();
                    TNama.setText("");
                    TAAlamat.setText("");
                    TTelp.setText("");
                    LUser.setVisible(true);
                    LPass.setVisible(true);
                    TUser.setVisible(true);
                    TPass.setVisible(true);
                    BTambah.setVisible(true);
                    BUbah.setVisible(false);
                    BHapus.setVisible(false);
                    BBatal.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Gagal menghapus !");
                }    
            }  
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_BHapusActionPerformed

    private void TabelKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelKaryawanMouseClicked
        id = null;
        int row = TabelKaryawan.getSelectedRow();
        String getData = (TabelKaryawan.getModel().getValueAt(row, 0).toString());
        try{
            ResultSet tkar = conn.select("SELECT * FROM karyawan WHERE ID_KARYAWAN = "+getData);
            while(tkar.next()){
                id = tkar.getString("ID_KARYAWAN");
                TNama.setText(tkar.getString("NAMA_KARYAWAN"));
                TAAlamat.setText(tkar.getString("ALAMAT"));
                TTelp.setText(tkar.getString("NO_TELP"));
            }  
        }
        catch(Exception e){
            System.out.println(e);
            System.exit(0);
        }
        LUser.setVisible(false);
        LPass.setVisible(false);
        TUser.setVisible(false);
        TPass.setVisible(false);
        BTambah.setVisible(false);
        BUbah.setVisible(true);
        BHapus.setVisible(true);
        BBatal.setVisible(true);
    }//GEN-LAST:event_TabelKaryawanMouseClicked

    private void BKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKeluarActionPerformed
        Menu mn = new Menu();
        mn.setVisible(true);
        mn.setLocationRelativeTo(null);
        mn.setDefaultCloseOperation(Login.DO_NOTHING_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_BKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBatal;
    private javax.swing.JButton BHapus;
    private javax.swing.JButton BKeluar;
    private javax.swing.JButton BTambah;
    private javax.swing.JButton BUbah;
    private javax.swing.JLabel LAlamat;
    private javax.swing.JLabel LNama;
    private javax.swing.JLabel LNtelp;
    private javax.swing.JLabel LPass;
    private javax.swing.JLabel LUser;
    private javax.swing.JTextArea TAAlamat;
    private javax.swing.JTextField TNama;
    private javax.swing.JPasswordField TPass;
    private javax.swing.JTextField TTelp;
    private javax.swing.JTextField TUser;
    private javax.swing.JTable TabelKaryawan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}