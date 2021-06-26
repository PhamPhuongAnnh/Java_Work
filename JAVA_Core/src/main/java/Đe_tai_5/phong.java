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
public class phong {
    private String maPhong;
    private int soTang;
    private String trangThai;
    private String loaiPhong;
    private double giaPhong;

    public phong() {
    }

    
    public phong(String maPhong, int soTang, String trangThai, String loaiPhong, double giaPhong) {
        this.maPhong = maPhong;
        this.soTang = soTang;
        this.trangThai = trangThai;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }
    
    
}
