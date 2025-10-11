package IntroduccionJava.ProyectoFinal;

import java.util.ArrayList;

public class AgendaContactos {
    private ArrayList<Contacto> contactos;

    public AgendaContactos() {
        contactos = new ArrayList<>();
    }

    public void addContacto(Contacto contacto){
        contactos.add(contacto);
    }

    public void listarContactos(){
        if(contactos.isEmpty()){
            System.out.println("No hay contactos en la agenda.");
            return;
        }
        for (Contacto c : contactos) {
            System.out.println(c.getNombre() + ", " + c.getTelefono() + ", " + c.getEmail());
        }
    }

    public void buscarContacto(String nombre){
        boolean encontrado = false;
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("Encontrado: " + c.getNombre() + ", " + c.getTelefono() + ", " + c.getEmail());
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("No se encontró ningún contacto con ese nombre.");
        }
    }

    public void retirarContacto(Contacto contacto){
        contactos.remove(contacto);
    }

    // Obtener un contacto por nombre
    public Contacto getContactoPorNombre(String nombre){
        for(Contacto c : contactos){
            if(c.getNombre().equalsIgnoreCase(nombre)){
                return c;
            }
        }
        return null;
    }

    public ArrayList<Contacto> getContactos(){
        return contactos;
    }
}
