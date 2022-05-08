package RecursiveExpNumber;

import java.util.Scanner;

public class Main {

    static long expNumber(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            return base * expNumber(base,exp - 1);
        }
    }

    static void infiniteLoop(){

        int base,exp;

        Scanner input = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        base = input.nextInt();

        System.out.print("Üs değeri giriniz: ");
        exp = input.nextInt();

        System.out.println("Sonuç : " + expNumber(base,exp));

        infiniteLoop();

    }

    public static void main(String[] args) {
        infiniteLoop();
    }

}
