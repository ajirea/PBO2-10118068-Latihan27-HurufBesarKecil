/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118068.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Satria Aji Putra
 * KELAS    : IF-2
 * NIM      : 10118068
 * Deskripsi Program : Prigram formatting string menjadi seluruhnya kapital dan
 * seluruhnya nonkapital
 */
public class PBO210118068Latihan27HurufBesarKecil {

    public static String kalimat;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        kalimat = scanner.nextLine().toUpperCase();
        
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Huruf Besar : " + kalimat);
        System.out.println("Huruf Kecil : " + kalimat.toLowerCase());
    }
    
}
