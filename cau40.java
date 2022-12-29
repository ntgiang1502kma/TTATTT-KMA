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
public class cau40 {
    static Scanner  sc = new Scanner(System.in);
    
    static long findGCD(long a, long b){
        if(b == 0) return a;
        return findGCD(b, a % b);
    }
    
    
    static boolean isSnt(long n){
        if(n < 2) return false;
        if(n == 2) return true;
        for(long i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        System.out.print("Nhap phan tu cua mang A: ");
        int n = sc.nextInt();
        long A[] = new long[n];
        int count = 0;
        System.out.print("Nhap gia tri cac phan tu cua mang A: ");
        for(int i =0; i < n; i++){
            A[i] = sc.nextLong();
        }
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(isSnt(findGCD(A[i], A[j]))){
                    System.out.println("(" + A[i] + ", " + A[j] + ")");
                    count++;
                }
            }
        }
        System.out.println("So luong cac cap (i, j) thoa man la: " + count);
    }
}
