import java.util.Scanner;

/*
Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı yazınız.
Onur ERDEMİROĞLU
*/
public class Main {
    public static void main(String[] args) {
        int number, positiveInt = 0;
        Scanner Input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        number = Input.nextInt();

        for (int i = 1; i < number; i++) { //Pozitif tamsayı çarpanlarını bulmak için
            if (number % i == 0) {
                positiveInt += i;
            }
        }
        if (positiveInt == number) {
            System.out.println(number + " Mükemmel sayıdır.");
        } else {
            System.out.println(number + " Mükemmel sayı değildir.");
        }
    }
}
