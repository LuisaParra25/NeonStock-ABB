public class ArbolInventario {
    Producto raiz;

    // Constructor
    public ArbolInventario() {
        this.raiz = null;
    }

    // --- 1. Método Insertar (Recursivo) ---
    public void insertar(int id, String nombre) {
        raiz = insertarRecursivo(raiz, id, nombre);
    }

    private Producto insertarRecursivo(Producto actual, int id, String nombre) {
        if (actual == null) {
            return new Producto(id, nombre);
        }

        if (id < actual.id) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, id, nombre);
        } else if (id > actual.id) {
            actual.derecho = insertarRecursivo(actual.derecho, id, nombre);
        } else {
            System.out.println("El producto con ID " + id + " ya existe.");
        }
        return actual;
    }

    // --- 2. Método Recorrido Inorden (Lista los IDs de menor a mayor) ---
    public void mostrarInorden() {
        if (raiz == null) {
            System.out.println("El inventario está vacío.");
        } else {
            ejecutarInorden(raiz);
        }
    }

    private void ejecutarInorden(Producto actual) {
        if (actual != null) {
            ejecutarInorden(actual.izquierdo); // Visita el subárbol izquierdo
            System.out.println("ID: " + actual.id + " | Artículo: " + actual.nombre); // Imprime el nodo actual
            ejecutarInorden(actual.derecho); // Visita el subárbol derecho
        }
    }

    // --- 3. Método Buscar (Por ID) ---
    public boolean buscar(int id) {
        return buscarRecursivo(raiz, id);
    }

    private boolean buscarRecursivo(Producto actual, int id) {
        // Si llegamos a un nodo nulo, el producto no existe
        if (actual == null) {
            return false;
        }
        // Si el ID coincide, lo encontramos
        if (id == actual.id) {
            return true;
        }
        // Llamada recursiva: si el ID buscado es menor, vamos a la izquierda, sino a la derecha
        return id < actual.id 
            ? buscarRecursivo(actual.izquierdo, id) 
            : buscarRecursivo(actual.derecho, id);
    }
} 
