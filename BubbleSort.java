
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class BubbleSort {
    public void main(String[]args){
        Scanner ab = new Scanner(System.in);
        
        int jumlah,i,j, swap;
        
        System.out.println("Masukkan jumlah bilangan yang ingin di input :");
        jumlah = ab.nextInt();
        
        int array[] = new int[jumlah];
        System.out.println("\nMasukkan"+jumlah+"Buah Bilangan Interger");
        System.out.println("==========================================");
        for (i=0; i <jumlah; i++) 
        {
            System.out.println("Bilangan ke-"+(i+1)+" =");
            array[i]=ab.nextInt();
        }
        
        System.out.println("\nBilangan Sebelum Diurutkan");
        for (int a = 0; a < jumlah; a++)
        {
            System.out.println(array[a]);
        }
        
        for (i = 0; i <(jumlah-1); i++)
        {
            for (j = 0; j < jumlah-i-1; j++) 
            {
                if (array[j] > array[j+1])
                {
                    swap=array[j];
                    array[j]=array[j+1];
                    array[j+1]=swap;
                }
            }
        }
        
        System.out.println("\nBilangan Setelah Diurutkann");
        for (i = 0; i < jumlah; i++) {
            System.out.println(array[i]);
        }
        
    }
}
