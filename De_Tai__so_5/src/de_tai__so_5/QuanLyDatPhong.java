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

public class QuanLyDatPhong {

    static Scanner sc = new Scanner(System.in);
    private List<HoaDon> dsHoaDon = new ArrayList<>();

    public QuanLyDatPhong() {

    }

    public String nhapMaHoaDon() {
        System.out.print("Nhap ma hoa don: ");
        String s = sc.nextLine();
        return s;

    }

    
    public String nhapSoDienThoai() {
        System.out.print("Nhap sdt: ");
        String s = sc.nextLine();
        return s;

    }

    //add
    public void add() {

        String maHoaDon = nhapMaHoaDon();
        String sodienthoai = nhapSoDienThoai();
        HoaDon hoadon = new HoaDon(maHoaDon, sodienthoai);
        dsHoaDon.add(hoadon);
    }

    //edit
    public void edit(String maHoaDon) {
        boolean isExisted = false;
        System.out.println("sửa lại thông tin ");
        int size = dsHoaDon.size();
        for (int i = 0; i < size; i++) {
            if (dsHoaDon.get(i).getMaHoaDon().equals(maHoaDon)) {
                isExisted = true;
                dsHoaDon.get(i).setSodienthoai(nhapSoDienThoai());

            }
        }
        if (isExisted == false) {
            System.out.printf("ma hoa don = %s khong ton tai.\n", maHoaDon);
        }
    }

    //xóa hóa đơn
    public void delete(String maHoaDon) {
        HoaDon hoadon = null;
        int size = dsHoaDon.size();
        for (int i = 0; i < size; i++) {
            if (dsHoaDon.get(i).getMaHoaDon().equals(maHoaDon)) {
                hoadon = dsHoaDon.get(i);
                break;
            }
        }
        if (hoadon != null) {
            dsHoaDon.remove(hoadon);

        } else {
            System.out.printf("Ma Hoa Don = %d khong ton tai.\n", maHoaDon);
        }
    }

    //sắp xếp mã hóa đơn
    public void SapXepMaHoaDon() {
        Collections.sort(dsHoaDon, new SapXepMaHoaDon());
    }

    public void show() {
        for (HoaDon hoadon : dsHoaDon) {
            System.out.format("%10s | ", hoadon.getMaHoaDon());
            System.out.format("%10s | ", hoadon.getSodienthoai());
            System.out.println("");
        }
    }

}
