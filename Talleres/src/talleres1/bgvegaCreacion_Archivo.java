package talleres1;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;
import java.util.Locale;

public class bgvegaCreacion_Archivo {
    public static void main(String[] args) {
        double suma = 0;
        try {

            // Array con los nombres de los estudiantes
            String [] nombres = new String[]{"Brandon Vega", "Fernando Quizhpe", "Edgar Guamo"};

            // Creacion de archivo csv con notas aleatorias del 1 al 10
            Locale ingles = new Locale("en", "EN");
            Formatter outArchivo = new Formatter("bgvegaNotas.csv", "US-ASCII", ingles);

            // Con el metodo Math.random()*10 se genera un numero double aleatorio desde el 0 al 10
            outArchivo.format("%.2f,%.2f,%.2f,%n", Math.random()*10, Math.random()*10, Math.random()*10);
            outArchivo.format("%.2f,%.2f,%.2f,%n", Math.random()*10, Math.random()*10, Math.random()*10);
            outArchivo.format("%.2f,%.2f,%.2f,%n", Math.random()*10, Math.random()*10, Math.random()*10);
            outArchivo.close();

            // FLUJO DE ENTRADA del archivo.
            Scanner inArchivo = new Scanner(new File("bgvegaNotas.csv"));
            String contenido;
            Formatter outArchivo2 = new Formatter("bgvegaResultados.csv", "US-ASCII", ingles);
            int nroEst = 0;
            while (inArchivo.hasNext()) {

                // Se guarda el nombre del estudiante en el csv de resultados
                outArchivo2.format("Nombre del estudiante: %s%n", nombres[nroEst]);
                contenido = inArchivo.nextLine();
                String[] tokens = contenido.split(",");
                int i = 1;
                for (String nota : tokens) {

                    // Se registran las notas de los estudiantes
                    outArchivo2.format("Nota %d:,%s%n", i, nota);
                    suma += Double.parseDouble(nota);
                    i++;
                }
                nroEst++;

                // Se calcula y registra el promedio
                outArchivo2.format("Promedio:,%.2f%n", (suma/3));
                suma = 0;
            }
            inArchivo.close();
            outArchivo2.close();
        } catch (NumberFormatException numberFormatException) {
            System.err.println("Formato de numero invalido");
        } catch (Exception e) {
            System.err.println("Excepcion generada: " + e);
            System.exit(1); // Termina el programa.
        }
    }
}

