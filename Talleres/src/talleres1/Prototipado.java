package talleres1;

import java.util.Random;
import java.util.Scanner;

public class Prototipado {

    public static int [] lista (){
        Random random = new Random();
        int [] values = new int[20];
        for(int i = 0; i < 20; i++){
            values[i] = random.nextInt();
        }
        return values;
    }
    public static void main(String[] args) {
        int [] values = lista();

        for (int i=0;i<10000000;i++){
            int index = -1;
            for(int j=0;j<values.length;j++)
                if (values[j] == 80)
                    index = j;
                break;
        }
    }
}