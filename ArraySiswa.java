
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class ArraySiswa {
     public static void main(String[] args) {
         Scanner ab = new Scanner(System.in);
         
         System.out.println("Jumlah Siswa : ");
         int a = ab.nextInt();
         
         String siswa [][] = new String[a][3];
         
         for (int i = 0; i < a; i++) {
             System.out.println("");
             System.out.println("Data siswa ke-"+(i+1));
              
             for (int j = 0; j < 3; j++) {
                 if (j==0) {
                    System.out.println("NIS     :");
                 }else if (j==1){
                    System.out.println("Nama    :");
                 }else
                    System.out.println("Jurusan :");
                 
                 System.out.println("");
                 siswa[i][j] = ab.next();
             }
             System.out.println("");
             }
             System.out.println("Data Siswa Yang Dimasukkan");
             System.out.println("--------------------------");
             System.out.println("NIS\t\t Nama\t\t Jurusan");
             
             for (int i = 0; i < a; i++) {
                 for (int j = 0; j < 10; j++) {
                    System.out.print(siswa[i][j]+"\t\t");
                 }
                System.out.println("");
         }
     }
}

