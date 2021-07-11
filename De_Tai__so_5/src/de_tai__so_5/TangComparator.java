/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_tai__so_5;

import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class TangComparator implements Comparator<Phong>{

    @Override
    public int compare(Phong o1, Phong o2) {
        return o1.getSoTang()-o2.getSoTang();
    }
    
}
