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

//Lập trình tìm kiếm xâu S1 trong xâu S2 theo thuật toán Boyer-Moore, 
//in giá trị của bảng. Trong trường hợp nào thì thuật toán Boyer-Moore 
//được xem là cải tiến hơn thuật toán tìm kiếm vét cạn.

public class cau36 {
    static Scanner sc = new Scanner(System.in);
//    Ham tien` xu ly' L(x)
    static int lastOccur(char[]p, char x){
        for(int i = p.length - 1; i >= 0; i--){
            if(p[i] == x) 
                return i; //Chi so i lon nhat ma p[i] = x
        }
//        neu khong ton tai chi so i 
        return -1;
    }
    
    
    public static void main(String[] args) {
        System.out.print("Nhap chuoi T: ");
        char[] T = sc.nextLine().toCharArray();
        System.out.print("Nhap chuoi P: ");
        char[] P = sc.nextLine().toCharArray();
        int m = P.length;
        int i = m - 1;
        int j = m - 1;
        int min;
        int check = 0;
        while( i < T.length){
            if(T[i] == P[j]){ //Neu trung nhau
                if(j == 0){
                    System.out.println("P co xuat hien trong T, co vi tri"
                            + " bat dau tu: " + (i+1));
                    check = 1;
                    break;
                }
                //giam gia tri i, j de so sanh' tiep
                i--;
                j--;
            }
            // neu khong trung 
            else { // tim min cua (j, 1 + L(T[i])
                if(j < (1 + lastOccur(P, T[i]))){
                    min = j;
                } else{
                    min = 1 + lastOccur(P, T[i]);
                }
                //inew = i + m - min(j, 1 + L(T[i])
                i = i + m - min;
                j = m - 1; //tinh jnew = m - 1; => moi lan` nhảy cách sẽ so sánh
                           // lại từ vị trí cuối cùng của P
            }
        }
        if(check == 0){
            System.out.println("P khong xuat hien trong T");
        }
    }
}
