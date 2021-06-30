/*
hoàng phi
 */
package doan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author PC Market
 */
public class danhSachHoaDon {

    static Scanner sc = new Scanner(System.in);
    private hoaDon[] danhSachHoaDon = new hoaDon[1000000];

    public danhSachHoaDon() {
    }

    public danhSachHoaDon(hoaDon[] danhSachHoaDon) {
        this.danhSachHoaDon = danhSachHoaDon;
    }

    public hoaDon[] getDanhSachHoaDon() {
        return danhSachHoaDon;
    }

    public void setDanhSachHoaDon(hoaDon[] danhSachHoaDon) {
        this.danhSachHoaDon = danhSachHoaDon;
    }

    //tìm kiếm 
    public int timKiemMaHoaDon(String maCanTim) {             //tìm kiếm theo mã
        int i = 0;
        if (maCanTim.equals(danhSachHoaDon[i].getMaHoaDon())) {
            return i;
        } else {
            i++;
        }
        return 0;
    }

    public int timKiemSoDienThoai(String sodienthoai) {             //tìm kiếm theo số điện thoại
        int i = 0;
        if (sodienthoai.equals(danhSachHoaDon[i].getSodienthoai())) {
            return i;
        } else {
            i++;
        }
        return 0;
    }

    public String timKiemTenKhachHang(ArrayList<String> list, String Name) {             //tìm kiếm tên khách hàng
        System.out.println("Nhap ten khach hang can tim: \n");
        String name = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(name)) {
                System.out.println("" + name);
                return name;
            } else {
                System.out.println("Not Found");
            }
        }
        return name;
    }

    public void suaThongTinMaHoaDon() {
        //Nhập mã hóa đơn
        sc.nextLine();
        String maCanTim = sc.nextLine();
        int i = timKiemMaHoaDon(maCanTim);
        //nhập lại mã hóa đơn
        danhSachHoaDon[i].setMaHoaDon(sc.nextLine());
    }

    public String SuaTenKhachHang(ArrayList<String> list, String Name) {             //tìm kiếm tên khách hàng
        System.out.println("Nhap ten khach hang can tim: \n");
        String name = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (Name == name) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhap ten:\n");
                String nametwo = sc.nextLine();
                list.get(i).setName(name);
                break;
            }
        }
        return name;
    }
    public void themMaHoaDon(int STT)
    {
        //nhập mã hóa đơn
        sc.nextLine();
        danhSachHoaDon[STT].setMaHoaDon(sc.nextLine());
        //thêm số điện thoại khách hàng
        sc.nextLine();
        danhSachHoaDon[STT].setSodienthoai(sc.nextLine());
    }
}
