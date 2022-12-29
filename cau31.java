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

//Áp dụng theo các thuật toán đã được học trong phần lí thuyết em hãy cài đặt chương 
//trình:
//- Tìm số nguyên tố k gần nhất với phần số của mã số sinh viên của mình (trong trường hợp 
//khoảng cách bằng nhau thì lấy số nhỏ hơn).
//- Từ số k tìm được tính ak mod n với a = SBD, n = 123456
public class cau31 {
      static boolean isSnt(long n){
        if(n < 2) return false;
        for(long i = 2; i <= Math.sqrt(n); i++){
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
    
    static long binhPhuongCoLap(long a, long k, long n){
        ArrayList<Long> c = binary(k);
        long b = 0;
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
    
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        long n = sc.nextInt();
        long b = n;
        long truoc;
        long sau;
        long a = n;
        while(true){
            if(isSnt(n)){
                truoc = n;
                break;
            }
            n--;
        }
        
        while(true) {
            if(isSnt(a)){
                sau = a;
                break;
            }
            a++;
        }
        long hieutruoc = b - truoc;
        long hieusau = sau - b;
        long k = 0;
        System.out.println(hieusau + " " + hieutruoc);
        if(hieusau == hieutruoc){
            System.out.println(truoc);
        }
        else if(hieusau - hieutruoc > 0){
            k = truoc;
            System.out.println(k);
        }
        else if(hieusau - hieutruoc < 0){
            k = sau;
            System.out.println(k);
        }
        System.out.println(binhPhuongCoLap(b, k, 12345));
    }
}
