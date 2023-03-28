
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class IfDasar {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Apakah kamu haus ? ");
        System.out.println("1.Iyah");
        System.out.println("2.Tidak");
        int b = input.nextInt();
        if(b==1){
            System.out.println("Silahkan Minum");
        }else{
            System.out.println("Turu aja dek");
        }
        
    }
    
}
