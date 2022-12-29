/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Admin
 */

//Viết chương trình sinh ra 2 số nguyên tố 0<p,q<1000 và kiểm tra với với số 0<a<100 thì 
//liệt kê những số a thoả mãn: a
//p mod q là số nguyên tố. 

public class cau42 {
    static boolean isSnt(long n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
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
    
    static long binhPhuongCoLap(int a, int k, int n){
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
    
    static int sinhSoNguyenTo(){
        Random rand = new Random();
        int n = rand.nextInt(999)+1;
        while(!isSnt(n)){
            n = rand.nextInt(999)+1;
        }
        
        return n;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sinhSoNguyenTo();
        int q = sinhSoNguyenTo();

        System.out.println(p + ", " + q);
        for(int i = 1; i < 100; i++){
            if(isSnt(binhPhuongCoLap(i, p, q))){
                System.out.print(i + " ");
            }
        }
    }
}
