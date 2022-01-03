/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class DeleteData {
       public static boolean deleteSanBay(String maSanBay) {
        String sqlCommand = "delete from dbo.SANBAY where MaSanBay=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, maSanBay);
            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa sân bay thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa sân bay thất bại");
        return false;
    }
       
        public static boolean deleteMayBay(String SHMB) {
        String sqlCommand = "delete from dbo.MAYBAY where SHMB=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, SHMB);
            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa may bay thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa sân bay thất bại");
        return false;
    }
}
