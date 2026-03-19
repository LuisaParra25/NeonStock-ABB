# 📦 CyberNode-Inventory (Sistema de Inventario basado en ABB)

## 🎯 Objetivo
Aplicar el concepto de Árbol Binario de Búsqueda (ABB) y su estructura lógica para gestionar un sistema de clasificación de inventario en Java, implementando nodos y punteros de forma manual sin el uso de librerías automáticas.

## 🧠 Comprensión Teórica
* **¿Qué es un Árbol Binario de Búsqueda (ABB)?**
  Es una estructura de datos dinámica no lineal donde cada elemento (Nodo) tiene como máximo dos hijos. Se organiza bajo una regla estricta: todos los valores menores al nodo raíz se ubican a su izquierda, y todos los valores mayores se ubican a su derecha. Esto permite operaciones de búsqueda increíblemente rápidas.
* **Uso de la Recursividad en nuestro inventario:**
  La recursividad se aplicó principalmente en los métodos de inserción y búsqueda. En lugar de usar bucles `while` complejos, el método se llama a sí mismo evaluando si el ID entrante es mayor o menor que el nodo actual, desplazándose por los punteros `izquierdo` o `derecho` hasta encontrar un espacio vacío (`null`) para insertar el nuevo producto, o hasta encontrar el ID deseado.

## 🚀 Instrucciones de Ejecución
1. Clonar el repositorio: `git clone [URL_DEL_REPO]`
2. Abrir la carpeta en VS Code con el JDK de Eclipse Temurin configurado.
3. Compilar y ejecutar el archivo `Main.java`.

## 📸 Capturas de Pantalla de la Ejecución
*(Nota para ustedes: Aquí deben subir 3 imágenes a GitHub y enlazarlas)*
1. **Menú e Inserción:** `![Inserción](ruta_de_imagen1.png)`
2. **Búsqueda exitosa:** `![Búsqueda](ruta_de_imagen2.png)`
3. **Listado Inorden:** `![Listado](ruta_de_imagen3.png)`

## 🎥 Enlace al Video de Sustentación
[Insertar Enlace de YouTube/Drive Aquí]

**Desarrollado por:** 
 [] , [] y [Jorge Alejandro Rubio Giraldo]