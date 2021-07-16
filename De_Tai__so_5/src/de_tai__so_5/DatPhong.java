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
   

    private int maDatPhong;
    private int maPhong;
    private int maKhachHang;
    private Date ngayDat;
    private Date ngayTra;
    private int tongTien;

    public DatPhong(int maDatPhong, int maPhong, int maKhachHang, Date ngayDat, Date ngayTra, int tongTien) {
        this.maDatPhong = maDatPhong;
        this.maPhong = maPhong;
        this.maKhachHang = maKhachHang;
        this.ngayDat = ngayDat;
        this.ngayTra = ngayTra;
        this.tongTien = tongTien;
    }

    public DatPhong() {
    }

    public int getMaDatPhong() {
        return maDatPhong;
    }

    public void setMaDatPhong(int maDatPhong) {
        this.maDatPhong = maDatPhong;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
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

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

   
    
}
