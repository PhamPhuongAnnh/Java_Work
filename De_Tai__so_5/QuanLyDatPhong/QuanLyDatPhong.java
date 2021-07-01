/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDatPhong;

import java.util.Scanner;

/**
 *
 * @author PC Market
 */
public class QuanLyDatPhong {
    static Scanner sc = new Scanner(System.in);
    private HoaDon[] danhSachHoaDon = new HoaDon[1000000];

    public QuanLyDatPhong() {
    }
    public QuanLyDatPhong(HoaDon[] danhSachHoaDon) {
        this.danhSachHoaDon = danhSachHoaDon;
    }

    public HoaDon[] getDanhSachHoaDon() {
        return danhSachHoaDon;
    }

    public void setDanhSachHoaDon(HoaDon[] danhSachHoaDon) {
        this.danhSachHoaDon = danhSachHoaDon;
    }
//  tìm kiếm thông tin theo mã hóa đơn
    public int timKiemThongTinMaHoaDon(String maCanTim) {
        int i = 0;
        if (maCanTim.equals(danhSachHoaDon[i].getMaHoaDon())) {
            return i;
        } else {
            i++;
        }
        return 0;
    }
    //    sửa thông tin theo mã hóa đơn
    public void suaThongTinTheoMaHoaDon() {
//        nhập mã phong cần tìm
        sc.nextLine();
        String maCanTim = sc.nextLine();
//      tìm mã phòng cần sửa
        int i = timKiemThongTinMaHoaDon(maCanTim);
//    nhập lại mã phòng
        danhSachHoaDon[i].setMaHoaDon(sc.nextLine());
    }
    //thêm thông tin hóa đơn
    public void themThongTinHoaDon(int soTT) {
//        nhập mã phòng
        sc.nextLine();
        danhSachHoaDon[soTT].setMaHoaDon(sc.nextLine());

    }
}
