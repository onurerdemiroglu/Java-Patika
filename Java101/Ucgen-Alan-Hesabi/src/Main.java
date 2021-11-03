import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        double  birinciKenar,ikinciKenar,ucuncuKenar,u,alan;
        Scanner Input = new Scanner(System.in);

        System.out.print("Üçgenin Birinci Kenar Uzunluğunu Giriniz : ");
        birinciKenar = Input.nextDouble();
        System.out.print("Üçgenin İkinci Kenar Uzunluğunu Giriniz : ");
        ikinciKenar= Input.nextDouble();
        System.out.print("Üçgenin Üçüncü Kenar Uzunluğunu Giriniz : ");
        ucuncuKenar= Input.nextDouble();

        /*
        Çevre : 2u = a+b+c
        Alan =√(u(u-a)(u-b)(u-c))
        */
        
        u=(birinciKenar+ikinciKenar+ucuncuKenar)/2;
        alan= Math.sqrt(u*(u-birinciKenar)*(u-ikinciKenar)*(u-ucuncuKenar));

        System.out.println("Üçgenin Alanı : " + new DecimalFormat("##.##").format(alan));

    }
}
