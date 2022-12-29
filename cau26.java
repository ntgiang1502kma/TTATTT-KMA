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

//Một số được gọi là số mạnh mẽ khi nó đồng thời vừa chia hết cho số nguyên tố và chia 
//hết cho bình phương của số nguyên tố đó. Tìm số mạnh mẽ nhỏ hơn số N cho trước (N < 10000)

public class cau26 {
    
    static Scanner sc = new Scanner(System.in);
    
    static boolean isSnt(long n){
        if(n < 2 ) return false;
        if(n == 2) return true;
        for(long i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
//    static ArrayList<Integer> mangSnt(){
//        ArrayList<Integer> arr = new ArrayList<>();
//        for(int i = 2; i < 98; i++){
//            if(isSnt(i)){
//                arr.add(i);
//            }
//        }
//        return arr;
//    }
    
    public static void main(String[] args) {
        long n = sc.nextLong();
        
        for(long i = 1; i < n; i++){
           for(long j = 2; j <= Math.sqrt(i); j++){
               if(isSnt(j)){
                   if(i % j == 0 && i % (j * j) == 0){
                       System.out.print(i + ", ");
                   }
               }
           }
        }
    }
}
