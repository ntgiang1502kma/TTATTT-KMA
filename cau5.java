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
//Viết chương trình tính tổng của các số nguyên tố nằm 
//trong khoảng [A, B] với A, B nhập vào từ bàn phím.


public class cau5 {
     static boolean checkSnt(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for(int i = a; i<= b; i++) {
            if(checkSnt(i))
                sum+=i;
        }
        System.out.println(sum);
    }
}
