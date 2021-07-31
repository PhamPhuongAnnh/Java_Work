/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_tai__so_5;

/**
 *
 * @author phuon
 */
public class khachHang {
    private String maKhachHang;
    private String hoTen;
    private String SDT;
    private int Tuoi;
    private String CMND;
    private String phuongThucThanhToan;

    public khachHang(String maKhachHang, String hoTen, String SDT, int Tuoi, String CMND, String phuongThucThanhToan) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.SDT = SDT;
        this.Tuoi = Tuoi;
        this.CMND = CMND;
        this.phuongThucThanhToan = phuongThucThanhToan;
    }

   

    public khachHang() {
    }

  
   

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getPhuongThucThanhToan() {
        return phuongThucThanhToan;
    }

    public void setPhuongThucThanhToan(String phuongThucThanhToan) {
        this.phuongThucThanhToan = phuongThucThanhToan;
    }
    
}
