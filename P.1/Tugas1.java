import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        while (true) {
            menu();
            System.out.print("Masukkan pilihan (1-4): ");
            int pilihan = sc.nextInt();
            
            if (pilihan == 4) {
                System.out.println("Terima kasih telah menggunakan program ini!");
                break;
            }
            
            if (pilihan >= 1 && pilihan <= 3) {
                System.out.print("Masukkan panjang sisi kubus: ");
                double sisi = sc.nextDouble();
                
                if (pilihan == 1) {
                    hitungVolume(sisi);
                } else if (pilihan == 2) {
                    hitungLuasPermukaan(sisi);
                } else if (pilihan == 3) {
                    hitungKeliling(sisi);
                }
            } else {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }
    public static void menu() {
        System.out.println("\nPilih perhitungan:");
        System.out.println("1. Volume Kubus");
        System.out.println("2. Luas Permukaan Kubus");
        System.out.println("3. Keliling Kubus");
        System.out.println("4. Keluar");
    }
    public static void hitungVolume(double sisi) {
        double volume = sisi * sisi * sisi;
        System.out.println("Volume kubus: " + volume);
    }
    public static void hitungLuasPermukaan(double sisi) {
        double luas = 6 * (sisi * sisi);
        System.out.println("Luas permukaan kubus: " + luas);
    }
    public static void hitungKeliling(double sisi) {
        double keliling = 12 * sisi;
        System.out.println("Keliling kubus: " + keliling);
    }
}
