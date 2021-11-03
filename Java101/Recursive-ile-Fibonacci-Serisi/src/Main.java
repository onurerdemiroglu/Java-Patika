import java.util.Scanner;
/*
Java'da recursive metotlar ile fibonacci serisi bulan program
Onur ERDEMİROĞLU
*/
public class Main {
    public static void main(String[] args) {
        int numberOfDigits;
        Scanner Input = new Scanner(System.in);
        System.out.print("Fibonacci serisi için basamak değerini girin : ");
        numberOfDigits = Input.nextInt();

        for (int i = 1; i <= numberOfDigits; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
