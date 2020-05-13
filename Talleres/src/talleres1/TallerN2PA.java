package talleres1;

import java.util.Random;
import java.util.Scanner;

public class TallerN2PA {

    static int sumT = 0;

    static int[][] generateRandomMatrix(int filas, int columnas) {

        Random random = new Random();
        int[][] matrix = new int[filas][columnas];

        for (var i = 0; i < matrix.length; i++) {
            for (var j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(21);
            }
        }
        return matrix;
    }

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar numero de filas para la matriz:");
        int fila = scanner.nextInt();

        System.out.println("Ingresar numero de columnas para la matriz:");
        int col = scanner.nextInt();

        int[][] matriz1 = generateRandomMatrix(fila, col);
        System.out.println("La matriz creada es:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++)
                System.out.print(matriz1[i][j]+"\t");

            System.out.println("");
        }

        for (var num: matriz1)
            new Thread(new Row(num)).start();


        Thread.sleep(1000);

        System.out.println("Suma total: " + sumT);
    }
}

class Row implements Runnable {
    private int[] num;

    public Row(int[] num) {
        this.num = num;
    }

    @Override
    public void run() {

        int sum = 0;
        for (int n : num) {
            sum += n;
        }
        System.out.println("Suma: " + sum);
        TallerN2PA.sumT += sum;
    }
}