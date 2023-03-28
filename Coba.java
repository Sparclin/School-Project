

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Coba {
    public static void main(String[] args) {
        //UKL nomer 1
       /*int awal = 6;
         int beda = 3;
         int total = 0;
    //selisih 3 tampilkan bilangan ke duang hingga ke lima
            for (int i = 1; i <= 15; i++) {
            if (i>=10) {
              total+=awal;
                System.out.println("Bilangan ke-"+i+": "+awal);
            }
            awal+=beda;
            }
        System.out.println("Hasilnya adalah : "+total);*/
       
       //UKL nomer 2
       /*int awal = 6;
       int baris = 4;
       int kolom = 3;
       int beda = 3;
       int total = 0;
       
        for (int i = kolom; i >= 1; --i) {
            for (int j = 1; j <= baris; ++j) {
                total+=awal;
                System.out.print(awal + " \t");
                awal+=beda;
            }
            System.out.println("");
        }
        System.out.println("Total : "+total);*/
       
       
       
       //UKL nomer 3
       /*int awal = 6;
       int beda = 3;
       int total = 0;
       
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j <= i; j++) {
                total+=awal;
                System.out.print(awal+"\t");                
                awal+=beda;
            }
            System.out.println("");
}
         for (int i = 3; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                total+=awal;
                System.out.print(awal + "\t");
                awal+=beda;
            }
            
            System.out.println("");
        }*/
       
       
       //UKL nomer 4
       /*
        for (int i = 1; i <= 8; i++) {
            for (int j = i; j <= 7; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
       */
       /*int awal = 6;
       int beda = 3;
       int total = 0;
       
       for (int i = 3; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(awal + "\t");
                awal+=beda;
            }
            
            System.out.println("");
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(awal+"\t");                
                awal+=beda;
            }
            System.out.println("");
        }*/
        
       //beda arah
       /*for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print("* ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            
            for (int j = i; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }*/
       
       //Beda arah
        /*for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
         for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }*/
        
        
        //beda bentuk
        /*for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <= 5-1; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < 5; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }*/
       
       //Array +
       /*int a[][]={{1,2},{4,3}};
        int b[][]={{1,2},{3,4}};
        int h[][]={{0,0},{0,0}};
        //proses perhitungan
        
        System.out.println("A = ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j]+" \t");
            }
            System.out.println("");
        }
        
        System.out.println("B = ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(b[i][j]+" \t");
            }
            System.out.println("");
        }
        
        System.out.println("Hasil = ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){ 
                for(int k=0;k<2;k++){ 
                    h[i][j]=h[i][j]+a[i][k]+b[k][j];
                }
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(h[i][j]+"\t");
            }
            System.out.println();
        }*/
       
      
       //Array *
       /*int a[][]={{1,2},{4,3}};
        int b[][]={{1,2},{3,4}};
        int h[][]={{0,0},{0,0}};
        //proses perhitungan
        
        System.out.println("A = ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j]+" \t");
            }
            System.out.println("");
        }
        
        System.out.println("B = ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(b[i][j]+" \t");
            }
            System.out.println("");
        }
        
        System.out.println("Hasil = ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){ 
                for(int k=0;k<2;k++){ 
                    h[i][j]=h[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(h[i][j]+"\t");
            }
            System.out.println();
        }*/
    }
}



