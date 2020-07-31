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
public class Delete {
    Koneksi konek = new Koneksi();
    
    public void delete(int no) {
        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql = "delete from daftarbuku where no = '" + no + "'";
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
