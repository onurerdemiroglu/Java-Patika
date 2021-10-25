import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberOfDigits;
        Scanner Input = new Scanner(System.in);

        System.out.print("Bir değer giriniz : ");
        numberOfDigits = Input.nextInt();

        /*
         k = Sol taraftan bırakılacak boşluk sayısı
         l = Yıldız sayısı
        */

        for (int i = 0; i <= numberOfDigits; i++) {
            for (int k = 0; k < (numberOfDigits - i); k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= (2 * i + 1); l++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i = numberOfDigits; i > 0; i--) {
            for (int k = (numberOfDigits - i); k >= 0; k--) {
                System.out.print(" ");
            }
            for (int l = (2 * i - 2); l >= 0; l--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
