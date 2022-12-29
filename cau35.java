/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

import static cau2.cau45.binary;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Admin
 */

//Cài đặt thuật toán kiểm tra số nguyên tố Miller-Rabin in
//ra kết luận về 1 số nguyên dương N nhập vào từ bàn phím 
//với xác suất kết luận tương ứng sau thuật toán. 



public class cau35 {
    
    
    static Scanner sc = new Scanner(System.in);
    
    static ArrayList<Long> binary(long n){
        ArrayList<Long> arr = new ArrayList<>();
        while(n > 0){
            arr.add(n % 2);
            n /= 2;
        }
        return arr;
    }
    
    static long binhPhuongCoLap(long a, long k, long n){
        ArrayList<Long> c = binary(k);
        long b = 1;
        if(c.get(0) == 1){
            b = a;
        }
        
        for(int i = 1; i < c.size(); i++){
            a = (a * a) % n;
            if(c.get(i) == 1){
                b = (b * a) % n;
            }
        }
        return b;
    }
    
    
    static long findR(long n){       
        long x = n - 1;
        while(x % 2 == 0){
            x = x / 2;
        }
       return x;
    }
    
    static long findS(long n){
        long x = n - 1;
        long s = 0;
        while(x % 2 == 0){
            s++;
            x = x / 2;
        }
       return s;
    }
    
    static String miller_rabin(long n, long t){
        long r = findR(n);
        long a;
        long y;
        long s = findS(n);
        for(int i = 1; i <= t; i++){
             a = ThreadLocalRandom.current().nextLong(2,n - 2);
             y = binhPhuongCoLap(a, r, n);
             if(y != 1 && y != (n - 1)){
                 int j = 1;
                 while(j <= s - 1 && y != (n - 1)){
                     y = (y * y) % n;
                     if(y == 1){
                         return "Hop so";
                     }
                     j++;
                 }
                if( y != (n - 1)){
                    return "Hop so";
                }
             }
        }
        return "Nguyen to";
    }
    
    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        long n = sc.nextLong();
        System.out.print("Nhap t: ");
        long t = sc.nextLong();
        System.out.println(miller_rabin(n, t));
    }
}
