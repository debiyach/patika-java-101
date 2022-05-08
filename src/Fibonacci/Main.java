package Fibonacci;

public class Main {

    public static void main(String[] args) {

        int total, prevValue = 0, nextValue = 1;

        for (int i = 0; i < 9; i++) {

            System.out.print(prevValue + " ");
            total     = prevValue + nextValue;
            prevValue = nextValue;
            nextValue = total;

        }

    }

}
