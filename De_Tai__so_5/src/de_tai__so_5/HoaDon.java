/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_tai__so_5;
/**
 *
 * @author PC Market
 */
class HoaDon {

    private String maHoaDon;
    private String sodienthoai;
    
    public HoaDon() {
    }

    public HoaDon(String maHoaDon, String sodienthoai) {
        this.maHoaDon = maHoaDon;
        this.sodienthoai = sodienthoai;
    }

    public HoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }
    
}
