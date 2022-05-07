package BodyMassIndex;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double result, length;
        int    weight;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        length = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = input.nextInt();

        result = (weight / (length * length));
        System.out.print("Vücut Kitle İndeksiniz : " + result);


    }

}
