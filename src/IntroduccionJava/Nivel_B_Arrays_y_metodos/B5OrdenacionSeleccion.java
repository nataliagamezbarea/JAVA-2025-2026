package IntroduccionJava.Nivel_B_Arrays_y_metodos;

import java.util.Arrays;

public class B5OrdenacionSeleccion {

    /**
     * Esta función se utiliza para enseñar todos los valores del array
     * @param nombre_array mediante este parametro sabe cual es el array tiene que recorrer
     */
    public static void mostrarArray (int [] nombre_array) {
        // recorre con un for each para poder recorrer el array entero
        for (int numero : nombre_array) {
            System.out.print(numero);
        }
    }

    /**
     * Para simplificar la logica de ordenacion de seleccion he hecho una funcion que a partir del inicio devuelve
     * la posicion del numero menor
     * @param nombre_array aquí para saber el array que tiene que buscar el numero menor
     * @param inicio aqui para saber en que posicion tiene que seguir buscando por ejemplo si ya recorrio el primero numero
     *  y ya se sustituyo no tiene que ver la primera posicion
     * @return
     */
    public static int getNumeroMenor (int[] nombre_array , int inicio) {
        // inicializa con el primer numero pero del inicio marcado porque ya sabes que los demas ya estan ordenados
        int numeroMenor = nombre_array[inicio];
        // tiene que buscar minimo en la posicion de la que se ha indicado si se pone 0 , empezará desde 0 y sucede
        // el error de el ultimo numero se pone al inicio
        int posicion = inicio;
        for (int i=inicio; i < nombre_array.length ; i++) {
            if (nombre_array[i] < numeroMenor) {
                numeroMenor = nombre_array[i];
                posicion = i;
            }
        }
        return posicion;
    }
    public static void main(String[] args) {
        // crea un array desordenado
        int[] array = {7, 2, 9, 4, 1, 6, 3, 8, 5};
        int[] arraySort = {7, 2, 9, 4, 1, 6, 3, 8, 5};

        // recorre el array entero
        for (int i= 0; i < array.length; i++) {
            // consige la posicion del numero menor en la primera iteracion empieza por 0 , pero en la segunda por el 1, como
            // ya sabe que la posición 0 ya ha sido ordenada empieza por la 1º y asi en bucle
            int posNumMenor = getNumeroMenor(array , i);
            // ahora para no perder el valor del numero , cuando sustituyes el numero en otra posición para ordenarlo
            // hay que guardar el otro numero o  lo perderás y ponerlo en la posición en la que estaba el numero menor
            int numPosSustituir = array[i];

            // ahora simplemente escribimos el numero menor , en la posicion de i
            array[i] = array[posNumMenor];

            // sustituimos el otro numero donde estaba el numero menor , ponemos el otro
            array[posNumMenor] = numPosSustituir;
        }

        // mostramos el array
        System.out.println("Este es el array ordenado manualmente:");
        mostrarArray(array);
        // imprime un salto de linea
        System.out.println("\n");
        System.out.println("Este es el array ordenado con sort:");
        Arrays.sort(arraySort);
        mostrarArray(arraySort);


    }

}