import java.util.Random;
import java.util.Scanner;

class MineSweeper {
    int rowNumber, colNumber;

    String[][] mine;
    String[][] arrayOfGame;

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
    }

    public void run() {
        this.arrayOfGame = new String[this.rowNumber][this.colNumber];

        makeMiner(this.rowNumber, this.colNumber);
        makeTable(this.rowNumber, this.colNumber);
        calMines(this.arrayOfGame);

    }

    public void calMines(String[][] arrayOfGame) {
        int gameRow, gameCol, marker = 0;
        Scanner Input = new Scanner(System.in);


        System.out.println("Mayınların Konumu");
        printArray(this.mine);
        System.out.println("=======================");
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");
        while (true) {

            printArray(arrayOfGame);

            do {
                if (marker == 1) {
                    System.out.println("\nDizi sınırları dışında sayı girişi yaptınız. Tekrar giriniz.");
                }
                System.out.print("Satır Giriniz :");
                gameRow = Input.nextInt();
                System.out.print("Sütun Giriniz :");
                gameCol = Input.nextInt();
                marker = 1;
            } while (mine.length <= gameRow || mine[0].length <= gameCol || gameCol < 0 || gameRow < 0);
            marker = 0;


            if (mine[gameRow][gameCol].equals("*")) {
                System.out.println("Game Over!!");
                System.out.println("===============");
                break;
            } else {
                arrayOfGame[gameRow][gameCol] = countMines(gameRow, gameCol);
            }
            if (isWin()) {
                System.out.println();
                System.out.println("Oyunu Kazandınız !");
                break;
            }
            System.out.println("=======================");
        }
    }

    public String countMines(int row, int col) {
        int n = 0;

        if (row - 1 >= 0) {
            if (this.mine[row - 1][col].equals("*")) {
                n++;
            }
        }
        if (row + 1 < this.mine.length) {
            if (this.mine[row + 1][col].equals("*")) {
                n++;
            }
        }
        if (col - 1 >= 0) {
            if (this.mine[row][col - 1].equals("*")) {
                n++;
            }
        }
        if (col + 1 < this.mine[0].length) {
            if (this.mine[row][col + 1].equals("*")) {
                n++;
            }
        }
        if (row - 1 >= 0 && col - 1 < this.mine[0].length && col - 1 >= 0) {
            if (this.mine[row - 1][col - 1].equals("*")) {
                n++;
            }
        }
        if (row + 1 < this.mine.length && col + 1 < this.mine[0].length) {
            if (this.mine[row + 1][col + 1].equals("*")) {
                n++;
            }
        }
        if (row - 1 >= 0 && col + 1 < this.mine[0].length) {
            if (this.mine[row - 1][col + 1].equals("*")) {
                n++;
            }
        }
        if (row + 1 < this.mine.length && col - 1 < this.mine[0].length && col - 1 >= 0) {
            if (this.mine[row + 1][col - 1].equals("*")) {
                n++;
            }
        }

        return Integer.toString(n);
    }

    public boolean isWin() {
        int spaceNumber = 0;
        for (String[] strings : this.arrayOfGame) {
            for (int j = 0; j < this.arrayOfGame[0].length; j++) {
                if (strings[j].equals("-")) {
                    spaceNumber++;
                }
            }
        }
        return spaceNumber - (this.rowNumber * this.colNumber / 4) == 0;
    }

    public void makeTable(int row, int col) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                this.arrayOfGame[i][j] = "-";
            }
        }
    }

    public void makeMiner(int row, int col) {
        int rand;
        int mines = 0;
        int mineNumber;
        int numberOfMines = (row * col / 4);
        Random random = new Random();

        this.mine = new String[row][col];

        do {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    rand = random.nextInt(3);  // 0 ile 2 arasında random sayı %33 oran
                    if (rand == 1 && (numberOfMines != mines)) {
                        this.mine[i][j] = "*";
                        mines++;
                    } else {
                        this.mine[i][j] = "-";
                    }
                }
            }

            // mayın sayısı olması gerekenden düşük ise tekrar üretsin.
            mineNumber = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (this.mine[i][j].equals("*")) {
                        mineNumber++;
                    }
                }
            }
        } while (mineNumber < numberOfMines);

    }


    public void printArray(String[][] arr) {
        for (String[] strings : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(strings[j] + " ");
            }
            System.out.println();
        }
    }
}
