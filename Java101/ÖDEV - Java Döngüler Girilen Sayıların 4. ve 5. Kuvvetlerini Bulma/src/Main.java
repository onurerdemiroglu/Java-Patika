import java.util.Scanner;

/* Java döngüler ile girilen sayıya kadar olan
           4 ve 5'in kuvvetlerini ekrana yazdıran program */

public class Main {
    public static void main(String[] args) {
        int number, fourthP = 0, fifthP = 0;
        Scanner Input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        number = Input.nextInt();

        for (int i = 0; i < number; i++) {
            fourthP=i;
            for (int j = 0; j < 3; j++) {
                fourthP = fourthP * i;
            }
            fifthP=i;
            for (int j = 0; j < 4; j++) {
                fifthP = fifthP * i;
            }
            System.out.println(i + " -> 4. kuvveti : " + fourthP + " | 5. kuvveti : " + fifthP);
        }
    }
}
