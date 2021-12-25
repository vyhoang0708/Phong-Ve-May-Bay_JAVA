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
        
/**
 *
 * @author conghau
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

   
    //
    public LoadData() {
        
       
        loadTableTaiKhoan();
        

    }

}
