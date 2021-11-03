import java.util.Scanner;

/*
Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
Onur ERDEMİROĞLU
*/

public class Main {
    public static void main(String[] args) {
        int numberOfElements;
        Scanner Input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz : ");
        numberOfElements = Input.nextInt();

        int[] fibonacciArray = new int[numberOfElements]; //Girilen eleman sayısına göre dizi oluşturduk

        int a = 1, b = 1, lastValue;
        for (int i = 0; i < numberOfElements; i++) {
            fibonacciArray[i] = a;

            lastValue = a + b;
            a = b;
            b = lastValue;
        }

        System.out.print(numberOfElements + " Elemanlı fibonacci serisi : ");
        for (int i : fibonacciArray) {   // Diziyi ekrana yazdırdık
            System.out.print(i + " ");
        }
    }
}
