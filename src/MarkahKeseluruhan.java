/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User's
 */
public class MarkahKeseluruhan {
    public static void main(String[] args) {
        
        int FOP,COA,WP,SI;
        double jumlah, purata, peratus;
        
        FOP=87;
        COA=90;
        WP=68;
        SI=50;
        
        jumlah=FOP+COA+WP+SI;
        purata=jumlah/4;
        peratus=jumlah*100/400;
        
        System.out.println("Fundamental of Programming : "+FOP+"\tComputer Organization and Architecture :"+COA);
        System.out.println("Web Programming :"+WP+"\t\tSystem Interface :"+SI);
        System.out.println("Jumlah Markah Keseluruhan :"+jumlah);
        System.out.println("Purata Markah Keseluruhan :"+purata);
        System.out.println("Peratus Markah Keseluruhan :"+peratus);

    }
    
}
