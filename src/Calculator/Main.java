package Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int    n1, n2, select;
        double result = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("Toplama işlemi: 1 \nÇıkarma işlemi: 2 \nÇarpma işlemi: 3 \nBölme işlemi: 4\nYukarıdaki işlemlerin birini seçiniz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                result = n1 + n2;
                break;
            case 2:
                result = n1 - n2;
                break;
            case 3:
                result = n1 * n2;
                break;
            case 4:
                if (n2 == 0) {
                    System.out.print("Hata: Bir sayı 0' a bölünemez!");
                    System.exit(0);
                }
                result = n1 / n2;
                break;
        }
        System.out.println("Sonuç : " + result);
    }
}
