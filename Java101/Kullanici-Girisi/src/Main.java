import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String sysKullaniciAdi="Onur",sysKullaniciSifre="Erdemiroglu",kullaniciAdi,kullaniciSifre,sifirlaOnay,yeniSifre;
        Scanner Input = new Scanner(System.in);

        System.out.print("Lütfen kullanıcı adınızı giriniz : ");
        kullaniciAdi=Input.nextLine();
        System.out.print("Lütfen kullanıcı şifrenizi giriniz : ");
        kullaniciSifre=Input.nextLine();

        if (kullaniciAdi.equals(sysKullaniciAdi) && kullaniciSifre.equals(sysKullaniciSifre))
        {
            System.out.print("Giriş başarılı.");
        }
        else
        {
            System.out.print("Kullanıcı adı veya şifreniz hatalı.\n" +
                    "Şifrenizi sıfırlamak istiyorsanız lütfen evet yazınız. : ");
            sifirlaOnay=Input.nextLine();
            if (sifirlaOnay.equals("evet"))
            {
                System.out.print("Yeni şifre giriniz : ");
                yeniSifre=Input.nextLine();

                while (yeniSifre.equals(sysKullaniciSifre)){
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz : ");
                    yeniSifre = Input.nextLine();
                }

                System.out.println("Şifreniz oluşturuldu : " + yeniSifre);
            }
            else
            {
                System.out.print("Giriş başarısız.");
            }

        }

    }
}
