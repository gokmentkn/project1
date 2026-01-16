


import java.util.Scanner;

public class Ortalamahesaplama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int vize, finalNot;
        double ortalama;

        System.out.print("Vize notunu giriniz: ");
        vize = input.nextInt();

        System.out.print("Final notunu giriniz: ");
        finalNot = input.nextInt();

        ortalama = (vize * 0.6) + (finalNot * 0.4);

        System.out.println("Ortalamanız: " + ortalama);
    }
}
