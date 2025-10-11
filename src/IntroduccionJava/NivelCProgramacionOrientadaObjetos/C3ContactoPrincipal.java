package IntroduccionJava.NivelCProgramacionOrientadaObjetos;

import java.util.Scanner;

// Clase que representa un contacto individual y permite probar la agenda
public class C3ContactoPrincipal {
    // Atributos del contacto
    private String nombre;
    private String telefono;
    private String correo;

    // Constructor: crea un contacto con nombre, teléfono y correo
    public C3ContactoPrincipal(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Getters para acceder a los datos del contacto
    public String getNombre() {
        return this.nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public String getCorreo() {
        return this.correo;
    }

    // Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner para leer del teclado
        C3AgendaContactos agenda = new C3AgendaContactos(); // Creamos la agenda

        boolean salir = false; // Control del menú

        // Bucle del menú principal
        while (!salir) {
            System.out.println("\nAGENDA DE CONTACTOS");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Listar todos los contactos");
            System.out.println("3. Buscar contacto por nombre");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> { // Añadir un contacto
                    System.out.print("Introduce el nombre del contacto: ");
                    String nombre = sc.nextLine();
                    System.out.print("Introduce el teléfono del contacto: ");
                    String telefono = sc.nextLine();
                    System.out.print("Introduce el correo del contacto: ");
                    String correo = sc.nextLine();

                    C3ContactoPrincipal contacto = new C3ContactoPrincipal(nombre, telefono, correo);
                    agenda.agregarContacto(contacto); // Añadimos a la agenda
                    System.out.println("Contacto añadido correctamente.");
                }
                case 2 -> { // Listar todos los contactos
                    System.out.println("\nLista de contactos:");
                    agenda.listarContactos();
                }
                case 3 -> { // Buscar un contacto por nombre
                    System.out.print("Introduce el nombre a buscar: ");
                    String nombreBusqueda = sc.nextLine();
                    System.out.println("Resultado de la búsqueda:");
                    agenda.busqueda(nombreBusqueda);
                }
                case 4 -> { // Salir del programa
                    System.out.println("Saliendo de la agenda...");
                    salir = true;
                }
                default -> System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        sc.close(); // Cerramos el Scanner al final
    }
}
