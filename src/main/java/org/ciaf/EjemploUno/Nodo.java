package org.ciaf.EjemploUno;

class Nodo {
    int dato;
    Nodo izq;
    Nodo der;

    public Nodo(int dato) {
        this.dato = dato;
        izq = null;
        der = null;
    }
}
