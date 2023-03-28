/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;





/**
 *
 * @author ACER
 */
public class NewClass2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a;
        System.out.println("Masukkan pilihan ");
        System.out.println("1 : Batu\n2 : Kertas\n3 : Gunting");
        int player = ip.nextInt();
        if(player<=3 && player>1){
            int a = (int)(Math.random()*3)+1;
            System.out.println("Komputer : "+a);
        }
        else if(a == 0 && player == 1 ){
            System.out.println("Win");
        }
        else if(a == 2 && player ==1 ){
            System.out.println("Lose");
        }
        else if(a ==1 && player ==2){
            System.out.println("Win");
        }
        else if(a == 3 && player == 1){
            System.out.println("Lose");
                }
        else if(a == 1 && player == 3){
            System.out.println("Win");
                }
        else if(a == 3 && player == 2){
            System.out.println("Lose");
                }
        else if(a == 2 && player == 3){
            System.out.println("Win");
                }
        else if(a == 3 && player == 3){
            System.out.println("Draw");
                }
        else if(a == 2 && player == 2){
            System.out.println("Draw");
                }
        else if(a == 1 && player == 1){
            System.out.println("Draw");
                }
        else if(player>3){
                System.out.println("Tidak bisa");
                }
        else
            System.out.println("Tidak bisa");
                }
        }
        
       

