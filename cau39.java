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

//Cho mảng A nhập từ bàn phím gồm các số nguyên dương.
//Hãy viết chương trình tìm các cặp số (i,j) trong mảng A 
//sao cho ước chung lớn nhất của chúng là một số nguyên tố.


public class cau39 {
    
    static Scanner sc = new Scanner(System.in);
    
    static long GCD(long a, long b){
        if(b == 0){
            return a;
        }
        return GCD(b,a % b);
    }
//    static ArrayList<Long> binary(long n){
//        ArrayList<Long> arr = new ArrayList<>();
//        while(n > 0){
//            arr.add(n % 2);
//            n /= 2;
//        }
//        return arr;
//    }
//    
//    static long binhPhuongCoLap(long a, long k, long n){
//        ArrayList<Long> c = binary(k);
//        long b = 1;
//        if(c.get(0) == 1){
//            b = a;
//        }
//        
//        for(int i = 1; i < c.size(); i++){
//            a = (a * a) % n;
//            if(c.get(i) == 1){
//                b = (b * a) % n;
//            }
//        }
//        return b;
//    }
//    
//    
//    static long findR(long n){       
//        long x = n - 1;
//        while(x % 2 == 0){
//            x = x / 2;
//        }
//       return x;
//    }
//    
//    static long findS(long n){
//        long x = n - 1;
//        long s = 0;
//        while(x % 2 == 0){
//            s++;
//            x = x / 2;
//        }
//       return s;
//    }
//    
//    static String miller_rabin(long n, long t){
//        long r = findR(n);
//        long a;
//        long y;
//        long s = findS(n);
//        for(int i = 1; i <= t; i++){
//             a = ThreadLocalRandom.current().nextLong(2,n - 2);
//             y = binhPhuongCoLap(a, r, n);
//             if(y != 1 && y != (n - 1)){
//                 int j = 1;
//                 while(j <= s - 1 && y != (n - 1)){
//                     y = (y * y) % n;
//                     if(y == 1){
//                         return "Hop so";
//                     }
//                     j++;
//                 }
//                if( y != (n - 1)){
//                    return "Hop so";
//                }
//             }
//        }
//        return "Nguyen to";
//    }
    
    static boolean isSnt(long n){
        if(n < 2) return false;
        if(n == 2) return true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.print("Nhap kich thuoc cua mang: ");
        int n = sc.nextInt();
        long arr[] = new long[n];
        System.out.print("Nhap vao cac phan tu cua mang(>0): ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(isSnt(GCD(arr[i], arr[j]))){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
