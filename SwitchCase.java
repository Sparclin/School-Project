
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class SwitchCase {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Apakah anda haus? ");
         System.out.println("Apakah Iya atau Tidak? ");
         String haus = input.nextLine();
         switch(haus){
             case "tidak" : System.out.println("Gk usah minum");break;
             case "iya" : System.out.println("Cepatlah minum");
                 System.out.println("Mau minuman hangat apa dingin");
                 System.out.println("Mau yang mana");
                 String pilihan = input.nextLine();
         switch(pilihan){
             case "hangat" : System.out.println("Teh hangat, Jahe, Jeruk nipis hangat,susu hangat");
             String a = input.nextLine();
             switch(a){
             case "teh hangat" : System.out.println("Harga = 3000");break;
                 case "jahe hangat" : System.out.println("Harga = 3500");break;
                 case "jeruk nipis hangat":System.out.println("Harga = 3500");break;
                 case "susu hangat":System.out.println("Harga = 5000");break;
             case "dingin" : System.out.println("Es teh, Es jeruk nipis, Es milo, Es kelapa");
             String b = input.nextLine();
             switch(b){
                 case "es teh": System.out.println("Harga = 3000");break;    
             case "es jeruk nipis" : System.out.println("Harga = 3500");break;
             case "es milo":System.out.println("Harga = 4000");break;
             case "es kelapa":System.out.println("Harga = 5000");break;
                 
             }
             
             
                                  
                                 
                }
              
             }
         }
     }
    
}
