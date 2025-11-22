package org.ciaf.EjemploUno;

public class TresArbolRecorridos {

    public static void preOrden(Nodo nodo) {
        if (nodo == null) return;

        System.out.print(nodo.dato + " ");  // N
        preOrden(nodo.izq);                 // I
        preOrden(nodo.der);                 // D
    }

    public static void inOrden(Nodo nodo) {
        if (nodo == null) return;

        inOrden(nodo.izq);  
        System.out.print(nodo.dato + " ");
        inOrden(nodo.der);
    }

    public static void postOrden(Nodo nodo) {
        if (nodo == null) return;

        postOrden(nodo.izq);
        postOrden(nodo.der);
        System.out.print(nodo.dato + " ");
    }

    public static void main(String[] args) {

        Nodo raiz = new Nodo(10);
        raiz.izq = new Nodo(5);
        raiz.der = new Nodo(20);
        raiz.izq.izq = new Nodo(3);
        raiz.izq.der = new Nodo(7);

        System.out.print("Preorden: ");
        preOrden(raiz);

        System.out.print("\nInorden: ");
        inOrden(raiz);

        System.out.print("\nPostorden: ");
        postOrden(raiz);
    }
}
