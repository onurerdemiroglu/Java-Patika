import java.util.Scanner;

/*
Java ile kullanıcın seçtiği işlemleri yapan gelişmiş hesap makinesi yapınız.
Onur ERDEMİROĞLU
*/
public class Main {
    public static void main(String[] args) {
        int select;
        Scanner Input = new Scanner(System.in);

        String islemMenu = ("1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme İşlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış Yap\n" +
                "Bir işlem seçiniz : ");
        System.out.print(islemMenu);
        do {
            select = Input.nextInt();
            if (select < 0 || select > 8) {
                System.out.print("Hatalı işlem seçimi yaptınız. Tekrar seçiniz : ");
            }
        } while (select < 0 || select > 8);

        switch (select) {
            case 1: {
                clearConsole();
                plus();
                break;
            }
            case 2: {
                clearConsole();
                minus();
                break;
            }
            case 3: {
                clearConsole();
                times();
                break;
            }
            case 4: {
                clearConsole();
                divided();
                break;
            }
            case 5: {
                clearConsole();
                power();
                break;
            }
            case 6: {
                clearConsole();
                factorial();
                break;
            }
            case 7: {
                clearConsole();
                moduloOperator();
                break;
            }
            case 8: {
                clearConsole();
                rectangularCalc();
                break;
            }
            case 0: {
                clearConsole();
                System.out.println("Çıkış yaptınız. İyi çalışmalar\uD83D\uDE0B");
                break;
            }
        }
    }

    static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    static void plus() {
        int result = 0, counter;
        Scanner Input = new Scanner(System.in);

        System.out.println("-- TOPLAMA İŞLEMİ --");
        System.out.print("Gireceğiniz sayı adedini giriniz : ");
        counter = Input.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayıyı girin : ");
            result += Input.nextInt();
        }
        System.out.println("\nToplama işlemi sonucunuz : " + result);
    }

    static void minus() {
        int result, firstNumber, secNumber;
        Scanner Input = new Scanner(System.in);

        System.out.println("-- ÇIKARMA İŞLEMİ --");

        System.out.print("İlk sayıyı giriniz : ");
        firstNumber = Input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        secNumber = Input.nextInt();

        result = firstNumber - secNumber;

        System.out.println("\nÇıkarma işlemi sonucunuz : " + result);
    }

    static void times() {
        Scanner Input = new Scanner(System.in);
        int result = 1, number, counter;
        System.out.println("-- ÇARPMA İŞLEMİ --");

        System.out.print("Kaç adet sayı gireceksiniz : ");
        counter = Input.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = Input.nextInt();

            result *= number;
        }
        System.out.println("\nÇarpma işlemi sonucunuz : " + result);
    }

    static void divided() {
        int result, firstNumber, secNumber;
        Scanner Input = new Scanner(System.in);

        System.out.println("-- BÖLME İŞLEMİ --");

        System.out.print("İlk sayıyı giriniz : ");
        firstNumber = Input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        secNumber = Input.nextInt();

        result = firstNumber / secNumber;

        System.out.println("\nBölme işlemi sonucunuz : " + result);
    }

    static void power() {
        int result = 1, base, exponent;
        Scanner Input = new Scanner(System.in);

        System.out.println("-- ÜS ALMA İŞLEMİ --");

        System.out.print("Taban sayısını giriniz : ");
        base = Input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        exponent = Input.nextInt();

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        System.out.println("\nÜslü işlemi sonucunuz : " + result);
    }

    static void factorial() {
        Scanner Input = new Scanner(System.in);
        int result = 1, number;
        System.out.println("-- FAKTORİYEL İŞLEMİ --");

        System.out.print("Faktoriyeli alınacak sayıyı giriniz : ");
        number = Input.nextInt();

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        System.out.println("\nFaktoriyel işlemi sonucunuz : " + result);
    }

    static void moduloOperator() {
        int result, base, divisor;
        Scanner Input = new Scanner(System.in);

        System.out.println("-- MOD ALMA İŞLEMİ --");

        System.out.print("Bölünen sayısını giriniz : ");
        base = Input.nextInt();
        System.out.print("Bölen sayısını giriniz : ");
        divisor = Input.nextInt();

        result = base % divisor;

        System.out.println("\nMod alma işlemi sonucunuz : " + result);
    }

    static void rectangularCalc() {
        int shortEdge, longEdge, envCalc, areaCalc;
        Scanner Input = new Scanner(System.in);

        System.out.println("-- DİKDÖRTGEN ÇEVRE VE ALAN İŞLEMİ --");

        System.out.print("Kısa kenarın değerini giriniz : ");
        shortEdge = Input.nextInt();
        System.out.print("Uzun kenarın değerini giriniz : ");
        longEdge = Input.nextInt();

        envCalc = 2 * (shortEdge + longEdge);
        areaCalc = shortEdge * longEdge;

        System.out.println();
        System.out.println("Dikdörtgenin çevresi : " + envCalc);
        System.out.println("Dikdörtgenin alanı : " + areaCalc);
    }
}
