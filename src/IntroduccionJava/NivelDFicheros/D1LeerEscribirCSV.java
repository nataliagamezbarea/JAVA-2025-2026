package IntroduccionJava.NivelDFicheros;

import java.io.*;

public class D1LeerEscribirCSV {

    public static void main(String[] args) {
        String nombreArchivo = "productos.csv"; // archivo CSV

        // ESCRIBIR EL CSV
        try {
            FileWriter escritor = new FileWriter(nombreArchivo);

            // Cabecera
            escritor.write("Producto,Precio,Cantidad\n");

            // Productos de ejemplo
            escritor.write("Manzanas,1.5,20\n");
            escritor.write("Leche,0.99,50\n");
            escritor.write("Pan,1.2,30\n");
            escritor.write("Huevos,2.5,12\n");

            escritor.close(); // cerramos archivo
            System.out.println("Archivo CSV de productos escrito correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // LEER EL CSV
        try {
            BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            System.out.println("\nLeyendo el CSV de productos:");

            while ((linea = lector.readLine()) != null) {
                // Separar los campos por coma
                String[] campos = linea.split(",");
                System.out.println("Producto: " + campos[0] + ", Precio: " + campos[1] + " €, Cantidad: " + campos[2]);
            }

            lector.close(); // cerramos archivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
