import java.util.Scanner;
public class MainSurat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat1 stack = new StackSurat1(10);
        int pilihan;
        do {
            System.out.println("\n===== MENU SURAT IZIN =====");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat\t: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa\t: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas\t\t: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi Izin (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat1 srt = new Surat1(id, nama, kelas, jenis, durasi);
                    stack.push(srt);
                    break;
                case 2:
                    Surat1 diproses = stack.pop();
                    if (diproses != null) diproses.print();
                    break;
                case 3:
                    Surat1 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat Terakhir:");
                        terakhir.print();
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = sc.nextLine();
                    stack.cariSurat(cariNama);
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);
    }
}
