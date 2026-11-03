
import java.util.Scanner;
class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah ruang baca : ");
        int jumlahRuang = input.nextInt();

        System.out.print("Jumlah hari       : ");
        int jumlahHari = input.nextInt();

        if (jumlahRuang <= 0 || jumlahHari <= 0) {

            System.out.println(
                "Jumlah ruang dan hari harus > 0!"
            );

        } else {

            int totalSeluruhPengunjung = 0;
            int ruangPalingRamai = 1;
            int pengunjungTerbanyak = -1;
            int hariRamai = 0;

            for (int ruang = 1; ruang <= jumlahRuang; ruang++) {
                int totalRuang = 0;
                System.out.println("Ruang " + ruang);
                int hari = 1;
                while (hari <= jumlahHari) {

                    int pengunjung;
                    do {

                        System.out.print(
                            "Pengunjung hari ke-" + hari + " : "
                        );

                        pengunjung = input.nextInt();

                        if (pengunjung < 0) {
                            System.out.println(
                                "Tidak boleh negatif. Ulangi input!"
                            );
                        }

                    } while (pengunjung < 0);
                    totalRuang += pengunjung;
                    totalSeluruhPengunjung += pengunjung;

                    if (pengunjung > 50) {
                        hariRamai++;
                    }

                    hari++;
                }

                double rataRata = (double) totalRuang / jumlahHari;

                System.out.println(
                    "Ruang " + ruang + " - total: " + totalRuang
                    + ", rata-rata per hari: " + rataRata
                );

                if (totalRuang > pengunjungTerbanyak) {

                    pengunjungTerbanyak = totalRuang;
                    ruangPalingRamai = ruang;
                }
            }

            System.out.println("==============================");
            System.out.println(
                "Total seluruh pengunjung : "
                + totalSeluruhPengunjung
            );

            System.out.println(
                "Ruang paling ramai        : "
                + ruangPalingRamai
            );

            System.out.println(
                "Hari ramai (> 50)         : "
                + hariRamai
            );
        }
        input.close();
    }
}
