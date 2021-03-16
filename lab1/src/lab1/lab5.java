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
public class lab5 {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int a=0,b=0;
        //kiem tra 2 so nguyen duong
        do{
            
            System.out.print("Nhập số nguyên dương a = ");
            a = scanner.nextInt();
            System.out.print("Nhập số nguyên dương b = ");
            b = scanner.nextInt();
            if(a<0||b<0)
                
                System.out.print("kiem tra lai 2 so a va b!!!\n");
        
        }while(a<0||b<0);

        // tính USCLN của a và b
        System.out.println("\nUSCLN của " + a + " và " + b + " là: " + USCLN(a, b));
        // tính BSCNN của a và b
        System.out.println("\nBSCNN của " + a + " và " + b + " là: " + BSCNN(a, b));
    }
    //tinh UCLN
     public static int USCLN(int a, int b) {
         
        if (b == 0) return a;
        return USCLN(b, a % b);
        
    }
     
     //tinh BCNN
     public static int BSCNN(int a, int b) {
         
        if(a==0&&b==0)
            return(0);           
        
        return (a * b) / USCLN(a, b);
    }
    
}
