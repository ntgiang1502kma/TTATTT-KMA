package cau2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class cau21 {

    static boolean isSnt(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int demSnt(int n) {
        int dem = 0;

        for (int i = 2; i < n; i++) {
            if (isSnt(i)) {
                dem++;
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
        int dem = 0;
        for (int i = a; i <= b; i++) {
            if (isSnt(demSnt(i))) {
                System.out.print(i + " ");
                dem++;
            }
        }
        System.out.println("");
        System.out.println(dem);
    }
}
