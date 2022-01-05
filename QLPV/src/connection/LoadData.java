package connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.TaiKhoan;
import controller.Controller;
import java.util.concurrent.ConcurrentHashMap;
import model.*;
        
/**
 *
 * @author PC
 */
public class LoadData {
    public static void loadTableTaiKhoan() {
      
        ResultSet rs = DataConnection.retrieveData("select * from dbo.TAIKHOAN");
        try {
            while (rs.next()) {
                TaiKhoan taiKhoan = new TaiKhoan(
                        rs.getString(1).trim(),
                        rs.getString(2).trim(),
                        rs.getString(3).trim());
               Controller.arrayListTaiKhoan.add(taiKhoan);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void loadTableNhanVien() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.NHANVIEN");
        try {
            while (rs.next()) {
                NhanVien nv = new NhanVien(
                        rs.getString(1).trim(),
                        rs.getString(2).trim(),
                        rs.getString(3).trim(),
                        rs.getInt(4));
                Controller.arrayListNhanVien.add(nv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void loadTableDuongBay() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.DUONGBAY");
        try {
            while (rs.next()) {
                DuongBay duongBay = new DuongBay(
                        rs.getString(1).trim(),
                        rs.getString(2).trim(),
                        rs.getString(3).trim(),
                        rs.getInt(4));

                Controller.arrayListDuongBay.add(duongBay);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public static void loadTableMayBay() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.MAYBAY");
        try {
            while (rs.next()) {
                MayBay mayBay = new MayBay(
                        rs.getString(1).trim(),
                        rs.getString(2).trim(),
                        rs.getInt(3));
                Controller.arrayListMayBay.add(mayBay);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public static void loadTableSanBay() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.SANBAY");
        try {
            while (rs.next()) {
                SanBay sanBay = new SanBay(
                        rs.getString(1).trim(),
                        rs.getString(2).trim(),
                        rs.getString(3).trim());
                Controller.arrayListSanBay.add(sanBay);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
      public static void loadTableChuyenBay() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.CHUYENBAY");
        try {
            while (rs.next()) {
                ChuyenBay chuyenBay = new ChuyenBay(
                        rs.getString(1).trim(),
                        rs.getString(2).trim(),
                        ChuyenBay.timDuongBay( rs.getString(3).trim()),
                        rs.getDate(4),
                        rs.getTime(5),
                        rs.getInt(6));
                chuyenBay.setArrayListGhe(loadTableGhe(chuyenBay.getMaChuyenBay().trim()));
                controller.Controller.arrayListChuyenBay.add(chuyenBay);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public static ArrayList<Ghe> loadTableGhe(String maChuyenBay) {

        ArrayList<Ghe> arrayListGhe = new ArrayList<Ghe>();
        ResultSet rs = DataConnection.retrieveData("select * from dbo.GHE where MaChuyenBay like '%" + maChuyenBay + " %'");
        try {
            while (rs.next()) {
                Ghe ghe = new Ghe(
                        rs.getString(1).trim(),
                        rs.getString(2).trim(),
                      
                        rs.getBoolean(3));
                arrayListGhe.add(ghe);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayListGhe;
    }

    public LoadData() {
        controller.Controller.arrayListSanBay.removeAll(controller.Controller.arrayListSanBay);
        controller.Controller.arrayListDuongBay.removeAll(controller.Controller.arrayListDuongBay);
        controller.Controller.arrayListTaiKhoan.removeAll(controller.Controller.arrayListTaiKhoan);
        controller.Controller.arrayListMayBay.removeAll(controller.Controller.arrayListMayBay);    
        controller.Controller.arrayListNhanVien.removeAll(controller.Controller.arrayListNhanVien);

        loadTableTaiKhoan();  
        loadTableSanBay(); 
        loadTableDuongBay(); 
        loadTableNhanVien();
        loadTableMayBay();
        loadTableChuyenBay();
    }

}
