/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan;

import java.util.List;
import java.util.Scanner;

    public class QuanLyDatPhong {
        static Scanner sc = new Scanner(System.in);
    private List<hoaDon> dsHoaDon;
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
    public void add(){
        
        String maHoaDon = nhapMaHoaDon();
        String sodienthoai = nhapSoDienThoai();
        hoaDon hoadon = new hoaDon(maHoaDon, sodienthoai);
        dsHoaDon.add(hoadon);
    }
    //edit
    public void edit(String maHoaDon) {
        boolean isExisted = false;
        int size = dsHoaDon.size();
        for (int i = 0; i < size; i++) {
            if (dsHoaDon.get(i).getMaHoaDon().equals(maHoaDon)) {
                isExisted = true;
                dsHoaDon.get(i).setSodienthoai(nhapSoDienThoai());
                
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("ma hoa don = %s khong ton tai.\n", maHoaDon);
        } 
    }
    //xóa hóa đơn
    public void delete(String  maHoaDon) {
        hoaDon hoadon = null;
        int size = dsHoaDon.size();
        for (int i = 0; i < size; i++) {
            if (dsHoaDon.get(i).getMaHoaDon()== maHoaDon) {
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
    public void show() {
        for (hoaDon hoadon : dsHoaDon) {
            System.out.format("%10s | ", hoadon.getMaHoaDon());
             System.out.format("%10s | ", hoadon.getSodienthoai());
        }
    }
      
    
}
