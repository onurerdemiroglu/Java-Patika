import java.util.Arrays;
import java.util.Scanner;
/*
Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
Onur ERDEMİROĞLU
*/

public class Main {
    public static void main(String[] args) {
        int number;
        int[] arrayNearest = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner Input = new Scanner(System.in);

        System.out.print("Girilen sayı : ");
        number = Input.nextInt();

        mathNearest(arrayNearest, number);
    }

    static void mathNearest(int[] arr, int number) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = number;
        Arrays.sort(newArr);
        int numIndex = Arrays.binarySearch(newArr, number);

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + newArr[numIndex - 1]);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + newArr[numIndex + 1]);
    }
}
