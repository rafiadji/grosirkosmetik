package grosirkosmetik;

import java.io.*;
import java.sql.*;

public class printStruk {
    private FileWriter prt;
    Koneksi conn;
    public printStruk(String id_trans, String bayar, int kembali){
        conn = new Koneksi();
        String total = null, kar = null, tgl = null;
        try {
            ResultSet tvtrans = conn.select("SELECT * FROM view_trans WHERE ID_TRANS = "+id_trans);
//            String printer = "/dev/usb/lp0";
            String printer = "print.txt";
            prt = new FileWriter(printer);
            prt.write("----------------------------------------");prt.write(13);prt.write(10); 
            prt.write("             Grosir Kosmetik            ");prt.write(13);prt.write(10); 
            prt.write("----------------------------------------");prt.write(13);prt.write(10); 
            prt.write("ID Transaksi : " + id_trans);prt.write(13);prt.write(10); 
            prt.write("----------------------------------------");prt.write(13);prt.write(10);
            while(tvtrans.next()){
                if(total == null || kar == null || tgl == null){
                    total = tvtrans.getString("TOTAL");
                    kar = tvtrans.getString("NAMA_KARYAWAN");
                    tgl = tvtrans.getString("TANGGAL_TRANS"); 
                }
                prt.write(tvtrans.getString("PRODUK")+"\t\t"+tvtrans.getString("HARGA")
                        +" X "+tvtrans.getString("JML_BELI")+"\t"
                        +tvtrans.getString("SUB_TOTAL"));prt.write(13);prt.write(10); 
            }
            prt.write("----------------------------------------");prt.write(13);prt.write(10);
            prt.write("Total : " + total);prt.write(13);prt.write(10);
            prt.write("Bayar : " + bayar);prt.write(13);prt.write(10);
            prt.write("Kembali : " + kembali);prt.write(13);prt.write(10);
            prt.write("----------------------------------------");prt.write(13);prt.write(10);
            prt.write(tgl);prt.write(13);prt.write(10);
            prt.write("Kasir : "+kar);prt.write(13);prt.write(10);
            prt.write("----------------------------------------");prt.write(13);prt.write(10); 
            prt.write("     Terimakasi Atas Kunjungan Anda     ");prt.write(13);prt.write(10); 
            prt.write("----------------------------------------");prt.write(13);prt.write(10); 
            prt.close();
        } catch (SQLException | IOException e) {
            System.out.println(e);
        }
    }
}
