package Nivel_B_Arrays_y_metodos;

import java.util.Scanner;

public class B1ContarVocales {
    public static  void main(String[] args) {
        // crea una instancia de escaner y indica que es un input
        Scanner leer = new Scanner(System.in);
        // printea al usuario un texto para pedir la frase
        System.out.println("Introduce una frase");
        // si la frase está en mayuscula se convierte en minuscula
        String frase = leer.nextLine().toLowerCase();

        // inicia un contador de vocales
        int contador_vocales = 0;

        // recorre toda la frase , lo de length sirve para saber la longitud
        for (int i = 0; i < frase.length(); i++) {
            // eso sirve para acceder a cada letra entonces lo que hace es si i=1 accede a la letra de la posición 1
            // sintaxis moderna de switch aqui no hace falta poner el break y suma lo que ya tiene uno
            switch (frase.charAt(i)) {
                // NOTA: ++ es igual que += 1
                case 'a' , 'e' , 'i' , 'o' , 'u' -> contador_vocales ++;
            }
        }
        // despues de terminar el bucle termina diciendo cuantas vocales hay
        System.out.println("La frase tiene: " + contador_vocales + " vocales");
    }
}
