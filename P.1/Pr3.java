import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] mk = new String[3];
        String[] nilaiHuruf = new String[mk.length]; 
        int[] nilaiAngka = new int[mk.length];
        double[] nilaiSetara = new double[mk.length];
        int[] sks = new int[mk.length];
        System.out.println("Program Menghitung IP Semester");
        System.out.println("-------------------------------");
        for (int i = 0; i < mk.length; i++) {
            System.out.print("Masukkan Mata Kuliah ke-" + (i + 1) + " : ");
            mk[i] = sc.nextLine();
        }
        for (int i = 0; i < nilaiAngka.length; i++) {
            System.out.print("Masukkan Nilai Angka Mata Kuliah " + mk[i] + " : ");
            nilaiAngka[i] = sc.nextInt();
        }

        for (int i = 0; i < sks.length; i++) {
            System.out.print("Masukkan SKS Mata Kuliah " + mk[i] + " : ");
            sks[i] = sc.nextInt();
        }
        System.out.println("-------------------------------");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("-------------------------------");
        System.out.println("Mata Kuliah\tNilai Huruf\tNilai Angka\tSKS\tBobot Nilai");
        for (int i = 0; i < mk.length; i++) {
            if (nilaiAngka[i] < 0 || nilaiAngka[i] > 100) {
                System.out.println("Nilai tidak valid untuk " + mk[i]);
                continue;
            }
            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }
            System.out.println(mk[i] + "\t\t" + nilaiHuruf[i] + "\t\t" + nilaiAngka[i] + "\t\t" + sks[i] + "\t\t" + nilaiSetara[i]);
        }

        System.out.println("-------------------------------");
        double totalBobot = 0, totalSKS = 0;
        for (int i = 0; i < mk.length; i++) {
            totalBobot += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        if (totalSKS > 0) {
            double ipk = totalBobot / totalSKS;
            System.out.printf("IP Semester Anda: %.2f\n", ipk);
        } else {
            System.out.println("Tidak ada SKS yang valid untuk perhitungan IP.");
        }
        sc.close();
    }
}
