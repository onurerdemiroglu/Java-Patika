import java.util.Arrays;

/*
Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yazınız.
Onur ERDEMİROĞLU
 */
public class Main {
    public static void main(String[] args) {
        int[] list = {4, 2, 27, 8, 28, 5, 6, 7, 5, 4, 2, 2, 8, 1, 8, 3, 6, 45, 46, 28};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && list[i] % 2 == 0) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                        startIndex++;
                    }
                    break;
                }
            }
        }
        Arrays.sort(duplicate);
        System.out.println("Dizideki tekrar eden sayılar: ");
        for (int j : duplicate) {
            if (j != 0) {
                System.out.println(j);
            }
        }
    }

    static boolean isFind(int[] arr, int number) {

        for (int i : arr) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }
}
