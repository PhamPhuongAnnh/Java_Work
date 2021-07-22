/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_tai__so_5;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class main {
//    public static void main(String[] args) {
//        quanLiPhong qlp = new quanLiPhong();
//        qlp.add();
//        qlp.add();
//        qlp.show();
//        System.out.println("---------------------");
//        qlp.sapXepTheoSoTang();
//        qlp.show();
//    }
    public static int extractNumber(String str) {
          boolean found = false;
        for (int i=0; i<str.length(); i++) {
            char dt = str.charAt(i);
            if (dt == '0'|| dt == '1' || dt == '2'||dt == '3'||dt == '4'||dt == '5'||dt == '6'||dt == '7'||dt == '8'||dt == '9') {
                found = true;
                break;
            }
        }
        if (found == false) {
            return 1;
        } else {
            return 0;
        }
    }
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = sc.nextLine();
        System.out.println(extractNumber(s));
        
    }
}
