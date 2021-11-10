/*
Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
Onur ERDEMİROĞLU
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] repeatingNumbers = new int[arr.length];

        int marker = 0;
        System.out.println("Dizi : " + Arrays.toString(arr));
        System.out.println("Tekrar sayıları");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    marker += 1;
                }
            }
            if (marker > 0) {
                if (!isFind(repeatingNumbers, arr[i])) {
                    System.out.println(arr[i] + " sayısı " + marker + " kere tekrar edildi.");
                    repeatingNumbers[i] = arr[i];
                }
                marker = 0;
            }
        }
    }

    static boolean isFind(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
}
