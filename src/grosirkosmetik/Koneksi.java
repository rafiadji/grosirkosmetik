package grosirkosmetik;

import java.sql.*;
import javax.swing.*;

public class Koneksi {
    public static Statement stmt;
    private boolean cek;
    public Koneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String database = "kosmetik";
            String user = "root";
            String pass = "";
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/" + database, user, pass);
            stmt = conn.createStatement();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Database sedang Maintenance !");
        }
    }
    
    public ResultSet select(String sql){
        try{
           return stmt.executeQuery(sql);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    public boolean insert(String table, String[][] data){
        try{
            String f = null;
            String d = null;
            for (String[] row : data) {
                if(f == null || d == null){
                    f = row[0];
                    d = "'" + row[1] + "'";
                }
                else{
                    f = f + ", " + row[0];
                    d = d + ", '" + row[1] + "'";
                }
            }
            int insert;
            insert = stmt.executeUpdate("INSERT INTO " + table + "(" + f + ") VALUES (" + d + ")");
            if(insert == 0){
                cek = false;
            }
            else{
                cek = true;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return cek;
    }
    
    public boolean insert(String table, String[][] data, boolean psword){
        try{
            String f = null;
            String d = null;
            for (String[] row : data) {
                if(f == null || d == null){
                    f = row[0];
                    d = "'" + row[1] + "'";
                }
                else if(psword){
                    f = f + ", " + row[0];
                    d = d + ", " + row[1];
                }
                else{
                    f = f + ", " + row[0];
                    d = d + ", '" + row[1] + "'";
                }
            }
            int insert;
            insert = stmt.executeUpdate("INSERT INTO " + table + "(" + f + ") VALUES (" + d + ")");
            if(insert == 0){
                cek = false;
            }
            else{
                cek = true;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return cek;
    }
    
    public boolean update(String table, String[][] data, String[] where){
        try{
            String d = null;
            for (String[] row : data) {
                if(d == null){
                    d = row[0] + " = '" + row[1] + "'";
                }
                else{
                    d = d + ", " + row[0] + " = '" + row[1] + "'";
                }
            }
            int update = stmt.executeUpdate("UPDATE " + table + " SET " + d + " WHERE " + where[0] + " = '" + where[1] + "'");
            if(update == 0){
                cek = false;
            }
            else{
                cek = true;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return cek;
    }
    
    public boolean delete(String table, String[] where){
        try{
            int delete = stmt.executeUpdate("DELETE FROM " + table + " WHERE " + where[0] + " = '" + where[1] + "'");
            if(delete == 0){
                cek = false;
            }
            else{
                cek = true;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return cek;
    }
    
}
