/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan38.perhitunganlingkaran;
import java.util.*;
/**
 *
 * @author ACER
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi tentang program menghitung luas dan keliling lingkaran
 */
public class PBO11K10118904Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Lingkaran l = new Lingkaran();
        float n = 0;
        
        System.out.println("====== Perhitungan lingkaran ======");
    
        do {
            System.out.print("Masukan nilai diameter lingkaran : ");
        try {
        n = input.nextFloat();
        } catch (Exception e) {
            System.out.println("Nilai diameter tidak sesuai");
            input.next();
        }
        } while( n <= 0);
        l.hasilHitung(n);
    }
    
}
