package talleres1;

import java.util.Random;

public class Analisis2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lista = new int[9];

        int minj;
        int minx;
        for(int i = 1; i < (lista.length - 1);i++){
            lista[i] = random.nextInt(10);
            minj = i;
            minx = lista[i];
            for(int j = i + 1; j < lista.length; i++){
                if(lista[j] < minx){
                    minj = j;
                    minx = lista[j];
                    lista[minj] = lista[i];
                    lista[i] = minx;
                }
            }
            System.out.println(lista[i]);
        }
    }
}
