package OneToHundredPrime;

public class Main {

    public static void main(String[] args) {

        boolean isPrime = true;

        for (int i = 2; i <= 100; i++) {

            for (int j = 2; j < i; j++) {

                isPrime = true;
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                System.out.print(i + " ");
            }

        }

    }

}
