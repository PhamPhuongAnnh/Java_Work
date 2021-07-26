/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_tai__so_5;

/**
 *
 * @author ADMIN
 */
public class Phong {
    
    private int maPhong;
    private int soTang;
    
   
    private int loaiPhong;
    private double giaPhong;

    public Phong() {
    }

    public Phong(int maPhong, int soTang, int loaiPhong, double giaPhong) {
        this.maPhong = maPhong;
        this.soTang = soTang;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }
    public int getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(int loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }
    

}
