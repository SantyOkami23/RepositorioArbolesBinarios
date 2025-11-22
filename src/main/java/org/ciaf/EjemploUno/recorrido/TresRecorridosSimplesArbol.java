package org.ciaf.EjemploUno.recorrido;

public class TresRecorridosSimplesArbol {
    public static void main(String[] args) {

        System.out.println("=== Árbol fijo ===");
        System.out.println("      10");
        System.out.println("     /  \\");
        System.out.println("    5    20\n");

        // PREORDEN (N - I - D)
        System.out.println("=== Recorrido PREORDEN (N - I - D) ===");
        System.out.println(10); // N
        System.out.println(5);  // I
        System.out.println(20); // D
        System.out.println();

        // INORDEN (I - N - D)
        System.out.println("=== Recorrido INORDEN (I - N - D) ===");
        System.out.println(5);  // I
        System.out.println(10); // N
        System.out.println(20); // D
        System.out.println();

        // POSTORDEN (I - D - N)
        System.out.println("=== Recorrido POSTORDEN (I - D - N) ===");
        System.out.println(5);  // I
        System.out.println(20); // D
        System.out.println(10); // N
        System.out.println();
    }
}
