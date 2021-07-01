/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_tai__so_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class quanLyPhong {
    

    static Scanner sc = new Scanner(System.in);
    private int stt;
    List<phong> danhSachPhong;

    public quanLyPhong() {
        danhSachPhong = new ArrayList<>();
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public List<phong> getDanhSachPhong() {
        return danhSachPhong;
    }

    public void setDanhSachPhong(List<phong> danhSachPhong) {
        this.danhSachPhong = danhSachPhong;
    }

//    hiển thị 
    public void disPlay() {
        System.out.printf("Phong so: %d: ", getStt());
        for (phong Phong : danhSachPhong) {
            System.out.println(Phong);
        }

    }
//    thêm 

    public void add() {
        stt = (danhSachPhong.size() > 0) ? (danhSachPhong.size() + 1) : 1;
        System.out.println("STT: " + stt);
        String maPhong = nhapMaPhong();
        int soTang = nhapSoTang();
        String trangThai = nhapTrangThai();
        String loaiPhong = nhapLoaiPhong();
        double gia = nhapGiaPhong();
        phong phong1 = new phong(maPhong, soTang, trangThai, loaiPhong, gia);
        danhSachPhong.add(phong1);
        

    }
//    sửa loại phòng
    public void suaThongTinLoaiPhong(String maPhong){
        boolean flag = false;
        for(int i =0; i<danhSachPhong.size(); i++){
            if(danhSachPhong.get(i).getMaPhong().equals(maPhong)){
                flag = true;
                danhSachPhong.get(i).setLoaiPhong(sc.nextLine());
                break;
            }
        }
        if(!flag){
            System.out.printf("Ma Phong = %s không có\n", maPhong);
        }
        
    }
//    sửa giá
    public void suaThongTinGiaPhong(String maPhong){
        boolean flag = false;
        for(int i =0; i<danhSachPhong.size(); i++){
            if(danhSachPhong.get(i).getMaPhong().equals(maPhong)){
                flag = true;
                danhSachPhong.get(i).setGiaPhong(sc.nextDouble());
            }
        }
        
    }
//   sửa trạng thái 
        public void suaThongTinTrangThai(String maPhong){
        boolean flag = false;
        for(int i =0; i<danhSachPhong.size(); i++){
            if(danhSachPhong.get(i).getMaPhong().equals(maPhong)){
                flag = true;
                danhSachPhong.get(i).setTrangThai(sc.nextLine());
            }
        }
        
    }
//        xóa 1 phần tử 
        public void xoaThongTin(String maPhong){
            phong Phong = null;
            for(int i=0; i<danhSachPhong.size(); i++){
                if(danhSachPhong.get(i).getMaPhong() == maPhong){
                    Phong = danhSachPhong.get(i);
                    break;
                }
            }
            if(danhSachPhong != null){
                danhSachPhong.remove(Phong);
                
            }
            else{
                System.out.println("ma phong khong ton tai");
            }
        }
        
//        sắp xếp thông tin theo số tâng 
       
//    hiển thị danh sách 
         public void show() {
        for (phong Phong : danhSachPhong) {
            System.out.format("%10s | ", Phong.getMaPhong());
            System.out.format("%20d | ",Phong.getSoTang());
            System.out.format("%10s | ", Phong.getLoaiPhong());
            System.out.format("%20s | ", Phong.getTrangThai());
            System.out.format("%10.1f%n", Phong.getGiaPhong());
        }
    }
//    Nhập Mã Phòng
    public String nhapMaPhong() {
        System.out.println("Nhap Ma Phong: ");
        return sc.nextLine();
    }
//nhập số tâng 

    public int nhapSoTang() {
        System.out.println("Nhap So Tang: ");
        return sc.nextInt();
    }
//    nhập trangThai;
    public String nhapTrangThai(){
        System.out.println("Nhap Trang Thai: ");
        return sc.nextLine();
    }
//   nhập loaiPhong;
    public String nhapLoaiPhong(){
        System.out.println("Nhap Loai Phong: ");
        return sc.nextLine();
    }
//    nhập giaPhong;
    public double nhapGiaPhong(){
        System.out.println("Nhap gia phong: ");
        return sc.nextDouble();
    }
}
