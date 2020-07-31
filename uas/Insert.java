/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author sugi
 */
public class Insert {
    Koneksi konek = new Koneksi();
    
    public void insert(int no, String judul, String pengarang, String kategori, int halaman, String penerbit, int tahun) {
        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql = "insert into daftarbuku values('" + no + "','" + judul + " ',' " + pengarang + "','" + kategori + "','" + halaman + "','" + penerbit + "','" + tahun + "');";
            statement.executeUpdate(sql);
            statement.close();
            
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
