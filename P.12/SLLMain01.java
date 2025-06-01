import java.util.Scanner;
public class SLLMain01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SingleLinkedList01 sll = new SingleLinkedList01();
        for (int i = 1; i <= 4; i++) {
            System.out.println("Masukkan data Mahasiswa ke-" + i);
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = Double.parseDouble(sc.nextLine());

            Mahasiswa01 mhs = new Mahasiswa01(nim, nama, kelas, ipk);

            if (i == 1) {
                System.out.println("-- Add First --");
                sll.addFirst(mhs);
            } else if (i == 2) {
                System.out.println("-- Add Last --");
                sll.addLast(mhs);
            } else if (i == 3) {
                System.out.print("Insert Setelah : ");
                String key = sc.nextLine();
                System.out.println("-- Insert setelah " + key + " --");
                sll.insertAfter(key, mhs);
            } else {
                System.out.print("Insert indeks untuk sisipkan : ");
                int index = Integer.parseInt(sc.nextLine());
                System.out.println("-- Insert di index " + index + " --");
                sll.insertAt(index, mhs);
            }

            sll.print();
        }
        System.out.println("\nData index 1 : ");
        sll.getData(1);
        System.out.println("Data mahasiswa an rizal berada di index : " + sll.indexOf("rizal"));
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
