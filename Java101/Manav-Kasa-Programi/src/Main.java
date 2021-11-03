import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
        double toplamTutar,armutFiyat=2.14,elmaFiyat=3.67,domatesFiyat=1.11,muzFiyat=0.95,patlicanFiyat=5.00;

        Scanner Input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        armutKg=Input.nextInt();
        System.out.print("Elma Kaç Kilo ? : ");
        elmaKg=Input.nextInt();
        System.out.print("Domates Kaç Kilo ? : ");
        domatesKg=Input.nextInt();
        System.out.print("Muz Kaç Kilo ? : ");
        muzKg=Input.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKg=Input.nextInt();

        toplamTutar=(armutKg * armutFiyat)+
                    (elmaKg * elmaFiyat)+
                    (domatesKg * domatesFiyat)+
                    (muzKg * muzFiyat)+
                    (patlicanKg * patlicanFiyat);

        System.out.println("Toplam Tutar : "+toplamTutar + " ₺");
    }
}
