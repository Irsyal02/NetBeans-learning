/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pb;

import java.util.Scanner;

/**
 *
 * @author MAHASISWA
 */
public class PB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        
        System.out.print("SOAL NOMOR 1");
        System.out.print("\n Masukkan jumlah kendaraan: ");
        int jumlahKendaraan = input.nextInt();
        
        long totalPendapatan = 0;

        for (int i = 1; i <= jumlahKendaraan; i++) {
            System.out.print("Lama parkir kendaraan ke-" + i + " (jam): ");
            int lamaParkir = input.nextInt();
            int biaya = 0;

            if (lamaParkir <= 2) {
                biaya = 5000;
            } else {
          
                biaya = 5000 + (lamaParkir - 2) * 3000;
            }
            
            System.out.println("Biaya kendaraan ke-" + i + ": Rp" + biaya);
            totalPendapatan += biaya;
        }
        System.out.println("Total Pendapatan Hari Ini: Rp" + totalPendapatan);
        
 
        int n = 8;
        int n1 = 1, n2 = 1;

        System.out.print("\n S0AL NOMOR 2");
        System.out.print("\n Deret Fibonacci: ");
        System.out.print("");
        for (int i = 1; i <= n; i++) {
            System.out.print(n1 + (i == n ? "" : ", "));
            
            int berikutnya = n1 + n2;
            n1 = n2;
            n2 = berikutnya;
        }
        
        int batas = 20; 
        System.out.print("\n");
        System.out.print(" S0AL NOMOR 3");
        System.out.print("\n Bilangan Prima: ");

        for (int i = 2; i <= batas; i++) {
            boolean isPrima = true;
            
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrima = false;
                    break;
                }
            }

            if (isPrima) {
                System.out.print(i + " ");
            }
        }
        
    }
}


