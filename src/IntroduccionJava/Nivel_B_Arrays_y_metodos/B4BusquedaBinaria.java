package IntroduccionJava.Nivel_B_Arrays_y_metodos;

public class B4BusquedaBinaria {

    public static void main(String[] args) {

        // definimos el array ordenado munualmente
        int [] array = {1 , 2 , 3, 4 , 5, 6 , 7, 8, 9, 10};

        // declaramos una constante para poder saber que numero deseo encontrar.
        final int NUMEROENCONTRAR = 3;


        // declaro el inicio predeterminadamente empezará por el 0
        int inicio = 0;
        // el fin empezará por el final siempre -1 porque las posiciones que calcula siempre tienen uno más porque las posiciones empiezan desde 0
        int fin = array.length -1;
        // sumamos el inicio y el final para saber cuantas posiciones hay en total y las dividimos a la mitad
        int mitad =  (inicio+fin)/2;

        // declaramos si lo encontramos una variable que utilizaremos para saber si se ha encontrado
        boolean encontrado = false;

        do {
            // si el valor de la mitad del array no es igual al numero que desea encontrar
            if (array[mitad] != NUMEROENCONTRAR) {
                // y si el numero es menor que el numero que esta en la mitad
                if (NUMEROENCONTRAR < array[mitad] ) {
                    // el número esta a la izquierda por eso se resta 1
                    fin = mitad -1;
                } else {
                    // si es mas mayor el numero esta para la derecha por eso se suma 1
                    inicio = mitad + 1;
                }
            } else {
                // si el valor de la mitad calculada es igual al numero a encontrar pon true
                encontrado = true;
                // imprime el valor de la posición y la posición encontrada
                System.out.println("Número encontrado: " + array[mitad] + " en la posición " + mitad);
            }
            // despues de haber actualizado las variables de inicio y fin hay que recalcular la mitad por eso fuera de los if
            mitad =  (inicio+fin)/2;
        } while (!encontrado  );

        // los do while siempre hay que poner la condicion contraria es decir si quieres que se haga el bucle hasta que el numero encontrado
        // tienes que decir el bucle se hara en bucle siempre que el numero no sea encontrado , si es encontrado ya no se reproduce el bucle
    }

}
