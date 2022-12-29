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


//Cho một số nguyên dương N, gọi:
//-	k là số ước nguyên tố của N;
//-	q là tổng của các ước nguyên tố của N;
//-	p là tổng của các ước số của N;
//-	s là số ước của N;
//Hãy viết chương trình tính giá trị của: N+p+s-q-k với N cho trước nhập
//từ bàn phím.

public class cau3 {
    
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
        if(n == 2 || n == 3) return "Nguyen to";
        if(n % 2 == 0) return "Hop so";
        for(int i = 1; i <= t; i++){
             int a = ThreadLocalRandom.current().nextInt(2,n - 2);
             int x = binhPhuongCoLap(a, n - 1, n);
             if(x != 1){
                 return "Hop so";
             }
        }        
        return "Nguyen to";
    }
    
    static int tongUocSo(int n, int t) {
        int q = 0;
        int p = 0;
        int s = 0;
        int k = 0;
        for(int i = 1; i<=n; i++) {
            if(n % i == 0) {
                p+=i;
                s++;      
            }
        }
        for(int j = 2; j<=n; j++) {
            if(n % j == 0) {
                if(isFermat(j, t) == "Nguyen to") {
                    System.out.println(j);
                    q+=j;
                    k++;
                }
            }
        }
        System.out.println( n + " " + p + " " + s + " " + q + " " + k);
        return n + p + s - q - k;
    }
    
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int t = new Scanner(System.in).nextInt();
        System.out.println(tongUocSo(n,t));
        System.out.println("Xac suat: " + (1 - Math.pow(1/4, t)));
    }
}
