/*package talleres1;

import java.util.Scanner;
import java.util.Random;

public class PAPractica {
    static int sumaT = 0;

    public static void main(String[] args) throws InterruptedException {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas que desea para la matriz:");
        int filas = entrada.nextInt();
        System.out.println("Ingrese el numero de filas que desea para la matriz:");
        int colum = entrada.nextInt();
        int[][] matriz = generateRandomMatrix(filas, colum);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }

        for (var fila : matriz) {
            new Thread(new Row(fila)).start();
        }

        Thread.sleep(500);

        System.out.println("Total: " + sumaT);
    }

    static int[][] generateRandomMatrix(int filas, int columnas) {
        int[][] matrix = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(21);
            }
        }
        return matrix;
    }
}

class Row implements Runnable {
    private int[] fila;

    public Row(int[] fila) {
        this.fila = fila;
    }

    @Override
    public void run() {

        int sum = 0;
        for (int n : fila) {
            sum += n;
        }
        System.out.println("Suma: " + sum);
        PAPractica.sumaT += sum;
    }
}*/