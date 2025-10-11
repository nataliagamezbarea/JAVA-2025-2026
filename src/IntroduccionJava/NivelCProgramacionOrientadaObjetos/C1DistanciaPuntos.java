package IntroduccionJava.NivelCProgramacionOrientadaObjetos;

import java.util.Scanner; // Importamos Scanner para leer datos del teclado

// Esta clase representa un punto en un plano con coordenadas (x, y)
// y puede calcular la distancia entre dos puntos.
public class C1DistanciaPuntos {
    // Atributos que guardan las coordenadas del punto
    private double x;
    private double y;

    // Constructor: se usa para crear un punto con sus coordenadas
    public C1DistanciaPuntos(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Métodos getter: sirven para acceder a las coordenadas
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Métodos setter: sirven para modificar las coordenadas si hiciera falta
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Método que calcula la distancia entre este punto y otro punto
    // usando la fórmula de distancia: √((x1 - x2)² + (y1 - y2)²)
    public double getDistanciaPuntos(C1DistanciaPuntos otro) {
        double dx = this.x - otro.getX(); // diferencia en el eje X
        double dy = this.y - otro.getY(); // diferencia en el eje Y
        return Math.sqrt(dx * dx + dy * dy); // raíz cuadrada de la suma de cuadrados
    }

    // Método principal: aquí arranca el programa
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer datos desde el teclado
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario las coordenadas del primer punto
        System.out.print("Introduce la coordenada x del primer punto: ");
        double x1 = sc.nextDouble();
        System.out.print("Introduce la coordenada y del primer punto: ");
        double y1 = sc.nextDouble();

        // Pedimos las coordenadas del segundo punto
        System.out.print("Introduce la coordenada x del segundo punto: ");
        double x2 = sc.nextDouble();
        System.out.print("Introduce la coordenada y del segundo punto: ");
        double y2 = sc.nextDouble();

        // Creamos los dos puntos con los datos que introdujo el usuario
        C1DistanciaPuntos dp1 = new C1DistanciaPuntos(x1, y1);
        C1DistanciaPuntos dp2 = new C1DistanciaPuntos(x2, y2);

        // Mostramos las coordenadas introducidas (opcional, solo para verificar)
        System.out.println("\nPunto 1 -> x: " + dp1.getX() + ", y: " + dp1.getY());
        System.out.println("Punto 2 -> x: " + dp2.getX() + ", y: " + dp2.getY());

        // Calculamos y mostramos la distancia entre ambos puntos
        System.out.println("La distancia entre los dos puntos es: " + dp1.getDistanciaPuntos(dp2));

        // Cerramos el Scanner (buena práctica)
        sc.close();
    }
}
