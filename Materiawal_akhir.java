
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Materiawal_akhir {
    public static void main(String[] args) {
        /*latihan 1
        System.out.println("Hello");
        System.out.println("Selamat Belajar di program Java");*/
        
        
        /*int nilai_pbo, nilai_web; nilai_pbo=90; 
        nilai_web = 80; 
        System.out.println("Variabel yang terdapat dalam program :");
        System.out.println("nilai_pbo" + nilai_pbo);
        System.out.println("nilai_web "+ nilai_web);*/
        
        
        
        /*int bil_a, bil_b, hasil;
        bil_a = 454;
        bil_b =546; 
        hasil = bil_a + bil_b;
        System.out.print ("Hasil Penjumlahan kedua bilangan :");
        System.out.println (hasil);*/
        /*int p=5;
        int i=10;
        int t=5;
        System.out.println("Nilai Panjang Balok: "+p);
        System.out.println("Nilai Lebar Balok: "+i);
        System.out.println ("Nilai Tinggi Balok: "+t);
        System.out.println("Menghitung Luas Permukaan Balok");
        System.out.println(": =");
        System.out.println("Luas Permukaan Balok= "+ ((2*p*1)+(2*p*t)+(2*1*t)));*/
        
        
        /*Scanner masukan = new Scanner(System.in);
        int a, b;
        System.out.print ("Masukkan nilai a :");
        a = masukan.nextInt();
        System.out.print ("Masukkan nilai b :");
        b = masukan.nextInt();
        System.out.println();
        System.out.println("Nilai Variabel yang ada pada program :");
        System.out.println("a = " + a);
        System.out.println("b= " + b);*/
        
        
        
        /*Scanner masukan = new Scanner(System.in);
        int nilai;
        System.out.print ("Masukkan nilai akhir PBO :");
        nilai = masukan.nextInt(); 
        if (nilai < 70)
        System.out.println("Siswa tidak lulus");
        if (nilai > 70)
        System.out.println("Siswa lulus");*/
        
        
        /*Scanner masukan = new Scanner(System.in);
        System.out.print ("Masukkan nilai WEB :");
        int nilai = masukan.nextInt();
        if (nilai >= 90)
        System.out.println("Nilai A");
        else if (nilai >= 75)
        System.out.println("Nilai B");
        else if (nilai >= 50)
        System.out.println("Nilai c");
        else if (nilai >= 35)
        System.out.println("Nilai D");
        else
        System.out.println("Nilai E");
        */
        
        
        /*Scanner masukan = new Scanner(System.in); 
        System.out.print ("Silakan pilih angka 1-3 :"); 
        int bil = masukan.nextInt();
        switch (bil) {
        case 1: System.out.println("Satu");
        break;
        case 2: System.out.println("Dua");
        break;
        case 3 : System.out.println("Tiga");}*/
        
        
        /*latihan 8
        System.out.print ("Masukkan nilai TPA:");\
        int TPA = masukan.nextInt(); System.out.print 
        ("Masukkan nilai Bahasa Inggris: ");
        int Bahasa Inggris = masukan.nextInt();
        if ((TPA > 85) && (Bahasa Inggris > 80)) 
        System.out.println("Siswa dapat Beasiswa");
        else
        System.out.println("Siswa tidak dapat Beasiswa");
        */
        
        
        /*System.out.println("Semangat Pagi!!"); 
        for (int i=1; i<4; i++)
        System.out.println("Pagi!!");*/
        
        
        
        /*Scanner masukan = new Scanner(System.in);
        System.out.print ("Masukkan batas bilangan : ");
        int batas = masukan.nextInt();
        int hasil = 0;
        for (int i=1; i<-batas; i++)
        hasil += i;
        System.out.println("Total jumlahnya adalah : "+hasil);*/
        
        
        
        /*Scanner masukan = new Scanner(System.in); 
        int a=0, 
        total=0, 
        bil=7; 
        while (bil!=0) {
        a++;
        System.out.print ("Masukkan bilangan ke-"+a+" : ");
        bil = masukan.nextInt(); 
        total+= bil;
        }
        System.out.println("Total jumlah "+ (a-1)+" bilangan: "); 
        System.out.println(total); }*/
        
        
        
        /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
        
        /*
        int main(){
        int r;
        float phi = 3.14, luasPermukaan;

        //Input Variabel
        printf("Program Menghitung Luas Permukaan Bola\n\n");
        printf("Input Jari-jari : ");
        scanf("%d", &r);

        //Menghitung Luas Permukaan
        luasPermukaan = 4 * phi * r * r;
        printf("Luas Permukaan  : %.2f\n", luasPermukaan);
        return 0;
        */
        
        
        /*Scanner input = new Scanner(System.in);  
        double suhuC, suhuR, suhuK, suhuF;
        String suhu, suhuKonversi;
        System.out.println("Satuan suhu yang diinput : ");
        suhu = input.next();
        
        System.out.println("");
        if (suhu.equals("Celsius")) {
            System.out.println("Masukkan suhu saat ini : ");
            suhuC = input.nextDouble();
            
            System.out.println("");
            
            System.out.println("Konversi suhu dalam bentuk : Reamur/Farenheit/Kelvin");
            suhuKonversi = input.next();
            
            if (suhuKonversi.equals("Reamur")) {
                suhuR = 4 * suhuC / 5;
                System.out.println("Suhu Celsius ke Reamur      : " + suhuR);
            }
            else if (suhuKonversi.equals("Farenheit")) {
                suhuF = (9 * suhuC / 5) + 32;
                System.out.println("Suhu Celsius ke Farenheit   : " + suhuF);
            }
            else if (suhuKonversi.equals("Kelvin")) {
                suhuK = suhuC + 273;
                System.out.println("Suhu Celsiun ke Kelvin      : " + suhuK);
            }
            else{
                System.out.println("Inputan tidak valid");
            }
        }else if(suhu.equals("Reamur")){
            System.out.println("Masukkan suhu saat ini : ");
            suhuR = input.nextDouble();
            
            System.out.println("");
            
            System.out.println("Konversi suhu dalam bentuk : Celsius/Farenheit/Kelvin");
            suhuKonversi = input.next();
            
            if (suhuKonversi.equals("Celsius")) {
                suhuC = 5 * suhuR / 4;
                System.out.println("Suhu Reamur ke Celsius      : " + suhuC);
            }
            else if (suhuKonversi.equals("Farenheit")) {
                suhuF = (9 * suhuR / 4) + 32;
                System.out.println("Suhu Reamur ke Farenheit   : " + suhuF);
            }
            else if (suhuKonversi.equals("Kelvin")) {
                suhuK = (5 * suhuR / 4) + 273;
                System.out.println("Suhu Reamur ke Kelvin      : " + suhuK);
            }
            else{
                System.out.println("Inputan tidak valid");
            }
            
        }else if(suhu.equals("Farenheit")){
            System.out.println("Masukkan suhu saat ini : ");
            suhuF = input.nextDouble();
            
            System.out.println("");
            
            System.out.println("Konversi suhu dalam bentuk : Celsius/Reamur/Kelvin");
            suhuKonversi = input.next();
            
            if (suhuKonversi.equals("Celsius")) {
                suhuC = (suhuF-32)* 5 /9;
                System.out.println("Suhu Farenheit ke Celsius   : " + suhuC);
            }
            else if (suhuKonversi.equals("Reamur")) {
                suhuR = (suhuF - 32) * 4 / 9;
                System.out.println("Suhu Farenheit ke Reamur    : " + suhuR);
            }
            else if (suhuKonversi.equals("Kelvin")) {
                suhuK = (suhuF - 32) * 5 / 9 + 273;
                System.out.println("Suhu Farenheit ke Kelvin    : " + suhuK);
            }
            else{
                System.out.println("Inputan tidak valid");
            }
            
        }else if(suhu.equals("Kelvin")){
            System.out.println("Masukkan suhu saat ini : ");
            suhuK= input.nextDouble();
            
            System.out.println("");
            
            System.out.println("Konversi suhu dalam bentuk : Celsius/Reamur/Farenheit");
            suhuKonversi = input.next();
            
            if (suhuKonversi.equals("Celsius")) {
                suhuC = suhuK - 273;
                System.out.println("Suhu Kelvin ke Celsius      : " + suhuC);
            }
            else if (suhuKonversi.equals("Reamur")) {
                suhuR = 4 * (suhuK - 273) /5;
                System.out.println("Suhu Kelvin ke Reamur       : " + suhuR);
            }
            else if (suhuKonversi.equals("Farenheit")) {
                suhuF = 9 * (suhuK-273) / 5 + 273;
                System.out.println("Suhu Kelvin ke Farenheit    : " + suhuF);
            }
            else{
                System.out.println("Inputan tidak valid");
            }
            
        }else{
            System.out.println("Inputan tidak valid");
        }*/
        
       
        Scanner ab = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String nama = ab.next();
        System.out.print("Masukkan NIS : ");
        String nis = ab.next();
        System.out.print("Tempat lahir : ");
        String lahir = ab.next();
        System.out.print("Tanggal lahir : ");
        String tanggal = ab.next();
        System.out.print("Jenis kelamin : ");
        String kelamin = ab.next();
        System.out.print("Alamat : ");
        String alamat = ab.next();
        System.out.print("Motto hidup : ");
        String motto = ab.next();
        
       
        System.out.println("===================================================");
        System.out.println("Bio Data anda "+"\nNama : "+nama+"\nNIS : "+nis+"\nLahir : "+lahir+"\nTanggal : "+tanggal+"\nKelamin"+kelamin+"\nAlamat : "+alamat+"\nMotto hidup : "+motto);
        System.out.println("===================================================");
        
    }        
}
