package irsal;

import java.util.Scanner;

public class irsal {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        String nama;
        double tugas, uts, uas, nilaiAkhir;
        
        System.out.print("Masukan Nama Siswa :");
        nama = input.nextLine(); 
        System.out.print("Masukan Nilai tugas :");
        tugas = input.nextDouble();
        System.out.print("Masukan Nilai UTS:");
        uts = input.nextDouble();
        System.out.print("Masukan Nilai UAS:");
        uas = input.nextDouble();
        
        nilaiAkhir = (0.3 * tugas) + (0.3 * uts) + (0.4 * uas);
        
        System.out.println("Nama Siswa :" + nama);
        System.out.println("Nilai Tugas :" + tugas);
        System.out.println("Nilai UTS :" + uts);
        System.out.println("Nilai UAS:" + uas);
        System.out.println("Nilai Akhir:" + nilaiAkhir);
     

        if (nilaiAkhir > 75){
            System.out.println("Keterangan: LULUS");
            
        } else {
            System.out.println("Keterangan: TIDAK LULUS");
        }
        // TODO code application logic here
    }// TODO code application logic here
    }
    
