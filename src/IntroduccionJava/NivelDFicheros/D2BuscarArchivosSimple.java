package IntroduccionJava.NivelDFicheros;

import java.io.File;
import java.util.Scanner;

public class D2BuscarArchivosSimple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario la extensión
        System.out.print("Introduce la extensión de los archivos a buscar (por ejemplo .txt): ");
        String extension = sc.nextLine();

        File carpeta = new File("."); // carpeta actual
        File[] archivos = carpeta.listFiles(); // guardamos la lista de archivos

        if (archivos != null) { // comprobamos que no sea null
            System.out.println("Archivos encontrados:");
            for (File f : archivos) {
                if (f.getName().endsWith(extension)) {
                    System.out.println(f.getName());
                }
            }
        } else {
            System.out.println("No se pudo acceder a la carpeta.");
        }

        sc.close(); // cerramos Scanner
    }
}
