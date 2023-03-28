/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Suhukonversi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
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
        }
    }
}

