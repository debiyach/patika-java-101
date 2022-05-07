package MinMaxFinder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int min = 0, max = 0, loopCount;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç adet sayı girilecek: ");
        loopCount = input.nextInt();

        for (int i = 1; i <= loopCount; i++) {

            System.out.print(i + ". sayıyı giriniz: ");
            int x = input.nextInt();


            if (x > max) {
                max = x;
            }

            if (x < min) {
                min = x;
            }

        }

        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);
    }
}
