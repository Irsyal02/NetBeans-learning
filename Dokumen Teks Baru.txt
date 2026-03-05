/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan1;

/**
 *
 * @author MAHASISWA
 */
public class Latihan1 {
 String jenis,warna;
 int usia;
}
        
class main{
    public static void main(String[] args) {
        Latihan1 burung_elang = new Latihan1();
        
        burung_elang.jenis = "Elang sunda";
        burung_elang.warna = "Hitam";
        burung_elang.usia = 5;
                
        System.out.println("Jenis Burung" + burung_elang.jenis);
        System.out.println("Warna Burung" + burung_elang.warna);
        System.out.println("Usia Burung" + burung_elang.usia + "Tahun");
    }
    

}





package sebastianrinaldi;

import java.util.Scanner;

public class Sebastianrinaldi {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data dari keyboard
        System.out.print("Masukan Nama Siswa: ");
        String nama_siswa = scanner.nextLine();

        System.out.print("Nilai UTS: ");
        double nilai_uts = scanner.nextDouble();

        System.out.print("Nilai UAS: ");
        double nilai_uas = scanner.nextDouble();

        System.out.print("Nilai Tugas Mandiri: ");
        double nilai_tugas = scanner.nextDouble();

        // Menghitung nilai murni
        double nilai_murni_uts = nilai_uts * 0.35;
        double nilai_murni_uas = nilai_uas * 0.45;
        double nilai_murni_tugas = nilai_tugas * 0.20;

        // Menghitung nilai akhir
        double nilai_akhir = nilai_murni_uts + nilai_murni_uas + nilai_murni_tugas;

        // Menampilkan hasil
        System.out.println("Nilai Murni yang diperoleh:");
        System.out.println("Nilai Murni UTS: " + nilai_murni_uts);
        System.out.println("Nilai Murni UAS: " + nilai_murni_uas);
        System.out.println("Nilai Murni Tugas: " + nilai_murni_tugas);
        System.out.println("Nilai Akhir yang diperoleh yaitu: " + nilai_akhir);

        scanner.close();
    }
}





package sebastianrinaldi;

import java.util.Scanner;

public class sebastianrinaldi2 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Harga Barang:");
        System.out.print("Harga Barang (Rp.): ");
        double hargaBarang = scanner.nextDouble();

        System.out.println("Diskon:");
        System.out.print("Diskon (%): ");
        double diskonPersen = scanner.nextDouble();

        double diskon = (diskonPersen / 100) * hargaBarang;
        double totalHarga = hargaBarang - diskon;

        System.out.println("Total Harga: Rp." + totalHarga);

        scanner.close();
    }
}
