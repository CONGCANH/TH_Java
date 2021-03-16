/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
/**
 *
 * @author Administrator
 */
public class lab4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        DecimalFormat nguyen = new DecimalFormat("#.##");
        int a,b,tong,hieu,tich;
        float thuong;
        System.out.print("nhap hai so nguyen");
        //nhap so a
        System.out.print("\na: ");
        a = x.nextInt();
        //nhap so b
        System.out.print("\nb: ");
        b = x.nextInt();
        //xuat ket qua
        ///tong
        tong = a+b;
        System.out.print("\nTong hai so a+b: "+tong);
        ///hieu
        hieu = a-b;
        System.out.print("\nHieu hai so a-b: "+hieu);
        ///tich
        tich = a*b;
        System.out.print("\nTich hai so a*b: "+tich);
        ///thuong
        thuong =(float)a/b;
        System.out.print("\nThuong hai so a/b: "+nguyen.format(thuong)+"\n");
        
    }
    
}
