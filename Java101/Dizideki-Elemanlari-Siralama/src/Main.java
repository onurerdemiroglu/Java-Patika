import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arrayLength, marker;
        int[] arr;

        Scanner Input = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        arrayLength = Input.nextInt();

        while (arrayLength <= 0) {
            System.out.print("Hatalı dizi boyutu girdiniz. Tekrar giriniz: ");
            arrayLength = Input.nextInt();
        }

        arr = new int[arrayLength];

        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            arr[i] = Input.nextInt();
        }
        for(int k = 0; k < arr.length; k++)
        {
            for(int l = k+1; l < arr.length; l++)
            {
                if(arr[k] > arr[l]) {
                    marker = arr[k];

                    arr[k] = arr[l];
                    arr[l] = marker;
                }
            }
        }
        System.out.println("Sıralama : " + Arrays.toString(arr));
    }
}
