package IntroduccionJava.Nivel_B_Arrays_y_metodos;

import java.util.Scanner;

public class B3RotarArray {
    public static void main(String[] args) {
        int [] array = {4 , 8, 2 , 5};
        int[] array_rotado = new int[4];
        Scanner leer = new Scanner(System.in);

        // introduce el numero de saltos que desea realizar
        System.out.println("Introduce el número de saltos que desea realizar");
        int k = leer.nextInt();
        leer.close();
        for (int i = 0; i < array.length ; i++) {
            //por ejemplo k = 2 si la posicion es menor que array.length se suma 2 y siempre dara la i igual como resto
            // si la posicion es mayor por ejemplo (12/4 --> 3) Y el resto es 0 , la cosa que hace es que se reparte en las 4 posiciones que hay y como ya no quedan más devuelve 0.
            // si es (13/4 -> 3 Pero el resto es 1 , porque la primera posicion ya esta ocupada.Entonces por eso el resto va entorno a las posiciones que hay ya ocupadas.

            int posicion_nueva = (i + k ) % array.length;

            // guardamos en otro array en la posición nueva el valor actual del bucle (i)
            array_rotado[posicion_nueva] = array[i];
        }

        // ahora simplemente imprimes el array rotado
        System.out.print("El array es: ");
        for (int n_rotado:array_rotado) {
            System.out.print(n_rotado);
        }
    }
}
