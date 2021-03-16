/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.io.*;
import java.util.*;
/**
 *
 * @author Administrator
 */
public class lab3 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        //nhap masv
        System.out.print("Nhap ma sinh vien: ");
        String masv = x.nextLine();
        //nhap ho ten
        System.out.print("Nhap ho ten sinh vien: ");
        String ten = x.nextLine();
        //nhap tuoi
        System.out.print("Nhap tuoi sinh vien: ");
        String tuoi = x.nextLine();
        //nhap nam sinh
        System.out.print("Nhap nam sinh sinh vien: ");
        String ns = x.nextLine();
        //nhap diem trung binh
        System.out.print("Nhap dtb sinh vien: ");
        String dtb = x.nextLine();
        //xuat thong tin
        System.out.print("-----Thong tin sinh vien-----\n");
        System.out.print("Ten SV: "+ten+"\nMaSV: "+masv+"\nTuoi: "+tuoi+"\nNam sinh: "+ns+"\nDiem trung binh: "+dtb+"\n");
    }
    
}
