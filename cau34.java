/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

import static cau2.cau42.isSnt;
import static cau2.cau45.miller_rabin;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


//Cài đặt thuật toán kiểm tra số nguyên tố Fermat. 
//Trong trường hợp số nào thì 
//thuật toán cho kết quả kiểm tra sai.

public class cau34 {
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
    

    static String isFermat(long n, long t){
        for(int i = 1; i <= t; i++){
             long a = ThreadLocalRandom.current().nextLong(2,n - 2);
             long x = binhPhuongCoLap(a, n - 1, n);
             if(x != 1){
                 return "Hop so";
             }
        }        
        return "Nguyen to";
    }
    
    
    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        long n = sc.nextLong();
        System.out.print("Nhap t: ");
        long t = sc.nextLong();
        System.out.println(isFermat(n, t));
    }
}
