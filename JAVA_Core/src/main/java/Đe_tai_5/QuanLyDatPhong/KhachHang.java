/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC Market
 */
public class KhachHang {
private String Name;

    public KhachHang() {
    }

    public KhachHang(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

//    public ArrayList<String> getList() {
//        return list;
//    }
//
//    public void setList(ArrayList<String> list) {
//        this.list = list;
//    }

    private ArrayList<String> list = new ArrayList<>();

    public void Nhap() {
        System.out.println("Nhap danh sach khac hang:\n");
        Scanner sc = new Scanner(System.in);
        int i = 1;
        do {
            String str = sc.nextLine();
            if(str.isEmpty()){
                break;
            }
             list.add(str);
        } while (true);
    }
public void xuatthongtin(){
    System.out.println("Danh sach ten khach hang:\n");
    for( String item : list)
    {
        System.out.println("Ho Ten: "+ item);
    }
}
}
