/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan3;

import java.util.Scanner;

/**
 *
 * @author MAHASISWA
 */
public class latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("\n Toko Makmur Jaya Purwakarta");
        System.out.print("\n---------------------------");
        System.out.println("");
        System.out.print("\n A. Susu Dancow");
        System.out.print("\n  1. Ukuran Kecil");
        System.out.print("\n  2. Ukuran Sedang");
        System.out.print("\n  3. Ukuran Besar");
        System.out.println("");
        System.out.print("\n B. Susu Bendera");
        System.out.print("\n  1. Ukuran Kecil");
        System.out.print("\n  2. Ukuran Sedang");
        System.out.print("\n  3. Ukuran Besar");
        System.out.println("");
        System.out.print("\nC. Susu SGM");
        System.out.print("\n  1. Ukuran Kecil");
        System.out.print("\n  2. Ukuran Sedang");
        System.out.print("\n  3. Ukuran Besar");
        System.out.println("");
        
        
        System.out.print("Masukkan Merk Susu (A/B/C): ");
        String merkInput = input.next().toUpperCase();
        char kodeProduk = merkInput.charAt(0);
        
        System.out.print("Masukkan Ukuran (1/2/3): ");
        String ukuranInput = input.next().toUpperCase();
        int kodeUkuran = ukuranInput.charAt(0) - '0'; 
        
        System.out.print("Masukkan jumlah yang dibeli: ");
        int jumlahBeli = input.nextInt();


        double hargaSatuan = 0;
        String namaProduk = "";
        String ukuran = "";
        
        switch(kodeProduk) {
                case 'A':
                namaProduk = "Dancow";
                  break;
                case 'B':
                namaProduk = "Bendera";
                  break;
                case 'C':
                namaProduk = "SGM";
                  break;
                default:
                System.out.println("Kode ukuran tidak valid!");
                input.close();
                return;
              }
                
        switch(kodeUkuran) {
                case 1:
                ukuran = "Kecil";
                if (kodeProduk == 'A') hargaSatuan = 15000;
                else if (kodeProduk == 'B') hargaSatuan = 130000;
                else if (kodeProduk == 'C') hargaSatuan = 15000;

                  break;
                case 2:
                ukuran = "Sedang";
                if (kodeProduk == 'A') hargaSatuan = 20000;
                else if (kodeProduk == 'B') hargaSatuan = 17000;
                else if (kodeProduk == 'C') hargaSatuan = 18000;
                  break;
                case 3:
                ukuran = "Besar";
                if (kodeProduk == 'A') hargaSatuan = 250000;
                else if (kodeProduk == 'B') hargaSatuan = 20000;
                else if (kodeProduk == 'C') hargaSatuan = 27000;
                  // code block
                  break;
                default:
                System.out.println("Kode ukuran tidak valid!");
                input.close();
                return;
              }

        double totalBelanja = hargaSatuan * jumlahBeli;
        double totalBayar = totalBelanja;
                
        System.out.println("Masukan Merk Susu [Dancow | Bendera | SGM] :" + kodeProduk);
        System.out.println("Masukan Ukuran Kaleng [Kecil | Sedang | Besar]" + kodeUkuran);
        System.out.println("Harga Satuan Barang  : Rp" + hargaSatuan);
        System.out.println("Jumlah Yang di beli" + totalBelanja);
        System.out.println("harga Yang Harus dibayar Sebesar : Rp " + totalBayar);
                
        input.close();
    }
}
    

