/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
//Viết chương trình tính tổng của các số nguyên tố 
//nhỏ hơn hoặc bằng N với N được nhập từ bàn phím


public class cau11 {
    static Scanner sc = new Scanner(System.in);
    
    static boolean isSnt(long n){
        if(n < 2) return false;
        if(n == 2) return true;
        for(long i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        long n = sc.nextLong();
        long sum = 0;
        for(long i = 2; i <= n; i++){
            if(isSnt(i)){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
