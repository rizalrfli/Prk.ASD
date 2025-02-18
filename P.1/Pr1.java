import java.util.Scanner;
public class Pr1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("====================");
        System.out.print("Masukkan nilai tugas: ");
        int nilaiTugas = sc.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        int nilaiKuis = sc.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        int nilaiUTS = sc.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        int nilaiUAS = sc.nextInt();
        System.out.println("=====================");
        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai tidak valid");
        } else {
            double nilaiTotal = (0.2*nilaiTugas) + (0.2*nilaiKuis) + (0.3*nilaiUTS) + (0.4*nilaiUAS);
            System.out.println("Nilai Akhir = " + nilaiTotal);
            if (nilaiTotal > 80 && nilaiTotal <= 100) {
                System.out.println("Nilai huruf: A ");
            }
            else if (nilaiTotal > 73 && nilaiTotal <= 80) {
                System.out.println("Nilai huruf: B+");
            }
            else if (nilaiTotal > 65 && nilaiTotal <= 73) {
                System.out.println("Nilai huruf: B");
            }    
            else if (nilaiTotal > 60 && nilaiTotal <= 65) {
                System.out.println("Nilai huruf: C+");
            }
            else if (nilaiTotal > 50 && nilaiTotal <= 60) {
                System.out.println("Nilai huruf: C");
            }
            else if (nilaiTotal > 39 && nilaiTotal <= 50) {
                System.out.println("Nilai huruf: D");
            }
            else {
                System.out.println("Nilai huruf: E");
            }
            System.out.println("===================");
            if ( nilaiTotal > 50){
            System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("MAAF ANDA TIDAK LULUS");
            }
        }
        sc.close();
    }
}