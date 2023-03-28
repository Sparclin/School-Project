
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class IfForElse {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        int i,k,total=0;
        System.out.print("Masukkan batas awal : ");
        i = ab.nextInt();
        System.out.print("Masukkan batas akhir : ");
        k = ab.nextInt();
        
        if (i > k ) {
            for (int a = k; a <= k; i--) {
                if(i % 2 == 0 ){
                System.out.println(i);
            }
            }    
        }else{
            for (int a = k; k >= a; i++) {
                if(i % 2 == 0 ){
                }
                System.out.println(i);
            }
            System.out.println("\nTotal = "+total);
        }
        
    }
}
