/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan;

import java.util.Scanner;

/**
 *
 * @author PC Market
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choose = null;
        boolean exit = false;
        QuanLyDatPhong quanlydatphong = new QuanLyDatPhong();
        showMenu();
        String maHoaDon;
        while (true) {
            choose = sc.nextLine();
            switch (choose) {
            case "1":
                quanlydatphong.add();
                break;
            case "2":
                 maHoaDon = quanlydatphong.nhapMaHoaDon();
                quanlydatphong.edit(maHoaDon);
                break;
            case "3":                                     //xóa khách hàng bởi mahoadon
                maHoaDon = quanlydatphong.nhapMaHoaDon();
                quanlydatphong.delete(maHoaDon);
                break;

            case "6":
                quanlydatphong.show();
                break;
            case "0":
                System.out.println("exited!");
                exit = true;
                break;
            default:
                System.out.println("invalid! please choose action in below menu:");
                break;
            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }
    }
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Thêm mã hóa đơn.");
        System.out.println("2. Edit mã hóa đơn.");
        System.out.println("3. xóa mã hóa đơn");
        System.out.println("6. Show mã hóa đơn.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
