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
//Viết chương trình đếm số ước và số ước nguyên tố 
//của một số N nhập vào từ bàn phím.

public class cau10 {
    static Scanner sc = new Scanner(System.in);
    
    static boolean isSnt(long n){
        if(n < 2) return false;
        if(n == 2) return true;
        for(long i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    static int demUoc(long n){
        int dem = 0;
        for(long i = 1; i <= n; i++){
            if (n % i == 0) {
                dem++;
            }
        }
        return dem;
    }
    
    static int demUocNT(long n){
        int dem = 0;
        for(long i = 2; i <= Math.sqrt(n); i++){
            if(isSnt(i) && n % i == 0){
                dem++;
            }
        }
        return dem;
    }
    
    public static void main(String[] args) {
        long n = sc.nextLong();
        System.out.println("So uoc la: " + demUoc(n));
        System.out.println("So uoc nguyen to la: " + demUocNT(n));
    }
}
