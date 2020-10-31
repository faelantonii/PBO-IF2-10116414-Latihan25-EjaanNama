/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan25_EjaanNama;

import java.util.Scanner;

/**
 *
 * @author sweenutt
 * 
 * NAMA         : FAEL ANTONI WIJAYA
 * KELAS        : PBO-2
 * NIM          : 10116414
 * DESKRIPSI    : Program Ejaan Nama
 */
public class PBO_IF2_10116414_EjaanNama {
    public static void main(String[] args) {
        int jumlah;
        char huruf;
        String nama;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nama depan untuk di eja : ");
        nama = scanner.nextLine();
        
        jumlah = nama.length();
        
        System.out.println("\nEjaan untuk \""+nama+"\" adalah : ");
        
        for (int i = 0; i < jumlah; i++){
            System.out.println("Huruf ke-" + (i+1) + " : " + nama.charAt(i));
        }
    }
    
}
