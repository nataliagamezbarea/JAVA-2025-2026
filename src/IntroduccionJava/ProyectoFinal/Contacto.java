package IntroduccionJava.ProyectoFinal;

import java.io.*;
import java.util.Scanner;

public class Contacto {
    private String nombre;
    private String telefono;
    private String email;

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
    public String getEmail() { return email; }

    // Exportar contactos a CSV
    public static void exportar(String nombreArchivo, AgendaContactos agenda) {
        if (agenda.getContactos().isEmpty()) {
            System.out.println("No hay contactos para exportar.");
            return;
        }
        try {
            FileWriter escritor = new FileWriter(nombreArchivo);
            escritor.write("Nombre,Telefono,Email\n"); // cabecera
            for (Contacto c : agenda.getContactos()) {
                escritor.write(c.getNombre() + "," + c.getTelefono() + "," + c.getEmail() + "\n");
            }
            escritor.close();
            System.out.println("Contactos exportados correctamente a " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Importar contactos desde CSV
    public static void importar(String nombreArchivo, AgendaContactos agenda) {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            System.out.println("El archivo '" + nombreArchivo + "' no existe. No se pueden importar contactos.");
            return;
        }

        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            String linea;
            boolean primeraLinea = true;
            while ((linea = lector.readLine()) != null) {
                if (primeraLinea) { primeraLinea = false; continue; }
                String[] datos = linea.split(",");
                if (datos.length == 3) {
                    Contacto c = new Contacto(datos[0], datos[1], datos[2]);
                    agenda.addContacto(c);
                }
            }
            lector.close();
            System.out.println("Contactos importados correctamente desde " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Crear contacto desde consola
    public static void crearContacto(AgendaContactos agenda, Scanner sc) {
        System.out.print("Introduce el nombre del contacto: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce el teléfono del contacto: ");
        String telefono = sc.nextLine();
        System.out.print("Introduce el correo del contacto: ");
        String email = sc.nextLine();

        Contacto c = new Contacto(nombre, telefono, email);
        agenda.addContacto(c);
        System.out.println("Contacto añadido correctamente.");
    }

    // Buscar contacto por nombre
    public static void buscarContacto(AgendaContactos agenda, Scanner sc) {
        System.out.print("Introduce el nombre del contacto a buscar: ");
        String nombre = sc.nextLine();
        agenda.buscarContacto(nombre);
    }

    // Eliminar contacto por nombre
    public static void eliminarContacto(AgendaContactos agenda, Scanner sc) {
        System.out.print("Introduce el nombre del contacto a eliminar: ");
        String nombre = sc.nextLine();
        Contacto c = agenda.getContactoPorNombre(nombre);
        if (c != null) {
            agenda.retirarContacto(c);
            System.out.println("Contacto eliminado correctamente.");
        } else {
            System.out.println("No se encontró ningún contacto con ese nombre.");
        }
    }

    public static void main(String[] args) {
        AgendaContactos agenda = new AgendaContactos();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMENU");
            System.out.println("1. Crear un contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Buscar contacto por nombre");
            System.out.println("4. Eliminar contacto por nombre");
            System.out.println("5. Exportar contactos a CSV");
            System.out.println("6. Importar contactos desde CSV");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1" -> crearContacto(agenda, sc);
                case "2" -> {
                    System.out.println("\nContactos actuales:");
                    agenda.listarContactos();
                }
                case "3" -> buscarContacto(agenda, sc);
                case "4" -> eliminarContacto(agenda, sc);
                case "5" -> {
                    System.out.print("Introduce el nombre del archivo CSV para exportar: ");
                    String archivo = sc.nextLine();
                    exportar(archivo, agenda);
                }
                case "6" -> {
                    System.out.print("Introduce el nombre del archivo CSV para importar: ");
                    String archivo = sc.nextLine();
                    importar(archivo, agenda);
                }
                case "7" -> {
                    System.out.println("Saliendo del programa...");
                    salir = true;
                }
                default -> System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        sc.close();
    }
}
