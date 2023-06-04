/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_2_chuong2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Car {
    public int ID;
    private String Name;
    private String Brand;
    private int Price;

    public Car(int ID, String Name, String Brand, int Price) {
        this.ID = ID;
        this.Name = Name;
        this.Brand = Brand;
        this.Price = Price;
    }

    public Car() {
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getBrand() {
        return Brand;
    }

    public int getPrice() {
        return Price;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "Car{" + "ID=" + ID + ", Name=" + Name + ", Brand=" + Brand + ", Price=" + Price + '}';
    }
    
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input car ID : ");
        this.ID = sc.nextInt();
        System.out.print("Input car name : ");
        this.Name = sc.next();
        System.out.print("Input car brand : ");
        this.Brand = sc.next();
        System.out.print("Input car price : ");
        this.Price = sc.nextInt();
    }
    
    public void Output() {
        //System.out.printf("%20s %12s %12s 12s\n", "Name", "Author", "Price", "Page");
        System.out.printf("%20s %12s %12s %12s\n", this.ID, this.Name, this.Brand, this.Price);
    }
}
