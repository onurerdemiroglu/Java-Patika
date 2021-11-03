import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,avarageTotal=0,avarageNumber=0;
        Scanner Input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        number = Input.nextInt();

        for (int i = 1; i < number; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                avarageTotal+=i;
                avarageNumber+=1;
            }
        }

        System.out.println("0'dan " +number+" kadar sayıların ortalaması : " + avarageTotal/avarageNumber );

    }
}
