import java.util.Scanner;
public class MahasiswaDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa01[] arrayofMahasiswa01 = new Mahasiswa01[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayofMahasiswa01 [i] = new Mahasiswa01();

            System.out.println("Masukkan data Mahasiswa ke- " + (i+1) + " :");
            System.out.print("NIM\t: ");
            arrayofMahasiswa01 [i].nim = sc.nextLine();
            System.out.print("Nama\t: ");
            arrayofMahasiswa01 [i].nama = sc.nextLine();
            System.out.print("Kelas\t: ");
            arrayofMahasiswa01 [i].kelas = sc.nextLine();
            System.out.print("IPK\t: ");
            dummy = sc.nextLine();
            arrayofMahasiswa01 [i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------------");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1) + " :");
            arrayofMahasiswa01[i].cetakInfo();
        }
    }   
}
