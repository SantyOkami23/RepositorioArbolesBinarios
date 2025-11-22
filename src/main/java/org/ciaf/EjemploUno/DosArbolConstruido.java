package org.ciaf.EjemploUno;
/*        10
         /   \
        5     20
       / \
      3   7
*/



public class DosArbolConstruido {
    public static void main(String[] args) {

        Nodo raiz = new Nodo(10);

        raiz.izq = new Nodo(5);
        raiz.der = new Nodo(20);

        raiz.izq.izq = new Nodo(3);
        raiz.izq.der = new Nodo(7);

        System.out.println("Raíz       : " + raiz.dato);
        System.out.println("Izq        : " + raiz.izq.dato);
        System.out.println("Der        : " + raiz.der.dato);
        System.out.println("Izq-Izq    : " + raiz.izq.izq.dato);
        System.out.println("Izq-Der    : " + raiz.izq.der.dato);
    }
}
