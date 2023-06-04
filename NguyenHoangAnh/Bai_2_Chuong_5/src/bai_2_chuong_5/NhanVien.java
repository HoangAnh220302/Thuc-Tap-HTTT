/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_2_chuong_5;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien implements Serializable{
    private String Name;
    private int Year;
    private String Gender;
    private String Address;

    public String getName() {
        return Name;
    }

    public int getYear() {
        return Year;
    }

    public String getGender() {
        return Gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public NhanVien(String Name, int Year, String Gender, String Address) {
        this.Name = Name;
        this.Year = Year;
        this.Gender = Gender;
        this.Address = Address;
    }

    public NhanVien() {
    }

    @Override
    public String toString() {
        return "NhanVien{" + "Name=" + Name + ", Year=" + Year + ", Gender=" + Gender + ", Address=" + Address + '}';
    }
    
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        //System.out.printf("%20s %12s %12s %12s\n","Name", "Author", "Price", "Pages");
        System.out.print("Nhap ten: ");
        this.Name = sc.next();
        System.out.print("Nhap nam sinh : ");
        this.Year = sc.nextInt();
        System.out.print("Nhap gioi tinh : ");
        this.Gender = sc.next();
        System.out.print("Nhap ten dia chi : ");
        this.Address = sc.next();
    }
    
    public void Xuat() {
        
        System.out.printf("%20s %12s %12s %12s\n",this.Name, this.Year, this.Gender, this.Address);
    }
}
