import java.util.Scanner;

/*
Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında
ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son
değerini ekrana yazdırın.

Onur ERDEMİROĞLU
*/
public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("N sayısı : ");

        int number = Input.nextInt();
        recMethodMinus(number, number);
    }

    public static int recMethodMinus(int number, int tempNumber) {

        if (number > 0) {
            System.out.print(number + " ");
            return recMethodMinus(number - 5, tempNumber);
        } else {
            return recMethodPlus(number, tempNumber);
        }
    }

    public static int recMethodPlus(int number, int tempNumber) {

        System.out.print(number + " ");
        if (number == tempNumber) {
            return number;
        } else {
            return recMethodPlus(number + 5, tempNumber);
        }
    }
}
