package IntroduccionJava.NivelCProgramacionOrientadaObjetos;

import java.awt.event.ContainerAdapter;
import java.util.ArrayList;

public class AgendaContactos {
    private String nombre;
    private String telefono;
    private String correo;
    private static ArrayList <AgendaContactos> contactos = new ArrayList<>();

    public AgendaContactos (String nombre , String telefono , String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        contactos.add(this);
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getTelefono() {
        return this.telefono;
    }

    public String getCorreo() {
        return this.correo;
    }
    public static void listarContactos() {
        for (AgendaContactos c : contactos) {
            System.out.println(String.join("," , c.getNombre() , c.getTelefono() , c.getCorreo()));
        }
    }

    public static void main(String [] args) {
        AgendaContactos contacto1 = new AgendaContactos("Nombre", "787878348939", "contacto1@gmail.com");
        AgendaContactos contacto2 = new AgendaContactos("Nombre2", "788787787887876655454", "contacto2@gmail.com");
        AgendaContactos contacto3 = new AgendaContactos("Nombre3", "7845454545544545549", "contacto3@gmail.com");

        listarContactos();
    }
}
