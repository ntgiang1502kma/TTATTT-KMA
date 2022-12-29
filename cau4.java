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

//Viết chương trình đếm số số nguyên tố nằm 
//trong khoảng [A,B] với A, B nhập vào từ bàn phím.
//Có thể dùng vét cạn nếu không hiểu thuật toán Fermat


public class cau4 {
    
//    static boolean checkSnt(int n) {
//        for(int i = 2; i <= Math.sqrt(n); i++) {
//            if(n % i == 0) return false;
//        }
//        return true;
//    }
      static ArrayList<Integer> binary(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        while(n > 0){
            arr.add(n % 2);
            n /= 2;
        }
        return arr;
    }
    
    static int binhPhuongCoLap(int a, int k, int n){
        ArrayList<Integer> c = binary(k);
        int b = 1;
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
    

    static String isFermat(int n, int t){
        for(int i = 1; i <= t; i++){
             int a = ThreadLocalRandom.current().nextInt(2,n - 2);
             int x = binhPhuongCoLap(a, n - 1, n);
             if(x != 1){
                 return "Hop so";
             }
        }        
        return "Nguyen to";
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap A: ");
        int a = sc.nextInt();
        System.out.print("Nhap B: ");
        int b = sc.nextInt();
        System.out.print("Nhap tham so an toan t: ");
        int t = sc.nextInt();
        int dem = 0;
        for(int i = a; i<= b; i++) {
            if(isFermat(i, t) == "Nguyen to")
                dem++;
        }
        System.out.println(dem);
    }
    
}
