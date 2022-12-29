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
public class cau13 {
    static Scanner sc = new Scanner(System.in);
    
    static boolean isSnt(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                 return false;
            }
               
        }
        return true;
    }
    
    static boolean checkTongHieu(int c, int d) {
        if(isSnt(c) && isSnt(d))
            return true;
        
        return false;
    }
    
    
    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = 0;
        int c[] = new int[n];
        
        for(int i = 2; i <= n; i++){
            if(isSnt(i)){
                c[k] = i;
                k++;
            }
        }
        
        for(int i = 0; i < k; i++){
            for(int j = 1; j < k; j++){
                int t = c[i] + c[j];
                int h = Math.abs(c[i] - c[j]);
                if(checkTongHieu(t,h)){
                    System.out.print( "{" + c[i] + " " + c[j] + "}");
                }
            }
        }
        
    }
}
