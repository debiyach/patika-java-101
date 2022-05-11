package FindNear;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {15, 12, 788, 1, -1, -778, 2, 0};
        int count;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int x = input.nextInt();

        Arrays.sort(numbers);

        count = numbers.length;
        for (int i = 0; i < count; i++) {
            if (numbers[i] >= x){
                System.out.println("Girilen sayıdan küçük en yakın sayı : " + numbers[i-1]);
                System.out.println("Girilen sayıdan büyük en yakın sayı : " + numbers[i]);
                break;
            }
        }
    }
}
