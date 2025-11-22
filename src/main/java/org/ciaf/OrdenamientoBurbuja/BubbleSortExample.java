package org.ciaf.OrdenamientoBurbuja;

public class BubbleSortExample {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        System.out.println("Estado inicial: " + arrayToString(arr));
        for (int i = 0; i < n - 1; i++) {             // i = número de pasada
            System.out.println("\n--- Pasada " + (i + 1) + " ---");
            for (int j = 0; j < n - 1 - i; j++) {     // j = índice de comparación
                System.out.print("Comparar arr[" + j + "]=" + arr[j] + " y arr[" + (j+1) + "]=" + arr[j+1]);
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println(" -> intercambian -> " + arrayToString(arr));
                } else {
                    System.out.println(" -> no hay cambio -> " + arrayToString(arr));
                }
            }
            System.out.println("Después de la pasada " + (i + 1) + ": " + arrayToString(arr));
        }
        System.out.println("\nArreglo ordenado: " + arrayToString(arr));
    }



    // Helper
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }


    public static void main(String[] args) {
        int[] ejemplo = {5, 1, 4, 2, 8};
        System.out.println("=== Bubble Sort básico ===");
        bubbleSort(ejemplo.clone());


    }
}
