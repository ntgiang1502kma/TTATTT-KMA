/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

import static cau2.cau17.isSnt;
import static cau2.cau17.sc;

/**
 *
 * @author Admin
 */
public class cau19 {
    
    static boolean isSnt(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) 
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.print("Nhap A: ");
        int a = sc.nextInt();
        System.out.print("Nhap B: ");
        int b = sc.nextInt();
        System.out.print("Nhap C: ");
        int c = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap m: ");
        int m = sc.nextInt();
        System.out.print("Nhap l: ");
        int l = sc.nextInt();
        
        
        for(int i = m; i < l; i++){
            int t = a*i*i + b*i + c;
            if(isSnt(t)){
                System.out.println("x = " + i);
               
            }
        }
    }
}
