package RecursivePrimeNumber;

import java.util.Scanner;

public class Main {

    static boolean isPrimeNumber(int number) {
        return isPrimeNumber(number, number - 1) == number;
    }

    static int isPrimeNumber(int number, int step) {
        if (step == 1){
            return number;
        }
        if (number % step == 0) {
            return 0;
        } else {
            return isPrimeNumber(number, step - 1) == 0 ? 0 : number;
        }
    }


    public static void main(String[] args) {
        boolean isPrime;
        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        number = input.nextInt();

        isPrime = isPrimeNumber(number);

        System.out.println(isPrime ? number + " sayısı ASALDIR" : number + "sayısı ASAL değildir!");

    }
}
