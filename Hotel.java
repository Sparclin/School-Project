
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Hotel {    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();
        System.out.println("========================");
        System.out.print("Masukkan jumlah penginap : ");
        int orang = input.nextInt();
        System.out.println("");
        System.out.println("========================");
        System.out.println("Pilih kota : ");
        System.out.println("1. Surabaya");
        System.out.println("2. Malang");
        System.out.print("pilih : ");
        int pilih = input.nextInt();
        System.out.println("=================");
        if (pilih == 1) {
            System.out.println("Pilih Hotel : ");
            System.out.println("1. Bess mansion");
            System.out.println("2. Royal tulip");
            System.out.print("pilih : ");
            int pilihh = input.nextInt();
            System.out.println("===================");
            if (pilihh == 1) {
                System.out.println("Pilih kelas : ");
                System.out.println("1. Superior");
                System.out.println("2. Deluxe");
                System.out.print("pilih : ");
                int pilihhh = input.nextInt();
                System.out.println("=====================");
                if (pilihhh == 1) {
                    int harga = 600000;
                    int jumlah = harga  * orang;
                    System.out.println("Pembayaran tiket hotel");
                    System.out.println("======================");
                    System.out.println("Nama            : "+nama);
                    System.out.println("Lokasi hotel    : Surabaya");
                    System.out.println("Nama hotel      : Bess mansion");
                    System.out.println("Jumlah penginap : "+orang);
                    System.out.println("Harus membayar  : "+jumlah);
                }else if (pilihhh == 2) {
                    int harga = 500000;
                    int jumlah = harga * orang;
                    System.out.println("Pembayaran tiket hotel");
                    System.out.println("======================");
                    System.out.println("Nama            : "+nama);
                    System.out.println("Lokasi hotel    : Surabaya");
                    System.out.println("Nama hotel      : Bess mansion");
                    System.out.println("Jumlah penginap : "+orang);
                    System.out.println("Harus membayar  : "+jumlah);
                }else System.out.println("error");
                    
                }else if (pilihh == 2) {
                System.out.println("Pilih kelas : ");
                System.out.println("1. Superior");
                System.out.println("2. Deluxe");
                System.out.print("pilih : ");
                int pilihhh = input.nextInt();
                System.out.println("=====================");
                if (pilihhh == 1) {
                    int harga =700000;
                    int jumlah = harga  * orang;
                    System.out.println("Pembayaran tiket hotel");
                    System.out.println("======================");
                    System.out.println("Nama            : "+nama);
                    System.out.println("Lokasi hotel    : Surabaya");
                    System.out.println("Nama hotel      : Royal tulip");
                    System.out.println("Jumlah penginap : "+orang);
                    System.out.println("Harus membayar  : "+jumlah);
                }else if (pilihhh == 2) {
                    int harga = 600000;
                    int jumlah = harga * orang;
                    System.out.println("Pembayaran tiket hotel");
                    System.out.println("======================");
                    System.out.println("Nama            : "+nama);
                    System.out.println("Lokasi hotel    : Surabaya");
                    System.out.println("Nama hotel      : Royal tulip");
                    System.out.println("Jumlah penginap : "+orang);
                    System.out.println("Harus membayar  : "+jumlah);
            }
            }else System.out.println("error");
            
        }else if (pilih == 2) {
            System.out.println("Pilih Hotel : ");
            System.out.println("1. Bess mansion");
            System.out.println("2. Royal tulip");
            System.out.print("pilih : ");
            int pilihh = input.nextInt();
            System.out.println("===================");
            if (pilihh == 1) {
                System.out.println("Pilih kelas : ");
                System.out.println("1. Superior");
                System.out.println("2. Deluxe");
                System.out.print("pilih : ");
                int pilihhh = input.nextInt();
                System.out.println("=====================");
                if (pilihhh == 1) {
                    int harga = 500000;
                    int jumlah = harga  * orang;
                    System.out.println("Pembayaran tiket hotel");
                    System.out.println("======================");
                    System.out.println("Nama            : "+nama);
                    System.out.println("Lokasi hotel    : Malang");
                    System.out.println("Nama hotel      : Bess mansion");
                    System.out.println("Jumlah penginap : "+orang);
                    System.out.println("Harus membayar  : "+jumlah);
                }else if (pilihhh == 2) {
                    int harga = 550000;
                    int jumlah = harga * orang;
                    System.out.println("Pembayaran tiket hotel");
                    System.out.println("======================");
                    System.out.println("Nama            : "+nama);
                    System.out.println("Lokasi hotel    : Malang");
                    System.out.println("Nama hotel      : Bess mansion");
                    System.out.println("Jumlah penginap : "+orang);
                    System.out.println("Harus membayar  : "+jumlah);
                }
                    
                }else if (pilihh == 2) {
                System.out.println("Pilih kelas : ");
                System.out.println("1. Superior");
                System.out.println("2. Deluxe");
                System.out.print("pilih : ");
                int pilihhh = input.nextInt();
                System.out.println("=====================");
                if (pilihhh == 1) {
                    int harga =600000;
                    int jumlah = harga  * orang;
                    System.out.println("Pembayaran tiket hotel");
                    System.out.println("======================");
                    System.out.println("Nama            : "+nama);
                    System.out.println("Lokasi hotel    : Malang");
                    System.out.println("Nama hotel      : Royal tulip");
                    System.out.println("Jumlah penginap : "+orang);
                    System.out.println("Harus membayar  : "+jumlah);
                }else if (pilihhh == 2) {
                    int harga = 650000;
                    int jumlah = harga * orang;
                    System.out.println("Pembayaran tiket hotel");
                    System.out.println("======================");
                    System.out.println("Nama            : "+nama);
                    System.out.println("Lokasi hotel    : Malang");
                    System.out.println("Nama hotel      : Royal tulip");
                    System.out.println("Jumlah penginap : "+orang); 
                     System.out.println("Harus membayar  : "+jumlah);
            }else System.out.println("errorF");
            } 
        } else System.out.println("error");
        }
    }


    

