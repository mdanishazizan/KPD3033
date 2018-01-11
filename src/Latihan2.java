/*Bina satu aturcara mengira gaji bulanan.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User's
 */
import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int gajiasas = 800;
        double gaji;
        double bonus;
        int bilpelanggan;
        
System.out.print("Masukkan bilangan pelanggan=");
bilpelanggan=input.nextInt();

if(bilpelanggan ==0){
    bonus=0;
    
}else if (bilpelanggan <= 10){
    bonus=550;
    
}else if (bilpelanggan <= 50){
    bonus=1400;
}else if (bilpelanggan <=100){
    bonus=2500;
}else{
    bonus=1050;
}
gaji=gajiasas +bonus;
System.out.print("Gaji anda adalah = RM" + gaji);

}
    }