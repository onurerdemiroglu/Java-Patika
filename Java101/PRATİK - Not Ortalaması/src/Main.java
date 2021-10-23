import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner Input = new Scanner(System.in);

        /* Matematik Ders Notu Girişi */
        System.out.print("Matematik Ders Notunuzu Giriniz :");
        mat=Input.nextInt();

        /* Fizik Ders Notu Girişi */
        System.out.print("Fizik Ders Notunuzu Giriniz :");
        fizik=Input.nextInt();

        /* Kimya Ders Notu Girişi */
        System.out.print("Kimya Ders Notunuzu Giriniz :");
        kimya=Input.nextInt();

        /* Türkçe Ders Notu Girişi */
        System.out.print("Türkçe Ders Notunuzu Giriniz :");
        turkce=Input.nextInt();

        /* Tarih Ders Notu Girişi */
        System.out.print("Tarih Ders Notunuzu Giriniz :");
        tarih=Input.nextInt();

        /* Müzik Ders Notu Girişi */
        System.out.print("Müzik Ders Notunuzu Giriniz :");
        muzik=Input.nextInt();

        /* Ortalama sonucu ve başarı durumu */
        double ortalamaSonuc = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.print("\nNot ortalamanız: "+ortalamaSonuc);

        boolean ortalamaKosul = ortalamaSonuc > 50;
        System.out.print("\nBaşarı durumu: " + (ortalamaKosul==true ? "Geçti." : "Kaldı."));

    }
}