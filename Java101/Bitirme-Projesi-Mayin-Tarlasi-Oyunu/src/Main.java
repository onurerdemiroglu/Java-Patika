import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col, count = 0;

        do {
            if (count == 1) {
                System.out.println("\nHatalı satır sütun tuşladınız. Tekrar deneyin.");
            }
            System.out.print("Satır sayısını giriniz: ");
            row = input.nextInt();
            System.out.print("Sütun sayısını giriniz: ");
            col = input.nextInt();
            count = 1;
        } while ((row <= 0 || col <= 0) || (row == 1 && col == 1));


        MineSweeper mine = new MineSweeper(row, col);
        mine.run();
    }
}
