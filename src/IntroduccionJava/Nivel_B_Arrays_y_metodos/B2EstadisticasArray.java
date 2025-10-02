package IntroduccionJava.Nivel_B_Arrays_y_metodos;

public class B2EstadisticasArray {
    public static void main(String[] args) {
        // creamos un array simple de numeros
        int[] array = {20, 3, 7, 10};

        // definimos los valores iniciales , si en valor_maximo pones 0 no funcionara porque si no hay ningun numero negativo siempre detectara que el valor es mayor que el máximo
        // por eso lo que hacemos es el primer valor del array
        int suma_total = 0;
        int valor_maximo = array[0];
        int valor_minimo = array[0];

        // Calculamos suma, máximo y mínimo
        for (int valor : array) {
            suma_total += valor;
            // cada vez que el valor es mayor que el valor maximo se guarda que ese es el valor maximo
            if (valor > valor_maximo) {
                valor_maximo = valor;
            // si no si el valor en menor que el valor_minimo tambien se sobreescribe
            } else if (valor < valor_minimo) {
                valor_minimo = valor;
            }
        }

        // la resta tenia un problema si la inicializaba a 0 , entonces lo que he hecho la suma_total que seria n1 - (n2 - n3 - n4)
        // si se suma eso menos el primero y se resta con el primero en este caso 20 - (40 -20) = 20-20 = 0
        int resta_total = array[0] - (suma_total - array[0]);

        // Calculamos la media como decimal y lo divido por la longitud del array
        double media = (double) suma_total / array.length;

        // Mostramos resultados
        System.out.println("La suma total es de : " + suma_total);
        System.out.println("La resta total es de : " + resta_total);
        System.out.println("La media es de : " + media);
        System.out.println("El valor mínimo es de : " + valor_minimo);
        System.out.println("El valor máximo es de : " + valor_maximo);
    }
}
