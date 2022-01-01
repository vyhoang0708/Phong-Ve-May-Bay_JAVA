package model;

import java.sql.Date;

/**
 *
 * @author PC
 */
public class Ve {

    private String maVe;
    private String maChuyenBay;
    private int giaVe;
    private KhachHang hanhKhach;
    private String maGhe;
    
    public Ve() {
    }

    public Ve(String maVe, String maChuyenBay, int giaVe, KhachHang hanhKhach, String maGhe) {
        this.maVe = maVe;
        this.maChuyenBay = maChuyenBay;
        this.giaVe = giaVe;
        this.hanhKhach = hanhKhach;
        this.maGhe = maGhe;
    }

    public String getMaVe() {
        return maVe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public int getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(int giaVe) {
        this.giaVe = giaVe;
    }

    public KhachHang getHanhKhach() {
        return hanhKhach;
    }

    public void setHanhKhach(KhachHang hanhKhach) {
        this.hanhKhach = hanhKhach;
    }

    public String getMaGhe() {
        return maGhe;
    }

    public void setMaGhe(String maGhe) {
        this.maGhe = maGhe;
    }
    
}
