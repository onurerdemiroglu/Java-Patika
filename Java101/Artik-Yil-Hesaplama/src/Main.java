import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;

        Scanner Input = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        yil = Input.nextInt();

        if ((yil % 100) == 0) {
            if ((yil % 400) == 0) {
                System.out.println(yil + " bir artık yıldır !");
            } else {
                System.out.println(yil + " bir artık yıldır değildir !");
            }
        } else {
            if ((yil % 4) == 0) {
                System.out.println(yil + " bir artık yıldır !");
            } else {
                System.out.println(yil + " bir artık yıldır değildir !");
            }
        }
    }
}
