import java.util.Scanner;

public class AsalSayi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi;
        boolean asal = true;

        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        if (sayi <= 1) {
            asal = false;
        } else {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    asal = false;
                    break;
                }
            }
        }

        if (asal) {
            System.out.println("Sayı asaldır.");
        } else {
            System.out.println("Sayı asal değildir.");
        }
    }
}
