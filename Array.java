
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Array {
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        /*System.out.println("Masukkan jumlah data yang ingin di input : ");
        int sum=0;
        int a = ab.nextInt();
        int klip[] = new int[a];
        for (int i = 0; i < klip.length; i++) {
            System.out.println("di input ke-"+i+": ");
            klip[i]= ab.nextInt();
        }
        System.out.println("------------------------------");
        System.out.println("Indeks dalam array :");
        for (int b : klip) {
            System.out.println(b);
        }
        
        System.out.println("---------------------------");
        for (int num : klip) {
            sum = sum +num;
            System.out.println("Hasil jumlah array :"+sum);
        }*/
        
        /*String[] ab = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println("Mobil" + ab[0]);*/
        
         
        /*for (int i = 0; i < ab.length; i++) {
        System.out.println(i);
        }*/
        
        /*String[]array = new String[2];
        for (int i = 0; i < array.length; i++) {
        System.out.print("Nama ke-"+1+": ");
        array[i] = ab.nextLine();
        }
        System.out.println("--------------------------");
        System.out.println("Nama dalam indeks array");
        for (int j = 0; j <array.length; j++) {
        System.out.println(j);
        }*/
 /*int b [] = {1,3,6,9,12};
         System.out.println(b[0]);*/
        
        /*int total = 0;
        int[]array = new int[2];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Indeks ke-"+1+": ");
            array[i] = ab.nextInt();
            total += array[i];
        }
        System.out.println("Hasilnya "+total);
        System.out.println("--------------------------");
        System.out.println("Data dalam indeks array");
        
        for (int j = 0; j <array.length; j++) {
            System.out.println(j);
           
        }*/
       
        int b;int k
                ;
        System.out.print("Masukan banyak Kolom :");
        b = ab.nextInt();
        System.out.print("Masukkan banyak Nilai :");
        k = ab.nextInt();
        
        int[][] Iya=new int[b][k];
        
        for(int i = 0 ; i < b ; i++){ 
            for(int j = 0 ; j < k ; j++){ 
                System.out.print("["+i+"]["+j+"]= ");
                Iya[i][j]=input();
            }
        }
        for(int i=0;i<b;i++){
            for(int j=0;j<k;j++){
                System.out.print(Iya[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int input(){
        Scanner a=new Scanner(System.in);
        int b = a.nextInt();
        return b;
        }
        
        
        
}
