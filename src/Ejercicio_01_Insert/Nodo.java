package Ejercicio_01_Insert;

public class Nodo {
    int valor;

    Nodo izquierdo, derecho;

    public Nodo(int valor) {
        this.valor = valor;
        izquierdo = derecho = null;
    }
}
