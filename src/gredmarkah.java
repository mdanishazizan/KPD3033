/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User's
 */
import java.util.Scanner;
public class gredmarkah {
    public static void main(String[] args) {
        
        double purata;
        double bm;
        double bi;
        double sej;
        
Scanner scan=new Scanner(System.in);

System.out.println("MASUKKAN MARKAH ANDA");

System.out.println("Markah Bahasa Melayu : ");
bm = scan.nextDouble();
System.out.println("Markah Bahasa Inggeris : ");
bi = scan.nextDouble();
System.out.println("Markah Sejarah : ");
sej = scan.nextDouble();

purata=bm+bi+sej/3;

if (purata > 89){
    System.out.println("Gred yang anda perolehi adalah : A");
    
}
else if (purata > 79){
    System.out.println("Gred yang anda perolehi adalah : A-");
            
}
else if (purata > 69){
    System.out.println("Gred yang anda perolehi adalah : B+");
    
}
else if (purata > 59){
    System.out.println("Gred yang anda perolehi adalah : B");
    
}
else if (purata > 49){
    System.out.println("Gred yang anda perolehi adalah : B-");
    
}
else if (purata > 39){
    System.out.println("Gred yang anda perolehi adalah : C");
    
}
else if (purata > 29){
    System.out.println("Gred yang anda perolehi adalah : D");
    
}
else if (purata > 19){
    System.out.println("Gred yang anda perolehi adalah : E");
    
}
else {
    System.out.println("Gred yang anda perolehi adalah : G");
}
    }
    
}