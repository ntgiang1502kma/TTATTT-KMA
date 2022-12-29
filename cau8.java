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

//Một số gọi là số Т-prime nếu có có đúng 3 ước nguyên dương.
//Viết chương trình tìm các số Т-prime nhỏ hơn hoặc bằng 
//N với N cho trước nhập từ bàn phím.

public class cau8 {
    static boolean checkUocSoEqualFour(int n) {
        int count = 0;
        for(int i = 1; i<=n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        if(count == 3) return true;
        return false;
    }
    
    static void inSoTPrime(int n) {
        
        for(int i = 1; i<=n; i++) {
            if(checkUocSoEqualFour(i))
                System.out.print(i + " ");
        }
        
    }
    
    
    
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        inSoTPrime(n);
    }
}
