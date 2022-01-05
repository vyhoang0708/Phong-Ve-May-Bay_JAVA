package model;

/**
 *
 * @author PC
 */
public class Ghe {

    private String maGhe;
    private String maChuyenBay;
 
    private boolean trangthai;

    public Ghe() {
    }

    public Ghe(String maGhe, String maChuyenBay, boolean trangthai) {
        this.maGhe = maGhe;
        this.maChuyenBay = maChuyenBay;
      
        this.trangthai = trangthai;
    }

    public String getMaGhe() {
        return maGhe;
    }

    public void setMaGhe(String maGhe) {
        this.maGhe = maGhe;
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

   

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

   

}
