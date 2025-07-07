package Ejercicio_01_Insert; // Paquete que agrupa este ejercicio

public class InsertarBST {

    Nodo raiz; // Nodo raíz del árbol (el primer nodo que se inserta)

    /**
     * Inserta un valor en el árbol BST.
     */
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor); // Llama al método recursivo de inserción
    }

    /**
     * Método recursivo para insertar valores en el BST.
     * Si el nodo actual es null, se crea uno nuevo.
     * Si el valor es menor, se va al subárbol izquierdo.
     * Si es mayor, al subárbol derecho.
     */
    private Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor); // Se crea un nuevo nodo si se llegó a una hoja vacía
        }

        if (valor < actual.valor) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRecursivo(actual.derecho, valor);
        }

        return actual; // Se retorna el nodo actualizado
    }

    /**
     * Imprime el árbol en recorrido in-order (izquierda → raíz → derecha).
     * Este recorrido imprime los valores en orden ascendente.
     */
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

    /**
     * Método principal para probar el árbol insertando varios valores
     * y mostrando el recorrido in-order.
     */
    public static void main(String[] args) {
        InsertarBST arbol = new InsertarBST();

        int[] valores = {5, 3, 7, 2, 4, 6, 8}; // Valores de entrada (Input)
        
        //int[] valores = {5, 3, 9,11,2,1, 8}; PRUEBA

        //int[] valores = {1, 5, 20, 48 ,6, 10, 8}; PRUEBA

        for (int val : valores) {
            arbol.insertar(val); // Se insertan uno por uno en el árbol
        }

        System.out.println("Árbol BST en orden:");
        arbol.imprimirEnOrden(); // Se imprime en orden
    }
}
