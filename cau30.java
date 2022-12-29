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
// Viết chương trình tính tổng của các số Carmichael (là các số giả nguyên tố n thoả mãn 
//điều kiện là hợp số và thoả mãn 𝑏
//𝑛−1 ≡ 1 (𝑚𝑜𝑑 𝑛) với mọi số nguyên dương b nguyên tố cùng 
//nhau với n) nhỏ hơn một số N cho trước nhập vào từ bàn phím (với điều kiện 0 ≤ 𝑁 ≤ 10000.
public class cau30 {
    static boolean checkHopSo(int n){
        if(n < 2){
            return false;
        }
        if(n == 2){
            return true;
        }
        if(n % 2 == 0){
            return false;
        }
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
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
    
    static int checkGCD(int a, int b){
        if(b == 0){
            return a;
        }
        return checkGCD(b,a % b);
    }
    
    static boolean checkMod(int n){
        for(int i = 1; i < n; i++){
            if(checkGCD(n,i) == 1){
                if(binhPhuongCoLap(i, n - 1, n) != 1){
                    return false;
                }
            }
        }
        return true;
    }
    
    static void carmicheal_numbers(int n){
        long tong = 0;
        for(int i = 31; i < n + 1; i+=2){
            if(!checkHopSo(i)){
                if(checkMod(i)){
                    System.out.print(i + " ");
                    tong += i;
                }
            }
        }
        System.out.println("");
        System.out.println(tong);
    }
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        carmicheal_numbers(n);
    }
}
