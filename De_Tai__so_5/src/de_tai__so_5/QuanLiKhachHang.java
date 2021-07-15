/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author oOOo
 */
public class QuanLiKhachHang {

    static Scanner sc = new Scanner(System.in);
    private int stt;
    private List<khachHang> danhSachKhachHang = new ArrayList<>();

    public QuanLiKhachHang() {
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public List<khachHang> getDanhSachKhachHang() {
        return danhSachKhachHang;
    }

    public void setDanhSachKhachHang(List<khachHang> danhSachKhachHang) {
        this.danhSachKhachHang = danhSachKhachHang;
    }

    // nhập Mã khác hàng
    public String nhapMaKhachHang() {
        System.out.println("Nhap Ma Khac Hang: ");
        return new Scanner(System.in).nextLine();
    }

    //   nhập họ tên khách hàng;
    public String nhapHoTenKhachHang() {
        System.out.println("Nhap Ho Ten: ");
        return new Scanner(System.in).nextLine();
    }

    // nhập tuổi
    public String nhapTuoi() {
        System.out.println("Nhap Tuoi: ");
        return sc.nextLine();
    }

    // nhập số CMND/TCC
    public int nhapSoCMND() {
        System.out.println("Nhap So CMND/TCC: ");
        return sc.nextInt();
    }

    // nhập SDT
    public int nhapSDT() {
        System.out.println("Nhap SDT: ");
        return sc.nextInt();
    }

    // nhập phương thức thanh toán
    public String nhapPhuongThucThanhToan() {
        System.out.println("Nhap Phuong Thuc Thanh Toan: ");
        return sc.nextLine();
    }

    // Thêm thông tin 1 khách hàng
    public void add() {
        String maKhachHang = nhapMaKhachHang();
        String hoTenKhachHang = nhapHoTenKhachHang();
        String tuoi = nhapTuoi();
        int soCMND = nhapSoCMND();
        int soDT = nhapSDT();
        sc.nextLine();
        String phuongTTT = nhapPhuongThucThanhToan();
        khachHang khacHang1 = new khachHang(maKhachHang, hoTenKhachHang, tuoi, soCMND, soDT, phuongTTT);
        danhSachKhachHang.add(khacHang1);
    }

    //   sửa tên khách hàng theo mã KH 
    public void suaTenKhachHang(String makhachHang) {
        boolean flag = false;
        System.out.println("Sua Ten Khach Hang: ");
        for (int i = 0; i < danhSachKhachHang.size(); i++) {
            if (danhSachKhachHang.get(i).getMaKhachHang().equals(makhachHang)) {
                flag = true;
                danhSachKhachHang.get(i).setHoTen(new Scanner(System.in).nextLine());
            }
        }
        if (flag == false) {
            System.out.println("không tồn tại mã khách hàng");
        }

    }

    //   sửa tuổi khách hàng theo mã KH 
    public void suaTuoiKhachHang(String makhachHang) {
        boolean flag = false;
        System.out.println("Sua Tuoi Khach Hang: ");
        for (int i = 0; i < danhSachKhachHang.size(); i++) {
            if (danhSachKhachHang.get(i).getMaKhachHang().equals(makhachHang)) {
                flag = true;
                danhSachKhachHang.get(i).setTuoi(new Scanner(System.in).nextLine());
            }
        }
        if (flag == false) {
            System.out.println("không tồn tại mã khách hàng");
        }

    }
    
    //   sửa số CMND/TCC khách hàng theo mã KH 
    public void suaSoCMNDKhachHang(String makhachHang) {
        boolean flag = false;
        System.out.println("Sua So CMND/TCC Khach Hang: ");
        for (int i = 0; i < danhSachKhachHang.size(); i++) {
            if (danhSachKhachHang.get(i).getMaKhachHang().equals(makhachHang)) {
                flag = true;
                danhSachKhachHang.get(i).setCMND(new Scanner(System.in).nextInt());
            }
        }
        if (flag == false) {
            System.out.println("không tồn tại mã khách hàng");
        }

    }
    
    //   sửa số điện thoại khách hàng theo mã KH 
    public void suaSoDienThoaiKhachHang(String makhachHang) {
        boolean flag = false;
        System.out.println("Sua SDT Khach Hang: ");
        for (int i = 0; i < danhSachKhachHang.size(); i++) {
            if (danhSachKhachHang.get(i).getMaKhachHang().equals(makhachHang)) {
                flag = true;
                danhSachKhachHang.get(i).setSDT(new Scanner(System.in).nextInt());
            }
        }
        if (flag == false) {
            System.out.println("không tồn tại mã khách hàng");
        }

    }
    
    //   sửa số Phương thức thanh toán theo mã KH 
    public void suaPhuongTTT(String makhachHang) {
        boolean flag = false;
        System.out.println("Sua Phuong Thuc Thanh Toan : ");
        for (int i = 0; i < danhSachKhachHang.size(); i++) {
            if (danhSachKhachHang.get(i).getMaKhachHang().equals(makhachHang)) {
                flag = true;
                danhSachKhachHang.get(i).setPhuongThucThanhToan(new Scanner(System.in).nextLine());
            }
        }
        if (flag == false) {
            System.out.println("không tồn tại mã khách hàng");
        }

    }

    //  xóa 1 phần tử theo mã khách hàng
    public void xoaThongTin(String maKhachHang) {
        khachHang khacHang = null;
        for (int i = 0; i < danhSachKhachHang.size(); i++) {
            if (danhSachKhachHang.get(i).getMaKhachHang().equals(maKhachHang)) {
                khacHang = danhSachKhachHang.get(i);
                break;
            }
        }
        if (khacHang != null) {
            danhSachKhachHang.remove(khacHang);

        } else {
            System.out.println("ma khach hang khong ton tai");
        }
    }

    // Sắp xếp theo họ tên
    public void sapXepTheoHoTen() {
        Collections.sort(danhSachKhachHang, new Comparator<khachHang>() {
            @Override
            public int compare(khachHang o1, khachHang o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
    }

    // Sắp xếp theo tuổi khách hàng
    public void sapXepTheoTuoi() {
        Collections.sort(danhSachKhachHang, new Comparator<khachHang>() {
            @Override
            public int compare(khachHang o1, khachHang o2) {
                return o1.getTuoi().compareTo(o2.getTuoi());
            }
        });
    }

    // hiển thị danh sách khách hàng
    public void show() {
        // hiển thị cột
        System.out.printf("%-10s %-30s %-10s %-15s %-15s %-20s\n",
                "MaKH", "HoTenKhachHang", "Tuoi", "SoCMND", "SoDT", "PhuongTTT");
        for (khachHang khachHang : danhSachKhachHang) {
            System.out.printf("%-10s %-30s %-10s %-15d %-15d %-20s\n",
                    khachHang.getMaKhachHang(), khachHang.getHoTen(), khachHang.getTuoi(),
                    khachHang.getSDT(), khachHang.getCMND(), khachHang.getPhuongThucThanhToan());
        }
    }

    // hiển thị ngẫu nhiên danh sách
    public void showRandom() {
        Collections.shuffle(danhSachKhachHang);
        show();
    }

    void suaTenKhachHang(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
