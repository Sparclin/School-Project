
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class FunctionMethod {
    static void nama(){
        System.out.println("sxinix");
    }
    static void hitung(int x,int y){
        int hasil,a = x,b = y;
        hasil = a+b;
        System.out.println(hasil);
    }
     
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        nama();
        System.out.println("Masukkan Nilai 1 : ");
        int i = ab.nextInt();
        System.out.println("Masukkan Nilai 2 :");
        int j = ab.nextInt();
        hitung(i,j);
        
        System.out.println("Masukkan Nilai 3 : ");
        int e = ab.nextInt();
        System.out.println("Masukkan Nilai 4 : ");
        int d = ab.nextInt();
        hitung(e,d);
        
    }       
}
