package HarmonicAverage;

public class Main {

    public static void main(String[] args) {
        int[]  harmonic = {1, 2, 3, 4, 5};
        double total   = 0;
        double result;

        for (double harmon : harmonic) {
            total += ( 1 / harmon);
        }
        result = (harmonic.length/total);
        System.out.println("Değerlerin harmonik ortalaması : " + result);
    }

}
