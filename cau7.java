/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

import java.util.Scanner;

//Một số emirp là một số nguyên tố mà khi đảo ngược vị trí các chữ số 
//của nó, ta cũng được một số nguyên tố.
//Viết chương trình liệt kê các số emirp nhỏ hơn N 
//với N nhập vào từ bàn phím.


public class cau7 {

    static boolean checkSnt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int reverseNumber(int k) {
        int reversed = 0;
        if (checkSnt(k)) {
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

        int n = new Scanner(System.in).nextInt();
        for (int i = 2; i <= n; i++) {
            if (checkSnt(i)) {
                if (checkSnt(reverseNumber(i))) {
                    System.out.println(i + " la so emirp");
                }
            }
        }
    }
}
