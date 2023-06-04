/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_2_chuong_4;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Bai_2_Chuong_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar ct = Calendar.getInstance();
        int Ngay = ct.get(Calendar.DATE);
        int Thang = ct.get(Calendar.MONTH);
        int Nam = ct.get(Calendar.YEAR);
        int Gio = ct.get(Calendar.HOUR);
        int Phut = ct.get(Calendar.MINUTE);
        int Giay = ct.get(Calendar.SECOND);
        
        System.out.println("Current day : " + Ngay);
        System.out.println("Current month : " + Thang);
        System.out.println("Current year : " + Nam);
        System.out.println("Current hour : " + Gio);
        System.out.println("Current minute : " + Phut);
        System.out.println("Current second : " + Giay);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");
        Date CD = ct.getTime();
        System.out.println("Current time : " + sdf.format(CD));
        Calendar ct1 = Calendar.getInstance();
        ct1.add(Calendar.DATE, 5);
        Date CD1 = ct1.getTime();
        System.out.println("5 days after current time : " + sdf.format(CD1));
        
        if(ct.before(ct1)) {
            System.out.println("Current time before : " + sdf.format(CD1));
        }
        else {
            System.out.println("Current time after : " + sdf.format(CD1));
        }
    }
    
}
