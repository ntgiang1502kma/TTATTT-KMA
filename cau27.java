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
public class cau27 {
    static Scanner sc = new Scanner(System.in);
    
    static long findGCD(long a, long b){
        if(b == 0)
            return a;
        return findGCD(b, a % b);
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
//    static String isFermat(long n, long t){
//        if(n < 2) return "Hop so";
//        if(n == 2) return "Nguyen to";
//        for(long i = 1; i <= t; i++){
//             long a = ThreadLocalRandom.current().nextLong(2,n - 2);
//             long x = binhPhuongCoLap(a, n - 1, n);
//             if(x != 1){
//                 return "Hop so";
//             }
//        }        
//        return "Nguyen to";
//    }
    
    static boolean isSnt(long n){
        if(n == 2) return true;
        if(n < 2) return false;
        for(long i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.print("Nhap a: ");
        long a = sc.nextLong();
        System.out.print("Nhap b: ");
        long b = sc.nextLong();
        for(long i = a; i <= b; i++){
            for(long j = i + 1; j <=b; j++){
                if(isSnt(findGCD(i,j))){
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
        }
    }
}
