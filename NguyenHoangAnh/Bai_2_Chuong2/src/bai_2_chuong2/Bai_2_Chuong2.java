/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_2_chuong2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai_2_Chuong2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        List<Car> Shop = new ArrayList<>();
        int choice = -1;
        do {
            System.out.print("Insert your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 :
                    System.out.println("Add a car in a shop ! ");
                    Car Lambor = new Car();
                    Lambor.Input();
                    Shop.add(Lambor);
                    break;
                case 2 :
                    System.out.printf("%20s %12s %12s %12s\n", "ID", "Name", "Brand", "Price");
                    for(Car i : Shop) {
                        i.Output();
                    }
                    break;
                case 3 :
                    System.out.print("Nhap ID xe can xoa : ");
                    int Remove = sc.nextInt();
                    for(Car i : Shop) {
                        if(Remove == i.ID) {
                            Shop.remove(i);
                        }
                    }
                    break;
                case 4 : 
                    System.out.print("Nhap ID xe can tim : ");
                    int Search = sc.nextInt();
                    System.out.printf("%20s %12s %12s %12s\n", "ID", "Name", "Brand", "Price");
                    for(Car i : Shop) {
                        if(Search == i.ID) {
                            i.Output();
                        }
                    }
                case 5 : 
                    System.out.println("END !");
                    break;
            }
        } while (choice != 5);
    }
    
}
