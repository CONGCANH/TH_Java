/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class lab7 {
     public static void main(String[] args)
   {
      int n;
      int[] soNguyen;
      int i ;
      
      //nhap phan tu
      Scanner sc = new Scanner(System.in);
      System.out.print("Nhập vào so phan tu n:");
      n = sc.nextInt();
      soNguyen = new int[n];
      
      //nhap mang
       for ( i=0 ; i < n; i++)
        {
            System.out.print("Nhập vào số nguyên:");
            soNguyen[i] = sc.nextInt();
        }   
       
      //xuat so nguyen to
      for( i=0;i<n;i++)
      {
         if(ktnt(soNguyen[i])&&soNguyen[i]>2)
         {
             System.out.println("SNT la: "+ soNguyen[i]);
         }  
      }
      
      //xuat so lon nhat
      int max =0; 
      for (i = 0; i < n; i++)
      {
         if(soNguyen[i] > max)
         max = soNguyen[i];
      }
      System.out.println("Phần tử có giá trị lớn nhất là: " + max);
      
      //dem so chinh phuong
      int dem=0;
      for (i = 0; i < n; i++)
      {
          if (ktcp(soNguyen[i])&&soNguyen[i]!=0)
          {
            dem++;   
            System.out.println(soNguyen[i]);
          }
      }
       
      System.out.println("Co "+dem+" phan tu la so chinh phuong");
      
      //xap sep mang
      sortASC(soNguyen);
        System.out.println("Dãy số được sắp xếp tăng dần: ");
        show(soNguyen);
      
   }
     
    //kiem tra nguyen to
    public static boolean  ktnt(int num)
    {
        int temp;
        boolean f=true;
        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                return false;
            }
        }
        return  true;
    }
    
    //kiem tra so ching phuong
     static boolean ktcp(int x)
    {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
        
    }
     //ham sap xep
     public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
     //show sau khi sap xep
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
   
