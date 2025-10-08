package IntroduccionJava.NivelCProgramacionOrientadaObjetos;

import java.util.ArrayList;

// Esta clase representa una agenda de contactos simple.
// Permite guardar, eliminar, listar y buscar contactos.
public class C3AgendaContactos {
    // La agenda usa un ArrayList para almacenar objetos de tipo C3Contacto
    private ArrayList<C3ContactoPrincipal> contactos;

    // El constructor inicializa la lista vacía al crear una nueva agenda
    public C3AgendaContactos() {
        contactos = new ArrayList<>();
    }

    // Este método añade un contacto a la lista de contactos
    // Se espera que el contacto ya esté creado antes de llamarlo
    public void agregarContacto(C3ContactoPrincipal c) {
        contactos.add(c);
    }

    // Este método elimina un contacto de la lista
    // Solo lo borra si ya existe dentro del ArrayList
    public void eliminarContacto(C3ContactoPrincipal c) {
        contactos.remove(c);
    }

    // Este método recorre todos los contactos y muestra su información
    // Los datos se imprimen separados por comas (nombre, teléfono, correo)
    public void listarContactos() {
        for (C3ContactoPrincipal contacto : contactos) {
            System.out.println(String.join(",",
                    contacto.getNombre(), contacto.getTelefono(), contacto.getCorreo()));
        }
    }

    // Este método busca un contacto por su nombre
    // Si lo encuentra, muestra sus datos y detiene la búsqueda
    public void busqueda(String nombre) {
        for (C3ContactoPrincipal contacto : contactos) {
            if (contacto.getNombre().equals(nombre)) {
                System.out.println(String.join(",", contacto.getNombre(), contacto.getTelefono(), contacto.getCorreo()));
                break; // Detiene el bucle al encontrar el primer contacto coincidente
            }
        }
    }
}
