import java.util.Scanner;
public class LayananAkademikSIAKAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan antrian = new AntrianLayanan(5);
        int pilihan;
        do { 
            System.out.println("\n=== Menu Antrian Layanan Akademik ====");
            System.out.println("1. Tambah Mahasisea ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalama Antrian");
            System.out.println("6. Cek Antrian paling belakang");
            System.out.println("0. Keluar");
            System.out.println("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("NIM: ");
                    String nim = sc.nextLine();
                    System.out.println("Nama: ");
                    String nama = sc.nextLine();
                    System.out.println("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.println("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa01 mhs = new Mahasiswa01(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa01 dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.println("Melayani mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 6:
                    antrian.LihatAkhir();
                    break;
                case 0:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0);
    }
}
