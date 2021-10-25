import java.util.Scanner;

/* Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul
        eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayan program */

public class Main {
    public static void main(String[] args) {
        int number,evenNumberSum=0;

        Scanner Input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        number = Input.nextInt();

        while (number % 2 == 0) {
            if (number % 4 == 0) {
                evenNumberSum+=number;
            }
            System.out.print("Sayı giriniz : ");
            number = Input.nextInt();
        }
        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı : " +evenNumberSum);
    }
}
