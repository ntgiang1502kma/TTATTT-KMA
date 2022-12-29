/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NXT
 */
public class cau24 {

    static ArrayList<Integer> list = new ArrayList<>();

    static ArrayList nhap(int n) {

        for (int i = 2; i < n; i++) {
            if(checkSNT(i)){
                list.add(i * i);
            }
            
        }
        return list;
    }

    public static boolean checkSNT(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        nhap(b);
        int dem = 0;
        for (int x = a; x <= b; x++) {
            if (checkSNT(x)) {

                for (int i = 0; i < list.size(); i++) {
                    for (int j = i + 1; j < list.size(); j++) {
                        if (list.get(i) + list.get(j) == x) {
                            dem++;
                            System.out.println(x);

                        }
                    }
                }
            }
        }
        System.out.println(dem);

    }
}
