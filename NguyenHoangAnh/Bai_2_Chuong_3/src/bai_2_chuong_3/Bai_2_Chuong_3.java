/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_2_chuong_3;

/**
 *
 * @author Admin
 */
public class Bai_2_Chuong_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            try {
                int zero = 0;
                int average = 10 / zero;
                System.out.println("Average = " + average);
            } catch (ArithmeticException ex) {
                System.out.println(ex);
            }
 
            System.out.println("Continue...");
            int arr[] = new int[5];
            arr[5] = 4;
            System.out.println("arr[5] = " + arr[5]);
 
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }
 
        System.out.println("Finished!");
    }
}
