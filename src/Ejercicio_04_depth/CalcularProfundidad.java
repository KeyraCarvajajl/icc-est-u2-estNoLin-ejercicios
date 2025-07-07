package Ejercicio_04_depth;

public class CalcularProfundidad {

    class Node {
    public int value;
    public Node left, right;

    public Node(int value) {
        this.value = value;
        this.left = this.right = null;
    }
}

    /**
     * Calcula la profundidad máxima del árbol binario.
     */
    public int maxDepth(Node root) {
        if (root == null) return 0;

        int izquierda = maxDepth(root.left);
        int derecha = maxDepth(root.right);

        return 1 + Math.max(izquierda, derecha);
    }

    /**
     * Inserta un nuevo valor en el árbol como BST.
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
     * Método principal para probar el cálculo de profundidad.
     */
    public static void main(String[] args) {
        CalcularProfundidad arbol = new CalcularProfundidad();

        //int[] valores = {4, 2, 7, 1, 3, 8};  // Este árbol tiene profundidad 4
        //int[] valores = {5, 3, 9,11,2,1, 8}; PRUEBA
        int[] valores = {1, 5, 20, 48 ,6, 10, 8}; 

        Node root = null;

        for (int val : valores) {
            root = arbol.insert(root, val);
        }

        int profundidad = arbol.maxDepth(root);

        System.out.println("Profundidad máxima del árbol: " + profundidad);
    }
}

