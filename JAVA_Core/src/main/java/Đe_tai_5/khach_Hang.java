/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Đe_tai_5;

/**
 *
 * @author phuon
 */
public class khach_Hang {
    private String maKhachHang;
    private String hoTen;
    private String Tuoi;
    private int CMND;
    private int SDT;
    private String phuongThucThanhToan;

    public khach_Hang() {
    }

    public khach_Hang(String maKhachHang, String hoTen, String Tuoi, int CMND, int SDT, String phuongThucThanhToan) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.Tuoi = Tuoi;
        this.CMND = CMND;
        this.SDT = SDT;
        this.phuongThucThanhToan = phuongThucThanhToan;
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

    public String getTuoi() {
        return Tuoi;
    }

    public void setTuoi(String Tuoi) {
        this.Tuoi = Tuoi;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public String getPhuongThucThanhToan() {
        return phuongThucThanhToan;
    }

    public void setPhuongThucThanhToan(String phuongThucThanhToan) {
        this.phuongThucThanhToan = phuongThucThanhToan;
    }
    
    
    
}
