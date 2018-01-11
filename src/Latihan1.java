/*Program ringkas yang membenarkan pengguna memasukkan dua nombor.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User's
 */
import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int nombor1;
        int nombor2;
        
    System.out.print("Masukkan nombor1 =");
    nombor1 = input.nextInt();
    
    System.out.print("Masukkan nombor2 =");
    nombor2 = input.nextInt();
    
    if (nombor1 > nombor2){
        System.out.print("Nombor 1 adalah lebih besar daripada nombor 2");
    }else if(nombor2 > nombor1){
        System.out.print("Nombor 2 adalah lebih besar daripada nombor 1");
    }else{
        System.out.print("Kedua-dua nombor adalah sama");
    }
    }
    
}