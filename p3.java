import java.util.Scanner;

public class ProgramDiskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data dari pengguna
        System.out.print("Masukkan Total Belanja: ");
        double totalBelanja = input.nextDouble();

        System.out.print("Status Member (G/S/N): ");
        char statusMember = input.next().toUpperCase().charAt(0);

        System.out.print("Memiliki Voucher? (true/false): ");
        boolean punyaVoucher = input.nextBoolean();

        double diskonPersen = 0;

        // Logika Aturan Diskon berdasarkan Status Member
        if (statusMember == 'G') { // Gold
            if (totalBelanja >= 200000) {
                diskonPersen = 20;
            }
        } else if (statusMember == 'S') { // Silver
            if (totalBelanja >= 150000) {
                diskonPersen = 10;
            }
        } else if (statusMember == 'N') { // Non-member
            if (totalBelanja >= 100000) {
                diskonPersen = 5;
            }
        }

        // Tambahan diskon jika punya voucher
        if (punyaVoucher) {
            diskonPersen += 5;
        }

        // Batasan Maksimal Diskon Total (35%)
        if (diskonPersen > 35) {
            diskonPersen = 35;
        }

        // Perhitungan Akhir
        double jumlahDiskon = totalBelanja * (diskonPersen / 100);
        double totalBayar = totalBelanja - jumlahDiskon;

        // Output Hasil
        System.out.println("\n--- Rincian Pembayaran ---");
        System.out.println("Total Belanja  : Rp " + totalBelanja);
        System.out.println("Persen Diskon  : " + diskonPersen + "%");
        System.out.println("Potongan Harga : Rp " + jumlahDiskon);
        System.out.println("Total Bayar    : Rp " + totalBayar);
        
        input.close();
    }
}

