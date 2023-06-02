/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_TongQuanJava;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author ASUS
 */
public class Bai2 {
    public void calculator(int a,int b,int c){
        float x1,x2;
        int delta = b*b - 4*a*c;
        if(delta > 0){
            x1 = (float)(-b + Math.sqrt(delta))/(2*a);
            x2 = (float)(-b - Math.sqrt(delta))/(2*a);
        }
    }
    
    public static void Main(String[] args){
        System.out.println("dmm");
    }
}
