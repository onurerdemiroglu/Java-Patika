import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int birinciDeger,ikinciDeger,islemSecim;
        Scanner Input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        birinciDeger=Input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        ikinciDeger=Input.nextInt();
        System.out.print("Yapmak istediğiniz matematik işlemini seçiniz.\n" +
                "1-Toplama\n"+
                "2-Çıkarma\n"+
                "3-Çarpma\n"+
                "4-Bölme\n");
        System.out.print("Seçiminiz : ");
        islemSecim=Input.nextInt();
        switch (islemSecim)
        {
            case(1): {
                System.out.print("Toplama işlemi sonucu : " +(birinciDeger+ikinciDeger));
                break;
            }
            case(2): {
                System.out.print("Çıkarma işlemi sonucu : " +(birinciDeger-ikinciDeger));
                break;
            }
            case(3): {
                System.out.print("Çarpma işlemi sonucu : " +(birinciDeger*ikinciDeger));
                break;
            }
            case(4): {
                System.out.print((ikinciDeger == 0) ? "Sayı sıfıra bölünemez." :"Bölme işlemi sonucu : "
                        +(birinciDeger/ikinciDeger));
                break;
            }
            default:
            {
                System.out.print("Yanlış işlem seçimi yaptınız. Tekrar deneyiniz.");
            }
        }

    }
}
