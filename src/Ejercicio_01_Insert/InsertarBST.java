package Ejercicio_01_Insert;

public class InsertarBST {

    Nodo raiz;

    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }

        if (valor < actual.valor) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRecursivo(actual.derecho, valor);
        }

        return actual;
    }

    public void imprimirEnOrden() {
        imprimirEnOrdenRecursivo(raiz);
    }

    private void imprimirEnOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            imprimirEnOrdenRecursivo(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            imprimirEnOrdenRecursivo(nodo.derecho);
        }
    }

    public static void main(String[] args) {
        InsertarBST arbol = new InsertarBST();

        int[] valores = {5, 3, 7, 2, 4, 6, 8};

        for (int val : valores) {
            arbol.insertar(val);
        }

        System.out.println("Árbol BST en orden:");
        arbol.imprimirEnOrden();
    }
}

