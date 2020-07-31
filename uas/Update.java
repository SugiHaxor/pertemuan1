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
public class Update {

    Koneksi konek = new Koneksi();

    //

    public void update(int no, String judul, String pengarang, String kategori, int halaman, String penerbit, int tahun) {
        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql_no = "update daftarbuku set no='" + no + "'where no='" + no + "'";
            String sql_judul = "update daftarbuku set judul='" + judul + "'where no ='" + no + "'";
            String sql_pengarang = "update daftarbuku set pengarang='" + pengarang + "'where no='" + no + "'";
            String sql_kategori = "update daftarbuku set kategori='" + kategori + "'where no='" + no + "'";
            String sql_halaman = "update daftarbuku set halaman='" + halaman + "'where no='" + no + "'";
            String sql_penerbit = "update daftarbuku set penerbit='" + penerbit + "'where no='" + no + "'";
            String sql_tahun = "update daftarbuku set tahun='" + tahun + "'where no='" + no + "'";

            statement.executeUpdate(sql_no);
            statement.executeUpdate(sql_judul);
            statement.executeUpdate(sql_pengarang);
            statement.executeUpdate(sql_kategori);
            statement.executeUpdate(sql_halaman);
            statement.executeUpdate(sql_penerbit);
            statement.executeUpdate(sql_tahun);

            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
