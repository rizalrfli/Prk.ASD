import java.util.Scanner;

public class Pr2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input NIM: ");
        int nim = input.nextInt();
        
        nim %= 100;
        if (nim < 10) {
            nim += 10;
        }
        
        System.out.print("OUTPUT: ");
        for (int i = 1; i <= nim; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
        input.close();
    }
}
