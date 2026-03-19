public class Producto {
    // Atributos del nodo
    int id;
    String nombre;
    Producto izquierdo;
    Producto derecho;

    // Punteros para las ramas del árbol
    public Producto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.izquierdo = null;
        this.derecho = null;
    }
}