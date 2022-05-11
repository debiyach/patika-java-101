package ManuelSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu (n) : ");
        int   n   = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            arr[i] = input.nextInt();
        }

        int count = arr.length;

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }

}
