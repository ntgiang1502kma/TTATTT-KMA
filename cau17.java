/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class cau17 {
    static boolean isSnt(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) 
                return false;
        }
        return true;
    }
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap A: ");
        int a = sc.nextInt();
        System.out.print("Nhap B: ");
        int b = sc.nextInt();
        System.out.print("Nhap C: ");
        int c = sc.nextInt();
        System.out.print("Nhap N: ");
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            int t = a*i*i + b*i + c;
            if(isSnt(t)){
                System.out.println("x = " + i);
                break;
            }
        }
    }
}
