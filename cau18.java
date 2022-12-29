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

    static Scanner sc = new Scanner(System.in);
    
    public static void chuyenDoiSoNguyenLon(int t, long[] arr , long a, int w){
        for(int i=t-1 ; i>=0; i--){
            arr[i] = (long)(a/Math.pow(2,i*w));
            a = (long) (a % Math.pow(2, i*w));
        }
    }
    
    public static int congChinhXacBoi(long[] arr , long[] arr2 , long[] c, int t){
        int x=0,y=0;
        for(int i=0 ; i<t; i++){
            c[i] = arr[i] + arr2[i] + x;
            if(c[i]>Math.pow(2,8)){
                c[i] = (long) (c[i]%Math.pow(2,8));
                x=1;
            }
            else{
                c[i] = c[i];
                x =0;
            }
             
        }
        return x;
    }
    
    public static void truChinhXacBoi(long[] arr , long[] arr2 , long[] c, int t){
        int x=0,y=0;
        for(int i=0 ; i<t; i++){
            c[i] = arr[i] - arr2[i] - x;
            if(c[i]<0){
                c[i]+=Math.pow(2,8);
                x=1;
            }
            else{
                x=0;
            }
        }
    }
    
    public static void congTrenTruongF(int e, long c,long p,long[] c1,long[] p1,long[] ketQua, int t){
        
        if(e==1){
            truChinhXacBoi(c1, p1, ketQua, t);
        }
        else if(c>=p){
            truChinhXacBoi(c1, p1, ketQua, t);
        }else{
            for(int i=0;i<4;i++){
                ketQua[i]=c1[i];
            }
        }
    }
    
    public static long chuyenMangThanhSoNguyen(int t, long[] arr , int w){
        
        long a=0;
        for(int i=t-1 ; i>=0; i--){
            a += (long) (arr[i]*Math.pow(2,i*w));
        }
        return a;
    }
    
    public static void showInfo(int t,long[] a){
        for(int i=t-1; i>=0; i--){
            if(i==0){
                System.out.print(a[i] + ")");
            }
            else {
             System.out.print(a[i] + ",");
            }  
        }
    }
    
    public static void main(String[] args) {
        int w = 8;
        int x,y = 0;   
        long p = 2147483647;
        int m = (int) Math.ceil(Math.log(p)/Math.log(2));
        int t = (int) Math.ceil((double)m/w);
        System.out.print("Nhap a :");
        long a = sc.nextLong();
        System.out.print("Nhap b :");
        long b = sc.nextLong();
        long c ;
        long KQ;
        long[] arr = new long[t];
        long[] arr2 = new long[t];
        long[] arr3 = new long[t];
        long[] ab = new long[t];
        long[] ketQua = new long[t];
        chuyenDoiSoNguyenLon(t, arr, a, w);
        chuyenDoiSoNguyenLon(t, arr2, b, w);
        chuyenDoiSoNguyenLon(t, arr3, p, w);
        System.out.print("Mảng của p : ");
        System.out.print("(");
        showInfo(t,arr3);
        x = congChinhXacBoi(arr, arr2, ab, t);
        System.out.print("\nMảng cộng chính xác bội a + b :   ");
        System.out.print("(" + x + ",(");
        showInfo(t,ab);
        
        c = chuyenMangThanhSoNguyen(t,ab,w);
        congTrenTruongF(x, c, p, ab, arr3, ketQua,t);
        KQ = chuyenMangThanhSoNguyen(t, ketQua, w);
        
        System.out.print("\nMảng kết quả cộng trên trường P : ");
        System.out.print("(");
        showInfo(t,ketQua);
        System.out.print("\nKết quả cộng trên trường P : ");
        System.out.println(KQ);
    }
}
