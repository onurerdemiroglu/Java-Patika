import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        int gidilenMesafe,taksimetreAcilis=10,taksimetreMin=20;
        double ucretTutar,taksimetreKM=2.2;
        Scanner Input = new Scanner(System.in);

        System.out.print("Gidilen Mesafeyi KM Cinsinden Giriniz : ");
        gidilenMesafe=Input.nextInt();

        ucretTutar = taksimetreAcilis + gidilenMesafe * taksimetreKM;

        ucretTutar= (ucretTutar<taksimetreMin) ? taksimetreMin : ucretTutar;

        System.out.println("Taksimetre Ücretiniz : " + new DecimalFormat("##.##").format(ucretTutar) + " ₺");
    }
}
