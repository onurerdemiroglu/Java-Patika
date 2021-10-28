import java.util.Scanner;
/*
Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program
Onur ERDEMİROĞLU
*/
public class Main {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.print("Bir değer giriniz : ");
        int enteredVal = Input.nextInt();


        System.out.println(palindrom(enteredVal) ? enteredVal + " sayısı bir polindrom sayıdır." :
                enteredVal + " sayısı bir polindrom sayısı değildir.");

        //palindromWithChar(enteredVal);

    }

    static boolean palindrom(int enteredVal) {
        int temp = enteredVal, reverse = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverse = reverse * 10 + lastNumber;
            temp /= 10;
        }
        return enteredVal == reverse;
    }

    static void palindromWithChar(int enteredVal) {
        String entered2string = enteredVal + "";
        StringBuilder reverse = new StringBuilder();

        for (int j = entered2string.length() - 1; j >= 0; j--) { //Stringe çevirdiğimiz değeri tersten yazıyoruz
            reverse.append(entered2string.charAt(j));
        }
        if (enteredVal == Integer.parseInt(reverse.toString())) {
            System.out.println(enteredVal + " sayısı bir polindrom sayıdır.");
        } else {
            System.out.println(enteredVal + " sayısı bir polindrom sayısı değildir.");
        }
    }
}
