import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Tutar,kdvOran = 0.18 ,kdvliTutar;

        Scanner Input = new Scanner(System.in);
        System.out.print("Ücret Tutarınızı Giriniz : ");

        Tutar = Input.nextDouble();
        kdvliTutar = Tutar+Tutar*kdvOran;

        System.out.println("KDV'siz Tutar : " + Tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV'li Tutar : " + kdvliTutar);
        System.out.println("KDV Tutarı : " + (kdvliTutar-Tutar));
    }
}
