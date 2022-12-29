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

// Một số gọi là Q-prime khi nó có đúng 4 ước số nguyên dương. 
//Hãy viết chương trình in ra các số Q-Prime nhỏ hơn hoặc bằng một số N 
//cho trước nhập từ bàn phím.

public class countQprime {
    
    static boolean checkUocSoEqualFour(int n) {
        int count = 0;
        for(int i = 1; i<=n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        if(count == 4) return true;
        return false;
    }
    
    static void inSoQPrime(int n) {
        for(int i = 2; i<=n; i++) {
            if(checkUocSoEqualFour(i))
                System.out.print(i + " ");
        }
        
    }
    
    
    
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        inSoQPrime(n);
    }
}
