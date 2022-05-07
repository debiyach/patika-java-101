package AreaOfTriangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // declare variable
        double a, b, c, length, area, halfLength;

        // declare Scanner class
        Scanner input = new Scanner(System.in);

        // get inputs

        System.out.print("1. kenar uzunluğu: ");
        a = input.nextDouble();

        System.out.print("2. kenar uzunluğu: ");
        b = input.nextDouble();

        System.out.print("3. kenar uzunluğu: ");
        c = input.nextDouble();


        length     = (a + b + c);
        halfLength = (length / 2);
        area       = Math.sqrt(halfLength * (halfLength - a) * (halfLength - b) * (halfLength - c));

        System.out.println("Üçgenin uzunluğu: " + length);
        System.out.print("Üçgenin alanı: " + area);


    }
}
