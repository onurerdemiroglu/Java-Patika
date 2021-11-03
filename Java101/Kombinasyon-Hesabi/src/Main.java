import java.util.Scanner;

/*
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li
kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Kombinasyon formülü: C(n,r) = n! / (r! * (n-r)!)
*/
public class Main {
    public static void main(String[] args) {
        int n, r, factN, factR, factNR, result;
        Scanner Input = new Scanner(System.in);

        System.out.print("N değerini giriniz : ");
        n = Input.nextInt();
        System.out.print("R değerini giriniz : ");
        r = Input.nextInt();

        factN = Factorial(n);
        factR = Factorial(r);
        factNR = Factorial(n - r);

        result = factN / (factR * (factNR));

        System.out.println("\nC(" + n + "," + r + ")" + "= " + result);

    }

    public static int Factorial(int number) {
        int factNumber = 1;
        for (int i = 1; i <= number; i++) {
            factNumber *= i;
        }
        return factNumber;
    }
}


