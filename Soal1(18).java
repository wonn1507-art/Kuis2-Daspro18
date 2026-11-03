
import java.util.Scanner;
class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah mahasiswa : ");
        int n = input.nextInt();

        double total = 0;
        double rataRata;

        int nilaiTertinggi = 0;
        int nilaiTerendah = 100;

        int tuntas = 0;
        int remidi = 0;

        for (int i = 1; i <= n; i++) {
            int nilai;
            do {
                System.out.print("Nilai tugas ke-" + i + " : ");
                nilai = input.nextInt();

                if (nilai < 0 || nilai > 100) {
                    System.out.println("Nilai harus 0-100. Ulangi input!");
                }

            } while (nilai < 0 || nilai > 100);
            total += nilai;

            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }

            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }

            if (nilai >= 70) {
                tuntas++;
            } else {
                remidi++;
            }
        }

        rataRata = total / n;

        System.out.println("Rata-rata       : " + rataRata);
        System.out.println("Nilai tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai terendah  : " + nilaiTerendah);
        System.out.println("Tuntas (>= 70)  : " + tuntas);
        System.out.println("Remidi          : " + remidi);

        input.close();
    }
}
