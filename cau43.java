/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

import static cau2.cau42.isSnt;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

//Cho N nhập vào từ bàn phím (0<N<1000), sinh một số nguyên tố p<100. Hãy viết 
//chương trình tìm tất cả các số nguyên a<N sao cho a
//p mod N là số nguyên tố

public class cau43 {
    static boolean isSnt(int n){
        if(n < 2) return false;
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
    
    static int binhPhuongCoLap(int a, int k, int n){
        ArrayList<Long> c = binary(k);
        int b = 0;
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
    
    
     static int sinhSoNguyenTo(){
        Random rand = new Random();
        int n = rand.nextInt(99)+1;
        while(!isSnt(n)){
            n = rand.nextInt(99)+1;
        }
        
        return n;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sinhSoNguyenTo();
        System.out.println("p: " + p);
        while(true){
            int n = sc.nextInt();
            if(n > 0 && n < 1000){
                for(int i = 1; i < n; i++){
                    if(isSnt(binhPhuongCoLap(i, p, n))){
                        System.out.print(i +" ");
                    }
                }
            }
        }
    }
}
