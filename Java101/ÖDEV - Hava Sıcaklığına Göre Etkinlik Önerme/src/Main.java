import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner Input = new Scanner(System.in);

        System.out.print("Sıcaklık giriniz : ");
        heat = Input.nextInt();

        if (heat < 5)
        {
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if (5 < heat && heat <= 10)
        {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else if (10 < heat && heat <= 15)
        {
            System.out.println("Sinemaya veya pikniğe gidebilirsiniz.");
        }
        else if (15 < heat && heat <25 )
        {
            System.out.println("Pikniğe gidebilirsiniz.");
        }
        else if (25 < heat)
        {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
