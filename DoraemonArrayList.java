/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */

import java.util.ArrayList;

public class DoraemonArrayList {
     public static void main(String[] args) {
         
         //membuat objek array list
         //ArrayList kantongAjaib = new ArrayList();
         ArrayList kantongCelana = new ArrayList();
         
         //mengisi kantong ajaib dengan 5 benda
         
         kantongCelana.add("Badag Besar");
         kantongCelana.add("Bakso Tikus");
         kantongCelana.add("Sate Kelinci");
         kantongCelana.add("Ibni");
         kantongCelana.add("Reza");
         
         //mengubah object
         kantongCelana.set(0, "Badag Kecil");
         
         //menghapis tikus dari kantong ajaib
         kantongCelana.remove("Reza");
         
         //menampilkan isi kantong ajaib
         System.out.println(kantongCelana);
         
         //menampilkan banyak isi kantong ajaib
         System.out.println("Kantog berisi "+kantongCelana.size() +" item");
         for (int i = 0; i < kantongCelana.size(); i++) {
             System.out.println("Isi kantong : "+i+" = "+kantongCelana.get(i));
         }
         
         
     }
}
