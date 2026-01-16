import java.util.Scanner;

public class MukemmelSayi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi;
        int toplam = 0;

        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam = toplam + i;
            }
        }

        if (toplam == sayi) {
            System.out.println("Sayı mükemmeldir.");
        } else {
            System.out.println("Sayı mükemmel değildir.");
        }
    }
}
