package talleres1;

public class EstructurasDeDatos {
    public static void main(String[] args) {
        int[] arr1 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = new int[arr1.length];

        int i = 0;
        // Solucion 1
        for(int n: arr1){
            arr2[i++] = n;
        }

        // Solucion 2
        for(i = 0;i < arr1.length; i++){
            arr2[i] = arr1[i];
        }
    }
}
