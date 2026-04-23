import java.util.Scanner;

public class HitungParkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah kendaraan: ");
        int jumlahKendaraan = input.nextInt();
        
        long totalPendapatan = 0;

        for (int i = 1; i <= jumlahKendaraan; i++) {
            System.out.print("Lama parkir kendaraan ke-" + i + " (jam): ");
            int lamaParkir = input.nextInt();
            int biaya = 0;

            if (lamaParkir <= 2) {
                biaya = 5000;
            } else {
                // 5000 untuk 2 jam pertama + 3000 per jam sisanya
                biaya = 5000 + (lamaParkir - 2) * 3000;
            }
            
            System.out.println("Biaya kendaraan ke-" + i + ": Rp" + biaya);
            totalPendapatan += biaya;
        }

        System.out.println("-----------------------------------");
        System.out.println("Total Pendapatan Hari Ini: Rp" + totalPendapatan);
    }
}




public class DeretFibonacci {
    public static void main(String[] args) {
        int n = 9; // Jumlah bilangan yang ingin ditampilkan sesuai soal
        int n1 = 1, n2 = 1;

        System.out.print("Deret Fibonacci: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(n1 + (i == n ? "" : ", "));
            
            int berikutnya = n1 + n2;
            n1 = n2;
            n2 = berikutnya;
        }
    }
}


public class BilanganPrima {
    public static void main(String[] args) {
        int batas = 20; // Mencari prima hingga angka 19 sesuai soal
        System.out.print("Bilangan Prima: ");

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
