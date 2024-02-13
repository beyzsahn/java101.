package com.example.Java101;

public class matrisTranspozu {
    static void printMatris(int[][] matris){
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int rows = matris.length;
        int columns = matris[0].length;
        int[][] transpoz = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                 transpoz[j][i]=matris[i][j];

            }
        }
        System.out.println("Matris: ");
        printMatris(matris);
        System.out.println("Transpoz: ");
        printMatris(transpoz);


    }
}
