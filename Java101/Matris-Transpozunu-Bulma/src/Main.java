/*
Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.
Onur ERDEMİROĞLU
*/
public class Main {
    public static void main(String[] args) {
        int[][] arr = {{2, 3, 4}, {5, 6, 4}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};

        transpose(arr);
        System.out.println("----------------------");
        transpose(arr2);
    }

    static void transpose(int[][] arr) {
        int[][] arrTranspose = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arrTranspose[j][i] = arr[i][j];
            }
        }

        System.out.println("Matris : ");
        printArr(arr);
        System.out.println("Transpoze : ");
        printArr(arrTranspose);
    }

    static void printArr(int[][] array) {
        for (int[] i : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(i[j] + " ");
            }
            System.out.println();
        }
    }
}
