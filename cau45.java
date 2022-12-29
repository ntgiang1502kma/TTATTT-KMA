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

//. Viết chương trình sinh một mảng số nguyên tố A gồm N phần tử (N nhập từ bàn phím) 
//sử dụng kiểm tra Miller-Rabin. In ra mảng và tính khoảng cách nhỏ nhất giữa 2 số bất kỳ trong 
//mảng.
public class cau45 {
    
    static Scanner sc = new Scanner(System.in); 
    
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
    
    static boolean miller_rabin(int n, int t){
        int s = 0;
        int r = n - 1;
        while(r % 2 == 0){
            s++;
            r = r/2;
        }
        int k = 1;
        for(int i = 2; i < n - 2; i++){
            long y = binhPhuongCoLap(i, r, n);
            if(y != 1 && y != n-1){
                int j = 1;
                while(j <= s - 1 && y != n - 1){
                    y = (y * y) % n;
                    if(y == 1){
                        return false;
                    }
                    j++;
                }
                if(y != n -1){
                    return false;
                }
            }
            if(k >= t){
                break;
            }
            k++;
        }
        return true;
    }
    
    static int random_number(int t){
        while(true){
            int ranNum = ThreadLocalRandom.current().nextInt(2,1000);
            if(miller_rabin(ranNum, t)){
                return ranNum;
            }
        }
    }
    
    
    public static void main(String[] args) {
        int n = sc.nextInt();
        int t = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = random_number(t);
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        int min = 100000;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int k = Math.abs(arr[i] - arr[j]);
                if(k < min){
                    min = k;
                }
            }
        }
        System.out.println("");
        System.out.println("Min space: " + min);
    }
}
