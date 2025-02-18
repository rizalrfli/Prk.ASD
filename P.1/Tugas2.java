import java.util.Scanner;

public class Tugas2 {
    static String[] namaMataKuliah;
    static int[] sks;
    static int[] semester;
    static String[] hariKuliah;
    static int jumlahMataKuliah;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        jumlahMataKuliah = sc.nextInt();
        sc.nextLine();

        namaMataKuliah = new String[jumlahMataKuliah];
        sks = new int[jumlahMataKuliah];
        semester = new int[jumlahMataKuliah];
        hariKuliah = new String[jumlahMataKuliah];

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("\nMasukkan data untuk mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = sc.nextLine();
        }

        int pilihan;
        do {
            System.out.println("\n===== MENU JADWAL KULIAH =====");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal();
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang dicari: ");
                    String hari = sc.nextLine();
                    tampilkanJadwalBerdasarkanHari(hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang dicari: ");
                    int sem = sc.nextInt();
                    tampilkanJadwalBerdasarkanSemester(sem);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String nama = sc.nextLine();
                    cariMataKuliah(nama);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while (pilihan != 5);

        sc.close();
    }

      static void tampilkanSeluruhJadwal() {
        System.out.println("\n===== SELURUH JADWAL KULIAH =====");
        System.out.printf("%-30s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "SKS", "Semester", "Hari Kuliah");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            tampilkanDetailMataKuliah(i);
        }
    }

      static void tampilkanJadwalBerdasarkanHari(String hari) {
        System.out.println("\n===== JADWAL KULIAH HARI " + hari.toUpperCase() + " =====");
        boolean ditemukan = false;
        System.out.printf("%-30s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "SKS", "Semester", "Hari Kuliah");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                tampilkanDetailMataKuliah(i);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah pada hari " + hari);
        }
    }

      static void tampilkanJadwalBerdasarkanSemester(int sem) {
        System.out.println("\n===== JADWAL KULIAH SEMESTER " + sem + " =====");
        boolean ditemukan = false;
        System.out.printf("%-30s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "SKS", "Semester", "Hari Kuliah");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            if (semester[i] == sem) {
                tampilkanDetailMataKuliah(i);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah pada semester " + sem);
        }
    }

      static void cariMataKuliah(String nama) {
        System.out.println("\n===== HASIL PENCARIAN MATA KULIAH =====");
        boolean ditemukan = false;
        System.out.printf("%-30s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "SKS", "Semester", "Hari Kuliah");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            if (namaMataKuliah[i].equalsIgnoreCase(nama)) {
                tampilkanDetailMataKuliah(i);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah '" + nama + "' tidak ditemukan.");
        }
    }

     static void tampilkanDetailMataKuliah(int index) {
        System.out.printf("%-30s %-5d %-10d %-10s\n", namaMataKuliah[index], sks[index], semester[index], hariKuliah[index]);
    }
}
