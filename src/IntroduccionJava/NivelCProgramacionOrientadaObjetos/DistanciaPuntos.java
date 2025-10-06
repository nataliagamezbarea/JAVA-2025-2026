package IntroduccionJava.NivelCProgramacionOrientadaObjetos;

public class DistanciaPuntos {
    private double x;
    private double y;

    public DistanciaPuntos(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDistanciaPuntos(DistanciaPuntos otro) {
        double dx = this.x - otro.getX();
        double dy = this.y - otro.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        DistanciaPuntos dp1 = new DistanciaPuntos(3 , 2);
        DistanciaPuntos dp2 = new DistanciaPuntos(5 , 10);

        System.out.println("d1:");
        System.out.println("La coordenada x es: " + dp1.getX());
        System.out.println("La coordenada y es: " + dp1.getY());

        System.out.println("d2:");
        System.out.println("La coordenada x es: " + dp2.getX());
        System.out.println("La coordenada y es: " + dp2.getY());
        System.out.println("La distancia entre puntos es: " + dp1.getDistanciaPuntos(dp2));

    }
}
