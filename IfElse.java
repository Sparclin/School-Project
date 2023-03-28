
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class IfElse {
    public static void main(String[] args) {
        
        /*int nilai = 91;
        if(nilai>90){
            System.out.println("A");
        }
        else if(nilai>80){
            System.out.println("B");
        }
        else
        System.out.println("C");*/
        
        
        /*if(nilai>90){
            System.out.println("A");
        }
        else if(nilai>80){
            System.out.println("B");
        }
        if
        System.out.println("C");*/
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan nilai : ");
        int nilai = input.nextInt();
        if(nilai>=101){
            System.out.println("TIdak bisa karena lebih dari 100");
        }
        else if(nilai>=90){
        System.out.println("A+");
        if(nilai==100){
            System.out.println("Dapat Hadiah");}
            else if (nilai==0){
            System.out.println("Dapat hukuman");
        }
        }
        else if(nilai>=80){
        System.out.println("B");
        }
        else if(nilai>=60){
        System.out.println("C");
        }
        else if(nilai>=40){ 
        System.out.println("D");
        }
        else if(nilai>=20){
            System.out.println("E");
        if (nilai==0){
            System.out.println("Dapat hukuman");
                }
        }           
    }
}        
        
        
        
        
        






