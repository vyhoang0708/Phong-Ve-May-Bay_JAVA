/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ChuyenBay {
    private String maChuyenBay;
    private String SHMB;
    private DuongBay maDuongBay;
    private Date ngayBay;
    private Time gioBay;
    private int trangThai;
    private ArrayList<Ghe> arrayListGhe = new ArrayList<Ghe>();

    public ChuyenBay() {
    }

    public ChuyenBay(String maChuyenBay, String SHMB,DuongBay duongBay, Date ngayBay, Time gioBay,int trangThai) {
        this.maChuyenBay = maChuyenBay;
        this.SHMB = SHMB;
        this.maDuongBay = duongBay;
        this.ngayBay = ngayBay;
        this.gioBay = gioBay;
        this.trangThai = trangThai;
        
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public String getSHMB() {
        return SHMB;
    }

    public void setSHMB(String SHMB) {
        this.SHMB = SHMB;
    }

    public DuongBay getDuongBay() {
        return maDuongBay;
    }

    public void setDuongBay(DuongBay duongBay) {
        this.maDuongBay = duongBay;
    }

    public Date getNgayBay() {
        return ngayBay;
    }

    public void setNgayBay(Date ngayBay) {
        this.ngayBay = ngayBay;
    }

    public Time getGioBay() {
        return gioBay;
    }

    public void setGioBay(Time gioBay) {
        this.gioBay = gioBay;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai  ;
    }

    public ArrayList<Ghe> getArrayListGhe() {
        return arrayListGhe;
    }

    public void setArrayListGhe(ArrayList<Ghe> arrayListGhe) {
        this.arrayListGhe = arrayListGhe;
    }
    
     public static DuongBay timDuongBay(String maDuongBay) {
         for (DuongBay db: controller.Controller.arrayListDuongBay) {
             if(db.getMaDuongBay().equals(maDuongBay))
                 return db;
         }
        return null;
    }
     public int getSoGhe() {
        for (MayBay mb: controller.Controller.arrayListMayBay) {
             if(mb.getSHMB().equals(this.SHMB))
                 return mb.getSoGhe();
         }
        return -1;
    }
    public int getSoGheTrong() {
        int soGheTrong=0;
        for (Ghe ghe :arrayListGhe)
            if(ghe.isTrangthai()==false)
                soGheTrong++;
         
        return soGheTrong;
        }
    
}
