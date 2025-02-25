import java.util.Scanner;
public class MatakuliahDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();

        Matakuliah01 [] arrayOfMatakuliah = new Matakuliah01[jumlahMatkul];
        String kode, nama, dummy;
        int sks, jumlahJam;
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukkan data Mahasiswa ke- " + (i+1) + " :");
            System.out.print("Kode\t: ");
            kode= sc.nextLine();
            sc.nextLine();
            System.out.print("Nama\t: ");
            nama = sc.nextLine();
            System.out.print("Sks\t: ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam\t: ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------------");

            arrayOfMatakuliah [i] = new Matakuliah01(kode, nama, sks, jumlahJam);
            arrayOfMatakuliah [i].tambahData("ASW8", "Algoritma dan Struktur Data", 9, 10);
        }
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1) + " :");
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
