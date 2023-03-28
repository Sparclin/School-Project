
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class ForIF2 {
    public static void main(String[] args) {
         Scanner ab = new Scanner(System.in);
        /*zfor (int i = 0; i < 10; i--) {
            System.out.println(""+i);
            
        }*/
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
            }
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
                    
    }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
                    
    }
        
       /*for (int i = 1; i <=20; i+=2) {
                System.out.print(i + " ");
       }*/
        /*for (int i = 1; i <= 10; i+=2) {
            for (int j = 1; j <= i ; j+=2) {
                System.out.print(j);
            }
            System.out.println("");
        }*/
        /*Scanner ab = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("Deret bilangan genap");
        System.out.println("==========================");
        System.out.print("Masukkan bilangan awal : ");
        int A = ab.nextInt();
        System.out.print("Masukkan bilangan akhir : ");
        int B = ab.nextInt();
        for (int i = A; i <= B ; i++) {
            if(i % 2 == 0 ){
                System.out.print(i+"");
        }
            
        }*/
        /*int total = 0;
        System.out.println("Masukkan batas awal : ");
        int a = ab.nextInt();
        System.out.println("Masukkan batas akhir");
        int b = ab.nextInt();
        if (a > b) {
            for (int i = a; i >=b; i--) {
                if(i % 2 == 0 ){
                    System.out.println(i);
                    total=total+0;
                }
            }
            System.out.println("\nTotal"+total);
        }else{
            for (int i = a; i <= b; i++) {
                if(i % 2 == 0 ){
                    System.out.println(i);
                    total=total+0;
                }
            }
            System.out.println("\nTotal "+total);*/
            
        
        
        /*int a = 4;
        int spasi = a;        
        for (int i = 0; i < a; i++) {
            for (int j = 1; j <= spasi-i; j++) {
                System.out.print(" ");
            }
            for (int z = 0; z < i+1 ; z++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
            
            for (int j = 0; j <= spasi-i; j++) {
                System.out.print(" ");
            }*/
            
        }
}      

