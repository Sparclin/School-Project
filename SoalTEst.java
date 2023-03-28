
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class SoalTEst {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int nilai1 = 0,nilai2 = 0,nilai3 = 0,nilai4 = 0,nilai5 = 0,nilai6 = 0,nilai7 = 0,nilai8 = 0,nilai9 = 0,nilai10 = 0;
        System.out.println("1.Siapakah anak terajin");
        System.out.println("a.Ahmad");
        System.out.println("b.Yasa");
        System.out.println("c.Nurdin");
        String a = z.nextLine();
        if(a.equalsIgnoreCase("b")){
            System.out.println("Salah");
            nilai1+=0;
            }
        else if(a.equalsIgnoreCase("b")){
                System.out.println("Benar");
                nilai1+=10;
            }
        else if(a.equalsIgnoreCase("c")){
                System.out.println("Salah");
                nilai1+=0;
            }
        System.out.println("2.Siapakah anak terpintar");
        System.out.println("a.Nurdin");
        System.out.println("b.Mudi");
        System.out.println("c.Yudi");
        String b = z.nextLine();
        if(b.equalsIgnoreCase("a")){
            System.out.println("Benar");
            nilai2+=10;
        }
        else if(b.equalsIgnoreCase("b")){
            System.out.println("Salah");
            nilai2+=0;
                }
        else if(b.equalsIgnoreCase("c")){
                System.out.println("Salah");
                nilai2+=0;
                }
        System.out.println("3.Jajan terenak");
        System.out.println("a.Cocolatos");
        System.out.println("b.Pillow");
        System.out.println("c.Coki coki");
        String c=z.nextLine();
        if(c.equalsIgnoreCase("a")){
            System.out.println("salah");
            nilai3+=0;
        }
        else if(c.equalsIgnoreCase("b")){
            System.out.println("Benar");
            nilai3+=10;
        }
        else if(c.equalsIgnoreCase("c")){
            System.out.println("salah");
            nilai3+=0;
        }
        System.out.println("4.Aku berangkat jam");
        System.out.println("a.07.00");
        System.out.println("b.06.06");
        System.out.println("c.05.30");
        String d=z.nextLine();
        if(d.equalsIgnoreCase("a")){
            System.out.println("Salah");
            nilai4+=0;
        }
        else if(d.equalsIgnoreCase("b")){
            System.out.println("Salah");
            nilai4+=0;
        }
        else if(d.equalsIgnoreCase("c")){
            System.out.println("Benar");
            nilai4+=10;
        }    
        System.out.println("5.Kucing saya pulang jam berapa");
        System.out.println("a.16.50");
        System.out.println("b.09.00");
        System.out.println("c.15.30");
        String e=z.nextLine();
        if(e.equalsIgnoreCase("a")){ 
            System.out.println("Benar");
            nilai5+=10;
        }
        else if(e.equalsIgnoreCase("b")){
            System.out.println("Salah");
            nilai5+=0;
        }
        else if(e.equalsIgnoreCase("c")){
            System.out.println("Salah");
            nilai5+=0;

        }
        System.out.println("6.Siapakah bapak nurdin");
        System.out.println("a.Ahmad");
        System.out.println("b.Suji");
        System.out.println("c.Kaem"); 
        String f=z.nextLine();
        if(f.equalsIgnoreCase("a")){
            System.out.println("Benar");
                        nilai6+=10;
        }
        else if(f.equalsIgnoreCase("b")){
            System.out.println("Salah");
                        nilai6+=0;

        }
        else if(f.equalsIgnoreCase("c")){
            System.out.println("Salah");
                        nilai6+=0;

        }
        System.out.println("7.Dimana rumah nurdin");
        System.out.println("a.di Banyuwangi");
        System.out.println("b.di Sawojajar");
        System.out.println("c.di Madura"); 
        String g=z.nextLine();
        if(g.equalsIgnoreCase("a")){
            System.out.println("Salah");
                        nilai7+=0;

        }
        else if(g.equalsIgnoreCase("b")){
            System.out.println("Salah");
                        nilai7+=0;
        }
        else if(g.equalsIgnoreCase("c")){
            System.out.println("Benar");
                        nilai7+=0;

        }
        System.out.println("8.Bagaimana kondisi laptop");
        System.out.println("a.Menyala");
        System.out.println("b.Mati");
        System.out.println("c.Sleep"); 
        String h=z.nextLine();
        if(h.equalsIgnoreCase("a")){
            System.out.println("Benar");
                        nilai8+=10;
        }
        else if(h.equalsIgnoreCase("b")){
            System.out.println("Salah");
                        nilai8+=0;
        }
        else if(h.equalsIgnoreCase("c")){
            System.out.println("Salah");
            nilai8+=0;
        }
        System.out.println("Apa yang dilakukan kucing");
        System.out.println("a.Jalan");
        System.out.println("b.Lari");
        System.out.println("c.Terbang"); 
        String i=z.nextLine();
        if(i.equalsIgnoreCase("a")){
            System.out.println("Salah");
            nilai9+=0;
        }
        else if(i.equalsIgnoreCase("b")){
            System.out.println("Benar");
            nilai9+=10;
        }
        else if(i.equalsIgnoreCase("c")){
            System.out.println("Salah");
            nilai9+=0;
        }
        System.out.println("10.Kucing berwarna coklat");
        System.out.println("a.Di tengah");
        System.out.println("b.Di kiri");
        System.out.println("c.Di kanan"); 
        String j=z.nextLine();
        if(j.equalsIgnoreCase("a")){
            System.out.println("Salah");
            nilai10+=0;
        }
        else if(j.equalsIgnoreCase("b")){
            System.out.println("Salah");
            nilai10+=0;
        }
        else if(j.equalsIgnoreCase("c")){
            System.out.println("Salah");
            nilai10+=0;
        }
        int total;
        total = nilai2+nilai1+nilai3+nilai4+nilai5+nilai6+nilai7+nilai8+nilai9+nilai10;
        System.out.println("\n\nNilai anda adalah = "+total);
        }
        }
        
            
        
        
        

    

