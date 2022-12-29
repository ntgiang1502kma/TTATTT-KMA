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
public class cau20 {
    static int findGCD(int x, int y) {
        //base case
        if(y== 0){
            return x;
        }
        return findGCD(y, x%y);
    }
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Nhap M: ");
        int m = sc.nextInt();
        System.out.print("Nhap N: ");
        int n = sc.nextInt();
        System.out.print("Nhap D: ");
        int d = sc.nextInt();
        for(int i = m+1; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(findGCD(i, j) == d){
                    System.out.println("{" + i + " " + j + "}");
                }
            }
        }
    }
}
