import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mesafe, yas, yolculukTipi;
        double mesafeBasinaUcret = 0.10, yasIndirimOrani = 0, tipIndirimi = 0,
                biletIndirimi, toplamTutar, normalTutar, indirimliTutar;

        Scanner Input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = Input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yas = Input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        yolculukTipi = Input.nextInt();

        if (mesafe > 0 && yas > 0) {
            if (yas < 12) {
                yasIndirimOrani = 0.5;
            } else if (yas > 12 && yas < 24) {
                yasIndirimOrani = 0.1;
            } else if (yas > 65) {
                yasIndirimOrani = 0.3;
            }

            if (yolculukTipi == 1) {
                tipIndirimi = 0;
            } else if (yolculukTipi == 2) {
                tipIndirimi = 0.2;
            } else {
                System.out.print("Yolculuk tipini yanlış girdiniz.");
            }

            normalTutar = (mesafe * mesafeBasinaUcret);
            indirimliTutar = normalTutar - (normalTutar * yasIndirimOrani);
            biletIndirimi = indirimliTutar * tipIndirimi;
            toplamTutar = (indirimliTutar - biletIndirimi) * yolculukTipi;

            System.out.print("Toplam Tutar = " + toplamTutar + " ₺");

        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
