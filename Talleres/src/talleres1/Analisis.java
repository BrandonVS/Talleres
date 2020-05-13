package talleres1;

import java.util.Random;

public class Analisis {
    public static void main(String[] args) {
        Random random = new Random();
        int [] lista = new int[10];
        int[] lista2 = new int[10];
        int x;
        int j;
        int minj;
        int minx;
        for (int i = 2; i < lista.length;i++){
            lista[i] = random.nextInt(10);
            x = lista[i];
            j = i - 1;
            while (j > 0 && x < lista[j]){
                lista[j + 1] = lista[j];
                j = j - 1;
                lista[j + 1] = x;
            }
            System.out.println(lista[i]);
        }


        for(int i = 1; i < (lista2.length - 1);i++){
            lista2[i] = random.nextInt(10);
            minj = i;
            minx = lista2[i];
            for(j = i + 1; j < lista2.length; i++){
                if(lista2[j] < minx){
                    minj = j;
                    minx = lista2[j];
                    lista2[minj] = lista2[i];
                    lista2[i] = minx;
                }
            }
            System.out.println(lista2[i]);
        }
    }
}
