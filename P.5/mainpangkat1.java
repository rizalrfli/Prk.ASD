import java.util.Scanner;
public class mainpangkat1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlahh elemen: ");
        int elemen = input.nextInt();
        pangkat1 [] png = new pangkat1[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i+1) + ": ");
            int basis = input.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke- " + (i+1) + ": ");
            int pangkat = input.nextInt();
            png[i] =  new pangkat1(basis,pangkat);
        }
        System.out.println("HASIL PANGKAT BRUTE FORCE: ");
        for (pangkat1 p : png) {
            System.out.println(p.nilai +"^"+p.pangkat+" : "+p.pangkatBF(p.nilai,p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE CONQUER: ");
        for (pangkat1 p : png) {
            System.out.println(p.nilai +"^"+p.pangkat+" : "+p.pangkatDC(p.nilai,p.pangkat));
        }
    }
}
