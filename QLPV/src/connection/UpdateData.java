/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.MayBay;
import model.SanBay;

/**
 *
 * @author PC
 */
public class UpdateData {
     public static boolean updateSanBay(SanBay sanBay) {
        String sqlCommand = "update dbo.SANBAY set TenSanBay=? , DiaDiem=?" 
                + " where MaSanBay=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);

            ps.setString(1, sanBay.getTenSanBay());
            ps.setString(2, sanBay.getDiaDiem());
            ps.setString(3, sanBay.getMaSanBay());

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa sân bay thất bại");
        return false;
    }
     
    public static boolean updateMayBay(MayBay mayBay) {
        String sqlCommand = "update dbo.MAYBAY set HANGBAY=?, SOGHE=?"
                + " where SHMB=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);

            ps.setString(1, mayBay.getHangBay());
            ps.setInt(2, mayBay.getSoGhe());
            ps.setString(3, mayBay.getSHMB());

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa máy bay thất bại");
        return false;
    }
}
