package MatrixTranspose;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);


    static void createMatrix(int[][] arr){
        int count=0;
        for(int a=0;a<arr.length;a++) {
            for(int b=0;b<arr[a].length;b++){
                arr[a][b]=++count;
            }
        }
    }

    static void createMatrixTranspose(int[][] matrix, int[][] transpose){
        for(int a=0;a<matrix.length;a++){
            for(int b=0;b<matrix[a].length;b++){
                transpose[b][a]=matrix[a][b];
            }
        }
    }

    private static void printMatrix(int[][] arr){
        for(int[] col:arr){
            for(int row:col){
                System.out.print(row +"\t");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int a,b;

        System.out.println("Matris boyutunu girin.");
        System.out.print("a: ");
        a=sc.nextInt();
        System.out.print("b: ");
        b=sc.nextInt();

        int[][] matrix=new int[a][b];
        int[][] transpose=new int[matrix[0].length][matrix.length];

        createMatrix(matrix);
        createMatrixTranspose(matrix,transpose);

        System.out.println("Matris: ");
        printMatrix(matrix);

        System.out.println("Transpose: ");
        printMatrix(transpose);
    }

}
