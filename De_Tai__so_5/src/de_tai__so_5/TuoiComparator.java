/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_tai__so_5;

import java.util.Comparator;

/**
 *
 * @author phuon
 */
public class TuoiComparator implements Comparator<khachHang>{

    @Override
    public int compare(khachHang o1, khachHang o2) {
        return o1.getTuoi()-o2.getTuoi();
    }
    
}
