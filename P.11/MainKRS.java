import java.util.Scanner;
public class MainKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses 2 Mahasiswa");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Cek Jumlah Antrian");
            System.out.println("7. Cek Jumlah Sudah Proses KRS");
            System.out.println("8. Cek Jumlah Belum Proses KRS");
            System.out.println("9. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa m = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.enqueue(m);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.print();
                    break;
                case 4:
                    antrian.peek();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah Antrian: " + antrian.getJumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah Mahasiswa Sudah KRS: " + antrian.getJumlahSudahKRS());
                    break;
                case 8:
                    System.out.println("Jumlah Mahasiswa Belum KRS: " + antrian.getJumlahBelumKRS());
                    break;
                case 9:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 9);
    }
}
