import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Tutar,kdvOran,kdvliTutar;

        Scanner Input = new Scanner(System.in);
        System.out.print("Ücret Tutarınızı Giriniz : ");
        Tutar = Input.nextDouble();
        if(Tutar>=0 && Tutar<=1000)
        {
            kdvOran = 0.18;
        }
        else if(Tutar>1000)
        {
            kdvOran = 0.08;
        }
        else
        {
            kdvOran=0;
        }
        kdvliTutar = Tutar+Tutar*kdvOran;

        System.out.println("KDV'siz Tutar : " + Tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV'li Tutar : " + kdvliTutar);
        System.out.println("KDV Tutarı : " + (kdvliTutar-Tutar));
    }
}
