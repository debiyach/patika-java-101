package GradeAverage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declare variables
        int mathematic, physice, chemical, turkish, history, music;
        double total;
        String result;

        // declare Scanner class
        Scanner input = new Scanner(System.in);

        // Get inputs

        System.out.print("mathematic grade: ");
        mathematic = input.nextInt();

        System.out.print("physice grade: ");
        physice = input.nextInt();

        System.out.print("chemical grade: ");
        chemical = input.nextInt();

        System.out.print("turkish grade: ");
        turkish = input.nextInt();

        System.out.print("history grade: ");
        history = input.nextInt();

        System.out.print("music grade: ");
        music = input.nextInt();

        total = (mathematic + physice + chemical + turkish + history + music);
        result = ((total/6) > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.print(result);
    }
}
