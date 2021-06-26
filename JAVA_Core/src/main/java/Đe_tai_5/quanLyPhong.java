/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Đe_tai_5;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class quanLyPhong {

    static Scanner sc = new Scanner(System.in);
    private phong[] danhSachPhong = new phong[1000000];

    public quanLyPhong() {
    }

    public quanLyPhong(phong[] danhSachPhong) {
        this.danhSachPhong = danhSachPhong;
    }

    public phong[] getDanhSachPhong() {
        return danhSachPhong;
    }

    public void setDanhSachPhong(phong[] danhSachPhong) {
        this.danhSachPhong = danhSachPhong;
    }

//  tìm kiếm thông tin theo mã phòng
    public int timKiemThongTinMa(String maCanTim) {
        int i = 0;
        if (maCanTim.equals(danhSachPhong[i].getMaPhong())) {
            return i;
        } else {
            i++;
        }
        return 0;
    }

//  tìm kiếm thông tin theo số tầng
    public int timKiemThongTinsoTang(int soTang) {
        int i = 0;
        if (soTang == danhSachPhong[i].getSoTang()) {
            return i;
        } else {
            i++;
        }
        return 0;
    }

//    sửa thông tin theo mã phòng
    public void suaThonhTinTheoMa() {
//        nhập mã phong cần tìm
        sc.nextLine();
        String maCanTim = sc.nextLine();
//      tìm mã phòng cần sửa
        int i = timKiemThongTinMa(maCanTim);
//    nhập lại mã phòng
        danhSachPhong[i].setMaPhong(sc.nextLine());
    }

//thêm thông tin một phòng
    public void themThongTinPhong(int soTT) {
//        nhập mã phòng
        sc.nextLine();
        danhSachPhong[soTT].setMaPhong(sc.nextLine());
//        nhấp số tâng 
        danhSachPhong[soTT].setSoTang(sc.nextInt());
//nhập trạng thái
        sc.nextLine();
        danhSachPhong[soTT].setTrangThai(sc.nextLine());

//nhập loại phòng
        danhSachPhong[soTT].setLoaiPhong(sc.nextLine());

//nhập giá
        danhSachPhong[soTT].setGiaPhong(sc.nextDouble());
    }
}
