/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Input : ");          
  
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int x , y;
        double akar1, akar2;
        
        int D = (b*b)-(4*a*c);
   
        if(a==0){
            System.out.println("\nOutput :");
            System.out.println("Nilai a tidak boleh 0");
        }
        else{
            akar1 = (-b+Math.sqrt(D))/(2*a);
            akar2 = (-b-Math.sqrt(D))/(2*a);
 
        System.out.println("\nOutput :");
                System.out.println("Polinomial "+"("+a+")"+"x"+"^2"+" + "+"("+b+")"+"x"+" + "+"("+c+")"+" memiliki");
            
            System.out.println("1. Diskriminan\t\t\t"+"= "+D);           
            System.out.println("2. Akar-akar dari polinomial\t"+"= "+akar1+" dan "+akar2);
            
            
            x = -b/(4*a);
            y = -D/(4*a);
                System.out.println("3. Titik stasioner\t\t"+"= "+"("+x+","+y+")");  
            
     
            if(a>0){                    
                System.out.println("4. Kecekungan kurva\t\t"+"= "+" Atas");     
            }
            else{              
                System.out.println("4. Kecekungan kurva\t\t"+"= "+" Bawah");
            }     
  
            if(a>0){       
                System.out.println("5. Nilai minimum lokal\t\t" + "= "+y);
            }
            else{       
                System.out.println("5. Nilai maksimum lokal\t\t"+"= "+y);
            }
}
}
}