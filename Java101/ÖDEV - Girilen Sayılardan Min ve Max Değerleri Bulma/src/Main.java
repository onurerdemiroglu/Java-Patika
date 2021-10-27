import java.util.Scanner;

/*
Java ile klavyeden girilen N tane sayma sayısından en büyük
ve en küçük sayıları bulan ve bu sayıları ekrana yazan program.
Onur ERDEMİROĞLU
*/

public class Main {
    public static void main(String[] args) {
        int number, maxNumber = 0, minNumber = 0;

        Scanner Input = new Scanner(System.in);

        System.out.print("Kaç adet sayi gireceksiniz? : ");
        number = Input.nextInt();

        int[] numberArrays = new int[number];

        for (int i = 1; i <= number; i++) {
            System.out.print(i + ". Sayıyı giriniz : ");
            numberArrays[i - 1] = Input.nextInt();
        }

        for (int j = 0; j < numberArrays.length; j++) {
            if (numberArrays[j] < minNumber)
                minNumber = numberArrays[j];
            else if (numberArrays[j] > maxNumber)
                maxNumber = numberArrays[j];
        }

        System.out.println("En büyük sayı : " + maxNumber);
        System.out.println("En küçük sayı : " + minNumber);
    }
}
