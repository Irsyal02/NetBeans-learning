import java.util.Scanner;

public class ManajemenNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Input jumlah kelas, mahasiswa, dan semester
        System.out.print("Masukkan jumlah Kelas: ");
        int jmlKelas = input.nextInt();
        System.out.print("Masukkan jumlah Mahasiswa per kelas: ");
        int jmlMahasiswa = input.nextInt();
        System.out.print("Masukkan jumlah Semester: ");
        int jmlSemester = input.nextInt();

        // Inisialisasi Array 3 Dimensi: nilai[kelas][mahasiswa][semester]
        double[][][] nilai = new double[jmlKelas][jmlMahasiswa][jmlSemester];

        System.out.println("\n--- Input Data Nilai ---");
        // 2. Mengisi nilai mahasiswa
        for (int i = 0; i < jmlKelas; i++) {
            for (int j = 0; j < jmlMahasiswa; j++) {
                for (int k = 0; k < jmlSemester; k++) {
                    System.out.printf("Nilai Kelas %d, Mahasiswa %d, Semester %d: ", (i + 1), (j + 1), (k + 1));
                    nilai[i][j][k] = input.nextDouble();
                }
            }
            System.out.println(); // Spasi antar kelas
        }

        // 3. Menampilkan seluruh data nilai
        System.out.println("--- Seluruh Data Nilai ---");
        for (int i = 0; i < jmlKelas; i++) {
            System.out.println("Kelas " + (i + 1) + ":");
            for (int j = 0; j < jmlMahasiswa; j++) {
                System.out.print("  Mahasiswa " + (j + 1) + ": ");
                for (int k = 0; k < jmlSemester; k++) {
                    System.out.print(nilai[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        // 4. Menghitung rata-rata nilai per kelas
        System.out.println("\n--- Rata-rata Nilai Per Kelas ---");
        for (int i = 0; i < jmlKelas; i++) {
            double totalPerKelas = 0;
            int jumlahDataPerKelas = jmlMahasiswa * jmlSemester;

            for (int j = 0; j < jmlMahasiswa; j++) {
                for (int k = 0; k < jmlSemester; k++) {
                    totalPerKelas += nilai[i][j][k];
                }
            }

            double rataRata = totalPerKelas / jumlahDataPerKelas;
            System.out.printf("Rata-rata Kelas %d: %.2f\n", (i + 1), rataRata);
        }

        input.close();
    }
}



