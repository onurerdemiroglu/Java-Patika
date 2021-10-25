import java.util.Scanner;
/*
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı
"For Döngüsü" kullanarak yapınız.
-Onur ERDEMİROĞLU-
*/

public class Main {
    public static void main(String[] args) {
        int x, y, number;
        Scanner Input = new Scanner(System.in);

        System.out.print("xʸ işlemini yapmak için;\nx değerini giriniz: ");
        x = Input.nextInt();
        System.out.print("y değerini giriniz : ");
        y = Input.nextInt();

        number = x;
        for (int i = 1; i < y; i++) {
            number = number * x;
        }
        System.out.println(number);
    }
}
