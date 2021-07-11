/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_tai__so_5;

/**
 *
 * @author ADMIN
 */
public class main {
    public static void main(String[] args) {
        quanLiPhong qlp = new quanLiPhong();
        qlp.add();
        qlp.add();
        qlp.show();
        System.out.println("---------------------");
        qlp.sapXepTheoSoTang();
        qlp.show();
    }
}
