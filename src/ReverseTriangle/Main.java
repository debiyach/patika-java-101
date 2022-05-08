package ReverseTriangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int starCount;

        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısı: ");
        starCount = input.nextInt();

        // 2n + 1 => yıldız formülü
        // n - 1  => adet boşluk olacak
        for (int i = 1; i <= starCount; i++) {
            System.out.println(" ".repeat(i - 1) + "*".repeat(2 * (starCount - i) + 1));
        }


    }
}
