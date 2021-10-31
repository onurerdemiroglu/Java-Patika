import java.util.Scanner;

/*
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini
"Recursive" metot kullanarak yapan programı yazınız.
Onur ERDEMİROĞLU
*/
public class Main {
    public static void main(String[] args) {
        int result, base, exponent;
        Scanner Input = new Scanner(System.in);

        System.out.print("Taban değerini giriniz : ");
        base = Input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        exponent = Input.nextInt();

        System.out.println("Sonuç : " + power(base, exponent));
    }

    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }
}
