package ClassUp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Define variables first
        float mathematic, physice, chemical, turkish, history, music, total = 0F;
        int   lessonCount                                                   = 0;

        // Create a scanner class
        Scanner input = new Scanner(System.in);

        // Ask for mathematic grade
        System.out.print("Matematik ders notunuzu giriniz :");
        mathematic = input.nextFloat();
        if (mathematic >= 0 && mathematic <= 100) {
            total += mathematic;
            lessonCount += 1;
        }

        // Ask for physice grade
        System.out.print("Fizik ders notunuzu giriniz :");
        physice = input.nextFloat();
        if (physice >= 0 && physice <= 100) {
            total += physice;
            lessonCount += 1;
        }

        // Ask for chemical grade
        System.out.print("Kimya ders notunuzu giriniz :");
        chemical = input.nextFloat();
        if (chemical >= 0 && chemical <= 100) {
            total += chemical;
            lessonCount += 1;
        }

        // Ask for turkish grade
        System.out.print("Türkçe ders notunuzu giriniz :");
        turkish = input.nextFloat();
        if (turkish >= 0 && turkish <= 100) {
            total += turkish;
            lessonCount += 1;
        }

        // Ask for history grade
        System.out.print("Tarih ders notunuzu giriniz :");
        history = input.nextFloat();
        if (history >= 0 && history <= 100) {
            total += history;
            lessonCount += 1;
        }

        // Ask for music grade
        System.out.print("Müzik ders notunuzu giriniz :");
        music = input.nextFloat();
        if (music >= 0 && music <= 100) {
            total += music;
            lessonCount += 1;
        }

        // Calculate the average
        float average = (total / lessonCount);

        // Print the average and pass/fail criteria
        System.out.println("Ortalamanız:" + average);
        System.out.println("Ortlamaya dahil olan ders sayısı :" + lessonCount);
        System.out.print((average >= 55) ? "Sınıfı Geçtiniz" : "Sınıftan Kaldınız");
    }
}
