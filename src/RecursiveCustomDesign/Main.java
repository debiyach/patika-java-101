package RecursiveCustomDesign;

import java.util.Scanner;

public class Main {

    static int customDesign(int number, int constVar, boolean state) {

        System.out.print(number + " ");

        if (number > 0 && state) {
            number -= 5;
        } else {
            state = false;
            number += 5;
        }

        if (number == constVar) {
            System.out.print(number);
            return number;
        }

        return customDesign(number, constVar, state);

    }

    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        number = scan.nextInt();
        customDesign(number, number, true);
    }

}
