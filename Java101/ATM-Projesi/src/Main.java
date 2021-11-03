import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner Input = new Scanner(System.in);

        int right = 3;
        int balance = 2000;
        int select;

        while (right > 0) {

            System.out.print("Kullanıcı Adınızı : ");
            userName = Input.nextLine();
            System.out.print("Parolanız : ");
            password = Input.nextLine();

            if (userName.equals("onur") && password.equals("erdemiroglu")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = Input.nextInt();
                    switch (select) {
                        case 1: {
                            System.out.print("Para miktarı : ");
                            int price = Input.nextInt();
                            balance += price;
                            break;
                        }
                        case 2: {
                            System.out.print("Para miktarı : ");
                            int price = Input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        }
                        case 3: {
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        }
                    }
                    System.out.println();
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyin!");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan deneme hakkınız : " + right);
                }
            }
        }
    }
}
