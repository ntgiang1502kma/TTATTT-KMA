/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
//Cho các số nguyên dương a,k,n, nhập từ bàn phím (0<a,k<n<1000), Viết chương trình 
//xác định xem a
//k mod n có phải là một số nguyên tố hay không (sử dụng thuật toán bình phương 
//và nhân có lặp)

public class cau41 {
    
    static Scanner sc = new Scanner(System.in);
    
    static boolean checkSnt(long n){
        if(n < 2)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
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
        long b = 0;
        if(c.get(0) == 1){
            b = a;
        }
        else {
            b = 1;
        }
        for(int i = 1; i < c.size(); i++){
            a = (a * a) % n;
            if(c.get(i) == 1){
                b = (b * a) % n;
            }
        }
        return b;
    }
    
    
    
    public static void main(String[] args) {
        long a = sc.nextLong();
        long k = sc.nextLong();
        long n = sc.nextLong();
        
        if(checkSnt(binhPhuongCoLap(a, k, n))){
            System.out.println(a +"^" + k + " mod " + n + " = " + binhPhuongCoLap(a, k, n)
                    + " la so nguyen to");
        }
        else {
            System.out.println(a +"^" + k + " mod " + n + " = " + binhPhuongCoLap(a, k, n)
                    + " khong la so nguyen to");
        }
    }
}
