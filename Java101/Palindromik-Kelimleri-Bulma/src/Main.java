import java.util.Scanner;

/*
Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazıyoruz.
Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".
Örnek : abba , asa , kavak, kayak
*/
public class Main {
    public static void main(String[] args) {
        String word = "";
        Scanner Input = new Scanner(System.in);

        System.out.print("Kelimeyi giriniz :");
        word = Input.nextLine();

        if (isPalindrome(word)) {
            System.out.println("Kelime Palindromiktir.");
        } else {
            System.out.println("Kelime Palindromik değildir.");
        }
    }

    static boolean isPalindrome(String str) {
        String duplicate = "";
        for (int i = 0; i < str.length(); i++) {
            duplicate += str.charAt(str.length() - 1 - i);
        }
        if (str.equals(duplicate)) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isPalindrome2(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
