/*
Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
Onur ERDEMİROĞLU
*/
public class Main {
    public static void main(String[] args) {

        for (int number = 2; number <= 100; number++) {
            int counter = 0;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    counter = 1;
                    break;
                }
            }
            if (counter == 0) {
                System.out.print(number + " ");
            }
        }

    }
}
