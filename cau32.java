/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class cau32 {

    static ArrayList<Long> binary(long n) {
        ArrayList<Long> arr = new ArrayList<>();
        long k = 0;
        while (n > 0) {
            arr.add(n % 2);
            k++;
            n = n / 2;
        }
        return arr;
    }
    // nhan binh phuong co lap

    static long LapMu2(long a, long k, long n) {
        ArrayList<Long> c = binary(k);
        long b = 0;
        if (c.get(0) == 1) {
            b = a;
        } else {
            b = 1;
        }
        for (int i = 1; i < c.size(); i++) {
            a = (a * a) % n;
            if (c.get(i) == 1) {
                b = (b * a) % n;
            }
        }
        return b;
    }

    static boolean fermat(long n, long t) {
        for (long i = 1; i <= t; i++) {
            long a = ThreadLocalRandom.current().nextLong(2, n - 2);
            long j = LapMu2(a, n - 1, n);
            if (j != 1) {
                return false;
            }
        }
        return true;
    }

    static long checkSNT() {
        long n = 0;
        while (true) {
            n = ThreadLocalRandom.current().nextLong(100, 500);
            if (fermat(n, n + 50)) {
                return n;
            }
        }
    }

    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static long nghichdao(long a, long b) {
        long d = 0;
        long x = 0;
        long y = 0;
        long b1 = b;
        if (b == 0) {
            d = a;
            x = 1;
            y = 0;
            return x;
        }
        long x2 = 1;
        long x1 = 0;
        long y2 = 0;
        long y1 = 1;
        while (b > 0) {
            long q = a / b;
            long r = a - q * b;
            x = x2 - q * x1;
            y = y2 - q * y1;
            a = b;
            b = r;
            x2 = x1;
            x1 = x;
            y2 = y1;
            y1 = y;
        }
        d = a;
        x = x2;
        y = y2;
        return (x2 + b1) % b1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long p = checkSNT();
        long q = checkSNT();
        long n = q * p;
        long k = (p - 1) * (q - 1);
        long e;
        while (true) {
            e = ThreadLocalRandom.current().nextLong(1, k);
            if (gcd(e, k) == 1) {
                break;
            }
        }
        long d = nghichdao(e, k);
        System.out.println("n: " + n);
        System.out.println("p: " + p + "  q: " + q);
        System.out.println("e: " + e);
        System.out.println("d: " + d);
        System.out.print("Nhap SBD: ");
        long sbd = sc.nextLong();
        long m = sbd + 123;
        long c = LapMu2(m, e, n);
        System.out.println("Ban ma cua m: " + c);
        long m1 = LapMu2(c, d, n);
        System.out.println("Giai ma: " + m1);
    }
}
