/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_tai__so_5;

/**
 *
 * @author phuon
 */

    


import java.util.Scanner;

/**
 *
 * @author PC Market
 */
public class Main_QuanLyDatPhong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        
        QuanLyDatPhong quanlydatphong = new QuanLyDatPhong();
        
        String maHoaDon;
        do  {
            showMenu();
            choose = sc.nextInt();
            
            switch (choose) {
                
                case 1: 
                    //thêm mã hóa đơn vào danh sách
                    quanlydatphong.add();
                    break;
                case 2:
                    // sửa thông tin khi nhập mã hóa đơn
                    maHoaDon = quanlydatphong.nhapMaHoaDon();
                    quanlydatphong.edit(maHoaDon);
                    break;
                case 3:                                  //xóa khách hàng bởi mahoadon
                    maHoaDon = quanlydatphong.nhapMaHoaDon();
                    quanlydatphong.delete(maHoaDon);
                    break;

                case 4:
                    quanlydatphong.show();
                    break;
                case 5:
                    quanlydatphong.SapXepMaHoaDon();
                    break;
                case 0:
                    System.out.println("exited!");
                    quanlydatphong.show();
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
        } while(choose !=0);
    }

    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Thêm mã hóa đơn.");
        System.out.println("2. Edit mã hóa đơn.");
        System.out.println("3. xóa mã hóa đơn");
        System.out.println("4. Show mã hóa đơn.");
        System.out.println("5. Sắp xếp.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
