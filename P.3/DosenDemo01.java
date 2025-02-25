import java.util.Scanner;
public class DosenDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan jumlah dosen: ");
        int jmlDosen = sc.nextInt();
        sc.nextLine();
        Dosen01 [] daftarDosen = new Dosen01[jmlDosen];

        for (int i = 0; i < jmlDosen; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode dosen\t: ");
            String kode = sc.nextLine();
            System.out.print("Nama dosen\t: ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin\t: ");
            boolean jenisKelamin = sc.nextBoolean();
            System.out.print("Usia\t\t: ");
            int usia = sc.nextInt();
            System.out.println("------------------------------------");
            sc.nextLine();

            daftarDosen[i] = new Dosen01(kode, nama, jenisKelamin, usia);
        }
        DataDosen01 dataDosen = new DataDosen01();
        dataDosen.dataSemuaDosen(daftarDosen);
        dataDosen.jumlahDosenPerJenisKelamin(daftarDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        dataDosen.infoDosenPalingMuda(daftarDosen);
        dataDosen.infoDosenPalingTua(daftarDosen);
    }
}
