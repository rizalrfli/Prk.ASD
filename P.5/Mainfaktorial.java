import java.util.Scanner;
public class Mainfaktorial {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nilai: ");
    int nilai = input.nextInt();
    faktorial fk = new faktorial();
    System.out.println("Nilai faktorial " + nilai + "menggunakan BF: " + fk.faktorialBF(nilai));
    System.out.println("Nilai faktorial " + nilai + "menggunakan DF: " + fk.faktorialDC(nilai));
    }
}
