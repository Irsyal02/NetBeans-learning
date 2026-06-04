package com.payment;

public class TransferBank implements Payment {
    private double jumlah;

    public TransferBank(double jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran via Transfer Bank sebesar: Rp" + jumlah);
    }

    @Override
    public void cetakStruk() {
        System.out.println("--- STRUK TRANSFER BANK ---");
        System.out.println("Status: BERHASIL");
        System.out.println("Total : Rp" + jumlah);
        System.out.println("---------------------------\n");
    }
}






package com.payment;

public class EWallet implements Payment {
    private double jumlah;

    public EWallet(double jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran via E-Wallet sebesar: Rp" + jumlah);
    }

    @Override
    public void cetakStruk() {
        System.out.println("--- STRUK E-WALLET ---");
        System.out.println("Status: BERHASIL");
        System.out.println("Total : Rp" + jumlah);
        System.out.println("----------------------\n");
    }
}





package com.payment;

public class KartuKredit implements Payment {
    private double jumlah;

    public KartuKredit(double jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran via Kartu Kredit sebesar: Rp" + jumlah);
    }

    @Override
    public void cetakStruk() {
        System.out.println("--- STRUK KARTU KREDIT ---");
        System.out.println("Status: BERHASIL");
        System.out.println("Total : Rp" + jumlah);
        System.out.println("--------------------------\n");
    }
}




import com.payment.Payment;
import com.payment.TransferBank;
import com.payment.EWallet;
import com.payment.KartuKredit;

public class Main {
    public static void main(String[] args) {
        // Membuat objek untuk masing-masing metode pembayaran
        Payment pembayaran1 = new TransferBank(150000);
        Payment pembayaran2 = new EWallet(50000);
        Payment pembayaran3 = new KartuKredit(500000);

        // Menjalankan simulasi Transfer Bank
        pembayaran1.prosesPembayaran();
        pembayaran1.cetakStruk();

        // Menjalankan simulasi E-Wallet
        pembayaran2.prosesPembayaran();
        pembayaran2.cetakStruk();

        // Menjalankan simulasi Kartu Kredit
        pembayaran3.prosesPembayaran();
        pembayaran3.cetakStruk();
    }
}

