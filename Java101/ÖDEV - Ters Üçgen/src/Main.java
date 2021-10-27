import java.util.Scanner;

/*
Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
Onur ERDEMİROĞLU
*/
public class Main {
    public static void main(String[] args) {
        int numberOfDigits;

        Scanner Input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        numberOfDigits = Input.nextInt();

        for (int i = 1; i <= numberOfDigits; i++) {
            for (int l = 0; l < i; l++) {
                System.out.print(" ");
            }
            for (int k = 2 * numberOfDigits + 1; k > 2 * i; k--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
