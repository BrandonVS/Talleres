package talleres1;

import java.util.Random;
import java.util.Scanner;

public class NumeroAbundante {

    static int[] generateNumAbundante(int lim){
        int[] lista = new int[lim];
        Random random = new Random();

        for(int i = 0; i < lim; i++){
            lista[i] = random.nextInt(1000);
        }

        return lista;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar limite de la lista: ");
        int [] lista = generateNumAbundante(scanner.nextInt());

        for(var num : lista){
            Thread hilo = new Thread(new Abundante(num));

            System.out.println(hilo.getName());
            hilo.start();
        }
        Thread.sleep(500);
    }
}
class Abundante implements Runnable{
    private int num;

    public Abundante(int num){
        this.num = num;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum > num) {
            System.out.printf("%d es abundante.\n", num);
        }else{
            System.out.printf("%d no es abundante.\n", num);
        }
    }
}
