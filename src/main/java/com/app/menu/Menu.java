package main.java.com.app.menu;

import java.util.Scanner;

import main.java.com.app.ayed1.tp1.edificio.Edificio;
import main.java.com.app.ayed1.tp1.oficina.Oficina;
import main.java.com.app.ayed1.tp2.pila.Pila;
import main.java.com.app.ayed1.tp3.hash.Hash;
import main.java.com.app.ayed1.tp4.mergesort.MergeSort;
import main.java.com.app.ayed1.tp4.quicksort.QuickSort;
import main.java.com.app.tayed1.tp1.contador.Contador;
import main.java.com.app.tayed1.tp2.cola.Cola;
import main.java.com.app.tayed1.tp2.pedido.Pedido;
import main.java.com.app.tayed1.tp2.pilaarray.PilaArray;
import main.java.com.app.tayed1.tp3.listaproductos.ListaProductos;
import main.java.com.app.tayed1.tp3.producto.Producto;
import main.java.com.app.tayed1.tp4.equipo.Equipo;
import main.java.com.app.tayed1.tp4.tabladeposiciones.TablaDePosiciones;
import main.java.com.app.ayed2.tp2.arbol.Arbol;
import main.java.com.app.ayed2.tp2.nodobinario.NodoBinario;
import main.java.com.app.ayed2.tp3.ABB.ABB;
import main.java.com.app.ayed2.tp4.arbolhuffman.ArbolHuffman;

public class Menu {

    private Scanner sc; // objeto para leer datos por teclado

    // Constructor:
    public Menu() {
        sc = new Scanner(System.in);
    }

    public void menuPrincipal() throws Exception {
        int opcion;
        do {
            System.out.println("");
            System.out.println("Seleccione la opción correspondiente a la asignatura:");
            System.out.println("1. Algoritmos y Estructuras de Datos I");
            System.out.println("2. Taller de Algoritmos y Estructuras de Datos I");
            System.out.println("3. Algoritmos y Estructuras de Datos II");
            System.out.println("4. Taller de Algoritmos y Estructuras de Datos II");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.print("Opción: ");

            // Validación del input del usuario
            while (!sc.hasNextInt()) {
                System.out.println("Opción inválida, por favor inténtalo nuevamente.");
                sc.next();
            }
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    /*** Algoritmos y Estructuras de Datos I ***/
                    menuAyED1();
                    break;
                case 2:
                    /*** Taller de Algoritmos y Estructuras de Datos I ***/
                    menuTAyED1();
                    break;
                case 3:
                    /*** Algoritmos y Estructuras de Datos II ***/
                    menuAyED2();
                case 4:
                    /*** Taller de Algoritmos y Estructuras de Datos II ***/
                    menuTAyED2();
                    break;
                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida, por favor inténtalo nuevamente.");
            }
        } while (opcion != 0);
    }

    public void menuAyED1() throws Exception {
        int opcion;
        do {
            System.out.println("");
            System.out.println("Seleccione una opción:");
            System.out.println("1. TP1: Algoritmos de búsqueda - Notación O");
            System.out.println("2. TP2: Estructuras de Datos - Pilas - Listas Enlazadas");
            System.out.println("3. TP3: Tablas Hash");
            System.out.println("4. TP4: QuickSort - MergeSort");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.print("Opción: ");

            // Validación del input del usuario
            while (!sc.hasNextInt()) {
                System.out.println("Opción inválida, por favor inténtalo nuevamente.");
                sc.next();
            }
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    /*** TRABAJO PRÁCTICO #1 ***/
                    // Creamos una instancia de Edificio
                    Edificio edificio = new Edificio();

                    // Llamamos al método cantidadOficinasActivas()
                    System.out.println("Cantidad de oficinas activas: " + edificio.cantidadOficinasActivas());

                    /**
                     * Llamamos al método encontrarPrimeraOficinaActiva(), aquí implementamos manejo
                     * de excepciones pues
                     * en caso de no haber oficinas activas, el método puede retornal null.
                     */
                    try {
                        Oficina primeraOficina = edificio.encontrarPrimeraOficinaActiva();
                        System.out.println("Primera oficina: " + primeraOficina.toString());
                    } catch (NullPointerException e) {
                        System.out.println("No se encontraron oficinas activas");
                    }
                    break;
                case 2:
                    /*** TRABAJO PRÁCTICO #2 ***/
                    Pila pila = new Pila();
                    pila.apilar(10);
                    pila.apilar(40);
                    pila.apilar(3);
                    pila.verContenido();
                    System.out.println("Desapilando tope de la pila: " + pila.desapilar());
                    pila.verContenido();
                    break;
                case 3:
                    /*** TRABAJO PRÁCTICO #3 ***/
                    int i, elemento;

                    // Tabla Definida de 15
                    int m = 15;
                    Hash[] h = new Hash[m];
                    for (i = 0; i < m; i++) {
                        h[i] = new Hash();
                        h[i].estado = 0;
                    }

                    // Insertar elemento
                    Hash.insertaHash(h, m, 15);
                    Hash.insertaHash(h, m, 130);
                    Hash.insertaHash(h, m, 7);
                    Hash.insertaHash(h, m, 32);

                    // Buscando un elemento
                    elemento = 7;
                    i = Hash.buscaHash(h, m, elemento);
                    i = Hash.eliminaHash(h, m, 130);
                    break;
                case 4:
                    /*** TRABAJO PRÁCTICO #4 ***/
                    int arr[] = {
                        12,
                        11,
                        13,
                        5,
                        6,
                        7
                    };
                    System.out.println("\n Array original antes de MergeSort");
                    MostrarArray(arr);
                    MergeSort obMS = new MergeSort();
                    obMS.ordenar(arr, 0, arr.length - 1);
                    System.out.println("\n Array ordenado por Merge Sort");
                    MostrarArray(arr);
                    int arr2[] = {
                        12,
                        11,
                        13,
                        5,
                        6,
                        7
                    };
                    System.out.println("\n Array original antes de QuickSort");
                    MostrarArray(arr2);
                    int n = arr2.length;
                    QuickSort obQS = new QuickSort();
                    obQS.ordenar(arr2, 0, n - 1);
                    System.out.println("\n Array ordenado por Quick Sort");
                    MostrarArray(arr2);
                    break;
                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida, por favor inténtalo nuevamente.");
            }
        } while (opcion != 0);
    }

    public void menuTAyED1() throws Exception {
        int opcion;
        int opcionSubmenu;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("");
            System.out.println("Seleccione una opción:");
            System.out.println("1. TP1: Manejo de objetos, arreglos y excepciones");
            System.out.println("2. TP2: Pilas y Colas");
            System.out.println("3. TP3: Listas Enlazadas");
            System.out.println("4. TP4: QuickSort");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.print("Opción: ");

            // Validación del input del usuario
            while (!sc.hasNextInt()) {
                System.out.println("Opción inválida, por favor inténtalo nuevamente.");
                sc.next();
            }
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    /*** TRABAJO PRÁCTICO #1 ***/
                    // Generamos un array de palabras que almacenará hasta 50 palabras.
                    String[] palabras = new String[50];
                    /**
                     * Inicializamos también un contador que usaremos al momento de
                     * ingresar nuevas palabras en la primera posición vacía del array,
                     * por eso lo inicializamos en 0.
                     */
                    int cantidadPalabras = 0;

                    // Leer una palabra del usuario
                    System.out.print("Ingrese una palabra (por favor, sólo letras): ");
                    String palabra = teclado.nextLine();

                    // Convertir a mayúsculas
                    palabra = palabra.toUpperCase();

                    /**
                     * Agregamos la palabra a nuestra lista de palabras
                     * e incrementamos en 1 nuestro contador de palabras ingresadas
                     */
                    palabras[cantidadPalabras] = palabra;
                    cantidadPalabras++;

                    do {
                        System.out.println("");
                        System.out.println("Seleccione una opción:");
                        System.out.println("1. Ingresar más palabras");
                        System.out.println("2. Listar palabras ingresadas");
                        System.out.println("3. Conteo de caracteres de una palabra");
                        System.out.println("4. Conteo de ocurrencias de una palabra");
                        System.out.println("0. Salir");
                        System.out.println("");
                        System.out.print("Opción: ");

                        // Validación del input del usuario
                        while (!teclado.hasNextInt()) {
                            System.out.println("Opción inválida, por favor inténtalo nuevamente.");
                            System.out.print("Opción: ");
                            teclado.next();
                        }
                        opcionSubmenu = teclado.nextInt();

                        switch (opcionSubmenu) {
                            case 1:
                                // Leer palabra del usuario
                                System.out.print("Ingrese una palabra (por favor, sólo letras): ");
                                teclado.nextLine();
                                palabra = teclado.nextLine();
                                // Convertir a mayúsculas
                                palabra = palabra.toUpperCase();
                                // Agregamos la palabra a nuestra lista de palabras
                                palabras[cantidadPalabras] = palabra;
                                cantidadPalabras++;
                                break;
                            case 2:
                                System.out.print("\nPalabras ingresadas: \n");
                                for (int i = 0; i < palabras.length; i++) {
                                    if (palabras[i] == null) {
                                        break;
                                    }
                                    System.out.println((i + 1) + ". " + palabras[i]);
                                }

                                presionaEnterParaContinuar();
                                teclado.nextLine();
                                break;
                            case 3:
                                String opcionPalabra;
                                System.out.print("\nPalabras ingresadas: \n");
                                for (int i = 0; i < palabras.length; i++) {
                                    if (palabras[i] == null) {
                                        break;
                                    }
                                    System.out.println((i + 1) + ". " + palabras[i]);
                                }

                                System.out
                                    .println("Ingresa el número de palabra sobre la cual deseas realizar el conteo de caracteres ");
                                System.out.println("");
                                System.out.print("Opción: ");
                                opcionPalabra = teclado.next();
                                /**
                                 * Validación del input del usuario:
                                 * - Debe ser un número
                                 * - Debe ser una opción válida (entre 1 y cantidadPalabras)
                                 */
                                while (!(isNumeric(opcionPalabra) &&
                                        Integer.parseInt(opcionPalabra) >= 1 &&
                                        Integer.parseInt(opcionPalabra) <= cantidadPalabras)) {
                                    System.out.println("Opción inválida, por favor inténtalo nuevamente.");
                                    System.out.print("Opción: ");
                                    opcionPalabra = teclado.next();
                                }
                                /**
                                 * Nos traemos la palabra de la lista, su índice será la opción menos 1,
                                 * puesto que el array comienza en 0
                                 */
                                palabra = palabras[Integer.parseInt(opcionPalabra) - 1];
                                System.out.println("Palabra elegida: " + palabra);
                                Contador.conteoDeFrecuencia(palabra);
                                presionaEnterParaContinuar();
                                break;
                            case 4:
                                System.out.print("\nPalabras ingresadas: \n");
                                for (int i = 0; i < palabras.length; i++) {
                                    if (palabras[i] == null) {
                                        break;
                                    }
                                    System.out.println((i + 1) + ". " + palabras[i]);
                                }

                                System.out.println("Ingresa el número de palabra de la cual deseas realizar el conteo de ocurrencias.");
                                System.out.println("");
                                System.out.print("Opción: ");
                                opcionPalabra = teclado.next();
                                /**
                                 * Validación del input del usuario:
                                 * - Debe ser un número
                                 * - Debe ser una opción válida (entre 1 y cantidadPalabras)
                                 */
                                while (!(isNumeric(opcionPalabra) &&
                                        Integer.parseInt(opcionPalabra) >= 1 &&
                                        Integer.parseInt(opcionPalabra) <= cantidadPalabras)) {
                                    System.out.println("Opción inválida, por favor inténtalo nuevamente.");
                                    System.out.print("Opción: ");
                                    opcionPalabra = teclado.next();
                                }
                                /**
                                 * Nos traemos la palabra de la lista, su índice será la opción menos 1,
                                 * puesto que el array comienza en 0
                                 */
                                palabra = palabras[Integer.parseInt(opcionPalabra) - 1];
                                System.out.println("La palabra elegida, '" + palabra + "' se repite " +
                                    Contador.cantidadDeOcurrencias(palabras, palabra) + " veces.");
                                presionaEnterParaContinuar();
                                break;
                            case 0:
                                System.out.println("¡Hasta pronto!");
                                break;
                            default:
                                System.out.println("Opción inválida, por favor inténtalo nuevamente.");
                        }
                    } while (opcionSubmenu != 0);
                    break;
                case 2:
                    do {
                        System.out.println("");
                        System.out.println("Seleccione una opción:");
                        System.out.println("1. Menú de Pila");
                        System.out.println("2. Demo del funcionamiento de la Cola");
                        System.out.println("0. Salir");
                        System.out.println("");
                        System.out.print("Opción: ");

                        // Validación del input del usuario
                        while (!teclado.hasNextInt()) {
                            System.out.println("Opción inválida, por favor inténtalo nuevamente.");
                            System.out.print("Opción: ");
                            teclado.next();
                        }
                        opcionSubmenu = teclado.nextInt();

                        switch (opcionSubmenu) {
                            case 1:
                                int maxTamaño = 10; // Tamaño máximo de la pila
                                PilaArray pila = new PilaArray(maxTamaño);

                                int opcionMenuPila;
                                do {
                                    System.out.println("\nMenú de Pila:");
                                    System.out.println("1. Apilar elemento");
                                    System.out.println("2. Retirar elemento");
                                    System.out.println("3. Verificar si la pila está vacía");
                                    System.out.println("4. Mostrar contenido de la Pila");
                                    System.out.println("5. Salir");
                                    System.out.print("Selecciona una opción: ");
                                    opcionMenuPila = teclado.nextInt();

                                    switch (opcionMenuPila) {
                                        case 1:
                                            System.out.print("Ingresa el elemento a apilar: ");
                                            int elemento = teclado.nextInt();
                                            pila.push(elemento);
                                            System.out.println("Elemento " + elemento + " apilado.");
                                            break;
                                        case 2:
                                            if (!pila.estaVacia()) {
                                                int elementoDesapilado = pila.pop();
                                                System.out.println("Elemento " + elementoDesapilado + " retirado de la pila.");
                                            } else {
                                                System.out.println("La pila está vacía. No se pueden retirar elementos.");
                                            }
                                            break;
                                        case 3:
                                            if (pila.estaVacia()) {
                                                System.out.println("La pila está vacía.");
                                            } else {
                                                System.out.println("La pila no está vacía.");
                                            }
                                            break;
                                        case 4:
                                            pila.mostrar();
                                            break;
                                        case 5:
                                            System.out.println("Saliendo del programa.");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Por favor, elige una opción válida.");
                                            break;
                                    }
                                } while (opcionMenuPila != 5);
                                break;
                            case 2:
                                Cola cola = new Cola();

                                // Verificar que la cola recién creada está vacía
                                if (cola.estaVacia()) {
                                    System.out.println("La cola está vacía");
                                }

                                // Generar pedidos de prueba
                                Pedido pedido1 = new Pedido(101, "Rodrigo Hernandez", 500);
                                Pedido pedido2 = new Pedido(102, "Hernán Calto", 125);
                                Pedido pedido3 = new Pedido(103, "Matías Carabella", 2500);
                                Pedido pedido4 = new Pedido(104, "Sofia Martinez", 400);
                                Pedido pedido5 = new Pedido(105, "Ayelén Vittora", 1000);
                                Pedido pedido6 = new Pedido(106, "Camila Leguizamon", 750);

                                // Agregar pedidos a la cola
                                cola.encolar(pedido1);
                                cola.encolar(pedido2);
                                cola.encolar(pedido3);
                                cola.encolar(pedido4);
                                cola.encolar(pedido5);
                                cola.encolar(pedido6);

                                // Mostrar el contenido de la cola
                                System.out.println("Contenido de la cola:");
                                cola.mostrarCola();

                                // Verificar el frente de la cola
                                if (!cola.estaVacia()) {
                                    Pedido frentePedido = cola.frente();
                                    System.out.println("Frente de la cola: Código: " + frentePedido.getCodigo() +
                                        ", Cliente: " + frentePedido.getNombreCliente() +
                                        ", Cantidad de Ladrillos: " + frentePedido.getCantidadLadrillos());
                                }

                                // Desencolar algunos pedidos
                                Pedido pedidoDesencolado1 = cola.desencolar();
                                Pedido pedidoDesencolado2 = cola.desencolar();

                                // Mostrar el contenido de la cola después de desencolar
                                System.out.println("\nContenido de la cola después de desencolar:");
                                cola.mostrarCola();

                                // Por último, mostrar los pedidos desencolados
                                System.out.println("\nPedidos desencolados:");
                                System.out.println("Pedido 1: Código: " + pedidoDesencolado1.getCodigo() +
                                    ", Cliente: " + pedidoDesencolado1.getNombreCliente() +
                                    ", Cantidad de Ladrillos: " + pedidoDesencolado1.getCantidadLadrillos());
                                System.out.println("Pedido 2: Código: " + pedidoDesencolado2.getCodigo() +
                                    ", Cliente: " + pedidoDesencolado2.getNombreCliente() +
                                    ", Cantidad de Ladrillos: " + pedidoDesencolado1.getCantidadLadrillos());
                                break;
                            case 0:
                                System.out.println("¡Hasta pronto!");
                                break;
                            default:
                                System.out.println("Opción inválida, por favor inténtalo nuevamente.");
                        }
                    } while (opcionSubmenu != 0);
                    break;
                case 3:
                    ListaProductos lista = new ListaProductos();

                    // Insertarmos productos de prueba
                    lista.insertarProducto(new Producto(1001, "Laptop Lenovo", 899.99));
                    lista.insertarProducto(new Producto(2522, "Smartphone Samsung", 599.99));
                    lista.insertarProducto(new Producto(311, "Monitor Dell", 249.99));
                    lista.insertarProducto(new Producto(4003, "Impresora HP", 129.99));
                    lista.insertarProducto(new Producto(105, "Teclado Logitech", 49.99));
                    // Ahora, intentamos insertar un producto con un código ya existente, lo cual
                    // arrojará un error:
                    lista.insertarProducto(new Producto(1001, "Laptop ASUS", 799.99));

                    // Finalmente, listamos los productos, que estarán ordenados por código
                    // (ascendentemente)
                    System.out.println("");
                    System.out.println("Lista de productos:");
                    lista.listarProductos();

                    presionaEnterParaContinuar();
                    break;
                case 4:
                    TablaDePosiciones tabla = new TablaDePosiciones();

                    tabla.agregarEquipo(new Equipo("Liverpool", 66));
                    tabla.agregarEquipo(new Equipo("Arsenal", 50));
                    tabla.agregarEquipo(new Equipo("Manchester United", 58));
                    tabla.agregarEquipo(new Equipo("Manchester City", 68));
                    tabla.agregarEquipo(new Equipo("Tottenham Hotspur", 48));
                    tabla.agregarEquipo(new Equipo("Leicester City", 43));
                    tabla.agregarEquipo(new Equipo("Chelsea", 60));
                    tabla.agregarEquipo(new Equipo("West Ham United", 45));

                    System.out.println("\nTABLA DE POSICIONES");
                    System.out.println("-------------------");
                    tabla.mostrarTabla();

                    presionaEnterParaContinuar();
                    break;
                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida, por favor inténtalo nuevamente.");
            }
        } while (opcion != 0);
    }

    public void menuAyED2() {
        int opcion;
        do {
            System.out.println("");
            System.out.println("Seleccione una opción:");
            System.out.println("1. TP2: Árboles binarios");
            System.out.println("2. TP3: Árboles binarios de búsqueda (ABB)");
            System.out.println("3. TP4: Árbol de Huffman");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.print("Opción: ");

            // Validación del input del usuario
            while (!sc.hasNextInt()) {
                System.out.println("Opción inválida, por favor inténtalo nuevamente.");
                sc.next();
            }
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    /*** TRABAJO PRÁCTICO #2 ***/
                    Arbol A = new Arbol();
                    NodoBinario NodoAux = null, NodoAux2 = null, NodoAux3 = null, NodoAux4 = null;
                    System.out.println("\nAgregando la raiz 30");
                    // Para que 30 sea la RAÍZ, se envía el primer argumento de este método en null
                    NodoAux2 = A.InsertaNodoHIzq(NodoAux, 30);
                    NodoAux = NodoAux2;
                    // Ahora, insertamos los HIJOS de la raíz (30): 25 como izq. y 45 como der.
                    NodoAux2 = A.InsertaNodoHIzq(NodoAux, 25);
                    NodoAux3 = A.InsertaNodoHDer(NodoAux, 45);
                    NodoAux = NodoAux2;
                    // Finalmente, insertamos los HIJOS de 25: 20 como izq. y 27 como der.
                    NodoAux2 = A.InsertaNodoHIzq(NodoAux, 20);
                    NodoAux4 = A.InsertaNodoHDer(NodoAux, 27);
                    System.out.println("El árbol binario en Inorden es:");
                    A.Inorden(A.raiz);
                    Integer Altura = A.Altura(A.raiz);
                    System.out.println("\n\nLa altura del árbol es: " + Altura.toString());
                    break;
                case 2:
                    /*** TRABAJO PRÁCTICO #3 ***/
                    // Crear el objeto ABB
                    ABB ABB = new ABB();
                    /* ABB Ejemplo
                           45
                        /      \
                      10        90
                      / \      /
                    7    12  50       */

                    // Agregar datos al ABB
                    ABB.insertar(45);
                    ABB.insertar(10);
                    ABB.insertar(7);
                    ABB.insertar(12);
                    ABB.insertar(90);
                    ABB.insertar(50);
                    // Mostrar el arbol ABB
                    System.out.println("El árbol ABB ha sido creado (izquierda-raiz-derecha):");
                    ABB.inorder();
                    // Borrar nodo hoja
                    System.out.println("\nEl árbol ABB después de borrar 12 (Nodo hoja):");
                    ABB.borrarClave(12);
                    ABB.inorder();
                    // Borrar el nodo con un solo hijo
                    System.out.println("\nEl árbol ABB después de borrar 90 (Nodo con 1 hijo):");
                    ABB.borrarClave(90);
                    ABB.inorder();
                    // Borrar nodo con 2 hijos
                    System.out.println("\nEl árbol ABB después de borrar 45 (Nodo con 2 hijos):");
                    ABB.borrarClave(45);
                    ABB.inorder();
                    // Buscar clave en el ABB
                    boolean ret_val = ABB.buscar(50);
                    System.out.println("\n\nClave 50 en el ABB: " + ret_val);
                    ret_val = ABB.buscar(12);
                    System.out.println("Clave 12 en el ABB: " + ret_val);

                    break;
                case 3:
                    /*** TRABAJO PRÁCTICO #4 ***/
                    // Crear arbol de huffman
                    ArbolHuffman AHuffman = new ArbolHuffman();
                    // Cambiar el nombre del archivo por el archivo deseado
                    AHuffman.Comprimir("prueba.txt");
                    break;
                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida, por favor inténtalo nuevamente.");
            }
        } while (opcion != 0);
    }

    public void menuTAyED2() {
        System.out.println("Work in progress");
    }

    // Helper methods
    private static void MostrarArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private static void presionaEnterParaContinuar() {
        System.out.println("\nPresiona ENTER para continuar...");
        try {
            System.in.read();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}