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
public class cau25 {

    static Scanner sc = new Scanner(System.in);

    static boolean isSnt(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    

    
    
    public static void main(String[] args) {
        System.out.print("Nhap N: ");
        int n = sc.nextInt();
        System.out.print("Nhap M: ");
        int m = sc.nextInt();
        int c[] = new int[1000];
        int k = 0;
        for(int i = 2; i < n; i++){
            if(isSnt(i)){
                c[k] = i;
                k++;
            }
        }

        int sum = 0;
        for(int i = 0; i < m; i++){
            sum+=c[i];
            
        }
        if(sum == n){
            for(int i = 0; i < m; i++){
                System.out.print(c[i] + " ");
            }
        }
    }
//    public static void main(String[] args) {
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[] arrayPrime = new int[10000];
//        int k = 0;
//        int sum = 0;
//        for (int i = 2; i <= n; i++) {
//            int count = 0;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    count++;
//                    break;
//                }
//            }
//            if (count == 0) {
//                k++;
//                arrayPrime[k] = i;
//                System.out.print(i + " ");
//            }
//        }
//        for (int i = 1; i <= m; i++) {
//            sum += arrayPrime[i];
//        }
//        if (sum == n) {
//            for (int i = 1; i <= m; i++) {
//                System.out.print(arrayPrime[i] + " ");
//            }
//        }
//    }
}
