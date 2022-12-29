/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

import java.math.MathContext;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class cau16 {
     static boolean isSnt(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) 
                return false;
        }
        return true;
    }
    
     public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int [] c = new int [n];
        for(int i = 0; i < n; i++){
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            c[i] =  (int) randomDouble;
        }
        
        for(int i = 0; i < n; i++){
            System.out.print(c[i] +" ");
        }
        for(int i = 0; i< n ; i++){
            
            if(isSnt(c[i])){
                System.out.println(c[i] + " ");
            }
        }
    }
}
