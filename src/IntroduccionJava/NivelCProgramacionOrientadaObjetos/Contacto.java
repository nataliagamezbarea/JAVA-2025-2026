package IntroduccionJava.NivelCProgramacionOrientadaObjetos;

public class Contacto {
    private String nombre;
    private String telefono;
    private String correo;
    public Contacto(String nombre , String telefono , String correo) {
       this.nombre = nombre;
       this.telefono = telefono;
       this.correo = correo;
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

    public static void main(String[] args) {
        AgendaContactos agenda = new AgendaContactos();
        Contacto c1 = new Contacto("Nombre","343838989","nataliagbarea@gmail.com");
        agenda.agregarContacto(c1);
        agenda.listarContactos();
        agenda.busqueda("Nombre");
    }



}
