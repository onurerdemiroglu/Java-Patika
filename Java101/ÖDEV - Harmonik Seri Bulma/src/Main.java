import java.util.Scanner;

/*
Java ile girilen sayının harmonik serisini bulan program
-Onur ERDEMİROĞLU-
*/

public class Main {
    public static void main(String[] args) {
        int number;
        double result = 0.0;

        Scanner Input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        number = Input.nextInt();

        for (double i = 1; i <= number; i++) {
            result += (1 / i);
        }
        System.out.println("Harmonik Serinin Sonucu : " +result);

    }
}
