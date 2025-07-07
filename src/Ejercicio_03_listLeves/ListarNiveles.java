package Ejercicio_03_listLeves;

import java.util.*;

class Node {
    public int value;
    public Node left, right;

    public Node(int value){
        this.value = value;
        this.left = this. right = null;
    }
}

public class ListarNiveles {

    /**
     * Retorna una lista de listas con los nodos de cada nivel del árbol binario.
     */
    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> resultado = new ArrayList<>();

        if (root == null) return resultado;

        Queue<Node> cola = new LinkedList<>();
        cola.add(root);

        while (!cola.isEmpty()) {
            int tamañoNivel = cola.size();
            List<Node> nivel = new ArrayList<>();

            for (int i = 0; i < tamañoNivel; i++) {
                Node nodoActual = cola.poll();
                nivel.add(nodoActual);

                if (nodoActual.left != null) cola.add(nodoActual.left);
                if (nodoActual.right != null) cola.add(nodoActual.right);
            }

            resultado.add(nivel);
        }

        return resultado;
    }

    /**
     * Inserta valores en el árbol como BST.
     */
    public Node insert(Node root, int value) {
        if (root == null) return new Node(value);
        if (value < root.value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    /**
     * Imprime los niveles del árbol, mostrando cada lista enlazada.
     */
    public void imprimirNiveles(List<List<Node>> niveles) {
        int nivel = 0;
        for (List<Node> lista : niveles) {
            System.out.print("Nivel " + nivel + ": ");
            for (Node nodo : lista) {
                System.out.print(nodo.value + " ");
            }
            System.out.println();
            nivel++;
        }
    }

    /**
     * Método principal de prueba.
     */
    public static void main(String[] args) {
        ListarNiveles arbol = new ListarNiveles();

        int[] valores = {4, 2, 7, 1, 3, 6, 9};
        //int[] valores = {5, 3, 9,11,2,1, 8};PRUEBA
        //int[] valores = {1, 5, 20, 48 ,6, 10, 8}; PRUEBA
        Node root = null;

        for (int valor : valores) {
            root = arbol.insert(root, valor);
        }

        List<List<Node>> niveles = arbol.listLevels(root);

        System.out.println("Niveles del árbol:");
        arbol.imprimirNiveles(niveles);
    }
}
