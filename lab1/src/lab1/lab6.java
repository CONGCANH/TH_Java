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
public class lab6 {
    private static Scanner scanner = new Scanner(System.in);
     
    /**
     * main
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: ", n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            
            if (ktnt(i)) {
                System.out.print(" " + i);
                
            }
        }
    }
     public static boolean ktnt(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            
            if (n % i == 0) {
                return false;
            }
            
        }
        return true;
    }
}
