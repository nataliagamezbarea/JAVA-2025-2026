package IntroduccionJava.Nivel_B_Arrays_y_metodos;

public class B3RotarArray {
    public static void main(String[] args) {
        int [] array = {4 , 8, 2 , 5};

        for (int i = 0; i < array.length ; i++) {
            // si la posicion es menor que array.length se suma 2 y siempre dara la i igual como resto
            // si la posicion es mayor por ejemplo (12/4 --> 3) Y el resto es 0 , la cosa que hace es que se reparte en las 4 posiciones que hay y como ya no quedan más devuelve 0.
            // si es (13/4 -> 3 Pero el resto es 1 , porque la primera posicion ya esta ocupada.Entonces por eso el resto va entorno a las posiciones que hay ya ocupadas.

            int posicion_nueva = (i + 2) % array.length;

            System.out.println("El numero " + array[i] + "en la posicion "+ posicion_nueva);
        }
    }
}
