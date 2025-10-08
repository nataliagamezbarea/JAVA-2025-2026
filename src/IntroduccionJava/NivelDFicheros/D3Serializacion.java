package IntroduccionJava.NivelDFicheros;

import java.io.*;

class Persona implements Serializable {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}

public class D3Serializacion {
    public static void main(String[] args) {
        Persona p = new Persona("Natalia", 30);

        // Guardar
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.dat"))) {
            oos.writeObject(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Cargar
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.dat"))) {
            Persona cargada = (Persona) ois.readObject();
            System.out.println("Objeto cargado: " + cargada);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
