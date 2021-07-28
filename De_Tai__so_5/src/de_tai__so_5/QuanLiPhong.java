/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_tai__so_5;
import java.util.ArrayList;
import java.util.Calendar;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QuanLiPhong {

    public static Scanner sc = new Scanner(System.in);
    private List<DatPhong> dPhongs = new ArrayList<>();

    public QuanLiPhong() {
    }

    public List<DatPhong> getdPhongs() {
        return dPhongs;
    }

    public void setdPhongs(List<DatPhong> dPhongs) {
        this.dPhongs = dPhongs;
    }

    //nhập mã phòng
    public String nhapMaPhong() {
        System.out.println("Nhập Mã Phòng");
        return sc.nextLine();
    }

    //nhập mã khách hàn
    public String nhapKhachHang() {
        System.out.println("Nhập Khách Hàng");
        return sc.nextLine();
    }

    //nhập mã Tổng tiền
    public int nhapTongTien() {
        System.out.println("Nhập Tổng Tiền");
        return sc.nextInt();
    }
    //nhập ngày đặt

    public Date nhapNgayDat() {
        Calendar c = Calendar.getInstance();
        System.out.println("nhập ngày đặt");
        c.set(Calendar.DAY_OF_MONTH, sc.nextInt());
        c.set(Calendar.MONTH, sc.nextInt() - 1);
        c.set(Calendar.YEAR, sc.nextInt());
        Date ngayDat = c.getTime();
        return ngayDat;
    }

    //nhập ngày trả 
    public Date nhapngayTra() {
        Calendar c = Calendar.getInstance();
        System.out.println("nhập ngày trả");
        c.set(Calendar.DAY_OF_MONTH, sc.nextInt());
        c.set(Calendar.MONTH, sc.nextInt() - 1);
        c.set(Calendar.YEAR, sc.nextInt());
        Date ngayTra = c.getTime();
        return ngayTra;
    }

    //thêm thông tin đặt phòng
    public void add() {
        String maDatPhong = nhapMaPhong();
        String maPhong = nhapMaPhong();
        String maKhachHang = nhapKhachHang();
        Date ngayDat = nhapNgayDat();
        Date ngayTra = nhapngayTra();
        int TongTien = nhapTongTien();
        DatPhong datPhong = new DatPhong(maDatPhong, maPhong, maKhachHang, ngayDat, ngayTra, TongTien);
        dPhongs.add(datPhong);
    }

    //xoa thong tin 1 phong
    public void xoaThongTin(int maDatPhong) {
        DatPhong datPhong = null;
        for (int i = 0; i < dPhongs.size(); i++) {
            if (dPhongs.get(i).getMaDatPhong().equals(maDatPhong)) {
                datPhong = dPhongs.get(i);
                break;
            }
        }
        if (datPhong != null) {
            dPhongs.remove(datPhong);

        } else {
            System.out.println("ma dat phong khong ton tai");
        }
    }

    //lọc thông tin  theo mã phòng
    public void locThongTinTheoMaPhong(int maPhong) {
        DatPhong datPhong = null;
        for (int i = 0; i < dPhongs.size(); i++) {
            if (dPhongs.get(i).getMaPhong().equals(maPhong) ){
                datPhong = dPhongs.get(i);
                break;
            }

        }
        if (datPhong != null) {
            System.out.println("hien thi: " + datPhong.getMaPhong());
            System.out.println("hien thi: " + datPhong.getMaKhachHang());
            System.out.println("hien thi: " + datPhong.getNgayDat());
            System.out.println("hien thi: " + datPhong.getNgayTra());
            System.out.println("hien thi: " + datPhong.getMaDatPhong());
            System.out.println("hien thi: " + datPhong.getTongTien());

        } else {
            System.out.println("ma phong khong ton tai");
        }
    }

    //loc thong tin theo ma khach hang
    public void locThongTinTheoMaKhachHang(int maKhachHang) {
        DatPhong datPhong = null;
        for (int i = 0; i < dPhongs.size(); i++) {
            if (dPhongs.get(i).getMaKhachHang() .equals(maKhachHang)) {
                datPhong = dPhongs.get(i);
                break;
            }

        }
        if (datPhong != null) {
            System.out.println("hien thi: " + datPhong.getMaPhong());
            System.out.println("hien thi: " + datPhong.getMaKhachHang());
            System.out.println("hien thi: " + datPhong.getNgayDat());
            System.out.println("hien thi: " + datPhong.getNgayTra());
            System.out.println("hien thi: " + datPhong.getMaDatPhong());
            System.out.println("hien thi: " + datPhong.getTongTien());

        } else {
            System.out.println("ma phong khong ton tai");
        }
    }

    //sap xep thong tin theo ma khach hang
    public void sortByMKH() {
        Collections.sort(dPhongs, new MaKHComparator());
    }

    //sap xep thong tin theo ma phong
    public void xapSepTheoMaPhong() {
        Collections.sort(dPhongs, new MaPhongComparator());
    }
    //xap xep thong tin theo ngay dat

    public void xapSepTheoNgayDat() {
        Collections.sort(dPhongs, new NgayComparator());
    }
    //sua thong tin theo ngay đặt

    public void editNgayDat(int maDatPhong) {
        int a = 0;
        System.out.println("sửa lại thông tin");
        for (int i = 0; i < dPhongs.size(); i++) {
            if (dPhongs.get(i).getMaDatPhong().equals(maDatPhong) ){
                a = 1;
                dPhongs.get(i).setNgayDat(nhapNgayDat());
                dPhongs.get(i).setNgayTra(nhapngayTra());
            }

        }
        if (a == 0) {
            System.out.println("không có mã phòng");
        }

    }

    //sua thong tin theo ngay trả
    public void editNgayTra(int maDatPhong) {
        int a = 0;
        System.out.println("sửa lại thông tin");
        for (int i = 0; i < dPhongs.size(); i++) {
            if (dPhongs.get(i).getMaDatPhong().equals( maDatPhong)) {
                a = 1;
                dPhongs.get(i).setNgayTra(nhapngayTra());
            }

        }
        if (a == 0) {
            System.out.println("không có mã phòng");
        }

    }

    public void show() {
        for (int i = 0; i < dPhongs.size(); i++) {
            System.out.println("hien thi: " + dPhongs.get(i).getMaPhong());
            System.out.println("hien thi: " + dPhongs.get(i).getMaKhachHang());
            System.out.println("hien thi: " + dPhongs.get(i).getNgayDat());
            System.out.println("hien thi: " + dPhongs.get(i).getNgayTra());
            System.out.println("hien thi: " + dPhongs.get(i).getMaDatPhong());
            System.out.println("hien thi: " + dPhongs.get(i).getTongTien());

        }
    }
}
