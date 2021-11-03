import java.util.Scanner;

/*
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
Örnek : 1643 = 1 + 6 + 4 + 3 = 14
-Onur ERDEMİROĞLU-
*/

public class Main {
    public static void main(String[] args) {

        int number, digitValue, result = 0;

        Scanner Input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        number = Input.nextInt();

        while (number != 0) {
            digitValue = number % 10;
            result += digitValue;
            number /= 10;
        }
        System.out.println("Basamakları Toplamı : " + result);
    }
}
