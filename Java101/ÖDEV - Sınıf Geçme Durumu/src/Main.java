import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dersSayi=5,notMatematik,notFizik,notTurkce,notKimya,notMuzik;
        double ortalamaDeger;

        Scanner Input = new Scanner(System.in);

        System.out.print("Matematik ders notunuzu giriniz : ");
        notMatematik=Input.nextInt();
        System.out.print("Fizik ders notunuzu giriniz : ");
        notFizik=Input.nextInt();
        System.out.print("Türkçe ders notunuzu giriniz : ");
        notTurkce=Input.nextInt();
        System.out.print("Kimya ders notunuzu giriniz : ");
        notKimya=Input.nextInt();
        System.out.print("Müzik ders notunuzu giriniz : ");
        notMuzik=Input.nextInt();

        if (notMatematik < 0 || 100 < notMatematik){
            notMatematik=0;
            --dersSayi;
        }
        if (notFizik < 0 || 100 < notFizik){
            notFizik=0;
            --dersSayi;
        }
        if (notTurkce < 0 || 100 < notTurkce){
            notTurkce=0;
            --dersSayi;
        }
        if (notKimya < 0 || 100 < notKimya){
            notKimya=0;
            --dersSayi;
        }
        if (notMuzik < 0 || 100 < notMuzik){
            notMuzik=0;
            --dersSayi;
        }

        ortalamaDeger = (dersSayi!=0) ? ((notMatematik+notFizik+notTurkce+notKimya+notMuzik)/dersSayi) : 0;

        if (ortalamaDeger==0)
        {
            System.out.println("Ortalamaya girecek notunuz bulunamadığından geçme durumu hesaplanamadı.");
        }
        else{
            System.out.println("Ortalama Degeriniz : "+ortalamaDeger);
            System.out.println((ortalamaDeger>=55) ? "Tebrikler sınıfı geçtiniz!" : "Sınıfı geçemediniz.");

        }



    }
}
