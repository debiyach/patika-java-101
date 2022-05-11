package ManyRepeats;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int count, arrCount = arr.length;
        Arrays.sort(arr);

        for (int i=0 ; i < arrCount; i++) {
            count = 0;
            for (int j = i; j < arrCount; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                } else {
                    break;
                }
            }
            i += (count-1);
            System.out.println(arr[i] + " sayısı dizide " + count + " defa tekrar ediyor.");
        }

    }

}
