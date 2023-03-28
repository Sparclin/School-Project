/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class For3 {

    
    public static void main(String[] args) {
       // inisialisasi sebagai stok
        /*int buku=7;
        int pensil=12;
        System.out.println("Buku : "+ buku+ "Pensil"+ pensil);
        double harga_buku,harga_pensil;
        harga_buku=8250;
        harga_pensil=1225;
        buku-=2;
        pensil-=6;
        double bayar =(harga_buku* buku + harga_pensil* pensil);
        System.out.println("Harga yang harus di bayar "+bayar);
        buku+=4;
        pensil+=4;
        System.out.println("Stock saat ini : ");
        System.out.println("Buku "+buku+ "Pensil "+pensil);*/
        
        
       /* int mawar=10,melati=2, matahari=5;
        double harga;
        harga = 4500.5;
        double total, bayar;*/
        
        /*operator penugasan*/
       /* melati+=1;
        mawar+=11;
        matahari=5;
        boolean a = mawar > melati+ matahari;
        /* Operator Aritmatika */
        /*total=mawar+melati+matahari;
        bayar=total*harga;*/
        
        
       
        
       /* System.out.println("jumlah barang yang dibeli = "+mawar+"+"+melati+"+"+matahari+"="+total);
        System.out.println("total yang dibayar  = Rp"+bayar);
        System.out.println("Bunga mawar > bunga melati "+ a);
        System.out.println("Pembelian Bunga mawar lebih besar dari matahari "+ a);*/

        //int a = 60;    /* 60 = 0011 1100 */
        //int b = 13;    /* 13 = 0000 1101 */
        //int c = 0;

       // c = a & b;       /* 12 = 0000 1100 */
       // System.out.println("a & b = " + c);

       // c = a | b;       /* 61 = 0011 1101 */
       // System.out.println("a | b = " + c);

       // c = a ^ b;       /* 49 = 0011 0001 */
        //System.out.println("a ^ b = " + c);

       // c = ~a;          /*-61 = 1100 0011 */
        //System.out.println("~a = " + c);

        //c = a << 2;     /* 240 = 1111 0000 */
        //System.out.println("a << 2 = " + c);

       // c = a >> 2;     /* 215 = 1111 */
        //System.out.println("a >> 2  = " + c);

        //c = a >>> 2;     /* 215 = 0000 1111 */
        //System.out.println ("a >>> 2 = " + c);

       //Scanner input = new Scanner(System.in);
        //int a,b, nilai,choice;
        
        //Scanner input = new Scanner (System.in);
        
        
        /*System.out.println("Masukkan angka : ");
        int angka = input.nextInt();
        if (angka % 2 == 0){
            System.out.println("Angka "+ angka + "adalah bilangan genap");
        }else{
            System.out.println("Angka "+ angka + "adalah bilang ganjil");*/
        
        
    
        Scanner input = new Scanner(System.in);
        int a, jumlah;
        jumlah=0;
        System.out.println("Masukkan Bilangan Awal = ");
        int A = input.nextInt();
        System.out.println("Masukkan Bilangan Akhir = ");
        int B = input.nextInt();
        for(a=A;a<=B;a++)
            {
                jumlah=jumlah+a;
                System.out.println("");
            }
           
        if (A>B){
            System.out.println("Bilangan B terlalu kecil");
        }else{
           System.out.println();
           System.out.println("Total jumlah = "+jumlah);
           
       
    }
    }        
   
        
        
}         
           
      
    

