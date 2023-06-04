/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_2_chuong_5;

import java.io.Serializable;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author Admin
 */
public class Bai_2_Chuong_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here\
        NhanVien NV = new NhanVien();
        NV.Nhap();
        ObjectOutputStream Inputfile = null;
        try {
            Inputfile = new ObjectOutputStream(new FileOutputStream("D:\\DataII.txt"));
            NhanVien nhanvien = new NhanVien("Nguyen Hoang Anh", 2002, "Nam", "Ha Noi");
            Inputfile.writeObject(NV); 
            
        } catch(IOException ex) {
            ex.printStackTrace();
        } finally {
            Inputfile.close();
        }
        // ==================DOC FILE==================
        ObjectInputStream OutputFile = null;
        try {
            OutputFile = new ObjectInputStream(new FileInputStream("D:\\DataII.txt"));
            NhanVien nhanvien = (NhanVien)OutputFile.readObject();
            //System.out.println(NV.toString());
            System.out.printf("%20s %12s %12s %12s\n","Name", "Author", "Price", "Pages");
            nhanvien.Xuat();
        }catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        }finally {
            OutputFile.close();
        }
    }
    
}
