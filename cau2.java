/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Admin
 */

//Viết chương trình tìm các số nguyên tố
//có N chữ số với N nhập từ bàn phím và 2 ≤ N ≤10
//Dùng miller rabin, fermat hay vét cạn đều được

public class cau2 {
    static Scanner sc = new Scanner(System.in);
    
//    static boolean checkSnt(int n) {
//
//        for(int i = 2; i<=Math.sqrt(n); i++) {
//            if(n % i == 0){
//                return false;
//            }
//        }
//      return true;
//    }
    
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
    
   static int demSnt(int n, long t) {
       int count = 0;
       for(int i = (int) Math.pow(10, n-1); i < Math.pow(10, n) - 1; i++) {
           if(miller_rabin(i, t) == "Nguyen to") 
           {
             count++;
               System.out.print(i + " ");
           }
       }
      
       return count;
   }
        
    public static void main(String[] args) {
        System.out.print("Nhap N: ");
        int n = sc.nextInt();
        System.out.print("Nhap tham so an toan t: ");
        long t = sc.nextLong();
        System.out.println(demSnt(n, t));
        
        
    }
    
    
}
