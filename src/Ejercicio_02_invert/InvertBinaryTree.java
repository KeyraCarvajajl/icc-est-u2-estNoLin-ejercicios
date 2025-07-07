package Ejercicio_02_invert;

public class InvertBinaryTree {

    /**
     * Invierte un árbol binario recursivamente.
     * Cambia cada nodo izquierdo por el derecho y viceversa.
     */
    public Node invertTree(Node root) {
        if (root == null) return null;

        Node temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }

    /**
     * Inserta un nuevo valor en el árbol siguiendo las reglas del BST.
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
     * Imprime los valores del árbol en recorrido en orden (in-order).
     * Recorre: izquierda → raíz → derecha.
     */
    public void printInOrder(Node root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.value + " ");
            printInOrder(root.right);
        }
    }

    /**
     * Método principal para construir, invertir y mostrar el árbol.
     */
    public static void main(String[] args) {
        InvertBinaryTree tree = new InvertBinaryTree();

        // Valores para construir el árbol de ejemplo
        int[] values = {4, 2, 7, 1, 3, 6, 9};
        //int[] values = {5, 3, 9,11,2,1, 8};   PRUEBA
        //int[] values = {1, 5, 20, 48 ,6, 10, 8}; PRUEBA
        Node root = null;

        // Se insertan todos los valores en el árbol
        for (int value : values) {
            root = tree.insert(root, value);
        }

        // Mostrar el árbol original
        System.out.println("Árbol original (in-order):");
        tree.printInOrder(root);

        // Invertir el árbol
        root = tree.invertTree(root);

        // Mostrar el árbol invertido
        System.out.println("\nÁrbol invertido (in-order):");
        tree.printInOrder(root);
    }
}
