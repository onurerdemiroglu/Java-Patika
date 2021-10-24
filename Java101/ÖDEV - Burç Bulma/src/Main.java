import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ay, gun;
        Scanner Input = new Scanner(System.in);

        System.out.print("Doğduğunuz ay : ");
        ay = Input.nextInt();
        System.out.print("Doğduğunuz gün : ");
        gun = Input.nextInt();

        if ((ay == 1 && 22 <= gun && gun <= 31) || (ay == 2 && 1 <= gun && gun <= 19)) {
            System.out.println("Burcunuz Kova");
        } else if ((ay == 2 && 20 <= gun && gun <= 28) || (ay == 3 && 1 <= gun && gun <= 20)) {
            System.out.println("Burcunuz Balık");
        } else if ((ay == 3 && 21 <= gun && gun <= 31) || (ay == 4 && 1 <= gun && gun <= 20)) {
            System.out.println("Burcunuz Koç");
        } else if ((ay == 4 && 21 <= gun && gun <= 30) || (ay == 5 && 1 <= gun && gun <= 21)) {
            System.out.println("Burcunuz Boğa");
        } else if ((ay == 5 && 22 <= gun && gun <= 31) || (ay == 6 && 1 <= gun && gun <= 22)) {
            System.out.println("Burcunuz İkizler");
        } else if ((ay == 6 && 23 <= gun && gun <= 30) || (ay == 7 && 1 <= gun && gun <= 22)) {
            System.out.println("Burcunuz Yengeç");
        } else if ((ay == 7 && 23 <= gun && gun <= 31) || (ay == 8 && 1 <= gun && gun <= 22)) {
            System.out.println("Burcunuz Aslan");
        } else if ((ay == 8 && 23 <= gun && gun <= 31) || (ay == 9 && 1 <= gun && gun <= 22)) {
            System.out.println("Burcunuz Başak");
        } else if ((ay == 9 && 23 <= gun && gun <= 30) || (ay == 10 && 1 <= gun && gun <= 22)) {
            System.out.println("Burcunuz Terazi");
        } else if ((ay == 10 && 23 <= gun && gun <= 31) || (ay == 11 && 1 <= gun && gun <= 21)) {
            System.out.println("Burcunuz Akrep");
        } else if ((ay == 11 && 22 <= gun && gun <= 30) || (ay == 12 && 1 <= gun && gun <= 21)) {
            System.out.println("Burcunuz Yay");
        } else if ((ay == 12 && 22 <= gun && gun <= 31) || (ay == 1 && 1 <= gun && gun <= 21)) {
            System.out.println("Burcunuz Oğlak");
        }
    }
}
