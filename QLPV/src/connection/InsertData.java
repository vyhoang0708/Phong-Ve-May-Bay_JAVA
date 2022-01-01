package connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;
/**
 *
 * @author conghau
 */
public class InsertData {
     public static void insertTaiKhoan(TaiKhoan taiKhoan) {
        String sqlCommand = "insert into dbo.TAIKHOAN values(?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, taiKhoan.getTenDangNhap());
            ps.setString(2, taiKhoan.getMatKhau());
            ps.setString(3, taiKhoan.getLoaiTaiKhoan());
            ps.executeUpdate();

            System.out.println("thanh cong");
        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public static boolean insertKhachHang(KhachHang kh){
        String sqlCommand = "insert into dbo.KhACHHANG values(?,?,?,?,?)";
        try{
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, kh.getSDT());
            ps.setString(2, kh.getTenDangNhap());
            ps.setString(3,kh.getTenKhachHang());
            ps.setString(4, kh.getNgaySinh());
            ps.setString(5, kh.getEmail());
            
            if (ps.executeUpdate() > 0) {
                System.out.println("thêm khach hang thành công");
                return true;
        }
         } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("thêm khach hang thất bại");
        return false;
    }
    public static boolean insertSanBay(SanBay sb) {
        String sqlCommand = "insert into dbo.SANBAY values(?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, sb.getMaSanBay());
            ps.setString(2, sb.getTenSanBay());
             ps.setString(3, sb.getDiaDiem());

            if (ps.executeUpdate() > 0) {
                System.out.println("thêm sân bay thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("thêm sân bay thất bại");
        return false;
    }

    
}
