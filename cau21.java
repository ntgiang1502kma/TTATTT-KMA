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
public class cau21 {

    static boolean isSnt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int demSnt(int n) {
        int dem = 0;
        if (isSnt(n)) {
            for (int i = 2; i < n; i++) {
                if (isSnt(i)) {
                    dem++;
                }
            }
        }

        return dem;

    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap A: ");
        int a = sc.nextInt();
        System.out.print("Nhap B: ");
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (isSnt(demSnt(i))) {
                System.out.print(i + " ");
            }
        }
    }
}
