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
public class cau15 {
    
    static boolean isSnt(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) 
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int j;
        for(int i = 2; i <= n; i++){
            j = i + 2;
            if(isSnt(i) == true  && isSnt(j) == true) {
                System.out.println("{" + i + " " + j +"}");
            }
        }
    }
}
