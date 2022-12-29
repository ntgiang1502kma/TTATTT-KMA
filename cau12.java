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
public class cau12 {

    static boolean checkSnt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int k = 0;
        int c[] = new int[n];
        for (int i = 2; i < n; i++) {
            if (checkSnt(i)) {
                c[k] = i;
                k++;
            }
        }
        for (int j = 0; j < c.length - 4; j++) {
//            System.out.println(c[j]);
            if (c[j + 3] == 0) {
                break;
            } else {
                int sum = c[j] + c[j + 1] + c[j + 2] + c[j + 3];
                if (checkSnt(sum) && sum < n) {
                System.out.println(c[j] + " " + c[j + 1] + " " + c[j + 2] + " " + c[j + 3]);
                }
            }

        }
    }

}
