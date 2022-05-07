package PerfectNumber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number, total = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        number = input.nextInt();

        if (number == 1) {
            System.out.println("1 mükemmel sayı değildir!");
        }

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        if (total == number){
            System.out.println(number + " sayısı mükemmel sayıdır!");
        }else{
            System.out.println(number + " sayısı mükemmel sayı değildir!");
        }

    }
}
