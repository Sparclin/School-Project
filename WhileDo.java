
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class WhileDo {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        /*while(i<5){
            System.out.println("Test");
            i++
        }*/
        /*do {
            System.out.println("Test");
            i++;
        } while (i<5);*/
        /*int a,b,total = 0;
        int aw = 0;
        System.out.print("Masukkan Jumlah Anak : \n");
        a = ab.nextInt();
         do {
             if (aw>=a) {
             System.out.println("Kena SKIZO");
             break;
             }
             aw++;
             System.out.println("Uang saku anak "+ aw+"");
             b = ab.nextInt();
             total +=b;
         if (aw>=a) {
             System.out.println("Ngapain ngasih uang??0");
         }else{
             System.out.println("Total Uang saku : "+total);
         }*/
        
        
        int a,b=1,c,subtotal=0, total=0;
        String pilih = "";
        System.out.println("Pilih : ");
        System.out.println("1.Pertambahan");
        System.out.println("2.Pengurangan");
        int d = ab.nextInt();
        if(d==1){
        do {
            b=1;
            subtotal=0;
            System.out.print("Masukkan jumlah bilangan yang ingin di hitung : ");
            a = ab.nextInt();
         while (b<=a){
             System.out.println("Input ke-"+b+" ");
             c = ab.nextInt();
             b++;
             subtotal +=c;
         }
         
            System.out.println("Hasil "+subtotal);
        total+= subtotal;
        System.out.println("Apakah ingin menghitung lagi (ya/tidak ? ");
        pilih = ab.next();
        }while(pilih.equalsIgnoreCase("Ya"));
        }
        System.out.println("");
        System.out.println("Progam Selesai");
        System.out.println("Hasil total penjumlahan : "+total);
               
       
        
        
        
        
        
        
    }
}
