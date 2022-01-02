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

    public LoadData() {
        controller.Controller.arrayListSanBay.removeAll(controller.Controller.arrayListSanBay);
        controller.Controller.arrayListDuongBay.removeAll(controller.Controller.arrayListDuongBay);
        controller.Controller.arrayListTaiKhoan.removeAll(controller.Controller.arrayListTaiKhoan);
        loadTableTaiKhoan();  
        loadTableSanBay(); 
        loadTableDuongBay(); 
    }

}
