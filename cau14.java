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
public class cau14 {

    static Scanner sc = new Scanner(System.in);

    static boolean isSnt(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int reverseNumber(int k) {
        int reversed = 0;
        if (isSnt(k)) {
            while (k != 0) {
                int digit = k % 10;
                reversed = reversed * 10 + digit;
                k /= 10;
            }
        } else {
            k = -1;
        }
        return reversed;
    }

    public static void main(String[] args) {
        double x;
        for (int i = 100; i < 1000; i++) {
            if (isSnt(i)) {
                x = Math.cbrt(reverseNumber(i));
                if (Math.ceil(x) == Math.floor(x)) {
                    System.out.print(i + " ");
                }
            }

        }

    }
}
