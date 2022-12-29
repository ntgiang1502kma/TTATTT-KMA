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
public class cau23 {
    static boolean isSnt(int n){
        if(n < 2 ) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for(int i = a; i <= b; i++){
            sum+=i;
        }
        if(isSnt(sum)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
