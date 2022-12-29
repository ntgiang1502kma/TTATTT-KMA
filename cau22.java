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
public class cau22 {
    static boolean isSnt(int n){
        if(n < 2 ) return false;
        if(n == 2) return true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
            
        }
        return true;
    }
    
    static int fN(int n){
        int a;
        if(isSnt(n)) a = n;
        else a = 0;
        return a;
    }
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int l = sc.nextInt();
        int r = sc.nextInt();
       
        long sum = 0;
        for(int i = l; i < r; i++){
            for(int j = i+1; j <= r; j++){
                sum+= fN(i) * fN(j);
            }
        }
        System.out.println(sum);
    }
}
