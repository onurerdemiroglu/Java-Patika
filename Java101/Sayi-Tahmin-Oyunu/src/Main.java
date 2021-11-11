import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının tahmin
etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapınız.
Onur ERDEMİROĞLU
*/

public class Main {
    public static void main(String[] args) {
        int number, prediction, right = 0;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        Scanner Input = new Scanner(System.in);

        Random random = new Random();
        number = random.nextInt(100);


        System.out.println("Sayı Tahmin Oyunumuz Başladı!");
        System.out.println("0-100 Arasında rastgele sayımız seçildi.\n");


        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            prediction = Input.nextInt();

            if (prediction < 0 || prediction > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (prediction == number) {
                System.out.println("Tebrikler, doğru tahmin ! Gizli sayımız : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz !");
                if (prediction > number) {
                    System.out.println(prediction + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(prediction + " sayısı, gizli sayıdan küçüktür.");
                }

                wrong[right++] = prediction;
                System.out.println("Kalan hakkınız : " + (5 - right));
            }
        }


        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }

    }
}
