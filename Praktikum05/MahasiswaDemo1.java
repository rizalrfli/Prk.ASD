import java.util.Scanner;
public class MahasiswaDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = sc2.nextLine();
            System.out.print("Nama: ");
            String nama = sc2.nextLine();
            System.out.print("Kelas: ");            
            String kelas = sc2.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            Mahasiswa mhs = new Mahasiswa(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }
        
        System.out.println("Data Mahasiswa Sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa Setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC): ");
        list.insertionSort();
        list.tampil();
    }
}
