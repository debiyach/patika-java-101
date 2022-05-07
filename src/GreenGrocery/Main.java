package GreenGrocery;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double
                a = 2.14,
                e = 3.67,
                d = 1.11,
                m = 0.95,
                p = 5.00,
                result=0;

        int     aP, eP, dP, mP, pP;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo: ");
        aP = input.nextInt();

        result += aP * a;

        System.out.print("Elma kaç kilo: ");
        eP = input.nextInt();

        result += eP * e;

        System.out.print("Domates kaç kilo: ");
        dP = input.nextInt();

        result += dP * d;

        System.out.print("Muz kaç kilo: ");
        mP = input.nextInt();

        result += mP * m;

        System.out.print("Patlıcan kaç kilo: ");
        pP = input.nextInt();

        result += pP * p;


        System.out.println("Toplam Tutar : " + result + " TL");
    }

}
