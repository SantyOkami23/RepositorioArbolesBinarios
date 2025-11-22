package org.ciaf.EjemploUno;

public class CuatroDemoArbolBasico {

    public static void main(String[] args) {

        // Construcción A MANO
        Nodo raiz = new Nodo(1);
        raiz.izq = new Nodo(2);
        raiz.der = new Nodo(3);
        raiz.izq.izq = new Nodo(4);
        raiz.izq.der = new Nodo(5);

        /*
                1
               / \
              2   3
             / \
            4   5
        */

        System.out.print("Recorrido Preorden: ");
        TresArbolRecorridos.preOrden(raiz);

        System.out.print("\nRecorrido Inorden: ");
        TresArbolRecorridos.inOrden(raiz);

        System.out.print("\nRecorrido Postorden: ");
        TresArbolRecorridos.postOrden(raiz);
    }
}
