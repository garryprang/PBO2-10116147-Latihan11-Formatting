/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10116147.latihan11.formatting;

/**
 * @author
 * Nama                 : Garry Prang
 * NIM                  : 10116147
 * Kelas                : PBO-2
 * Deskripsi Program    : Program untuk membuat formatting pada teks.
 */

public class PBO210116147Latihan11Formatting {
    
    public static void main(String[] args) {
        
        int i = 3546764;
        int iMinus = -i;
        System.out.println("i \t: " + i);
        System.out.printf("%%d \t: %d%n", i);
        System.out.printf("%%10d \t: %10d%n" , i);
        System.out.printf("%%+10d \t: %+10d%n", i);
        System.out.printf("%%+10d \t: %+10d%n", iMinus);
        System.out.printf("%%,10d \t: %,10d%n", i);
        System.out.printf("%%-10d \t: %-10d%n", i);
        
        double f = 5675482.982;
        System.out.println("f \t: " + f);
        System.out.printf("%%f \t: %f%n", f);
        System.out.printf("%%.2f \t: %.2f%n", f);
        System.out.printf("%%.12.2f : %12.2f%n", f);
        System.out.printf("%%,12.2f : %,12.2f%n", f);
                
        
    }
    
}
