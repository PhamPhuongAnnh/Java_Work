/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_tai__so_5;

import java.util.Date;

/**
 *
 * @author phuon
 */
class DatPhong {
//    maDatPhong, maPhong, maKhachHang, ngayDat, ngayTra, TongTien);
   

    private String maDatPhong;
    private String maPhong;
    private String maKhachHang;
    private Date ngayDat;
    private Date ngayTra;
    private double tongTien;

    public DatPhong(String maDatPhong, String maPhong, String maKhachHang, Date ngayDat, Date ngayTra, double tongTien) {
        this.maDatPhong = maDatPhong;
        this.maPhong = maPhong;
        this.maKhachHang = maKhachHang;
        this.ngayDat = ngayDat;
        this.ngayTra = ngayTra;
        this.tongTien = tongTien;
    }
    
    

    public DatPhong() {
    }

    public String getMaDatPhong() {
        return maDatPhong;
    }

    public void setMaDatPhong(String maDatPhong) {
        this.maDatPhong = maDatPhong;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }


   
    
}
