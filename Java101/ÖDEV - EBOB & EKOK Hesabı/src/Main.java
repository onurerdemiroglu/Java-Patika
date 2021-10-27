import java.util.Scanner;

/*
Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
Onur ERDEMİROĞLU
*/

public class Main {
    public static void main(String[] args) {
        int ebobResult, ekokResult, firstNumber, secondNumber;

        Scanner Input = new Scanner(System.in);

        System.out.print("Birinci Sayıyı giriniz : ");
        firstNumber = Input.nextInt();
        System.out.print("İkinci Sayıyı giriniz : ");
        secondNumber = Input.nextInt();

        ebobResult = mathEbob(firstNumber, secondNumber);
        System.out.println("Bu sayıların ortak bölenlerin en büyüğü[EBOB] :" + ebobResult);
        ekokResult = mathEkok(firstNumber, secondNumber);
        System.out.println("Bu sayıların ortak katlarının en küçüğü[EKOK] :" + ekokResult);

        /*
        --- EBOB bilinen sayıların EKOK değerlerini formül ile bulma -> EKOK=(x*y)/EBOB ---
        ekokResult = mathEkokWithEbob(ebobResult,firstNumber, secondNumber);
        System.out.println("Bu sayıların ortak katlarının en küçüğü[EKOK] :" + ekokResult);
        */
    }

    private static int mathEbob(int firstNumber, int secondNumber) {
        int sNumber, i = 1, ebob = 1;
        if (firstNumber >= secondNumber) {  //Küçük değeri bulma
            sNumber = secondNumber;
        } else {
            sNumber = firstNumber;
        }
        while (true) {
            if (firstNumber % i == 0 && secondNumber % i == 0) { //İki sayı da aynı bölene sahip ise
                ebob = i;
            }
            if (i != sNumber) {  //i değerini en küçük sayıya eşit olana kadar arttırma işlemi
                i++;
            } else {
                break;
            }
        }
        return ebob;
    }

    private static int mathEkok(int firstNumber, int secondNumber) {
        int startFirstValue = firstNumber, startSecValue = secondNumber, ekok = 1;
        while (true) {
            if (firstNumber == secondNumber) {
                ekok = firstNumber;
                break;
            } else if (firstNumber > secondNumber) {
                secondNumber += startSecValue;
            } else {
                firstNumber+=startFirstValue;
            }
        }
        return ekok;
    }

    private static int mathEkokWithEbob(int ebob, int firstNumber, int secondNumber) {
        int ekok;
        ekok = (firstNumber * secondNumber) / ebob;
        return ekok;
    }
}
