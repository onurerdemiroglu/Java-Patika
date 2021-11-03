import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
            Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
            𝜋 sayısını = 3.14 alınız.
            Formül : (𝜋 * (r*r) * 𝛼) / 360
        */
        int r;
        double alfa,pi=3.14,alan;
        Scanner Input = new Scanner(System.in);

        System.out.print("Dairenin Yarıçapını Giriniz : ");
        r=Input.nextInt();
        System.out.print("Merkez Açısının Ölçüsünü Giriniz : ");
        alfa=Input.nextDouble();

        alan=(pi * (r*r) * alfa) / 360;

        System.out.println("Daire Diliminin Alanı : " + alan);

    }
}
