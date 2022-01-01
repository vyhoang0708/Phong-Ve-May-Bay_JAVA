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
    private DuongBay duongBay;
    private Date ngayBay;
    private Time gioBay;
    private int trangThai;
    private int khoangCach;
    private ArrayList<Ghe> arrayListGhe = new ArrayList<Ghe>();

    public ChuyenBay() {
    }

    public ChuyenBay(String maChuyenBay, String SHMB, DuongBay duongBay, Date ngayBay, Time gioBay,int trangThai, int khoangCach) {
        this.maChuyenBay = maChuyenBay;
        this.SHMB = SHMB;
        this.duongBay = duongBay;
        this.ngayBay = ngayBay;
        this.gioBay = gioBay;
        this.trangThai = trangThai;
        this.khoangCach = khoangCach;
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
        return duongBay;
    }

    public void setDuongBay(DuongBay duongBay) {
        this.duongBay = duongBay;
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

    public int getKhoangCach() {
        return khoangCach;
    }

    public void setKhoangCach(int khoangCach) {
        this.khoangCach = khoangCach;
    }

    public ArrayList<Ghe> getArrayListGhe() {
        return arrayListGhe;
    }

    public void setArrayListGhe(ArrayList<Ghe> arrayListGhe) {
        this.arrayListGhe = arrayListGhe;
    }
    
    
}
