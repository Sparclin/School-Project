
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Tugas {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        String mira = "Nama : Mira\nAlamat : Sawojajar";
        String nina = "Nama : Nina\nAlamat : Kedung kandang";
        String oemar ="Nama : Oemar\nAlamat : Ijen";
        String pena  = "Nama : Pena\nAlamat : Dinoyo";

        System.out.print("Masukan ID : ");
        int a = ab.nextInt();
        System.out.println("====================");
                if (a>=1 && a<5) {
            System.out.println("Data Pelajar : ");
            switch(a){
    case 1 :
        System.out.println(mira);
        break;
    case 2 :
        System.out.println(nina);
        break;
    case 3 :
        System.out.println(oemar);
        break;
    case 4 :
        System.out.println(pena);
}
        System.out.println("========================");
        System.out.println("Masukan jalur pendaftaran :\n1. SMBPTN\n2. SNMPTN\n3. Mandiri");
     int b =ab.nextInt();
switch (b){
    case 1 :
        System.out.println("Masukan Jumlah Pendapatan Perbulan :\n1. <2 juta\n2. 2 s.d 10 juta\n3. >10 juta");
    int c = ab.nextInt();
        System.out.println("=====================");
switch(c){
    case 1 :
        System.out.println("Golongan A \nDSP : 5 juta\nSPP : 500 ribu");   
        break;
    case 2 :
        System.out.println("Golongan B \nDSP : 15 juta\nSPP : 1 juta ");
        break;
    case 3 :
        System.out.println("Golongan C \nDSP : 30 juta\nSPP : 2 juta");
        break;
      }
break;

    case 2 :
       System.out.println("Masukan Jumlah Pendapatan Perbulan :\n1. <2 juta\n2. 2 s.d 10 juta\n3. >10 juta");
    int d = ab.nextInt();
        System.out.println("=====================");
switch(d){
     case 1 :
        System.out.println("Golongan A \nDSP : 7 juta\nSPP : 500 ribu");   
        break;
    case 2 :
        System.out.println("Golongan B \nDSP : 17 juta\nSPP : 1 juta ");
        break;
    case 3 :
        System.out.println("Golongan C \nDSP : 35 juta\nSPP : 2 juta");
        break;
}
break;

    case 3 :
        System.out.println("Masukan Jumlah Pendapatan Perbulan :\n1. <2 juta\n2. 2 s.d 10 juta\n3. >10 juta");
    int e = ab.nextInt();
        System.out.println("=====================");
switch(e){
     case 1 :
        System.out.println("Golongan A \nDSP : 10 juta\nSPP : 1 juta");   
        break;
    case 2 :
        System.out.println("Golongan B \nDSP : 25 juta\nSPP : 2 juta ");
        break;
    case 3 :
        System.out.println("Golongan C \nDSP : 50 juta\nSPP : 3 juta");
        break;
}

   }
        }
                else {
                    System.out.println("ID Tidak Ditemukan");
                }
    }
}
