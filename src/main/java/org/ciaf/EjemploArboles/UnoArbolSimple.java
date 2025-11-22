package org.ciaf.EjemploArboles;
/*    10
     /  \
    5    20
 */



public class UnoArbolSimple {
    public static void main(String[] args) {

        Nodo raiz = new Nodo(10);     // raíz
        raiz.izq = new Nodo(5);       // hijo izquierdo
        raiz.der = new Nodo(20);      // hijo derecho

        System.out.println("Raíz: " + raiz.dato);
        System.out.println("Hijo izquierdo: " + raiz.izq.dato);
        System.out.println("Hijo derecho: " + raiz.der.dato);
    }
}
