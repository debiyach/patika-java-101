package Circle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double r, a, result;
        float  pi = 3.14F;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapı: ");
        r = input.nextDouble();

        System.out.print("Dairenin merkez açısı: ");
        a = input.nextDouble();

        result = (pi * (r * r) * a);

        System.out.println("Dairenin alanı: " + result);

    }

}
