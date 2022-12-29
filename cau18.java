/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import sun.security.mscapi.CPublicKey;

/**
 *
 * @author Admin
 */
public class cau18 {

    public static long[] TinhToan(long a, int t, int w) {
        long[] c = new long[t];
        for (int i = t - 1; i >= 0; i--) {
            c[i] = ((long) (a / (Math.pow(2, i * w))));
            a = ((long) (a % (Math.pow(2, i * w))));
        }
        return c;
    }

    public static void Cong(long a[], long b[]) {
        long[] c = new long[a.length];
        long d = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] + b[i] + d > 256) {
                c[i] = (long) (d + a[i] + b[i]) % 256;
                d = 1;
            } else {
                c[i] = (long) (d + a[i] + b[i]) % 256;
                d = 0;
            }

        }

        System.out.print("{" + d + ", ");
        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i] + " ");
        }
        System.out.println("}");
        System.out.println("C = " + arrayToNumber(c, c.length));
    }

    public static long arrayToNumber(long a[], int t) {
        long number = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            number += a[i] * Math.pow(2, i * 8);
        }

        return number;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long p = 2147483647;
        int w = 8;
        int m = (int) Math.ceil(Math.log(p) / Math.log(2));
        int t = (int) Math.ceil((double) m / w);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long[] a1 = TinhToan(a, t, w);
        long[] b1 = TinhToan(b, t, w);
        Cong(a1, b1);
        
    }
}
