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

//Hai số tạo thành một cặp số thân thiết khi chúng tuân theo quy luật: 
//Số này bằng tổng tất cả các ước của số kia (trừ chính số đó) và ngược lại. 
//Viết chương trình tìm hai số dạng này nhỏ hơn N (với N nhập vào từ bàn phím).

public class cau6 {
    
    static long tongUoc(long n) {
        long sum = 0;
        for(long i = 1; i <= n/2; i++) {      
            if(n % i == 0) 
                sum += i;
        }
        return sum;
    }
    
    static boolean checkSoThanThiet(long a, long b){
        if((tongUoc(a) == b) && (tongUoc(b) == a)) {
            return true;
        }        
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        
        for(long i = 1; i < n; i++) {
            for(long j = i + 1; j < n; j++) {
                if(checkSoThanThiet(i, j))
                    System.out.println( "(" + i + " " + j + ")");
            }
        }
        
    }
    
}
