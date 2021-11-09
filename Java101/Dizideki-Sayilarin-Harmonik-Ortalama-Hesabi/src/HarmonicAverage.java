import java.util.Scanner;
/*
Java ile dizideki sayıların harmonik ortalamasını bulan program
Onur ERDEMİROĞLU
*/

public class HarmonicAverage {
    public static void main(String[] args) {
        int arraylength;
        double[] arrayHarmonic;

        Scanner Input = new Scanner(System.in);

        System.out.print("Dizinin eleman sayısını giriniz : ");
        arraylength = Input.nextInt();

        arrayHarmonic = new double[arraylength];

        for (int i = 0; i < arraylength; i++) {
            System.out.print("Dizinin " + i + ". elemanını giriniz : ");
            int input = Input.nextInt();
            while (input <= 0) {
                System.out.print("Hatalı giriş yaptınız, tekrar giriniz : ");
                input = Input.nextInt();

            }
            arrayHarmonic[i] = input;
        }


        mathHarmonic(arrayHarmonic);
    }


    static void mathHarmonic(double[] numbers) {
        double result = 0.0;

        for (int j = 0; j < numbers.length; j++) {
            result += 1 / numbers[j];
        }

        System.out.println();
        System.out.println("Harmonik serisi: " + String.format("[%f]", result));
        System.out.println("Harmonik ortalaması: " + String.format("[%f]", numbers.length / result));
    }
}
