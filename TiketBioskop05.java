import java.util.Scanner;
public class TiketBioskop05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int jumlahTiket, totalTiketTerjual = 0;
        double totalPenjualan = 0;
        int hargaTiket = 50000;
        String jawab = "y";

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik angka negatif untuk keluar): ");
            jumlahTiket = sc.nextInt();
            sc.nextLine();  

            if (jumlahTiket < 0) {
                System.out.println("Program selesai. Terima kasih.");
                break;
            }

            if (jumlahTiket == 0) {
                System.out.println("Jumlah tiket tidak boleh 0. Silakan coba lagi.");
                continue;
            }

            double totalHarga;
            if (jumlahTiket > 10) {
                totalHarga = jumlahTiket * hargaTiket * 0.85; 
            } else if (jumlahTiket > 4) {
                totalHarga = jumlahTiket * hargaTiket * 0.90; 
            } else {
                totalHarga = jumlahTiket * hargaTiket; 
            }

            totalTiketTerjual += jumlahTiket;
            totalPenjualan += totalHarga;

            System.out.println("Total harga untuk " + jumlahTiket + " tiket adalah Rp" + totalHarga);
            System.out.print("Apakah ada transaksi lain? (y/n): ");
            jawab = sc.nextLine();

        } while (jawab.equalsIgnoreCase("y"));

        System.out.println("Total tiket terjual hari ini: " + totalTiketTerjual);
        System.out.println("Total penjualan hari ini: Rp" + totalPenjualan);
    }
}
