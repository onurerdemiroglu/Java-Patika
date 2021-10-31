import java.util.Scanner;
/*
Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
Onur ERDEMİROĞLU
*/
public class Main {
    public static void main(String[] args) {
        int number;
        Scanner Input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        number = Input.nextInt();

        System.out.println(number + " sayısı " + (primeNumber(number, 2) ? "ASALDIR!" : "ASAL DEĞİLDİR!"));

    }
    static boolean primeNumber(int number, int div) {
        if (number % div == 0 && number > div || number < 2) {
            return false;
        }
        if (number % div == 0) {
            return true;
        }
        return primeNumber(number, div + 1);
    }
}
