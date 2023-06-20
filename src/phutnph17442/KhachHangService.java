/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phutnph17442;

import java.util.ArrayList;

/**
 *
 * @author 84949
 */
public class KhachHangService {
    private ArrayList<KhachHang> dskh = new ArrayList<>();
    public void insert(KhachHang kh){
        dskh.add(kh);
    }

    public ArrayList<KhachHang> getDskh() {
        return dskh;
    }

    public void setDskh(ArrayList<KhachHang> dskh) {
        this.dskh = dskh;
    }
    
}
