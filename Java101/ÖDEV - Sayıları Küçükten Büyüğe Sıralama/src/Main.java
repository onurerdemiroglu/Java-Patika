import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int birinciSayi,ikinciSayi,ucuncuSayi;
        boolean birinciOnerme,ikinciOnerme,ucuncuOnerme;

        Scanner Input = new Scanner(System.in);

        System.out.print("Lütfen birinci sayıyı giriniz : ");
        birinciSayi = Input.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz : ");
        ikinciSayi = Input.nextInt();
        System.out.print("Lütfen üçüncü sayıyı giriniz : ");
        ucuncuSayi = Input.nextInt();

        birinciOnerme = (birinciSayi>ikinciSayi) ? birinciOnerme = true : false;  /* a>b */
        ikinciOnerme = (birinciSayi>ucuncuSayi) ? ikinciOnerme = true : false;    /* a>c */
        ucuncuOnerme = (ikinciSayi>ucuncuSayi) ? ucuncuOnerme = true : false;     /* b>c */

        if (birinciOnerme==true && ikinciOnerme==true) {
            if (ucuncuOnerme==true) {
                System.out.println("Sıralama : "+ucuncuSayi+"<"+ikinciSayi+ "<"+birinciSayi);
            }
            else {
                System.out.println("Sıralama : "+ikinciSayi+"<"+birinciSayi+ "<"+ucuncuSayi);
            }
        }
        if (birinciOnerme==false && ikinciOnerme==true) {
            if (ucuncuOnerme==true) {
                System.out.println("Sıralama : "+ucuncuSayi+"<"+birinciSayi+ "<"+ikinciSayi);
            }
            else {
                System.out.println("Sıralama : "+birinciSayi+"<"+ikinciSayi+ "<"+ucuncuSayi);
            }
        }
        if (birinciOnerme==true && ikinciOnerme==false) {
            if (ucuncuOnerme==true) {
                System.out.println("Sıralama : "+birinciSayi+"<"+ucuncuSayi+ "<"+ikinciSayi);
            }
            else {
                System.out.println("Sıralama : "+ikinciSayi+"<"+birinciSayi+ "<"+ucuncuSayi);
            }
        }
        if (birinciOnerme==false && ikinciOnerme==false) {
            if (ucuncuOnerme==true) {
                System.out.println("Sıralama : "+birinciSayi+"<"+ucuncuSayi+ "<"+ikinciSayi);
            }
            else {
                System.out.println("Sıralama : "+birinciSayi+"<"+ikinciSayi+ "<"+ucuncuSayi);
            }
        }
    }
}
