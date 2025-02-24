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
        arrayofMahasiswa01 [0] = new Mahasiswa01();
        arrayofMahasiswa01 [0].nim = "244107060033";
        arrayofMahasiswa01 [0].nama = "Afrizal Rafli";
        arrayofMahasiswa01 [0].kelas = "SIB-1E";
        arrayofMahasiswa01 [0].ipk = (float) 3.75;
        
        arrayofMahasiswa01 [1] = new Mahasiswa01();
        arrayofMahasiswa01 [1].nim = "2341720172";
        arrayofMahasiswa01 [1].nama = "ACHMAD MAULANA HAMZAH";
        arrayofMahasiswa01 [1].kelas = "TI-2A";
        arrayofMahasiswa01 [1].ipk = (float) 3.36;

        arrayofMahasiswa01 [2] = new Mahasiswa01();
        arrayofMahasiswa01 [2].nim = "244107023006";
        arrayofMahasiswa01 [2].nama = "DIRHAMAWAN PUTRANTO";
        arrayofMahasiswa01 [2].kelas = "TI-2E";
        arrayofMahasiswa01 [2].ipk = (float) 3.80;
        System.out.println("NIM\t: " + arrayofMahasiswa01[0].nim);
        System.out.println("Nama\t: " + arrayofMahasiswa01[0].nama);
        System.out.println("Kelas\t: " + arrayofMahasiswa01[0].kelas);
        System.out.println("IPK\t: " + arrayofMahasiswa01[0].ipk);
        System.out.println("--------------------------------------");
        System.out.println("NIM\t: " + arrayofMahasiswa01[1].nim);
        System.out.println("Nama\t: " + arrayofMahasiswa01[1].nama);
        System.out.println("Kelas\t: " + arrayofMahasiswa01[1].kelas);
        System.out.println("IPK\t: " + arrayofMahasiswa01[1].ipk);
        System.out.println("--------------------------------------");
        System.out.println("NIM\t: " + arrayofMahasiswa01[2].nim);
        System.out.println("Nama\t: " + arrayofMahasiswa01[2].nama);
        System.out.println("Kelas\t: " + arrayofMahasiswa01[2].kelas);
        System.out.println("IPK\t: " + arrayofMahasiswa01[2].ipk);
        System.out.println("--------------------------------------");
    }   
}
