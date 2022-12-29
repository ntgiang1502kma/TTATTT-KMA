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
public class cau37Edit {

    static Scanner sc = new Scanner(System.in);

  
    static int compareString(char P[], int j, int i) {
        int check = 0;
        for (int x = 0; x < i; x++) {    //kiểm tra tiền tố, hậu tố
            if (P[x] == P[j - i + x]) {  //Kiểm tra từng ký tự của tiền tố và hậu tố
                check++;
            }
        }
        if (check == i) {
            return 1;
        }
        return 0;
    }

    static int check(char Pc[], int j) { //Kiểm tra kích thước của tiền tố = hậu tố
        for (int i = j - 1; i >= 0; i--) {
            if (compareString(Pc, j, i) == 1) {
                return i;
            }
        }
        return 0;
    }
//  hàm tiền xử lý mẫu
//  kích thước của tiền tố dài nhất của P[0..j-1]
//  sao cho nó cũng là hậu tố của P[1..j-1]  
    static void failureFunction(char[] Pc, int F[]) {
        F[0] = -1;
        for (int j = 1; j < Pc.length; j++) {
            F[j] = check(Pc, j); //=> có mảng F[j] tương ứng 
        }
    }

    public static void main(String[] args) {
        String T, P;
        char[] Tc;
        char[] Pc;
        System.out.print("Nhap chuoi T: ");
        T = sc.nextLine();
        Tc = T.toCharArray();
        System.out.print("Nhap chuoi P: ");
        P = sc.nextLine();
        Pc = P.toCharArray();
        int F[] = new int[Tc.length];
        failureFunction(Pc, F);
        int i = 0;
        int j = 0;
        int check = 0;
        while (i <= Tc.length - Pc.length) {  // cho i chạy hết độ dài của T - P
            int inew = i + j;
            if (Tc[inew] == Pc[j]) {
                inew++;
                j++;
                if (j == Pc.length) {     //j tăng đến hết P
                    System.out.println("P co xuat hien trong T, "
                            + " co vi tri bat dau tu: " + i);
                    check = 1;
                    break;
                }
            } else {   // cập nhập giá trị i và j với công thức:
                i = i + j - F[j]; //i = i + j - F[j]
                if(F[j] == -1){
                    j = 0;
                }
                else {
                    j =F[j];
                }
            }
        }
        if (check == 0) {
            System.out.println("P khong xuat hien trong T");
        }
    }
}
