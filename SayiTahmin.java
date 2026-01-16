import java.util.Scanner;
import java.util.Random;

public class SayiTahmin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        int tutulanSayi = rnd.nextInt(10) + 1;
        int tahmin;

        System.out.print("1 ile 10 arasında bir sayı tahmin et: ");
        tahmin = input.nextInt();

        if (tahmin == tutulanSayi) {
            System.out.println("Tebrikler! Doğru bildin ");
        } else {
            System.out.println("Yanlış tahmin ");
            System.out.println("Tutulan sayı: " + tutulanSayi);
        }
    }
}
